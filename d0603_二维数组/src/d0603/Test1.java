package d0603;

public class Test1 {
	public static void main(String[] args) {
		char[][] a = {                     //j
				{'道','路','千','万','条'},
				{'安','全','第','一','条'}, //1
				{'行','车','不','规','范'}, //2
				{'亲','人','两','行','泪'}  //3      
		};   //i  0    1    2    3    4 
		
		/*
		 * 亲行安道
		 * 人车全路
		 * 两不第千
		 * 行规一万
		 * 泪范条条
		 */
		for (int i = 0; i < a[0].length; i++) {
			for (int j = a.length-1; j >=0; j--) {
				System.out.print(a[j][i]);
			}
			System.out.println();
		}
		
	}
}




