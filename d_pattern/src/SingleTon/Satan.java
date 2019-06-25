package SingleTon;

public class Satan {
	private static Satan satan;
	private int hp; //변수선언
	
	private Satan() {
		hp = 100; //값대입
	}

	public static Satan getInstance() { //메소드 추가
		if(satan == null) {
			satan = new Satan(); 
		}
		return satan;  //사탄의 값이 없을때 새로운 사탄을 만들어내고 반환한다
		
	}
	
	public int getHp() { //입력값이 없는 메소드 추가
		return hp;
	}
	public void setHp(int hp) { //리턴값이 없는 메소드 추가 this는 자신의 hp를 지정
		this.hp = hp;
	}
	
}



