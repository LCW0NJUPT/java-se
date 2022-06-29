package d1801;

public class Test1 {
	public static void main(String[] args) throws Exception {
		//A
		Class<A> c1 = A.class;
		
		//B
		Class<B> c2 = 
		 (Class<B>) Class.forName("d1801.B");
		
		//C
		C c = new C();
		Class<C> c3 = (Class<C>) c.getClass();
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
	}
}



