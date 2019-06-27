package Factory;

	public class SuperKnightCastle extends Castle { //캐슬에서 상속받아 클래스 정
	@Override //상속받은것을 재정의 
	Knight createKnighT(String name) { // createKnighT 메소드 정
		switch(name) { // 네임이라는 조건으로 switch-case문을정의	
			case "super": return new SuperKnight(); //슈퍼라는 값은 슈퍼나이트를 생성한뒤 반환함
			case "power": return new PowerKnight(); //파워라는 값은 파워나이트를 생성한뒤 반환함
		}
		return null; // null값을 반환함
	}
}
