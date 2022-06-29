package d1202;

public class Transformer {
	//包含一个武器接口
	private Weapon w; //默认 null
	//给变量w赋值的方法
	public void setWeapon(Weapon w) {
		this.w = w;
	}
	
	public void attack() {
		System.out.println("变形金刚进攻");
		if (w == null) {
			System.out.println("用牙咬");
			return;
		}		
		String t = "";
		switch(w.getType()) {
		case Weapon.TYPE_COLD: t="冷兵器";break;
		case Weapon.TYPE_HOT: t="热兵器";break;
		case Weapon.TYPE_NUCLEAR: t="核武器";break;
		}		
		//使用冷兵器倚天剑进攻
		System.out.println("使用"+t+w.getName()+"进攻");
		w.kill();
	}
}









