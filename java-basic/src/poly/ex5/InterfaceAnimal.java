package poly.ex5;

public interface InterfaceAnimal {
	
	//여러가지 메서드가 다 추상인것은 인터페이스로 만든다.
	
	void sound(); //public abstract
	void move(); //public abstract
	
	//모든 메서드가 추상 메서드다. 
	//따라서 물려 받을 수 있는 기능이 없고 오히려 인터페이스에 정의한 모든 메서드를 자식이 오버라이딩 해서 기능을 구현해야 한다.따라서 구현한다고 표현한다.
	//인터페이스는 이름만 있는 설계도이고 이 설계도가 실제 어떻게 작동하는지는 하위 클래스에서 모두 구현해야함.

}
