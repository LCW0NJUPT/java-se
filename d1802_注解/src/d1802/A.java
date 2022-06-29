package d1802;

public class A {
	@Test(id=1, title="测试a")  // 1 , "测试a"  , ""
	public void a() {
		System.out.println("A.a");
	}
	public void b() {
		System.out.println("A.b");
	}
	@Test("测试b")          // 1 ,  ""  ,  "测试b"
	public void c() {
		System.out.println("A.c");
	}
	@Test(id=3)             //3 , ""  ,  ""
	public void d() {
		System.out.println("A.d");
	}
}
