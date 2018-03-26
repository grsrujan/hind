#This will display filesize
ls -ltrh $0 | awk '{print $5}'
