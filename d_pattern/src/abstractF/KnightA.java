package abstractF;

public class KnightA implements Knight { //나이트에서 상속받아 나이트A 클래스 정의
	@Override //상속받은것을 재정의
	public void process() { //메소드 정의
		System.out.println("execute KnightA"); //출력
	}
}