package Document;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.regex.Pattern;

public class StudentInfoMain {
	public static void main(String[] args) throws Exception {
		
		//creating objects to a student class
		StudentInfo s1=new StudentInfo("ABC","1","9284716693");
		StudentInfo s2=new StudentInfo("XYZ","2","9130620449");
		StudentInfo s3=new StudentInfo("PQR","3","8975747016");
		
		//creating a file
		File f=new File("D:\\MyName.txt");
		FileWriter fw=new FileWriter(f);
		FileReader fr=new FileReader(f);
		
		//writing objects into a file
		fw.write("s1");
		fw.write("s2");
		fw.write("s3");
		//System.out.println(fr.read());
		
		//closing the reader and writer streams
		fw.close();
		fr.close();
		
		System.out.println("\nStudent names starts with 'A' are..\n");
		StudentInfo s[]= {s1,s2,s3};
		for(int i=0;i<s.length;i++)
		{
		   if(Pattern.matches("[A]\\w+",s[i].getName()))
		    {
				System.out.println("Name : "+s[i].getName());
				System.out.println("Student Id : "+s[i].getId());
				System.out.println("Contact no. : "+s[i].getContact()+"\n");
		    }
		}
	}
}