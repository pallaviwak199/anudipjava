package Document;
public class Operation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float n1=2;
		float n2=6;
		String choice = "Multiplication";
		switch(choice)
		{
		case "addition":System.out.println("addition is "+(n1+n2));
		break;
		case "Substraction":System.out.println("Substraction is "+(n1-n2));
		break;
		case "Multiplication":System.out.println("Multiplication is "+(n1*n2));
		break;
		case "division":System.out.println("division is "+(n1/n2));
		break;
		case "Modulus":System.out.println("Modulus is "+(n1%n2));
		break;
		}
	}

}