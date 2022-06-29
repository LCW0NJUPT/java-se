package d0307;

public class Test1 {
	public static void main(String[] args) {
		//1到9行
		for (int i = 1; i<=9; i++) {
			//1到i
			for (int j = 1; j<=i; j++) {
				if (j==3 && (i==3 || i==4)) {
					System.out.print(" ");
				}
				System.out.print(
						j+"*"+i+"="+(j*i)+" ");
			}
			System.out.println();

		}
	}
}
