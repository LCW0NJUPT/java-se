package d0904;

import java.util.Arrays;
import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		System.out.print("整数：");
		int n = new Scanner(System.in).nextInt();
		byte[] a = f1(n);
		System.out.println(Arrays.toString(a));
		
		int r = f2(a);
		System.out.println(r);
	}

	private static int f2(byte[] a) {
		/*
		 * 00101010 
		 * 11111001 
		 * 10111010 
		 * 10111011
		 * 
		 * r = 00101010 11111001 10111010 00000000
		 * 
		 * 每一个字节值先和0x000000ff求位与，
		 * 再左移24,16,8,0位
		 * 再和r求位或，结果保存到r
		 */
		int r = 0;
		for (int i = 0; i < a.length; i++) {
			r = r | ((a[i]&0x000000ff)<<(24-8*i));     
		}
		return r;
	}

	private static byte[] f1(int n) {
		/*
		 * 00101010 11111001 10111010 10111011
		 * 
		 * n右移24,16,8,0，再强转byte
		 *    i 0  1  2 3
		 */
		byte[] a = new byte[4];
		for (int i = 0; i < a.length; i++) {
			a[i] = (byte) (n>>(24-8*i));
		}
		return a;
	}
}




