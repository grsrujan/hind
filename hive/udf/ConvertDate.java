package hive;
import org.apache.commons.lang.StringUtils;
import org.apache.hadoop.hive.ql.exec.Description;
import org.apache.hadoop.hive.ql.exec.UDF;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Description(
        name="ConvertDate",
        value="Returns string which can be cast to hive timestamp/date"
)

/*
enter the following commands in hive shell or .hive script file
ADD JAR local_jar_path;
CREATE TEMPORARY FUNCTION convert_date AS 'hive.ConverDate';

SELECT convert_date('2018142','1212123');  displays 2018-05-22 12:12:12:3
SELECT convert_date('20180505'); displays 2018-05-05

*/
public class ConvertDate extends UDF {

	  public String evaluate(String dt) throws ParseException {
		  
		    if( dt == null ) return null;
		    		    
		    if ( dt.length() == 8 && dt.equals("00000000") ) {
		    	return "0000-00-00";
		    }
		    
		    else if ( dt.length() == 8 ) {
		    	// If input is of format yyyyMMdd return yyyy-MM-dd
		    	String d = new SimpleDateFormat("yyyy-MM-dd").format(new SimpleDateFormat("yyyyMMdd").parse(dt.trim()));
		    	return d;
		    }
		    else {
		    	// If Input is Julian date(yyyyD) return date in yyyy-MM-dd format
		    	String b = new SimpleDateFormat("yyyy-MM-dd").format(new SimpleDateFormat("yyyyD").parse(dt.trim()));	    	
				return b;
		    }		   
		  }
	  
	  public String evaluate(String dt, String time) throws ParseException {

		  if( dt == null ) return null;
		  
		  StringBuilder sb = new StringBuilder();
		  sb.append(dt.trim()).append(' ').append(StringUtils.leftPad(time.trim(), 7, "0"));
		  Date a   = new SimpleDateFormat("yyyyD HHmmssS").parse(sb.toString());
		  String b = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:S").format(a);		   
		  return b;
		  }		
		
}
