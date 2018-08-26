package search;
import org.apache.commons.lang.StringUtils;

public class PadZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "222212";		
		System.out.println(StringUtils.leftPad(a.trim(), 10, "0"));
		System.out.println(StringUtils.rightPad(a.trim(), 10, "0"));

	}
}

// output: 0000222212
// 2222120000
