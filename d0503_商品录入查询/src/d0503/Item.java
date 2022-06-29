package d0503;
/*
 * 封装商品的数据
 * Item类，商品的对象模板
 */
public class Item {
	int id;//编号
	String name;//名称
	double price;//价格
	int number;//数量
	public Item() {
	}
	public Item(int id,
			    String name,
			    double price,
			    int number) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.number = number;
	}
	
	public String toString() {
		//return "编号：xx, 名称：xx, 价格：xx, 数量：xx";
		return "编号："+id+
				", 名称："+name+
				", 价格："+price+
				", 数量："+number;
	}
}






