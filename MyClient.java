import java.io.*;  
import java.net.*; 
import java.util.Scanner;
public class MyClient {  
public static void main(String[] args) { 
String a; 
int count=0;
try{      
Socket s=new Socket("localhost",6666); 
Scanner sc = new Scanner(System.in); 
a = sc.nextLine(); 
DataOutputStream out=new DataOutputStream(s.getOutputStream());  
out.writeUTF("C: "+a);  

DataInputStream dis=new DataInputStream(s.getInputStream());  
String  str=(String)dis.readUTF();  
System.out.println(str); 
out.flush();  
out.close(); 
s.close();  
}catch(Exception e){System.out.println(e);}  
}  
}