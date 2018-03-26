#!/bin/bash
##############################################################

# string concatenation
#method1
a='hello '
b='world !'
c=$a$b
echo "$c"

#method2
a='hello'
a+=' world!'
echo "$a"

# Converting input string to lower case
a='HEllo'
# method1  using awk
echo "$a" | awk '{print tolower($0)}'

#method2 using sed
echo "$a" | sed -e 's/\(.*\)/\L\1/'

#method3 using tr
echo "$a" | tr '[:upper:]' '[:lower:]'

# Converting input string to Upper case
a='hello'

# method1  using awk
echo "$a" | awk '{print toupper($0)}'

#method2 using sed
echo "$a" | sed -e 's/\(.*\)/\U\1/'

#method3 using tr
echo "$a" | tr '[:lower:]' '[:upper:]'
