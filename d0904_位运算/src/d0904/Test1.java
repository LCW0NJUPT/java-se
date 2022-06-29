package d0904;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		/*
		 * 746345
		 * 00101010 11111001 10111010 10111011
		 *        <<--------24-----------
		 *        ---------24---------->>>
		 * 00000000 00000000 00000000 10111011
		 */
		System.out.print("输入整数：");
		int n = new Scanner(System.in).nextInt();     
		n = n<<24>>>24;
		System.out.println(n);
		
		/*
		 * 00101010 11111001 10111010 10111011
		 * 00000000 00000000 00000000 11111111 &
		 * --------------------------------------
		 * 00000000 00000000 00000000 10111011
		 */
		System.out.print("输入整数：");
		n = new Scanner(System.in).nextInt();  
		n = n & 0x000000ff;
		System.out.println(n);
		
		
	}
}




