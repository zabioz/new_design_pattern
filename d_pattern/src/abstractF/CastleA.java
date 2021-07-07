package abstractF;

public class CastleA implements Castle { //캐슬에게 상속받아 캐슬A 클래스정의
	@Override //상속받은것을 재정의
	public Knight getKnight() { //메소드정의
		return new KnightA(); //반환
	}
	@Override
	public Archer getArcher() {
		return new ArcherA();
	}
}