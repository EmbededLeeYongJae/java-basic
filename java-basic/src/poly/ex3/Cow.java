package poly.ex3;

public class Cow extends AbstractAnimal{
	
	//추상메서드는 반드시 오버라이딩
	@Override
	public void sound() {
		System.out.println("음메");
	}

}