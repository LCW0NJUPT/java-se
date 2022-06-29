package d1201;

import java.text.SimpleDateFormat;

public class MyDate extends java.util.Date {
	@Override
	public String toString() {
		// "yyyy-MM-dd HH:mm:ss"
		SimpleDateFormat f = 
		 new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String s = f.format(this);
		return s;
	}
}






