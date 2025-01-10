package poly.ex4;

public class Cow extends AbstractAnimal{
	
	//추상메서드는 반드시 오버라이딩
	@Override
	public void sound() {
		System.out.println("음메");
	}

	@Override
	public void move() {
		System.out.println("소 이동");
	}
}