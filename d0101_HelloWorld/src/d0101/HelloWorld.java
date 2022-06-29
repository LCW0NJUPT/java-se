package d0101;

import javax.xml.crypto.Data;
import java.security.PublicKey;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HelloWorld {
	//主方法、入口方法
	public static void main(String[] args) {  //args是变量名可以换
		System.out.println("Hello world!!!");
		System.out.println("师姐你好！！！");
		int a=0,b=70;
		for (;a<1000;a++){
			b=b*a;
		}
		Integer test = new Integer(5);
		System.out.println(test);

		Date d1 = new Date();
		SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		String s1 = f.format(d1);
		System.out.println(f);
	}
}
//ArrayIndexOutOfBoundsException
interface Inter1{
	public static final double PI=3.1415926;
	public abstract void show();
	int COUNT = 5;

}





