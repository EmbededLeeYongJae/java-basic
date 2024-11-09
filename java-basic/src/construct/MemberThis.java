package construct;

public class MemberThis {

	String nameField;
	
	//서로 이름이 다르니 this 생략가능
	void initMember(String nameParameter) {
		
		//this.nameField = nameParameter;
		nameField = nameParameter;
	}
}
