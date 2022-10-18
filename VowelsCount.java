package Document;

public class VowelsCount { 
	public static int countVowels() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The string :");
		String s1=sc.next();
		char ch[]=s1.toCharArray();
	    int count=0;
	    for(int i=0;i<ch.length;i++) {
		    if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u') {
		    	count++;
		    }
		}
	    
	    try {
	    	if(s1.contains("x"))
	    	throw new Exception();
	    }
	    catch(Exception e) {
	    	System.out.println("String should not conatin x");
	    }
	    return count;
	}
	
	public static void main(String[] args) {  
		System.out.println("Number of vowels in the String :"+countVowels());
	}

}