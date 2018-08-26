package search;
import java.util.Date;

import org.apache.commons.lang.StringUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Ddate {

	public static void main(String[] args) throws ParseException{
		
		Date c = new SimpleDateFormat("yyyy-MM-dd").parse("2018-05-05");
		SimpleDateFormat dt1 = new SimpleDateFormat("yyyy-MM-dd");
		
    		System.out.println(c);    	
    		System.out.println(dt1.format(c));
    	
    		String inputDate = "2018142";
    		String inputTime= "121212";    	
    	
  	        StringBuilder sb = new StringBuilder();
	        sb.append(inputDate.trim()).append(' ').append(StringUtils.leftPad(inputTime.trim(), 7, "0"));
	        System.out.println(sb.toString());
		Date a   = new SimpleDateFormat("yyyyD HHmmssS").parse(sb.toString());
		String b = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:S").format(a);
		System.out.println(b); 
	}

}
