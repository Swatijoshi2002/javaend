import java.io.*;
class Xyz
{

public static void main(String args[])throws IOException
{
  InputStreamReader isr=new InputStreamReader(System.in);
   BufferedReader br=new BufferedReader(isr);
  int i=0;
  System.out.println("HI enter your name");
  String s=br.readLine();
  System.out.print(s);
br.close();
isr.close();
}
}
