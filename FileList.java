package Document;

import java.io.File;

public class FileList{
	//creating a file
           public static void main(String[] args) {
			File file=new File("D:\\MyName.txt");
			String[] s=file.list();
			System.out.println("File names present in the folder");
			for (String string : s) {
				System.out.println(string);
			}
			System.out.println("\nPermission check:");
			File[] f =file.listFiles();
			for (File file2 : f) {
				
				System.out.println(file2);
				System.out.println("File Name : "+file2.getName());
				System.out.println("File Length : "+file2.length());
				System.out.println("File Hidden : "+file2.isHidden());
				System.out.println("Writable : "+file2.canWrite());
				System.out.println("Readable : "+file2.canRead());
				System.out.println("Executable : "+file2.canExecute()+"\n");
			}
		}

	}