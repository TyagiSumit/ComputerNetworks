import java.net.*;
public class Information
{
	public static void main(String[] args) throws MalformedURLException
	{
		URL hp=new URL("http://www.google.com");
		System.out.println("Protocol : "+hp.getProtocol());
		System.out.println("Port : "+hp.getPort());
		System.out.println("Host : " + hp.getHost());
	}
}