import java.io.*; 
import java.net.*; 
public class UDPClient 
{ 
 public static void main(String[] args) 
{ 
DatagramSocket skt; 
try 
{ 
skt=new DatagramSocket(); 
String msg= "atme college "; 
byte[] b = msg.getBytes(); 
InetAddress host=InetAddress.getByName("127.0.0.1"); 
int serverSocket=6788; 
DatagramPacket request =new DatagramPacket (b,b.length,host,serverSocket); 
skt.send(request); 
byte[] buffer =new byte[1000]; 
DatagramPacket reply= new DatagramPacket(buffer,buffer.length); 
skt.receive(reply); 
System.out.println("client received:" +new String(reply.getData())); 
Computer Network Laboratory 18CSL57 
DEPT OF CSE, ATMECE Page 75 
skt.close(); 
} 
catch(Exception ex) 
{ 
 System.out.println(ex.getMessage()); 
} 
} 
}
