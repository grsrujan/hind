#!/bin/bash
##############################################################
##############################################################
##############################################################

function check_for_file(){
if [[ -f "/home/test.dat" ]]; then
    echo " file exists"
    exit 13
else
   echo " file does not exist"
fi
}
echo "checking whether file exists"
check_for_file
echo "done"
