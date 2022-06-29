package d1006;

import java.util.Arrays;
import java.util.Random;

public class Test1 {

	public static void main(String[] args) {
		int[] a = suiJi();
		int[] b = suiJi();
		Arrays.sort(a);
		Arrays.sort(b);
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		
		int[] c = heBing(a, b);
		System.out.println(Arrays.toString(c));
	}

	private static int[] heBing(int[] a, int[] b) {
		/*
           a=[11, 12, 13, 14, 15, 16]
                                        j
           b=[12, 15, 16, 59, 61, 85, 91, 94]
                           k
           
           c=[11, 12, 12, 13, 14, 15, 15, 16, 16                 ]
                                                  i
		 */
		//新建数组，长度是两个数组长度和
		int[] c = new int[a.length+b.length];
		for (int i = 0,j=0,k=0; i < c.length; i++) {
			if(j>=a.length) {
				System.arraycopy(b,k,c,i,b.length-k);
				break;
			}
			if(k>=b.length) {
				System.arraycopy(a,j,c,i,a.length-j);
				break;
			}
			
			if (a[j]<b[k]) {
				c[i] = a[j++];
			} else {
				c[i] = b[k++];
			}
		}
		return c;
	}

	private static int[] suiJi() {
		int n = 5+ new Random().nextInt(6);
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = new Random().nextInt(100);
		}
		return a;
	}

}
