package decorator;

public class NecklaceAccessory extends Accessory { //악세사리에서 상속받아 넥클래스 악세사리 정의
	
	public NecklaceAccessory(Princess princess) { //메소드 정의
		super(princess); //프린세스클래스에 상속받아 참조할때 사용
	}
	
	@Override
	public String getName() {
		return "necklace" + princess.getName();
	}
}
