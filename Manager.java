package Document;

public class Manager extends Member {
	//default constructor
	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}
	//additional data member of manger class
	String department;
	//parameterized constructor
	public Manager(String name, int age, String contact, String address, String Salary) {
		super(name, age, contact, address, Salary);
		// TODO Auto-generated constructor stub
	}
	//method to display information of manager
	void displayempInfo() {
		System.out.println("name:"+name);
		System.out.println("age:"+age);
		System.out.println("contact:"+contact);
		System.out.println("address:"+address);
		System.out.println("department:"+department);
		System.out.println("Salary:"+printSalary());
	}
}