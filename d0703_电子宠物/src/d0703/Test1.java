package d0703;

import java.util.Random;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.println("1. 猫");
		System.out.println("2. 狗");
		System.out.print("选择：>");
		int c = new Scanner(System.in).nextInt();
		
		System.out.print("给宠物起个名：");
		String n = new Scanner(System.in).nextLine();   
		
		//Cat cat = null;
		//Dog dog = null;
		//只定义一个父类型变量，
		//可以引用任意子类型实例
		Pet pet = null;
		
		if (c == 1) {
			//向上转型，用父类型引用变量，来引用一个子类型实例
			pet = new Cat(n);
		} else {
			pet = new Dog(n);
		}
		
		f(pet);
	}

	private static void f(Pet pet) {
		System.out.println("按回车执行");
		while(true) {
			new Scanner(System.in).nextLine();
			int r = new Random().nextInt(9);
			switch(r) {
			case 0: pet.feed(); break;
			case 1: pet.play(); break;
			default: pet.punish();
			}
		}
	}
}






