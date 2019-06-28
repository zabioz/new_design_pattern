package decorator;

public class RingAccessory extends Accessory{
	
	public RingAccessory(Princess princess) {
		super(princess);
	}
	
	@Override
	public String getName() {
		return "ring" + princess.getName();
	}
}
