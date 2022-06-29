package d1301;

import java.util.HashMap;

public class Test1 {
	public static void main(String[] args) {
		Student s1 = new Student(9527,"唐伯虎","男",19);
		Student s2 = new Student(9527,"唐伯虎","男",19);
		
		//哈希值相同，才能保证计算出相同下标位置
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		//即使计算出相同下标，equals()也必须相等，才能覆盖
		System.out.println(s1.equals(s2));
		
		HashMap<Student, Integer> map = new HashMap<>();  
		for (int i = 0; i < 20; i++) {
			map.put(new Student(), 99);
		}
		System.out.println(map);
	}
}




