#!/bin/bash
##############################################################
##############################################################
##############################################################
##############################################################
function sqoop_full_import()
##############################################################
{
if [[ $1 -eq 1 ]]; then
  #logging " started importing data from $rdbms_source "
  sqoop import \
  --connect $jdbc_uri \
  --username $user \
  --password-file file:///local_path/test.pw \
  --num-mappers 5 \
  --table $source_db.$source_table \
  --split-by $pk_col \
  --target-dir /hdfs_dir/$source_table \
  --hive-import \
  --hive-overwrite \
  --hive-table $target_db.$target_table \
  --outdir $out_dir \
  --validate &> $logs_dir/$source_table.log
  #logging " Completed importing data from $rdbms_source "
elif [[ $1 -eq 2 ]]; then
  #logging "started importing data from $rdbms_source "
  #echo " split by column : $pk_col"
  echo " sqoop import \
  --connect $jdbc_uri \
  --username $user \
  --password-file file:///local_path/test.pw \
  --num-mappers 5 \
  --table $source_db.$source_table \
  --split-by $pk_col \
  --target-dir   \
  --hive-import \
  --create-hive-table \
  --hive-table default.test3 "
fi
}

: <<'COMMENT1'
##############################################################
function sqoop_incr_import()
##############################################################
{

}
COMMENT1
home_dir=`pwd`
source $home_dir/$1
sqoop_full_import $temp_select
