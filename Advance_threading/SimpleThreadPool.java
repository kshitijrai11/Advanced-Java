import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class WorkerThread implements Runnable
{
  private String command;
  public WorkerThread(String s)
  {
     this.command=s;
  }
  @Override
  public void run()
  {
	  System.out.println(Thread.currentThread().getName()+" Start.comment="+command);
	  processCommand();
	  System.out.println(Thread.currentThread().getName()+" End.");
  }
  private void processCommand()
  {
	  try{
		  Thread.sleep(1000);
	  }catch(InterruptedException e)
	  {e.printStackTrace();}
  }
  
  public String toString()
  {
	  return this.command;
  }
}

public class SimpleThreadPool
{
  public static void main(String s[])
  {
	  ExecutorService executor=Executors.newFixedThreadPool(5);
	  for(int i=0;i<10;i++)
	  {
		  Runnable worker=new WorkerThread("" +i);
		  executor.execute(worker);
	  }
	  executor.shutdown();
	  while(!executor.isTerminated())
	  {
		  
	  }
	  System.out.println("Finished all thread");
  }
}

/*
E:\Advance_threading>javac SimpleThreadPool.java

E:\Advance_threading>java SimpleThreadPool
pool-1-thread-3 Start.comment=2
pool-1-thread-4 Start.comment=3
pool-1-thread-1 Start.comment=0
pool-1-thread-5 Start.comment=4
pool-1-thread-2 Start.comment=1
pool-1-thread-4 End.
pool-1-thread-2 End.
pool-1-thread-5 End.
pool-1-thread-3 End.
pool-1-thread-1 End.
pool-1-thread-3 Start.comment=8
pool-1-thread-5 Start.comment=7
pool-1-thread-2 Start.comment=6
pool-1-thread-4 Start.comment=5
pool-1-thread-1 Start.comment=9
pool-1-thread-4 End.
pool-1-thread-3 End.
pool-1-thread-5 End.
pool-1-thread-1 End.
pool-1-thread-2 End.
Finished all thread*/