package extends1.super2;

public class ClassB extends ClassA{

	public ClassB(int a) {
		super(); // 기본생성자 생략 가능
		System.out.println("ClassB 생성자 a = " + a);
	}
	
	public ClassB(int a, int b) {
		super(); // 기본 생성자 생략 가능
		System.out.println("ClassB 생성자 a = " + a + "b = " +b);
	}
}

// ClassA를 상속받았기에 super()를 사용해 부모 클래스를 호출. 
// 기본생성자는 생략 가능.
