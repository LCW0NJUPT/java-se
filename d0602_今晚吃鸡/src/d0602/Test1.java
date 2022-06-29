package d0602;

public class Test1 {
	public static void main(String[] args) {
		/*
		 * s1 = {
		 *     id: 9527,
		 *     blood: 100
		 * }
		 * s2 = {
		 *     id: 9528,
		 *     blood: 100
		 * }
		 */
		//新建士兵对象，把它的内存地址保存到s1
		Soldier s1 = new Soldier();
		Soldier s2 = new Soldier();
		s1.id = 9527;
		s2.id = 9528;		
		s1.go();
		s2.go();
		s2.attack();
		s2.attack();
		s2.attack();
		s2.attack();
		s2.attack();
	}
}





