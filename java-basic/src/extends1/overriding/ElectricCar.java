package extends1.overriding;

public class ElectricCar extends Car{
	
	@Override // =@ -> 애노테이션 주석이랑 비슷한데, 프로그램이 읽을 수 있는 특별한 주석 
	public void move() {
		System.out.println("전기차를 빠르게 이동합니다.");
		
	}
	
	public void charge() {
		System.out.println("충전합니다");
	}
	
}
