package Document;
public class Calculator{

	//method for addition upto any number
	public double add(int j,double ... k) {
		// TODO Auto-generated method stub
		double result=j;
		for(double x:k) {
			result+=x;      //logic of addition
		}
		return result;
	}
	//method for substraction upto any number
	public double sub(int j,double ... k) {
		// TODO Auto-generated method stub
		double result=j;
		for(double x:k) {
			result-=x;      //logic of substraction
		}
		return result;
	}
	//method for multiplication upto any number
	public double mul(int j,double ... k) {
		// TODO Auto-generated method stub
		double result=j;
		for(double x:k) {
			result*=x;      //logic of multiplication
		}
		return result;
	}
	//method for division upto any number
	public double div(int j,double ... k) {
		// TODO Auto-generated method stub
		double result=j;
		for(double x:k) {
			result/=x;      //logic of division
		}
		return result;
	}
	

}