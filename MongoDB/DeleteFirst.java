import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;

public class DeleteFirst
{
  public static void main(String args[])throws Exception
  {
	    MongoClient mongoClient=new MongoClient("localhost",27017);
		DB db=mongoClient.getDB("codequadz12");
		boolean auth=db.authenticate("virat","panoti".toCharArray());
		
		DBCollection coll=db.getCollection("user");
	    System.out.println("Connect to database successfuly..");
		DBObject myDoc=coll.findOne();
		coll.remove(myDoc);
		DBCursor cursor=coll.find();
		int i=1;
		 while(cursor.hasNext())
		  {
			  System.out.println("Inserted Document: "+i);
			  System.out.println(cursor.next());
			  i++;
		  }
		  System.out.println("Document deleted Successfully..");
  }

}