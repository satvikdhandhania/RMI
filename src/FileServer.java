import java.io.*;
import java.rmi.*;
public class FileServer
{
	public static void main(String argv[])
	{
		/*if(System.getSecurityManager() == null)
		{
			System.setSecurityManager(new RMISecurityManager());
		}
		*/
            try
		{
			FileInterface fi = new FileImpl("FileServer");
			Naming.rebind("//172.16.41.75:8852/FileServer", fi);
		}
		catch(Exception e)
		{
			System.out.println("FileServer: "+e.getMessage());
			e.printStackTrace();
		}
	} 
}   