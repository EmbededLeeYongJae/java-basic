package poly.basic;

public class CastingMain2 {

	public static void main(String[] args) {
		//부모 변수가 자식 인스턴스 참조(다형적 참조)
		Parent poly = new Child(); //x001
		//단 자식의 기능은 호출할 수 없다. 컴파일 오류
		//poly.childMethid();
		
		//다운캐스팅 (부모 타입 -> 자식 타입) *업캐스팅(자식 타입 -> 부모 타입)* 
		//Child child = (Child) poly; //x001 // 강제로 바꾸는것 // Parent poly
		//child.childMethod();
		
		//일시적 다운캐스팅 -= 해당 메서드를 호출하는 순간만 다운캐스팅
		((Child) poly).childMethod(); //연산자 우선순위때문에 괄호를 한 번 더 사용 
	}
}