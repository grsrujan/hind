
# running .hive/.hql files using spark sql


spark-sql --master yarn-client --conf "spark.driver.extraJavaOptions=-Dlog4j.configuration=file:///scripts/config/log4j.properties" \
--executor-memory 2g --num-executors 8 --driver-memory 1g \
-hiveconf table_name=tbname -f ".hqlpath" -i "hive_parameter_file"
