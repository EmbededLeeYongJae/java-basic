package construct;

public class MemberInit {
	
	String name;
	int age; 
	int grade;
	
//	// 기본생성자 - > 자동으로 생성 
//	// 생성자가 하나라도 있으면 기본생성자를 만들지 않는다.
//	MemberInit(){
//				
//	}
//	

	//추가
	void initMember(String name, int age, int grade) {
		this.name = name;
		this.age = age;
		this.grade = grade;
		
	}

}
