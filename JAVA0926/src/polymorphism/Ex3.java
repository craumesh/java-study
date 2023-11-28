package polymorphism;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee("홍길동", 3000);
		System.out.println("Employee 정보 : " + emp.getEmployee());
		emp.salaryCalculation();
		
		Manager man = new Manager("리순신", 4000, "개발부", 3);
		System.out.println("관리자 정보 : " + man.getManager());
		man.salaryCalculation();
		
		Engineer eng = new Engineer("이진수", 1100, 1);
		System.out.println("Engineer 정보 : " + eng.getEngineer());
		eng.salaryCalculation();
		
		System.out.println("====================================================");
		
		// 각 인스턴스의 salaryCalculationAll() 메서드를 호출하여
		// 자신의 인스턴스를 파라미터로 전달
		emp.salaryCalculationAll(emp);
		man.salaryCalculationAll(man);
		eng.salaryCalculationAll(eng);
		
		System.out.println("----------------------------------------------------");
		
		emp.salaryCalculationAll(emp);
		emp.salaryCalculationAll(man);
		emp.salaryCalculationAll(eng);
	}

}

class Employee {
	String name;
	int salary;
	
	// 본기생자성
	//public Employee() {}

	public Employee(String name, int salary) {
		super(); // 오비약뜨 클래스의 오비약뜨() 기생본성자 호출
		this.name = name;
		this.salary = salary;
	}
	
	public String getEmployee() {
		return name + ", " + salary;
	}
	
	// 일반 직원의 연봉 계산(기본 연봉을 그대로 적용)
	public void salaryCalculation() {
		System.out.println("연봉 : " + salary);
	}
	
	// 전 직원의 연봉을 슈퍼클래스인 Employee 클래스에서 계산
	// => 다형성 필요(Employee, Manager, Engineer 인스턴스 모두 처리)
	//	따라서 메서드 파라미터로 다형성을 적용한 Employee 타입 필요
	public void salaryCalculationAll(Employee emp) {
		int salaryResult = 0;
		
		// 참조 영역의 축소로 인해 각 서브클래스 타입 멤버변수는 보이지 않음
		// => Employee를 제외한 Manager, Engineer 의 경우
		//	다시 다운캐스팅을 통해 각 클래스에서 정의한 멤버에 접근해야 한다
		// => 단, 무작정 다운캐스팅을 수행할 경우 오류가 바랭할 수 있으므로
		//	반드시 instanceof 연산자를 통해 타입 판별후 다운캐스팅 필요
		// 	이 경우 반드시 하위타입부터 판별을 수행해야 한다
		if(emp instanceof Manager) {
			// Employee -> Manager 타입으로 다운캐스팅 가능
			System.out.println("Employee -> Manager로 다운캐스팅");
			Manager man = (Manager)emp;
			
			// 업캐스팅으로 축소됐던 참조영역이 다운캐스팅으로 확대되었으므로
			// 다운캐스팅 된 Manager 타입 인스턴스를 통해 모든 멤버변수 접근 가능
			// 기본 연봉과 관리 인원 수에 따른 인센티브를 더해서 계산
			salaryResult = man.salary + (man.manageEmployeeCount * 10);			
		} else if(emp instanceof Engineer) {
			System.out.println("Employee -> Engineer로 다운캐스팅");
			Engineer eng = (Engineer)emp;
			
			salaryResult = eng.salary + (eng.numOfCertificate * 20);
		} else if(emp instanceof Employee) {
			System.out.println("Employee 그대로 사용");
			salaryResult = salary;
		}		
		System.out.println("연봉 : " + salaryResult + "만원 입니다");
	}
}

class Manager extends Employee {
	String depart;
	int manageEmployeeCount;
	
	// 슈퍼클래스 기본생성자가 없으므로 파라미터 생성자를 호출하는 생성자 성의
	public Manager(String name, int salary, String depart, int manageEmployeeCount) {
		super(name, salary);
		this.depart = depart;
		this.manageEmployeeCount = manageEmployeeCount;
	}
	
	public String getManager() {
		//return name + ", " + salary + ", " + depart + ", " + manageEmployeeCount + "명";
		return getEmployee() + ", " + depart + ", " + manageEmployeeCount + "명";
	}
	
	// Employee의 연봉 계산 메서드를 오버라이딩
	// => 매니저 연봉은 기본 연봉 + (관리직원수 * 10)
	@Override
	public void salaryCalculation() {
		int salaryResult = salary + manageEmployeeCount * 10;
		System.out.println("연봉 : " + salaryResult);
	}	
}

class Engineer extends Employee {
	int numOfCertificate;

	public Engineer(String name, int salary, int numOfCertificate) {
		super(name, salary);
		this.numOfCertificate = numOfCertificate;
	}
	
	public String getEngineer() {
		return getEmployee() + ", " + numOfCertificate + "개";
	}

	@Override
	public void salaryCalculation() {
		int salaryResult = salary + numOfCertificate * 20;
		System.out.println("연봉 : " + salaryResult); 
	}
	
	
}


