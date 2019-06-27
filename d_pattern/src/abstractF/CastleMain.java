package abstractF;

public class CastleMain { 
	public static void main(String[] args) { //메인함수 정의
		Castle castleA = new CastleA(); //castleA = CastleA라는 인스턴스 생성
		castleA.getArcher().process(); //castleA인스턴스의 getArcher메소드안의 process를 참조함(??)
		castleA.getKnight().process();
		
		Castle castleA2 = new CastleA2(); //castleA2 = CastleA2라는 인스턴스 생성
		castleA2.getArcher().process(); //castleA2인스턴스의 getArcher메소드안의 process를 참조함(??)
		castleA2.getKnight().process();
	}
}
