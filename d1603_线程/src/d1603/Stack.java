package d1603;

public class Stack {
	private char[] a = new char[5];
	private int index;
	public void push(char c) {
		if(isFull()) {
			return;
		}
		a[index] = c;
		index++;
	}
	public boolean isFull() {
		return index == 5;
	}
	public char pop() {
		if (isEmpty()) {
			return ' ';//用空格字符，表示没有数据
		}
		index--;
		char c = a[index];
		return c;
	}
	public boolean isEmpty() {
		return index == 0;
	}
}
