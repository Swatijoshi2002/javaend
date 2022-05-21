import java.io.*;
class Demo
{

 public static void main(String agrs[])throws IOException
  {

    FileReader isr=new FileReader("/tmp/guest-odjbmn/file5.txt");
    BufferedReader br= new BufferedReader(isr);
    int i=0;
StringBuffer s=new StringBuffer();
String line;
while((line=br.readLine())!=null)
{

s.append(line);
s.append('\n');

}
    
System.out.print(s.toString());

isr.close();
br.close();
  }





}
