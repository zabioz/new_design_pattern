package decorator;

public class PrincessMain {
	public static void main(String[] args) {
		Princess dressPrincess = new DressPrincess();  //드레스프린세스 인스턴스를 생성
		
		Princess ringDressPrincess = new RingAccessory(dressPrincess);  //드레스프린세스를 매개변수로 받아 링악세사리를 생성
		
		Princess necklace_ringDressPrincess = new NecklaceAccessory(ringDressPrincess); //링드레스프린세스를 매개변수로 받아 넥클레스악세사리를 생성
		
		Princess necklace_DoubleringDressPrincess = new RingAccessory(necklace_ringDressPrincess);
		
		System.out.println(necklace_DoubleringDressPrincess.getName()); //호출
		
		Princess PartyDressPrincess = new Princess() {
			@Override
			public String getName() {
				return "partydressPrincess";
			}
		};
		
		PartyDressPrincess = new NecklaceAccessory(new NecklaceAccessory(PartyDressPrincess));
		
		System.out.println(PartyDressPrincess.getName());
	}
}
