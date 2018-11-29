import java.net.*;
import java.io.*;
public class multipleConnection
{
	public static void main(String[] args)
	{
		
		//do
		//{
		//System.out.println("Enter name of host");
		Socket s= null;
		try {
			s = new Socket( InetAddress.getByName("www.google.com"),80);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Remote socket address is " + s.getRemoteSocketAddress());
		System.out.println("Local socket address is "+ s.getLocalSocketAddress());
		//System.out.println("Want to make new connection");
		
		//}
		//while(in.nextChar()=='y');
	}
}