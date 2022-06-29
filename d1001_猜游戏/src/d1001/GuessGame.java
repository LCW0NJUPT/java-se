package d1001;

import java.util.Scanner;

/*
 * 猜数字和猜字母的通用父类
 * 封装两种游戏的通用流程代码
 */
public abstract class GuessGame {
	public void start() {		
		String r = suiJi();//产生随机值		
		tiShi();//显示提示		
		while(true) {//死循环猜
			System.out.print("猜：");
			String c = new Scanner(System.in).nextLine();
			//猜的值c，和随机值r比较
			String result = biJiao(c, r);
			System.out.println(result);
			//比较结果 result 是不是猜对的结果
			if(caiDui(result)) {
				break;
			}
		}
	}
	public abstract String suiJi();
	public abstract void tiShi();
	public abstract String biJiao(String c, String r);
	public abstract boolean caiDui(String result);
}









