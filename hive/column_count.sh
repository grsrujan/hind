#count number of columns in hive

hive -S -e "SHOW COLUMNS IN dbname.tbname" | wc -l

# 2 nd method

hive -S -e "describe dbname.tbname" | wc -l
