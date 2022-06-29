package d1302;

import java.io.File;

public class Test1 {
	public static void main(String[] args) {
		String path;

		//path = "D:\\home\\java\\eclipse\\eclipse.exe";//存在的文件
		//path = "D:/home/java/eclipse";//存在的文件夹
		//path = "f:/xxx/xx/xx";//不存在的路径
		path = "D:\\TotalWorkspace\\尝试同步.txt";

		//不会新建文件，仅是创建了File实例来封装字符串
		File f = new File(path);//封装路径
		System.out.println(f.getName());//取文件名
		System.out.println(f.getParent());//取父目录
		System.out.println(f.getAbsolutePath());//取完整路径
		System.out.println(f.length());//文件字节量，目录无效
		System.out.println(f.isFile());//是否是文件
		System.out.println(f.isDirectory());//是否是文件夹

	}
}
