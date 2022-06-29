package d1801;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test4 {
	public static void main(String[] args) throws Exception {
		A a = new A();
		Class<A> c = (Class<A>) a.getClass();
		
		Field f = c.getDeclaredField("i");
		f.setAccessible(true);//私有可访问
		
		f.set(a, 6);//反射赋值
		System.out.println(a.getI());
		
		int i = (int) f.get(a);//反射取值
		System.out.println(i);
		
		////
		
		Method geti = c.getMethod("getI");
		Method seti = c.getMethod("setI", int.class);
		
		int r = (int) geti.invoke(a);
		System.out.println(r);
		
		seti.invoke(a, 666);
		System.out.println(a.getI());
		
	}
}






