from pyspark import SparkContext
from pyspark.sql import HiveContext
import sys

if __name__ == "__main__":
    if len(sys.argv) != 4:
        print "Error usage: CreateHive [master] [inputFile] [inputTable]"
        sys.exit(-1)
    master = sys.argv[1]
    inputFile = sys.argv[2]
    inputTable = sys.argv[3]
    sc = SparkContext(master, "CreateHive")
    hiveContext = HiveContext(sc)
    # create hive table 
    hiveContext.sql(
        "CREATE TABLE IF NOT EXISTS default." +
        inputTable +
        " (a int, b string, c string)")
	# loading data into hive table
	
    hiveContext.sql(
        "LOAD DATA LOCAL INPATH '" + inputFile + "' INTO TABLE " + inputTable)
	
	# read data from hive table
	
	sampleData = hiveContext.table("default."+inputTable)
	
	sampleData.show()
	
	# running sql on hive table
	
	sampleData.registerTempTable("test_temp")
	hiveContext.sql("select * from test_temp").show()
