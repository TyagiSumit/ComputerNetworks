// for input write address of website like "www.google.com"
import java.io.*;
import java.net.*;
import java.util.*;
public class ipManipulate
{
	public static void main(String[] args)throws Exception
	{
		BufferedReader ins=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter host");
		String str=ins.readLine();
	
		InetAddress add=InetAddress.getByName(str);

		String ip=add.getHostAddress().toString();

		StringTokenizer t=new StringTokenizer(ip,".");
		
		

		int a=Integer.parseInt(t.nextToken());


		int b=Integer.parseInt(t.nextToken());
		int c=Integer.parseInt(t.nextToken());
		int d=Integer.parseInt(t.nextToken());
		
		if(a<=127)
		{
			System.out.println("Network id is : "+a+".0.0.0");
			System.out.println("Host id is    : "+b+"."+c+"."+d);
		}
		else if(a<=191)
		{
		System.out.println("Network id is : "+a+"."+b+".0.0");
		System.out.println("Host id is    : "+c+"."+d);
		}
		else if(a<=223)
		{
		System.out.println("Network id is  : "+a+"."+b+"."+c+".0");
		System.out.println("Host id   is  : "+d);
		}
		else if(a<=239)
		{
			System.out.println("It is an Multicast Address : "+ip);
		}
	}
}