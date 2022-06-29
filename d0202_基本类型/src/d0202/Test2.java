package d0202;

public class Test2 {
	public static void main(String[] args) {
		System.out.println(3/2);
		System.out.println(3d/2);
		//  \n 是换行符的转义符
		System.out.println("\n-----------------");
		
		char c1 = 'S';
		char c2 = 'B';
		System.out.println(c1 + c2);//int + int
		
		System.out.println("\n-----------------");
		
		System.out.println(Integer.MAX_VALUE+1);
		System.out.println(300000000*60*60*24*365);
		System.out.println(300000000L*60*60*24*365);        
		
		System.out.println("\n-----------------");
		
		System.out.println(2-1.9);
		System.out.println(2-1.8);
		System.out.println(2-1.7);
		System.out.println(2-1.6);
		System.out.println(2-1.5);
		System.out.println(4.35*100);
		System.out.println(4.36*100);
		System.out.println(4.37*100);
		System.out.println(4.38*100);
		System.out.println(4.39*100);
		
		System.out.println("\n-----------------");
		
		System.out.println(3.14/0);
		System.out.println(Math.sqrt(-6));

		int asd=5;
		asd=asd++;
		System.out.println(asd);

	}
}




