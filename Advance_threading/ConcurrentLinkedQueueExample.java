import java.util.concurrent.*;

public class ConcurrentLinkedQueueExample
{
	public static void main(String a[])
	{
		ConcurrentLinkedQueue<String> queue=new ConcurrentLinkedQueue<>();
		Thread producer=new Thread(new Producer(queue));
		Thread consumer=new Thread(new Consumer(queue));
		producer.start();
		consumer.start();
	}
}
//the producer puts  String on the queue.

class Producer implements Runnable
{
	ConcurrentLinkedQueue<String> queue;
	Producer(ConcurrentLinkedQueue<String>queue)
	{
		this.queue=queue;
	}
	public void run()
	{
		System.out.println("Producer Stated");
		try{
			for(int i=1;i<10;i++)
			{
				queue.add("String"+i);
				System.out.println("added:String" +i);
				Thread.currentThread().sleep(1000);
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

//the consumer remove String from the queue
class Consumer implements Runnable
{
	ConcurrentLinkedQueue<String> queue;
	Consumer(ConcurrentLinkedQueue<String> queue)
	{
		this.queue=queue;
	}
	public void run()
	{
		String str;
		System.out.println("Consumer Started");
		for(int x=0;x<10;x++)
		{
			while((str=queue.poll())!=null)
		{
			System.out.println("Removed:"+str);
		}
		try{
			Thread.currentThread().sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	  }	
	}
}

/*

E:\Advance_java\Advance_threading>javac ConcurrentLinkedQueueExample.java

E:\Advance_java\Advance_threading>java  ConcurrentLinkedQueueExample
Producer Stated
Consumer Started
added:String1
Removed:String1
added:String2
Removed:String2
Removed:String3
added:String3
added:String4
added:String5
Removed:String4
Removed:String5
added:String6
Removed:String6
added:String7
Removed:String7
added:String8
Removed:String8
added:String9
Removed:String9
*/