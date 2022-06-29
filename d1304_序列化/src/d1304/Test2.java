package d1304;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Test2 {
	public static void main(String[] args) throws Exception {
		/*
		 * OIS--FIS--f3
		 */
		ObjectInputStream in =
		 new ObjectInputStream(Files.newInputStream(Paths.get("d:/abc/f3")));
		//new ObjectInputStream(new FileInputStream("d:/abc/f3"));
		Student s = (Student) in.readObject();   
		System.out.println(s);
		
		in.close();
		
	}
}




