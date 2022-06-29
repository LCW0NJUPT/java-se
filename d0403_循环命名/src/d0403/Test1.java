package d0403;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		/*
		 * 您现在的状态：
		 * 1. 好嗨哟
		 * 2. 感觉人生已经达到了高潮
		 * 3. 感觉人生已经达到了巅峰
		 * 4. 我想静静，bye~
		 * 选择：> 1
		 */
		
		outer:
		while (true) {
			//显示菜单并获得输入的选项值
			int c = caiDan();
			switch(c) {
			case 1:
				System.out.println("好嗨哟");
				break;
			case 2:
				System.out.println("感觉人生已经达到了高潮");
				break;
			case 3:
				System.out.println("感觉人生已经达到了巅峰");
				break;
			case 4:
				System.out.println("我想静静，bye~");
				break outer;
			default:
				System.out.println("输入有误，请重试");
			}

		}
		
	}

	private static int caiDan() {
		System.out.println("\n------------------------------------");
		System.out.println("您现在的状态：");
		System.out.println("1. 好嗨哟");
		System.out.println("2. 感觉人生已经达到了高潮");
		System.out.println("3. 感觉人生已经达到了巅峰");
		System.out.println("4. 我想静静，bye~");
		System.out.print("选择：> ");
		int c = new Scanner(System.in).nextInt();
		return c;
	}


}



