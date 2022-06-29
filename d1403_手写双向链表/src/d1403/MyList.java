package d1403;
/*
 * {
 * 		{...}-{...}-{...}
 * }
 * 
 * {
 * 		123{ ... }
 * 
 * 		{
 * 			prev: 123,
 * 			value: 8,
 * 			next: 456
 * 		}
 * 
 * 		456{ ... }
 * }
 */
public class MyList {
	//首尾节点
	private Node first; //null
	private Node last;  //null
	//数据的数量
	private int size;   //数据的数量，默认0
	
	public void add(Object value) {
		//如果添加的是第一个节点
		Node n = this.new Node();
		n.value = value;
		//
		if (size == 0) {
			//添加第一个
			n.prev = n;
			n.next = n;
			//
			first = n;
			last = n;
		} else {
			//在尾部新加数据
			//n和last连接
			n.prev = last;
			last.next = n;
			//n和first连接
			n.next = first;
			first.prev = n;
			//新的节点n，变成尾部节点
			last = n;
		}
		
		size++;
	}
	
	public Object get(int i) {
		//越界
		if(i<0 || i>=size) {
			throw 
	        new IndexOutOfBoundsException(""+i);    
		}
		//访问 i 位置的节点对象
		Node n = getNode(i);
		//返回节点中封装的数据
		return n.value;
	}
	
	private Node getNode(int i) {
		if (i==0) {
			return first;
		} else if(i==size-1){
			return last;
		}				
		if (i<size/2) {//i<中间位置
			Node n = first;
			//从下标1到下标i
			for (int j = 1; j <= i; j++) {
				n = n.next;
			}
			return n;
		} else {
			Node n = last;
			//从size-2到i
			for (int j = size-2; j >= i; j--) {       
				n = n.prev;
			}
			return n;
		}
	}
	
	public int size() {
		return size;
	}
	
	//内部类，辅助双向链表，
	//封装局部的数据：保存的值和前后引用
	private class Node {
		Node prev;
		Node next;
		Object value;
	}
	
}








