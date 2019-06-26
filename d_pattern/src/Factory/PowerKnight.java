package Factory;

public class PowerKnight extends Knight{ //나이트에서 상속받은 클래스생성
	@Override //상속받은것을 재정의
	public String getName() { //메소드 정의
		return "powerknight"; //반환
	}

}
