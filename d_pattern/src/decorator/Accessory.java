package decorator;

public abstract class Accessory implements Princess { //프린세스를 상속받은 액세서리 클래스를 정의
	protected Princess princess; //상속관계의 프린세스 클래스 이외에는 접근이 불가
	
	public Accessory(Princess princess) { //메소드 정의 (이 부분 좀더 자세히 알려주시면 감사하겠습니다)
		
		this.princess = princess; 
	}
	
	@Override //재정의
	public abstract String getName(); //추상메소드 정의 
}
