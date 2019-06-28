package decorator;

public class DressPrincess implements Princess{ //프린세스를 상속받아 드레스프린세스를 정의 
	@Override //재정의
	public String getName() { //메소드정의
		return "dressPrincess"; //반환
	}
}
