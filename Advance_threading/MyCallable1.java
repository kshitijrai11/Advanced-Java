import java.util.concurrent.*;
import java.util.*;

class MyCallable1 implements Callable
{
  public String call() throws Exception
  {
   System.out.println(Thread.currentThread().getName()+" starts");
   Thread.sleep(2000);
   System.out.println(Thread.currentThread().getName()+" ends");
   //return name of thread.
   return(Thread.currentThread().getName());
  }
} 
class MyCallableTest
{
	public static void main(String s[])
	{
		ExecutorService executor=Executors.newFixedThreadPool(5);
		
		//collection to store result
		ArrayList<Future<String>> list=new ArrayList<Future<String>>();
		
		//future list[]=new Future[10];
		for(int i=0;i<10;i++)
		{
			Future<String> future=executor.submit(new MyCallable1());
			list.add(future);
			//list[i]=executor.submit(new MyCallable1());
			
		}
		//print result
			for(Future<String> future:list)
			{
				try
				{
					System.out.println(future.get());
				}catch(Exception e){
					
				}
			}
		executor.shutdown();	
	}
} 
/*

E:\Advance_java\Advance_threading>javac MyCallable1.java
Note: MyCallable1.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.

E:\Advance_java\Advance_threading>java MyCallableTest
pool-1-thread-1 starts
pool-1-thread-5 starts
pool-1-thread-4 starts
pool-1-thread-2 starts
pool-1-thread-3 starts
pool-1-thread-3 ends
pool-1-thread-2 ends
pool-1-thread-1 ends
pool-1-thread-3 starts
pool-1-thread-4 ends
pool-1-thread-5 ends
pool-1-thread-4 starts
pool-1-thread-1
pool-1-thread-2
pool-1-thread-3
pool-1-thread-4
pool-1-thread-5
pool-1-thread-1 starts
pool-1-thread-2 starts
pool-1-thread-5 starts
pool-1-thread-4 ends
pool-1-thread-3 ends
pool-1-thread-2 ends
pool-1-thread-5 ends
pool-1-thread-1 ends
pool-1-thread-2
pool-1-thread-3
pool-1-thread-1
pool-1-thread-4
pool-1-thread-5

*/