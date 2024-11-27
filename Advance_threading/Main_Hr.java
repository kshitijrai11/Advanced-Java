import java.util.concurrent.locks.ReentrantLock;
class TechLead1 extends Thread
{
 ReentrantLock question_paper;
 String name;
 TechLead1(ReentrantLock question_paper,String name)
 {
	 super(name);
	 this.question_paper=question_paper;
 }
 public void run()
 {
	 System.out.println(getName()+"is waiting for question paper");
	 question_paper.lock();
	 System.out.println(getName()+"takes the question paper");
	 System.out.println(getName()+"start taking test");
	 try
	 {
		 Thread.sleep(1000);
	 }catch(InterruptedException e)
	 {
		 System.out.println(getName()+" is interrupted.");
	 }
	 System.out.println(getName()+" has takes the test");
	 System.out.println(getName()+" return the question paper");
	 question_paper.unlock();
 }
}
class TechLead2 extends Thread
{
 ReentrantLock question_paper;
 String name;
 TechLead2(ReentrantLock question_paper,String name)
 {
	 super(name);
	 this.question_paper=question_paper;
 }
 public void run()
 {
	 System.out.println(getName()+"is waiting for question paper");
	 question_paper.lock();
	 System.out.println(getName()+"takes the question paper");
	 System.out.println(getName()+"start taking test");
	 try
	 {
		 Thread.sleep(1000);
	 }catch(InterruptedException e)
	 {
		 System.out.println(getName()+" is interrupted.");
	 }
	 System.out.println(getName()+" has tajes the test");
	 System.out.println(getName()+" return the question paper");
	 question_paper.unlock();
 }
}
class TechLead3 extends Thread
{
 ReentrantLock question_paper;
 String name;
 TechLead3(ReentrantLock question_paper,String name)
 {
	 super(name);
	 this.question_paper=question_paper;
 }
 public void run()
 {
	 System.out.println(getName()+" is waiting for question paper");
	 question_paper.lock();
	 System.out.println(getName()+" takes the question paper");
	 System.out.println(getName()+" start taking test");
	 try
	 {
		 Thread.sleep(1000);
	 }catch(InterruptedException e)
	 {
		 System.out.println(getName()+"is interrupted.");
	 }
	 System.out.println(getName()+"has tajes the test");
	 System.out.println(getName()+"return the question paper");
	 question_paper.unlock();
 }
}
public class Main_Hr
{
  public static void main(String ar[])
  {
	ReentrantLock question_paper=new ReentrantLock();
	new TechLead1(question_paper,"ram").start();
	new TechLead2(question_paper,"shaym").start();
	new TechLead3(question_paper,"kabir").start();
	System.out.println("Hr completes his work...");
  }
}


/*
E:\Advance_threading>javac Main_Hr.java

E:\Advance_threading>java  Main_Hr
ramis waiting for question paper
ramtakes the question paper
ramstart taking test
shaymis waiting for question paper
Hr completes his work...
kabir is waiting for question paper
ram has tajes the test
ram return the question paper
shaymtakes the question paper
shaymstart taking test
shaym has tajes the test
shaym return the question paper
kabir takes the question paper
kabir start taking test
kabirhas tajes the test
kabirreturn the question paper

*/