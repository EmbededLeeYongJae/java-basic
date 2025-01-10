package poly.ex3;

//추상메서드를 하나라도 가지고 있으면 추상 클래스로 해야한다.
public abstract class AbstractAnimal {
	
	public abstract void sound();
	
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
	
}
