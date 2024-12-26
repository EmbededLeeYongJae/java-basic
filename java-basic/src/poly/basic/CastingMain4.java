package poly.basic;

//다운캐스팅을 자동으로 하지 않는 이유
public class CastingMain4 {

	public static void main(String[] args) {
		Parent parent1 = new Child();
		Child child1 = (Child) parent1;
		child1.childMethod(); //문제 없음
		
		
		Parent parent2 = new Parent();
		Child child2 = (Child) parent2; //런타임 오류 - ClassCastException (사용할 수 없는 타입으로 다운캐스팅하는 경우 생기는 오류)
		child2.childMethod();// 실행 불가
		
		// 업캐스팅이 안전하고 다운캐스팅이 위험한 이유
		// 업캐스팅의 경우 이런 문제가 절대로 발생하지 않는다. 왜냐하면 객체를 생성하면 해당 타입의 상위 부모 타입은 모두 함께 생성된다! 
		// 따라서 위로만 타입을 변경하는 업캐스팅은 메모리 상에 인스턴스가 모두 존재하기 때문에 안전.
		// 반면 다운캐스팅의 경우 인스턴스에 존재하지 않는 하위 타입으로 캐스팅하는 문제가 발생할 수 있다.
		// 런타임오류 - 고객이 사용하다가 발생할 수 있는 오류로서 안좋은 오류.
		
	}

}
