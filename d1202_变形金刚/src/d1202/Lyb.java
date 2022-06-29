package d1202;

public class Lyb implements Weapon {
	@Override
	public void kill() {
		System.out.println("耍棒");
	}
	@Override
	public String getName() {
		return "狼牙棒";
	}
	@Override
	public int getType() {
		return Weapon.TYPE_NUCLEAR;
	}
}