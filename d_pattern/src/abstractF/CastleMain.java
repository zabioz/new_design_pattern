package abstractF;

public class CastleMain { 
	public static void main(String[] args) { //메인함수 정의
		Castle castleA = new CastleA(); //선언과 동시에 castleA = CastleA라는 인스턴스 생성
		castleA.getArcher().process(); //castleA인스턴스를 참조하여 인스턴스의 해당 클래스에 정의된 process를 호출함
		castleA.getKnight().process();
		
	//Archer aaa = castleA.getArcher();
	//		aaa.process();
			
		Castle castleA2 = new CastleA2(); //castleA2 = CastleA2라는 인스턴스 생성
		castleA2.getArcher().process(); //castleA2인스턴스를 참조하여 인스턴스의 해당 클래스에 정의된 process를 호출함
		castleA2.getKnight().process();
	}
}
