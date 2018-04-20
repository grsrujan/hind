#!/bin/bash
##############################################################
##### compresses hdfs files present in multiple folders
##### Usage : sh compress_main.sh compress.cfg
##############################################################

##############################################################
function generate_dir_list()
##############################################################
{

hdfs dfs -stat "%n" "$hdfs_input_dir"/* > $local_input_dir

}

##############################################################
#### Program execution starts from here
##############################################################
# source config_file
config=compress.cfg
home_dir=`pwd`
source $home_dir/$config

generate_dir_list

counter=0
while IFS=, read -r -a line || [[ -n "$line" ]]
do
    if [ $counter -ge $no_folders ]; then
        break
    fi
    counter=$((counter+1))
    echo $line
    export hdfs_folder=$line
    nohup sh $home_dir/child.sh $config &
    while true
       do
          if [[ `ps -ef | grep -I compress_child.sh | grep -v grep |wc -l` -le $parallel ]];then
              echo "number of running process is less than $parallel"
              break
          else
              sleep 30
          fi
       done
done < "$local_input_dir"
