import java.net.ServerSocket;
import java.net.Socket;
import java.io.*;

public class SERVER
{
  public static void main (String [] args)
  {
    try
    {
      System.out.println ("GETTING FROM CLIENT....");
      ServerSocket ss = new ServerSocket (4583);

      Socket soc = ss.accept();
      //connect to client
      System.out.println("CONNECTED TO CLIENT!!! OMG!!!");
      BufferedReader in = new BufferedReader (new 
InputStreamReader(soc.getInputStream()));

      String str = in.readLine();
      PrintWriter out = new PrintWriter(soc.getOutputStream(), true);
      String a = "assalamualaikum". toLowerCase();
 
      if (str.equals(a))
      { 
        out.println("WAALAIKUMUSSALAM!!!");
      }
      
      else
      { 
        out.println("Are you Muslim?");
      }
    }
    catch(Exception e)
    {
      e.printStackTrace();
    }
  }
}
