#############################

# TSV to ctrl-A delimited
sed 's/[[:space:]]\+/\x01/g' $1 > $2

# CSV to ctrl-A delimited
sed 's/,/\x01/g' $1 > $2
