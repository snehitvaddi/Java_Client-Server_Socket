import java.io.*;  
import java.net.*;  
public class MyServer {  
public static void main(String[] args){  
try{  
System.out.println("S: Server is started");
ServerSocket ss=new ServerSocket(6666); //Creates socket for specified port number

System.out.println("S: Server is Waiting for client request"); 
Socket s=ss.accept(); //Establishes connection
  
System.out.println("S: Client connected"); 

DataInputStream in=new DataInputStream(s.getInputStream());  //DataInputStream
String  str=(String)in.readUTF();
System.out.println(str);
int intIndex = str.indexOf("hi");
   if(intIndex == - 1) {
	System.out.println("pardon!!");} 
   else {
        DataOutputStream out=new DataOutputStream(s.getOutputStream());  //DataOutputStream
        out.writeUTF("S :Hello,I'm 5n How can I help you!!"); 
	System.out.println("S :Hello,I'm 5n How can I help you!! ");
        out.flush(); //Buffer Arrangement 
        }  
ss.close();  //Socket Close
}catch(Exception e){System.out.println(e);}  
}  
}  
