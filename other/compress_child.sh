#!/bin/bash

##############################################################
function compress()
##############################################################
{

hadoop jar $local_jar_path \
-Dmapred.reduce.tasks=1 \
-Dmapred.output.compress=true \
-Dmapred.compress.map.output=true \
-Dmapred.output.compression.codec=org.apache.hadoop.io.compress.BZip2Codec \
-input '$hdfs_input_dir/$hdfs_folder' \
-output '$hdfs_output_dir/$hdfs_folder' \
-mapper /bin/cat \
-reducer /bin/cat \
-inputformat org.apache.hadoop.mapred.TextInputFormat \
-outputformat org.apache.hadoop.mapred.TextOutputFormat

}

##############################################################
function delete_input_hdfs_dir()
##############################################################
{

hadoop fs -rm -r '$hdfs_input_dir/$hdfs_folder'

}

home_dir=`pwd`
source $home_dir/$1

compress
delete_input_hdfs_dir
