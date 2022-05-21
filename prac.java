import java.io.*;
class A
{

public static void main(String args[])throws IOException
{
  FileInputStream fis=new FileInputStream("/tmp/guest-odjbmn/file1.txt");
  int i=0;
  while((i=fis.read())!=-1)
{
   System.out.print((char)i);
}
fis.close();
}
}
