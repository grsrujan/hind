#!/bin/bash
##############################################################
##############################################################
##############################################################

#single line comment

: <<'COMMENT3'
echo "This will not be displayed as it is enclosed within multiline comment"
##############################################################
function check_trigger()
##############################################################
{
  if [[ -f "$trigger_file" ]]; then
    echo "trigger file exists"
    exit 13
  else
    echo "trigger is missing so its a new run"
  fi
}
COMMENT3

echo " single and multi line comments in bash scripting"
