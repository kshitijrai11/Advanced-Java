import com.mongodb.DB;
import com.mongodb.MongoClient;

public class MongodbEx
{
   public static void main(String args[])
   {
	   try{
		 MongoClient mongoClient=new MongoClient("localhost",27017);
		 
		DB db=mongoClient.getDB("codequadz12");
	    System.out.println("Connect to database successfuly..")
		boolean auth=db.authenticate("virat","panoti".toCharArray());
		System.out.println("Authentication: "+auth);
	   }
	   catch(Exception e)
	   {
		   System.out.println(e.getClass().getName()+":"+e.getMessage());
	   }
   }
}