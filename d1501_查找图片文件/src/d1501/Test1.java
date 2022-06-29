package d1501;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.println("输入文件夹：");
		String s = new Scanner(System.in).nextLine();
		File dir = new File(s);
		if(! dir.isDirectory()) {
			System.out.println("请输入正确的文件夹");
			return;
		}
		
		List<File> list = f(dir);
		for (File f : list) {
			System.out.println(f.getAbsolutePath());
		}
	}

	private static List<File> f(File dir) {
		ArrayList<File> pic = new ArrayList<>();
		LinkedList<File> stack = new LinkedList<>();
		stack.push(dir);//初始状态，dir先压入		
		while (! stack.isEmpty()) {//栈中还有数据
			File f = stack.pop();//弹出
			if (f.isFile()) { //f是文件
				//if(isPic(f)) {//f是图片文件
					pic.add(f);//图片添加到pic集合
				//}
			} else { //f是文件夹
				
				FileFilter filter = new FileFilter() {					
					@Override
					public boolean accept(File f) {
						if (f.isDirectory()) {
							return true;//接受文件夹
						}
						//也接受图片文件
						String n = f.getName().toLowerCase();
						return n.matches(".+\\.(jpg|png|gif|bmp)");
					}
				};
				
				File[] list = f.listFiles(filter);
				if(list == null) {
					continue;//列不出来不处理，继续弹出下一项
				}
				for (File f2 : list) {//遍历，全部压入栈中
					stack.push(f2);
				}
			}
		}
		return pic;
	}

	private static boolean isPic(File f) {
		// sdf.sdfs.sdf.jpg, a.JPG, .Jpg
		String n = f.getName().toLowerCase();
		return n.matches(".+\\.(jpg|png|gif|bmp)");
	}
}







