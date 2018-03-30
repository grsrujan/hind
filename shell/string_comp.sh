#!/bin/bash
#here we can use == operator too for comparision
if [ "$1" = "$2" ];then
  echo "both are equal"
else
  echo "not equal"
fi

if [ "$1" != "$2" ];then
  echo "entered strings are not equal"
else
  echo "entered strings are equal"
fi


#case insensitive comparision

#forcing shell todo insensitive comparision

shopt -s nocasematch
if [[ "TEST" = "test" ]]
then
  echo "Matched"
fi

#to unset use -u
shopt -u nocasematch
