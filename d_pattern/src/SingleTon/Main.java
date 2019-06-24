package SingleTon;

public class Main {

public static void main(String[] args) {

Satan satan1 = Satan.getInstance();
Satan satan2 = Satan.getInstance();
Satan satan3 = Satan.getInstance();

System.out.println(satan1);
System.out.println(satan2);
System.out.println(satan3);

System.out.println(satan1.getHp());
System.out.println(satan2.getHp());

satan1.setHp(1000);

System.out.println(satan1.getHp());
System.out.println(satan2.getHp());
System.out.println(satan3.getHp());
	}
}