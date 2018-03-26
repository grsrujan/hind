#!/bin/bash
##############################################################
##############################################################
##############################################################
counter=0
while true
  do
    if [[ `ls -1 | wc -l` -gt 2 ]];then
        echo "number of files in current directory is greater than 2"
        break
    else
        counter=$((counter+1))
        sleep 60
    fi
  done
