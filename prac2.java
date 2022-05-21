import java.io.*;
class Abc
{

public static void main(String args[])throws IOException
{
  FileInputStream fis=new FileInputStream("/tmp/guest-odjbmn/file1.txt");
   FileOutputStream fos=new FileOutputStream("/tmp/guest-odjbmn/file2.txt");
  int i=0;
  while((i=fis.read())!=-1)
{
  fos.write(i);
}
fis.close();
fos.close();
}
}
