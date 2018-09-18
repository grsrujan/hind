#!/bin/bash

###########################################################################################
###########################################################################################
#  Usage : sh get_record_count.sh database_name
###########################################################################################
###########################################################################################

dir=`pwd`
hive -e "use $1;show tables" > $dir/table_list

array=( tableprefix1 tableprefix2 tableprefix3 )
for i in "${array[@]}"
do
      echo "$i"
      while read line ;
      do
         if [[ $line == "$i"_* ]]; then
             cnt=`hive -S -e "show columns in $1.$line" | wc -l`
             echo "$1, $line , $cnt"
         fi
      done < $dir/table_list > $dir/$1_$i.csv
done
