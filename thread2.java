import java.lang.Thread;
class A implements Runnable{

 public void run()
{
 int i=0;
 for(i=0;i<100;i++)
  {
   System.out.println("Thread1 begin");
   }
}

}

class B implements Runnable{

 public void run()
{
 int i=0;
 for(i=0;i<5;i++)
  {
   System.out.println("Thread2 begin");
   }
}

}

class C implements Runnable{

 public void run()
{
 int i=0;
 for(i=0;i<5;i++)
  {
   System.out.println("Thread3 begin");
   }
}

}


class R{

public static void main(String args[])
{

 A obj1=new A();
 Thread t1=new Thread(obj1);
  B obj2=new B();
 Thread t2=new Thread(obj2);
  C obj3=new C();
 Thread t3=new Thread(obj3);
t1.start();
try{
t1.join();
}
catch (Exception e)
{
  System.out.println(e);
}
t2.start();
t3.start();
 

}

}




