#!/bin/bash
##############################################################
##############################################################
##############################################################

DATE=`date +'%Y-%m-%d:%H:%M:%S'`
log_path='/home/sqoop'

##############################################################
function check_trigger()
##############################################################
{
  if [[ -f "$trigger_dir/$source_table.trg" ]]; then
    echo "trigger file exists, job is running for $target_table"
    exit 13
  elif [[ -f "$trigger_dir/$source_table.comp" ]]; then
    echo "sqoop import is completed for $source_table"
    exit 13
  else
    touch $trigger_dir/$source_table.trg
    echo "New run"
    echo " "
  fi
}
##############################################################
function create_trigger()
##############################################################
{

  touch $trigger_dir/$source_table.comp

}
##############################################################
function delete_trigger()
##############################################################
{
  rm -r $trigger_dir/$source_table.trg
}

##############################################################
function connection_details()
##############################################################
{
if [ "$rdbms_source" = "ORACLE" ]; then
  echo "source is Oracle"
  # connection string for oracle
  export jdbc_uri=jdbc:oracle:thin:@//$ora_host:$ora_port/$ora_db
  export user=$ora_user

elif [ "$rdbms_source" = "NETEZZA" ]; then
  echo " source is netezza "
  # connection string for netezza
  export jdbc_uri=jdbc:netezza://$nz_host:$nz_port/$nz_db
  export user=$nz_user

elif [ "$rdbms_source" = "MYSQL" ]; then
  echo "Source is mysql"
  # connection string for mysql
  export jdbc_uri=jdbc:mysql://$mysql_host:$mysql_port/$mysql_db
  export user=$mysql_user

elif [ "$rdbms_source" = "TERADATA" ]; then
  echo "Source is teradata"
  # connection string for teradata
  export jdbc_uri=jdbc:teradata://$tera_host:$tera_port/$tera_db
  export user=$tera_user

elif [ "$rdbms_source" = "DB2" ]; then
  echo "Source is DB2"
  # connection string for teradata
  export jdbc_uri=jdbc:db2://$db2_host:$db2_port/$db2_db
  export user=$db2_user
else
  echo " INVALID SOURCE"
#exit 0
fi
}

##############################################################
function run_sqoop_script()
##############################################################
{

start_time=`date +'%Y-%m-%d:%H:%M:%S'`

sh $home_dir/"$type"_template.sh $1

end_time=`date +'%Y-%m-%d:%H:%M:%S'`

}

##############################################################
function data_validation()
##############################################################
{

text=`cat $logs_dir/$source_table.log | grep 'Data successfully validated' |wc -l`

if [ $text -ne 1 ];then
   echo "data is mismatching"
   delete_trigger
   exit 13
fi
src_count=`cat $logs_dir/$source_table.log | awk -F'=' /'Map input records/{print $2}'`
tgt_count=`cat $logs_dir/$source_table.log | awk '/Retrieved/ {print $6}'`

}

##############################################################
function check_mail_file()
##############################################################
{
  #check if mail template file exists
  if [[ -f "$mail_file" ]]; then
    echo "mail template file exists"
    echo "<tr>
        <td>$source_table</td>
        <td>$start_time</td>
        <td>$end_time</td>
        <td>$src_count</td>
        <td>$tgt_count</td>
        <td>SUCCESS</td>
      </tr>" >> $mail_file
  else
    echo "mail template is missing "
    echo '(
    echo "To: .com"
    echo "From: .com"
    echo "Subject: Job Status"
    echo "Content-Type: text/html"
    echo
    echo "<html>
    <head>
    <title>Status of the jobs during the day</title>
    <style>
    table, th, td {
        border: 1px solid blue;
        border-collapse: collapse;
    }
    th, td {
        padding: 5px;
    }
    </style>
    </head>
    <body>
    <table style='width:100%'>
    <tr bgcolor='#808080'>
        <th>Table Name</th>
        <th>start timestamp</th>
        <th>end timestamp</th>
        <th>source record count</th>
        <th>target record count</th>
        <th>Status</th>
      </tr>' > $mail_file
      echo "<tr>
          <td>$source_table</td>
          <td>$start_time</td>
          <td>$end_time</td>
          <td>$src_count</td>
          <td>$src_count</td>
          <td>SUCCESS</td>
        </tr>" >> $mail_file
  fi
}

: <<'COMMENT1'
##############################################################
function data_validation()
##############################################################
{
 # get source record count
  cnt=`sqoop-eval \
  --connect $jdbc_uri \
  --username $user \
  --password-file file:///path \
  --query "select count(*) from $source_db.$source_table"`
  #echo "$cnt"
  src_rcd_cnt=`echo "$cnt" | awk 'NR ==6 {print $2}'`
  echo "$b"
  #get target record Count
 tgt_rcd_cnt=`hive -S -e "select count(*) from $target_db.target_table"`
  if [[ src_rcd_cnt -eq tgt_rcd_cnt ]];then
    echo "record counts are matching "
    send_success_mail
  else
    echo "record counts are not matching"
}

function create_trigger()
{
num=$(echo "after sleep $a")
  #statements
  if [ $? -ne 0 ]
then
        email_func_fail
        exit 1
  fi
}
##############################################################
#function send_error_mail()
##############################################################
{
  mailx -r "$from_mail" -s "Error mail" "$to_mail"
}

COMMENT1

##############################################################
#### Program execution starts from here
##############################################################
home_dir=`pwd`
source $home_dir/$1
# source config_file
check_trigger
connection_details

run_sqoop_script $1
data_validation
delete_trigger
check_mail_file
create_trigger
