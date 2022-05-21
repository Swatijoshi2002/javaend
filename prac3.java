import java.io.*;
class Ab
{

public static void main(String args[])throws IOException
{
  FileInputStream fis=new FileInputStream("/tmp/guest-odjbmn/file1.txt");
   BufferedInputStream bis=new BufferedInputStream(fis);
   FileOutputStream fos=new FileOutputStream("/tmp/guest-odjbmn/file3.txt");
   BufferedOutputStream bos=new BufferedOutputStream(fos);
  int i=0;
  while((i=bis.read())!=-1)
{
  bos.write(i);
}
bis.close();
bos.close();
fis.close();
fos.close();
}
}
