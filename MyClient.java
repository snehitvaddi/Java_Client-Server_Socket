import java.io.*;  
import java.net.*; 
import java.util.Scanner;
public class MyClient {  
public static void main(String[] args) { 
String a; 
int count=0;
try{      
Socket s=new Socket("localhost",6666); //Creates socket for specified port number
Scanner sc = new Scanner(System.in); 
a = sc.nextLine(); 
DataOutputStream out=new DataOutputStream(s.getOutputStream()); //DataOutputStream  
out.writeUTF("C: "+a);  

DataInputStream dis=new DataInputStream(s.getInputStream());  //DataInputStream
String  str=(String)dis.readUTF();  
System.out.println(str); 
out.flush();  //Buffer management
out.close(); //output stream close
s.close();  //socket close
}catch(Exception e){System.out.println(e);}  
}  
}
