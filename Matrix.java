package Document;

public class Matrix {

	//method for multiplication of two matrix
	static void multiply(int[][] a1, int[][] a2,  int[][] a3)

    {
		for(int i=0;i<a1.length;i++)  ///number of rows
	    {
	    	for(int j=0;j<a1[i].length;j++)//number of columns
	    	{
	    		 a3[i][j] =a1[i][j] *a2[i][j];//logic
	    		System.out.print(a3[i][j]+" ");//printing third array
	    	}	  
	    	System.out.println("");
	    }
		}
}