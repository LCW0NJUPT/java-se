package d1802;

import java.lang.reflect.Method;

public class Runner {
	//在指定的类中，自动发现自动运行有@Test注解的方法
	public static void launch(Class c) throws Exception{
		//从类，用反射新建实例
		Object obj = c.newInstance();
		//从类中，获得该类中定义的所有方法
		Method[] a = c.getMethods();
		for (Method m : a) {
			//在方法上，是否存在Test类型的注解
			/*
			@Test
			void a(){}

			void b(){}
			 */
			if (m.isAnnotationPresent(Test.class)) {
				//获取 Test 注解数据
				Test t = m.getAnnotation(Test.class);
				//从注解实例中取出属性数据进行处理
				System.out.println("id: "+t.id());
				//把title和value属性处理成互为别名的关系
				System.out.println("title: "
			     +(t.title().length()!=0?t.title():t.value()));

				//通过反射的方法执行这个方法
				//使用obj实例来运行该方法
				m.invoke(obj);
				System.out.println("\n\n-------------------");
			}
		}
	}
	
	public static void main(String[] args) throws Exception {
		Runner.launch(A.class);
	}
}
