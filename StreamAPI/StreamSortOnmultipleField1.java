import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamSortOnmultipleField1
{
  public static void main(String[] ade)
  {
	  ArrayList<Employee> employees=getUnsortedEmployeeList();
	  
	  //compare by first names and than last names
	  
	  Comparator<Employee> compareByName=Comparator.comparing(Employee::getFirstName);
	  System.out.println(compareByName.getClass().getName());
	  
	  List<Employee> sortedEmployees=employees.stream().sorted(compareByName).collect(Collectors.toList());
	  
	  System.out.println(sortedEmployees);
  }
  private static ArrayList<Employee> getUnsortedEmployeeList()
  {
	  ArrayList<Employee> list=new ArrayList();
	  list.add(new Employee(2l,"Lokesh","Gupta"));
	  list.add(new Employee(1l,"Alex","Gussin"));
	  list.add(new Employee(4l,"Biral","Kapoor"));
	  list.add(new Employee(5l,"Neon","pipr"));
	  list.add(new Employee(3l,"Daved","Beckkam"));
	  list.add(new Employee(6l,"Alex","Beckkam"));
	  list.add(new Employee(7l,"Biral","Suxena"));
	  return list;
  }
}
class Employee
{
	long ld;
	String name;
	String lastname;
	Employee(long ld,String name,String lastname)
	{
		this.ld=ld;
		this.name=name;
		this.lastname=lastname;
	}
	public long getId()
	{
		return ld;
	}
	public String getFirstName()
	{
		return name;
	}
	public String getlastName()
	{
		return lastname;
	}
	public String toString()
	{
	return "Id="+ld+" "+"name="+name+" "+"Lastname="+lastname;
	}	
}

/*

E:\Advance_java\StreamAPI>java  StreamSortOnmultipleField1
java.util.Comparator$$Lambda$2/1078694789
[Id=1 name=Alex Lastname=Gussin, Id=6 name=Alex Lastname=Beckkam, Id=4 name=Biral Lastname=Kapoor, Id=7 name=Biral Lastname=Suxena, Id=3 name=Daved Lastname=Beckkam, Id=2 name=Lokesh Lastname=Gupta, Id=5 name=Neon Lastname=pipr]
*/