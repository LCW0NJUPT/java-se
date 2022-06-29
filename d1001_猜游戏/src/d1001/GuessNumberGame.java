package d1001;

import java.util.Random;

public class GuessNumberGame extends GuessGame {
	@Override
	public String suiJi() {
		// 1+ [0, 1000)
		int r = 1+ new Random().nextInt(1000);
		return String.valueOf(r);
	}
	@Override
	public void tiShi() {
		System.out.println(
		 "已经产生了一个[1,1001)范围的随机整数");
		System.out.println("请猜这个整数");
	}
	@Override
	public String biJiao(String c, String r) {
		//字符串解析成 int
		int cc = Integer.parseInt(c);
		int rr = Integer.parseInt(r);
		if (cc > rr) {
			return "大";
		} else if(cc < rr) {
			return "小";
		} else {
			return "对";
		}
	}
	@Override
	public boolean caiDui(String result) {
		return result.equals("对");
	}
}



