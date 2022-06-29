package d1203;

import java.util.HashMap;

public class Test1 {
	public static void main(String[] args) {
		Point a = new Point(1, 3);// -- "2.9亿"
		Point b = new Point(1, 3);// -- "3.1亿"    
		//有相同的哈希值，才能保证计算出相同下标位置
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		//即使计算出相同位置，
		//equals()也要像等，才能覆盖，否则链表连在一起
		System.out.println(a.equals(b));
		
		HashMap<Point, String> map = new HashMap<>();
		map.put(a, "2.9亿");
		map.put(b, "3.1亿");
		System.out.println(map);
	}
}






