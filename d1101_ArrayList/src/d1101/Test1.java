package d1101;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		//插入随机整数，生成有序数字列表
		/*
		 * ArrayList 代替数组
		 * *）长度1.5倍自动增长
		 * *）增删数据，数据复制移位，自动进行
		 */
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println("回车执行，按q退出");
		while(true) {
			String s = new Scanner(System.in).nextLine();
			if(s.equals("q")) {
				break;
			}
			int r = new Random().nextInt(1000);
			//Collections是集合的工具类
			//二分法查找，正数是插入点，负数是-(插入点+1)
			int index = Collections.binarySearch(list, r);
			if(index<0) {// -(插入点+1)
				index = -index-1;//得到插入点
			}
			list.add(index, r);//向index位置插入数据
			System.out.println(list);
		}

		//迭代器遍历集合
		//Iterator - 迭代器
		//新建迭代器，必须用集合的方法辅助创建
		Iterator<Integer> it = list.iterator();
		//当还有数据
		while(it.hasNext()) {
			//取下一个
			Integer n = it.next();
			System.out.println(n);
		}


		//背着写迭代遍历
	}
}










