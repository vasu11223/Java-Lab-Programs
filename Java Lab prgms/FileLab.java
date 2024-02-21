import java.io.*; 
import java.util.Scanner; 
class Experiment8
{
	public static void main(String args[])throws Exception
	{
		String fn;
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter a file name "); 
		fn=sc.next();
		File f1 = new File(fn);
		System.out.println("File Name: " + f1.getName()); 
		System.out.println("Absolute Path: " + f1.getAbsolutePath()); 
		System.out.println(f1.exists() ? "The file exists" : "The file does not exist"); 
		System.out.println(f1.canWrite() ? "It is writeable" : "It is not writeable"); 
		System.out.println(f1.canRead() ? "It is readable" : "It is not readable"); 
		System.out.println(f1.isDirectory() ? "It is a directory " : "It is not a directory"); 
		System.out.println(f1.isFile() ? "It is normal file" : "It might be a named pipe");
		System.out.println(f1.isAbsolute() ? "It is an absolute file" : "It is not absolute file"); 
		System.out.println("File size: " + f1.length() + " Bytes");
	
		FileInputStream f = new FileInputStream(f1); 
		int n=f.available(); 
		int nl=0,nw=0;
		char ch;
		System.out.println("Contents of the file: -\n"); 
		

for(int i=0;i<n;i++)
		{
			ch=(char)f.read(); 
			System.out.print(ch); 
			if(ch=='\n')
				nl++;
			else if(ch==' ') 
				nw++;
		}
		System.out.println("\nNumber of lines : "+nl); 
		System.out.println("\nNumber of words : "+(nl+nw)); 
		System.out.println("\nNumber of characters : "+n);
	}
}
