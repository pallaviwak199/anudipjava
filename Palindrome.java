package Document;
import java.util.Scanner;

	public class Palindrome {
		public static boolean isPalindrome(String str)
	    {
	        String r = "";// Initializing an empty string to store the reverse  of the original str
	        for (int i = str.length() - 1; i >= 0; i--) {
	            r = r + str.charAt(i);
	        }
	        if (str.equals(r)) // Checking if both the strings are equal
	        return true;
	        else
			return false;
			
	    }
	    public static void main(String[] args)
	    {
	    	Scanner sc=new Scanner(System.in);
	    	System.out.println("Enter a String");
	        String s = sc.next();// Input string
	        s = s.toLowerCase();// Convert the string to lowercase
	        if(isPalindrome(s))
	        	System.out.println(s+" is palindrome");
	        else
	        	System.out.println(s+" is not palindrome");
	    }

	}	