import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import com.mongodb.DBCursor;

public class InsertRecord
{
  public static void main(String ar[])
  {
	  try{
		  MongoClient mongoClient=new MongoClient("localhost",27017);
		  DB db=mongoClient.getDB("codequadz12");
		  System.out.println("Connect to database successfuly..");
		  boolean auth=db.authenticate("virat","panoti".toCharArray());
		  System.out.println("Authentication:"+auth);
		  //DBCollection coll=db.getCollection("emp2");
		  
		  
		  DBCollection coll=db.getCollection("user");
		  System.out.println("Collection user selected successfuly");
		  BasicDBObject doc=new BasicDBObject("name","rabri");
		  doc.append("salary",51);
		  doc.append("city","patna");
		  doc.append("url","http://www.rabri.com");
		  coll.insert(doc);
		  System.out.println("Document inserted successfuly");
		  DBCursor cursor=coll.find();
		  int i=1;
		  while(cursor.hasNext())
		  {
			  System.out.println("Inserted Document: "+i);
			  System.out.println(cursor.next());
			  i++;
		  }
	  }catch(Exception e){
		  System.out.println(e.getClass().getName()+":"+e.getMessage());
	  }
  }
}