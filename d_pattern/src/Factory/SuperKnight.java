package Factory;

public class SuperKnight extends Knight { //나이트에서 상속받은 클래스 생성
	@Override // 상속받은것을 재정의
	public String getName() { //메소드 생성
		return "superknight"; //반환
	}
}
