package d1602;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Test1 {
	public static void main(String[] args) throws Exception {
		//读取加载文件数据
		List<Student> list = load();
		//随机访问list中的一个学生实例
		Student s = chouJiang(list);
		s.setCount(s.getCount()+1);
		System.out.println(
		 "恭喜"+s.getName()+"中大奖");
		//把列表数据，重新存到文件
		save(list);
	}

	private static List<Student> load() throws Exception {
		ArrayList<Student> list = new ArrayList<>();
		BufferedReader in = 
		 new BufferedReader(
		 new InputStreamReader(
		 new FileInputStream("d:/stu.txt"), "GBK"));
		
		String line;
		while((line = in.readLine()) != null) {
			line = line.replaceAll("\\s+", "");
			if (line.length() == 0) {
				continue;
			}
			//同学甲;0 --->  ["同学甲",  "0"]
			//                  0         1
			String[] a = line.split(";");
			Student s = new Student();
			s.setName(a[0]);
			s.setCount(Integer.parseInt(a[1]));
			
			list.add(s);
		}
		in.close();
		System.out.println(list);
		return list;
	}

	private static Student chouJiang(
			List<Student> list) {
		//对list排序
		Collections.sort(list, new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o1.getCount()-o2.getCount();
			}
		});
		
		int mid = list.size()/2;
		int j;
		
		if (Math.random() < 0.7) {//70%概率在前面一半抽取
			// [0, mid)
			j = new Random().nextInt(mid);
		} else {//30%概率在后面一半抽取
			// mid + [0, list.size()-mid)
			j = 
			 mid+ new Random().nextInt(list.size()-mid);
		}
		
		return list.get(j);
	}
	
	
	

	private static void save(List<Student> list) throws Exception {
		PrintWriter out = 
		 new PrintWriter(
		 new OutputStreamWriter(
		 new FileOutputStream("d:/stu.txt"),"GBK"));
		
		for (Student s : list) {
			out.println(s);//默认调用 s.toString()
		}
		
		out.close();
	}
}








