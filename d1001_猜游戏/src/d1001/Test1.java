package d1001;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.println("1. 猜数字");
		System.out.println("2. 猜字母");
		System.out.print("选择：>");
		int c = new Scanner(System.in).nextInt();    
		GuessGame game;		
		if(c == 1) {
			game = new GuessNumberGame();
		} else {
			game = new GuessLetterGame();
		}
		
		game.start();
	}
}






