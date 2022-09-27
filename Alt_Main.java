package Document;
public class Alt_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alternate a=new Alternate();
	        int a1[] = {0,2,4,6,8,10};
	        int n1 = a1.length;
	        int a2[] = {1,3,5,7,9};
	        int n2 = a2.length;
	        int a3[] = new int[n1+n2];
	        a.alternateMerge(a1, a2, n1, n2, a3);
	        System.out.println("Array after merging");
	        for (int i = 0; i < n1 + n2; i++)
	            System.out.print( a3[i] + " ");
	    }
	}