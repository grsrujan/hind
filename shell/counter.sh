
counter=0
while true
  do
    if [[ condition ]];then
        echo "number of files in current directory is greater than "
        break
    else
        counter=$((counter+1))
        sleep 60
    fi
  done
