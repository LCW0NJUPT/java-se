package d1104;

import java.util.HashMap;
import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		System.out.println("输入字符串：");
		String s = new Scanner(System.in).nextLine();
		//统计方法
		HashMap<Character, Integer> map = tongJi(s);
		System.out.println(map);
	}

	private static HashMap<Character, Integer> tongJi(String s) {
		/*
		 * *)先新建 HashMap 对象 map
		 * *)i循环遍历字符串s
		 *      *)从s取出i位置的一个字符 c
		 *      *)从 map 取字符c对应的计数值 Integer count
		 *      *)count是null
		 *           *)放入c -- 1
		 *      *)否则
		 *           *)放入c -- count+1
		 * 
		 * *)返回 map
		 */
		HashMap<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			Integer count = map.get(c);
			if(count ==null) {
				map.put(c, 1);
			} else {
				map.put(c, count+1);
			}
		}
		return map;
	}
}







