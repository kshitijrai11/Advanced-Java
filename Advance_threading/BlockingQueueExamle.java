import java.util.concurrent.*;

public class BlockingQueueExamle
{
	public static void main(String a[]) throws Exception
	{
		BlockingQueue q=new ArrayBlockingQueue(5);
		Producer producer=new Producer(q);
		Consumer consumer=new Consumer(q);
		System.out.println("String Producer..");
		new Thread(producer).start();
		System.out.println("Starting Consumer..");
		new Thread(consumer).start();
	}
}
//Producer class it sleeps 3sec. between each put() call.
//this will the consumer to block ,while waiting for on=bject in the queue.

class Producer implements Runnable
{
	protected BlockingQueue queue=null;
	
	public Producer(BlockingQueue queue)
	{
		this.queue=queue;
	}
	
	public void run()
	{
		try{
			queue.put("String ONE");
			Thread.sleep(3000);
			queue.put("String TWO");
			Thread.sleep(3000);
			queue.put("String THREE");
		
		}catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}

//consumer class. it takes out the object from the queue and print then to System.out.

class Consumer implements Runnable
{
	protected BlockingQueue queue=null;
	public Consumer(BlockingQueue queue)
	{
		this.queue=queue;
	}
	public void run()
	{
		try{
			System.out.println(queue.take());
			System.out.println(queue.take());
			System.out.println(queue.take());
		}catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}

/*
E:\Advance_java\Advance_threading>javac BlockingQueueExamle.java
Note: BlockingQueueExamle.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.

E:\Advance_java\Advance_threading>java  BlockingQueueExamle
String Producer..
Starting Consumer..
String ONE
String TWO
String THREE
*/