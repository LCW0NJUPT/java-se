package d1202;

public class AK47 implements Weapon {
	@Override
	public void kill() {
		System.out.println("耍枪");
	}
	@Override
	public String getName() {
		return "AK47";
	}
	@Override
	public int getType() {
		return Weapon.TYPE_HOT;
	}
}