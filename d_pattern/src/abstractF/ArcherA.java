package abstractF;

public class ArcherA implements Archer {//아처에서 상속받아 아처A클래스 정
	
	@Override //상속받은것을 재정의
	public void process() { // 메소드정의
		System.out.println("execute ArcherA");//출력
	}
}
