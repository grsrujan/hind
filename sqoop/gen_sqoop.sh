#!/bin/bash
##############################################################
##############################################################
##############################################################

DATE=`date +'%Y-%m-%d:%H:%M:%S'`
log_path='/home/s1474644/sqoop'

function logging()
##############################################################
{
    echo $DATE" $1" >> $log_path/sqoop_$DATE.log
}
: <<'COMMENT1'
function delete_logs() {
  #statements
}

##############################################################
#function send_error_mail()
##############################################################
{
  mailx -r "from_mail" -s "Error mail" "to_mail"
}
COMMENT1

##############################################################
function send_success_mail()
##############################################################
{
  #mailx -r "from_mail" -s "Success mail" "to_mail"
  echo ' </table>
</body></html>"
echo
) | /usr/sbin/sendmail -t' >> $mail_file

sh $mail_file

}
##############################################################
function delete_email_file()
##############################################################
{
  rm $mail_file
}



##############################################################
function remove_trigger()
##############################################################
{

  rm $trigger_dir/*.comp

}
##############################################################
#### Program execution starts from here
##############################################################

# source config_file
common_config=common.cfg
home_dir=`pwd`
source $home_dir/$common_config
export type=$2
counter=0
while true
do
  if [[ `ls -1 $trigger_dir/*.comp 2>/dev/null | wc -l` -ne $total_tables ]]; then
    while IFS=, read -r -a line || [[ -n "$line" ]]
    do
    # assign values to variables
          if [[ ${#line[@]} -eq 7 ]]; then
            export temp_select=${line[0]}
            export rdbms_source=${line[1]}
            export source_db=${line[2]}
            export source_table=${line[3]}
            export target_db=${line[4]}
            export target_table=${line[5]}
            export pk_col=${line[6]}

            nohup sh $home_dir/sqoop_child.sh $common_config &
            #ps -eaf count
          elif [[ ${#line[@]} -eq 5 ]]; then
            #statements
            export rdbms_source=${line[0]}
            export source_db=${line[1]}
            export source_table=${line[2]}
            export target_db=${line[3]}
            export target_table=${line[4]}
            #pk_col=${line[5]}
            nohup sh $home_dir/sqoop_child.sh $common_config &
          fi
          while true
            do
              if [[ `ps -ef | grep -I sqoop_child.sh | grep -v grep |wc -l` -le $parallel ]];then
                  echo "number of running process is less than $parallel"
                  break
              else
                  sleep 30
              fi
           done
    done < "$1"
  cnt=0
  while true
  do
    if [[ `ls -1 $trigger_dir/*.comp 2>/dev/null | wc -l` -eq $total_tables ]]; then
      echo "Completed importing data for all tables "
      remove_trigger
      send_success_mail
      delete_email_file
      exit 13
    elif [[ "$cnt" -lt 120 ]]; then
      sleep 30
      cnt=$((cnt+1))
    else
      break
    fi
  done
  if [[ "$counter" -lt 3 ]]; then
    counter=$((counter+1))
    #sleep 60
    else
    exit 0
  fi
fi
done
exit 0
