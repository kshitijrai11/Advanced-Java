//cyclic barrier program in java 

import java.util.concurrent.CyclicBarrier;

public class HRManager_CB
{
  public static void main(String rg[])
  {
	  CyclicBarrier cyclicBarrier=new CyclicBarrier(3);
	  TechLead techLead1=new TechLead(cyclicBarrier, "Manju");
	  TechLead techLead2=new TechLead(cyclicBarrier, "Anuj");
	  TechLead techLead3=new TechLead(cyclicBarrier, "Malti");
	  
	  techLead1.start();
	  techLead2.start();
	  techLead3.start();
	  
	  System.out.println("No Work For HR Manager.");
  }
}

class TechLead extends Thread
{
	CyclicBarrier cyclicBarrier;
	public TechLead(CyclicBarrier cyclicBarrier,String name)
	{
		super(name);
		this.cyclicBarrier=cyclicBarrier;
	}

@Override
public void run()
{

try
{
	Thread.sleep(3000);
	System.out.println(Thread.currentThread().getName()+ "recuited developer");
	System.out.println(Thread.currentThread().getName()+ " waiting for ohter to complete.....");
	cyclicBarrier.await();
	System.out.println("All finished recuiting,"+Thread.currentThread().getName()+
	" gives offer latter to candidate ");
}catch(Exception e)
{
	e.printStackTrace();
}
}
}

/*

E:\Advance_threading>javac HRManager_CB.java

E:\Advance_threading>java  HRManager_CB
No Work For HR Manager.
Maltirecuited developer
Anujrecuited developer
Anuj waiting for ohter to complete.....
Manjurecuited developer
Manju waiting for ohter to complete.....
Malti waiting for ohter to complete.....
All finished recuiting,Malti gives offer latter to candidate
All finished recuiting,Manju gives offer latter to candidate
All finished recuiting,Anuj gives offer latter to candidate
*/