package final1;

public class FinalRefMain {

	public static void main(String[] args) {

//		final Data data ; // 참조형
//		data = new Data(); // 밑에 코드랑 같은 말
		final Data data = new Data();
		// data = new Data(); // 불가능 컴파일 오류
		
		
		// 참조 대상의 값은 변경 가능
		data.value = 10;
		System.out.println(data.value);
		data.value = 20;
		System.out.println(data.value);
	}

}