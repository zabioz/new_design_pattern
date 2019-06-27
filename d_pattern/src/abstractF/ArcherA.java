package abstractF;

public class ArcherA implements Archer {//아처에서 상속받아 아처A클래스 생성
	
	@Override
	public void process() {
		System.out.println("execute ArcherA");
	}
}
