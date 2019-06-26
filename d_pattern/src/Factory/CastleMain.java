package Factory;

public class CastleMain {
	public static void main(String[] args) { //메인함수생성
		
		Castle kc = new SuperKnightCastle();  //kc = SuperKnightCastle 이라는 인스턴스를 생성
		
		Knight	a = kc.createKnighT("super");//나이트 a에게 kc인스턴스의 createKnighT메소드를 참조하여 super라는 값을 입력함
		Knight a2 = kc.createKnighT("power");
		Knight a3 = kc.createKnighT("super");
		Knight a4 = kc.createKnighT("power");
		
		
		System.out.println(a.getName()); //a를 출력
		System.out.println(a2.getName());
		System.out.println(a3.getName());
		System.out.println(a4.getName());
		
	}
}
