package d1802;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/*
 * 元注解：对注解的注解
 * 
 * @Target 设置注解目标：类、方法、成员变量、参数变量...
 * 
 * @Retention 保留范围：源码、字节码、运行期内存
 *      源码：编译成字节码时被丢弃
 *      字节码：类被加载到内存时丢弃
 *      运行期内存：在内存中保留
 */
//@Target({ElementType.TYPE, ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER})

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Test {
	// 如果没有默认值，使用注解时，就必须赋值
	// 有默认值，可以不赋值
	int id() default 0;
	
	String title() default "";
	
	/*
	 * 特殊的属性名  value，只要名字叫value
	 * 有特殊待遇，单独赋值时，可以不写value=
	 * 可以作为一个有意义属性名的别名
	 * @Test("sdfsdfs")
	 * @Test(id=5, value="dfgsdf")
	 * @Test(id=5, title="dfgsdf")
	 */
	
	//title的别名
	String value() default "";
}







