package d0102;
//导包，指明路径，后面代码可以简写类名
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.println("录入个人信息：");
		System.out.print("姓名：");
		//获得输入的值
		//再保存到变量 name
		String name = new Scanner(System.in).nextLine();  //扫描整行

		System.out.print("性别：");
		String gender = new Scanner(System.in).nextLine();

		System.out.print("年龄：");
		int age = new Scanner(System.in).nextInt();   //整数

		System.out.println("您录入的个人信息：");
		System.out.println(name+", "+gender+", "+age);
		System.out.println(
				"我在达内一定要努力磨炼技术，"
				+ "比旁边同学多写一遍代码，"
				+ "薪水一定要比旁边同学高");
	}
}








