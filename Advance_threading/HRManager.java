// semaphore program......

import java.util.concurrent.Semaphore;

public class HRManager
{
  public static void main(String a[])
  {
	Semaphore questionPaperPool=new Semaphore(2);
	
	TechLead techLead1=new TechLead(questionPaperPool,"Amit TL");
	TechLead techLead2=new TechLead(questionPaperPool,"sachin TL");
	TechLead techLead3=new TechLead(questionPaperPool,"Hira TL");
	
	techLead1.start();
	techLead2.start();
	techLead3.start();
	
	System.out.println("No work for HR manager");
  }
}

// the HR Manager above create 4 tech lead and quits

class TechLead extends Thread
{
 Semaphore questionPaperPool;
 public TechLead(Semaphore questionPaperPool,String name)
 {
	 super(name);
	 this.questionPaperPool=questionPaperPool;
 }
 @Override
 public void run()
 {
	 try{
		 System.out.println(Thread.currentThread().getName()+"Waiting for test question paper");
		 questionPaperPool.acquire();
		 System.out.println(Thread.currentThread().getName()+"acquire test paper");
		 System.out.println(Thread.currentThread().getName()+"Conducting test");
		 Thread.sleep(3000);
		 System.out.println(Thread.currentThread().getName()+"Test done giving back the paper");
		 questionPaperPool.release();
	 }catch(InterruptedException e)
	 {
		 e.printStackTrace();
	 }
 }
}

/*
E:\Advance_java\Advance_threading>javac HRManager.java

E:\Advance_java\Advance_threading>java  HRManager
No work for HR manager
Hira TLWaiting for test question paper
sachin TLWaiting for test question paper
Amit TLWaiting for test question paper
sachin TLacquire test paper
sachin TLConducting test
Hira TLacquire test paper
Hira TLConducting test
sachin TLTest done giving back the paper
Hira TLTest done giving back the paper
Amit TLacquire test paper
Amit TLConducting test
Amit TLTest done giving back the paper
*/