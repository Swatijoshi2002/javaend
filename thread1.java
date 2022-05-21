import java.lang.Thread;
class A extends Thread{

 public void run()
{
 int i=0;
 for(i=0;i<100;i++)
  {
   System.out.println("Thread1 begin");
   }
}

}

class B extends Thread{

 public void run()
{
 int i=0;
 for(i=0;i<5;i++)
  {
   System.out.println("Thread2 begin");
   }
}

}

class C extends Thread{

 public void run()
{
 int i=0;
 for(i=0;i<5;i++)
  {
   System.out.println("Thread3 begin");
   }
}

}


class Run{

public static void main(String args[])
{

 A obj1=new A();
 //Thread t1=new thread(obj1);
  B obj2=new B();
 //Thread t2=new thread(obj2);
  C obj3=new C();
 //Thread t3=new thread(obj3);
obj1.start();
obj2.start();
obj3.start();
 

}

}




