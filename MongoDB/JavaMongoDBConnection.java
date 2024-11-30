import java.net.UnknowHostException;
import java.util.List;
import java.util.Set;

import com.mongodb.DB;
import com.mongodb.MongClient;

public class JavaMongoDBConnection
{
    public static void main(String arg[])
	 {
		 try{
			 MongClient mongoClient=new MongClient("localhost",27017);
			 
			 List<String> database=mongoClient.getDatabaseNames();
			 for(String dbName:database)
			 {
			 System.out.println("-Database"+dbName);
		 
		 DB db=mongoClient.getDB(dbName);
		 
		 Set<String> collection=db.getDatabaseNames();
		 for(String colName:collection)
		 {
			 System.out.println("\t + Collection: "+colName);
		 }
		 }
		 mongoClient.close();
	 }catch(UnknowHostException ex)
	 {
		 ex.printStackTrace();
	 }
	 

}