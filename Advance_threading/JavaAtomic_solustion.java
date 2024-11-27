
import java.util.concurrent.atomic.AtomicInteger;

public class JavaAtomic_solustion
{
	public static void main(String a[]) throws InterruptedException
	{
		ProcessingThread pt=new ProcessingThread();
		Thread t1=new Thread(pt,"t1");
		t1.start();
		Thread t2=new Thread(pt,"t1");
		t2.start();
		t1.join();
		t2.join();
		System.out.println("Processing count="+pt.getCount());
	}
} 

class ProcessingThread implements Runnable{
	private AtomicInteger count=new AtomicInteger();
	
	public void run()
	{
		for(int i=1;i<4;i++)
		{
			System.out.println("hello");
			processSomething(i);
			count.incrementAndGet();
		}
	}
	public int getCount()
	{
		return this.count.get();
	}
	private void processSomething(int i)
	{
		//processing som job
		try{
			Thread.sleep(1000);
		}catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}

/*

E:\Advance_java\Advance_threading>javac JavaAtomic_solustion.java

E:\Advance_java\Advance_threading>java  JavaAtomic_solustion
hello
hello
hello
hello
hello
hello
Processing count=6
*/