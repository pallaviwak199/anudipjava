package Document;

public class Mat_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Matrix a=new Matrix();
		int [] [] a1= {{10,20,30},{40,50,60}};//first two dimentional array
		int [] [] a2= {{10,20,30},{40,50,60}};//second two dimentional array
	      
	        int[] []a3=new int[a1.length][a1[0].length];//assigning length of array
	        a.multiply(a1, a2,  a3);    //method for multiplication of two matrix
	    }
}