package Document;
public class Main_Class {
	public static void main(String[] args) {
		System.out.println("------Employee info------");
		Employee e=new Employee();//object of employee class
		e.name="PW";
		e.age=20;
		e.contact="1234567890";
		e.address="ghulewadi";
		e.Salary="12349.5";
		e.specialization="EEE";
		e.displayempInfo();
		System.out.println();
		System.out.println("------Manager info------");
		Manager M=new Manager();//object of manager class
		M.name="PW";
		M.age=20;
		M.contact="1234567890";
		M.address="ghulewadi";
		M.Salary="12349.5";
		M.department="hr";
		M.displayempInfo();
	}

}