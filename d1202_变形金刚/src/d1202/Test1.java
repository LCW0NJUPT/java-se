package d1202;

import java.util.Random;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Transformer t = new Transformer();
		Sword s = new Sword();
		AK47 a = new AK47();
		Lyb l = new Lyb();
		System.out.println("按回车执行");
		while(true) {
			new Scanner(System.in).nextLine();         
			int r = new Random().nextInt(4);
			switch (r) {
			//setWeapon()方法中，为变形金刚的成员w赋值
			case 0: t.setWeapon(s); break;
			case 1: t.setWeapon(a); break;
			case 2: t.setWeapon(l); break;
			case 3: t.setWeapon(null); break;
			}
			
			t.attack();
		}
	}
}





