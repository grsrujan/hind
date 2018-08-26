package hive;

import java.text.ParseException;
import org.junit.Assert;
import org.junit.Test;

public class ConvertDateTest {

	@Test
	  public void testUDF() throws ParseException {
		ConvertDate example = new ConvertDate();
	    Assert.assertEquals("2018-05-22", example.evaluate(new String("2018142")));
	  }
	
	@Test
	  public void testUDFF() throws ParseException {
		ConvertDate example = new ConvertDate();
	    Assert.assertEquals("2018-05-22", example.evaluate(new String("20180522")));
	    Assert.assertEquals("0000-00-00", example.evaluate(new String("00000000")));
	  }

	  @Test
	  public void testUDFD() throws ParseException {
		  ConvertDate example = new ConvertDate();
	    Assert.assertEquals("2018-05-22 12:12:12:3", example.evaluate("2018142","1212123"));
	  
	  }

}
