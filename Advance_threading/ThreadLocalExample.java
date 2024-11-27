public class ThreadLocalExample
{
    public static void main(String a[])
	{
		MyRunnable sharedRunnableInstance=new MyRunnable();
		
		Thread thread1=new Thread(sharedRunnableInstance);
		Thread thread2=new Thread(sharedRunnableInstance);
		Thread thread3=new Thread(sharedRunnableInstance);
		Thread thread4=new Thread(sharedRunnableInstance);
		
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
	}
}

class MyRunnable implements Runnable
{
	private ThreadLocal<Integer> threadLocal=new ThreadLocal<>();
	
	public void run()
	{
		int z=(int)(Math.random()*100D);
		System.out.println(Thread.currentThread().getName()+" "+z);
		threadLocal.set(z);
		//threadLocal.set(x++);
		
		try{
			Thread.sleep(2000);
		}catch(InterruptedException e)
		{}
		System.out.println(Thread.currentThread().getName()+" "+threadLocal.get());
	}
}


/*

E:\Advance_java\Advance_threading>javac ThreadLocalExample.java

E:\Advance_java\Advance_threading>java  ThreadLocalExample
Thread-0 89
Thread-1 15
Thread-2 41
Thread-3 95
Thread-3 95
Thread-2 41
Thread-1 15
Thread-0 89
*/