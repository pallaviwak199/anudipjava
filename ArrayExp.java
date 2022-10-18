package Document;

	public class ArrayExp {
        public static int sum(int[] i,int start,int end) {
        	int sum=0;
        try {
            for(int j=start;j<=end;j++ ) {
				
				sum+=i[j];

	        }
            System.out.println("Addition :"+sum);
            if(sum==0) {
    			System.out.println("Exception is Sum is 0");
				throw new Exception();
            }

		}
		catch(Exception e){
		
		}
	
	    return sum;
}

	public static void main(String[] args) { 
		
		int n;
		Scanner sc=new Scanner(System.in);  
		System.out.print("Enter the size of array : ");  		
		n=sc.nextInt(); 
		
		try {
			if(n==0) {
				System.out.println("IllegalArgumentException is occured.");

				throw new IllegalArgumentException();
			}
			
			int[] array = new int[n];
			System.out.println("Enter the elements  ");  
			for(int i=0; i<n; i++)  
			{  
			array[i]=sc.nextInt();  
			}  
			
			if(array==null)
			{
				System.out.println("NullPointerException is occured.");
				throw new NullPointerException();
			}
			int start;
			System.out.print("Enter the start of array : ");  		
			start=sc.nextInt();  
			
			int end;
			System.out.print("Enter the end of array : ");  		
			end=sc.nextInt(); 
			
			if(start>array.length || end>=array.length ) {
				System.out.println("ArrayIndexOutOfBoundsException is occured.");

				throw new ArrayIndexOutOfBoundsException();
				
			}
			
		    sum(array,start,end);
		    
		    
			
		}
		catch(Exception e) {
			System.out.println("Exception is occured.");
		}
		
		
			
	}
}