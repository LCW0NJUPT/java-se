package d0503;

import java.util.Scanner;

public class Test1 {
	/*
	 * 商品数组
	 * [{...}, {...}, {...}, {...}, {...}]
	 * 
	 * 
	 * [
	 *     {
	 *         id: 6,
	 *         name: "aa",
	 *         price: 5.35,
	 *         number: 6
	 *     },
	 *     {
	 *         id: 7,
	 *         name: "bb",
	 *         price: 6.4,
	 *         number: 2
	 *     }
	 *     
	 * ]
	 */
	
	static Item[] items = {
			new Item(1,"iPhoneXS",8199,20),
			new Item(2,"华为P30 pro",5799,80),
			new Item(3,"小米8",2699,50),
			new Item(4,"vivo NEX",3599,90),
			new Item(5,"OPPO FIND",3099,60)
	};
	
	public static void main(String[] args) {
		/*
		 * 1. 商品列表
		 * 2. 商品录入
		 * 3. 商品查询
		 * 4. 统计信息
		 * 5. 退出
		 * 选择：> 2
		 */
		outer:
		while(true) {
			//调用 caiDan() 方法显示菜单并获得选择的值
			int c = caiDan();
			//判断选项值
			switch(c) {
			case 1: f1(); break;
			case 2: f2(); break;
			case 3: f3(); break;
			case 4: f4(); break;
			case 5: break outer;
			}
		}
	}

	private static int caiDan() {
		System.out.println("-------------------");
		System.out.println("1. 商品列表");
		System.out.println("2. 商品查询");
		System.out.println("3. 商品录入");
		System.out.println("4. 统计信息");
		System.out.println("5. 退出");
		System.out.println("-------------------");
		System.out.print("选择：> ");
		int c = new Scanner(System.in).nextInt();
		return c;
	}

	private static void f1() {
		/*
		 * [{...}, {...}, {...}, {...}, {...}]
		 *    0      1      2      3      4
		 * 遍历显示商品信息
		 * items[0].id
		 * items[0].name
		 * items[0].toString()
		 */
		for (int i = 0; i < items.length; i++) {
			//println()方法的内部会自动调用对象的toString()方法
			System.out.println(items[i].toString());
		}
	}

	private static void f2() {
		/*
		 * [{...}, {...}, {...}, {...}, {...}]
		 *    0      1      2      3      4
		 *    
		 * 查询的商品名：a 存到变量 n
		 * n   items[i].name
		 * 判断商品名称中是否包含 n 子串
		 * 
		 * s.indexOf(子串), 在s中寻找子串的起始位置
		 * s = "adfdabcabc"
		 * s.indexOf("bc")   1 下标值
		 * s.indexOf("xx")   -1 特殊值表示不存在
		 */
		System.out.print("查询的商品名：");
		String n = new Scanner(System.in).nextLine();
		//遍历所有商品比对
		for (int i = 0; i < items.length; i++) {
			if(items[i].name.indexOf(n) >= 0) {
				System.out.println(items[i].toString());   
			}
		}
	}

	private static void f3() {
		/*
		 * [{xxx}, {xxx}, {xxx}, {xxx}, {...}]
		 *    0      1      2      3      4
		 */
		for (int i = 0; i < items.length; i++) {
			System.out.println(
				"录入第 "+(i+1)+" 件商品：");
			System.out.print("编号：");
			items[i].id = new Scanner(System.in).nextInt();
			System.out.print("名称：");
			items[i].name = new Scanner(System.in).nextLine();
			System.out.print("价格：");
			items[i].price = new Scanner(System.in).nextDouble();
			System.out.print("数量：");
			items[i].number = new Scanner(System.in).nextInt();
		}
		//重新显示列表
		f1();
	}

	private static void f4() {
		/*
		 * 商品总价
		 * 单价均价
		 * 最高总价
		 * 最高单价
		 */
		double spzj = 0;//商品总价
		double djzj = 0;//单价总价
		double zgzj = 0;//最高总价
		double zgdj = 0;//最高单价		
		//遍历数组
		for (int i = 0; i < items.length; i++) {
			Item s = items[i];//访问数组中的对象，存到变量s
			spzj += s.price * s.number;//商品总价
			djzj += s.price;//单价总价
			if(s.price*s.number > zgzj) { //最高总价
				zgzj = s.price*s.number;
			}
			if(s.price > zgdj) { //最高单价
				zgdj = s.price;
			}
		}		
		System.out.println("商品总价："+spzj);
		System.out.println("单价均价："+(djzj/items.length));
		System.out.println("最高总价："+zgzj);
		System.out.println("最高单价："+zgdj);
		
	}
}












