#is equal to
if [ "$1" -eq "$2" ];then
  echo " equal"
else
  echo " not equal "
fi

#is not equal to
if [ "$1" -ne "$2" ];then
  echo " not equal"
else
  echo " equal"
fi

#is greater than
if [ "$1" -gt "$2" ];then
  echo " $1 is greater than $2"
else
  echo " $1 is less than $2"
fi


#is greater than or equal to
if [ "$1" -ge "$2" ];then
  echo " $1 is greater than or equal to $2 "
else
  echo " $1 is less than $2"
fi

#is less than
if [ "$1" -lt "$2" ];then
  echo " $1 is less than  $2 "
else
  echo " $1 is greater than or equal to $2 "
fi

#is less than or equal to
if [ "$1" -le "$2" ];then
  echo " $1 is less than or equal to $2 "
else
  echo " $1 is greater than $2"
fi

#is less than
if (("$1" < "$2"));then
  echo " $1 is less than  $2"
else
  echo " $1 is greater than or equal to $2"
fi

#is less than or equal to
if (("$1" <= "$2"));then
  echo " $1 is less than or equal to $2"
else
  echo " $1 is greater than $2"
fi

#is greater than
if (("$1" > "$2"));then
  echo " $1 is greater than $2"
else
  echo " $1 is less than or equal to $2 "
fi

#is greater than or equal to
if (("$1" >= "$2"));then
  echo " $1 is greater than or equal to $2"
else
  echo " $1 is less than $2"
fi
