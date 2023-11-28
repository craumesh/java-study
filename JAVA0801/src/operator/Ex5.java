package operator;

class Student{
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public void showStudentInfo() {
		System.out.println(studentName + "," + address);
	}
}

public class Ex5 {

	public static void main(String[] args) {
		/* 비교 연산자(<, >...)
		 * - 피 연산자 간의 대소 관계 등을 비교하여 true 혹은 false 값 리턴
		 * - ^^ :D ;< :3 UwU
		 * float와 double 타입은 비교 시 서로 다른 값으로 취급하기 때문에 강제 형변환 필수
		 */
		Student YCH = new Student();
		YCH.studentName = "YCH";
		YCH.address = "YD";
		YCH.showStudentInfo();
	}

}
