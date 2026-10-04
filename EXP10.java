import java.util.Scanner;
import java.io.File;
class FileDemo {
public static void main(String[] args) {
Scanner input = new Scanner(System.in); 
System.out.print("Enter file path: ");
String s = input.nextLine();
 File f1 = new File(s);
System.out.println("File Name: " + f1.getName());
System.out.println("Path: " + f1.getPath());
System.out.println("Absolute Path: " + f1.getAbsolutePath());
System.out.println("Parent: " + f1.getParent());
 System.out.println("This file is: " + (f1.exists() ? "Exists" : "Does not exist"));
System.out.println("Is file: " + f1.isFile());
System.out.println("Is Directory: " + f1.isDirectory());
System.out.println("Is Readable: " + f1.canRead());
System.out.println("Is Writable: " + f1.canWrite());
System.out.println("Is Absolute: " + f1.isAbsolute());
System.out.println("File Last Modified: " + f1.lastModified());
System.out.println("File Size: " + f1.length() + " bytes");
System.out.println("Is Hidden: " + f1.isHidden()); 
}
}





OUTPUT:

 D:/JavaProgr
 File Name:Fibonacci.java 
Path: Fibonacci.java 
Abs Path:c:\sameer\Fibonacci.java 
Parent: Null 
This file is:Exists 
Is file:true 
Is Directory:false 
Is Readable:true 
Is Writable:true 
Is Absolute:false 
File Last Modified:1206324301937 
File Size: 406 bytes 
Is Hidden: false 
ams> java FileDemo
 Fibonacci.java 

