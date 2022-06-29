package d1001;

import java.util.Random;

public class GuessLetterGame extends GuessGame {
	
	
	public String suiJi() {
		/*
		 *                  J
		 * "MUKNQFGHIJCLADOPQRSTBVWXYZ"
		 *      i
		 *      
		 *      char t = E
		 *      
		 * StringBuilder
		 */
		StringBuilder sb = new StringBuilder(
		 "ABCDEFGHIJKLMNOPQRSTUVWXYZ");
		for (int i = 0; i < 5; i++) {
			// i+ [0, sb.length()-i)
			int j = 
			 i+ new Random().nextInt(sb.length()-i);    
			char t = sb.charAt(i);
			sb.setCharAt(i, sb.charAt(j));
			sb.setCharAt(j, t);
		}
		sb.delete(5, sb.length());
		System.out.println(sb);
		return sb.toString();
	}
	
	
	
	
	
	
	
	
	public void tiShi() {
		System.out.println(
		 "已经产生了5个不重复的大写字母");
		System.out.println("请猜这5个字母");
	}
	
	
	
	
	
	
	public String biJiao(String c, String r) {
		/*                 a=1  b=3
		 * r = "FQGKN"
		 *        j      
		 * c = "QGFKV"
		 *       i
		 */
		
		int a = 0;
		int b = 0;		
		//i循环访问字符串c的字符
		for (int i = 0; i < 5; i++) {
			//j循环访问字符串r的字符
			for (int j = 0; j < 5; j++) {
				//i位置字符和j位置的字符相等
				if(c.charAt(i) == r.charAt(j)) {
					//位置相等还是不相等
					if (i == j) {
						a++;
					} else {
						b++;
					}					
					break;//j结束
				}
			}
		}
		
		return a+"A"+b+"B";
	}
	
	
	
	
	
	
	
	
	
	
	
	public boolean caiDui(String result) {
		return result.equals("5A0B");
	}
}
