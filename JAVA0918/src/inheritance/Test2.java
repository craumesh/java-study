package inheritance;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager mn = Manager.getInstance();
		mn.setName("이진수");
		mn.setSalary(10101101);
		mn.setDepart("개발팀");
		System.out.println(mn.getEmployee());
		System.out.println(mn.getManager());
		
	}

}

class Employee {
	private String name;
	private int salary;
	
	public String setName(String name) {
		return this.name = name;
	}
	
	public int setSalary(int salary) {
		return this.salary = salary;
	}
	
	public String getEmployee() {
		return name + ", " + salary;
	}
}

class Manager extends Employee {
	private String depart;
	
	private Manager() {}
	
	private static class LazyHolder {
		private static final Manager instance = new Manager();
	}
	
	public static Manager getInstance() {
		return LazyHolder.instance;
	}
	
	public String setDepart(String depart) {
		return this.depart = depart;
	}
	
	public String getManager() {		
		return getEmployee() + ", " + depart;
	}
}