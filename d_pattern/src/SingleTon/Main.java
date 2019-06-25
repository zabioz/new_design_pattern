package SingleTon;

public class Main {

	public static void main(String[] args) {
		
	Satan satan1 = Satan.getInstance(); //satan1이라는 인스턴스를 호출함
	Satan satan2 = Satan.getInstance(); //2도 호출
	
	satan1.setHp(50); //satan1 인스턴스에 hp를 입력
	
	System.out.println(satan1.getHp()); //1,2를 출력함
	System.out.println(satan2.getHp()); 
	
	satan2.setHp(33); //이번엔 satan2 인스턴스에 hp를 입력
	
	System.out.println(satan1.getHp());	//1,2를 출력함
	System.out.println(satan2.getHp()); 	
	
	}
}