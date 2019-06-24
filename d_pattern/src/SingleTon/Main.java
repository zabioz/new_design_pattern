package SingleTon;

public class Main {

	public static void main(String[] args) {

	Satan satan1 = Satan.getInstance();
	Satan satan2 = Satan.getInstance();

	Satan hp1 = Satan.getInstance();
	Satan hp2 = Satan.getInstance();

	System.out.println(hp1);
	System.out.println(hp2);
	
	
	System.out.println(satan1.getHp());
	System.out.println(satan2.getHp());
	
	hp1.setHp(90);
	System.out.println(satan1.getHp());
	System.out.println(satan2.getHp());
	
	hp2.setHp(60);
	System.out.println(satan1.getHp());
	System.out.println(satan2.getHp());
	
	
	if (hp1 == hp2) {
		System.out.println("satan1과 satan2는 같습니다");
	}
	else {
		System.out.println("satan1과 satan2는 다릅니다");
		}
	}
}