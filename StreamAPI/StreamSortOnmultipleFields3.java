//Example of using then Comparing() to crreate Comparator which is capable of sorting by multiple fields.
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamSortOnmultipleFields3
{
  public static void main(String[] args){
  ArrayList<Employee> employees = getUnsortedEmployeeList();
  // Compare by first name and then last name
    Comparator <Employee> compareByName = Comparator
	                       .comparing(Employee::getFirstName).thenComparing(Employee::getLastName);
						   
	 List<Employee> sortedEmployees = employees.stream().sorted(compareByName)
                                         .collect(Collectors.toList());
      System.out.println(sortedEmployees);										 
  }
  
  private static ArrayList<Employee> getUnsortedEmployeeList()
  {
   ArrayList<Employee> list = new ArrayList<>();
     
	 list.add(new Employee(2,"Lokesh","gupta"));
	 list.add(new Employee(1,"alex","Gussin"));
	 list.add(new Employee(4,"Brain","Kapoor"));
	 list.add(new Employee(5,"Neon","Piper"));
	 list.add(new Employee(3,"David","Beckham"));
	 list.add(new Employee(7,"alex","Beckham"));
	 list.add(new Employee(6,"Brain","Suxena"));
	 return list;
   }
}

 class Employee
  {
     long id;
	 String name;
	 String lastname;
	 Employee(long id,String name,String latsname){
	    this.id=id;
		this.name=name;
		this.lastname=lastname;
	 }
	 public long getId()
	 { 
	   return id;
	 }
	 public String getFirstName()
	 {
	    return name;
		}
		public String getLastName(){
		   return lastname;
		}
		public String toString(){
		   return "Id="+id+" "+"name="+name+""+"Lastname="+lastname;
		   
		}
   }