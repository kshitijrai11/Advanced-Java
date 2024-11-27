import java.util.concurrent.*;

public class MyThreadFactory implements ThreadFactory
{
   public Thread newThread(Runnable r)
    {
		return new Thread(r);
	}
	 public static void main(String a[])
	 {
		 MyThreadFactory mtf=new MyThreadFactory();
		 Thread t=mtf.newThread(new MyThread());
		 t.start();
	 }
}

class MyThread implements Runnable
{
	public void run()
	{
		System.out.println("Inside: "+Thread.currentThread().getName());
	}
}

/*

E:\Advance_java\Advance_threading>javac MyThreadFactory.java

E:\Advance_java\Advance_threading>java  MyThreadFactory
Inside: Thread-0
*/