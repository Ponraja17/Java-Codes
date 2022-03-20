import org.bson.Document;

import com.mongodb.BasicDBObject;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;

public class MyDB {
	public static void main(String args[]) {
		
		//Connecting database
		MongoClient MyDB=new MongoClient("127.0.0.1" , 27017);
		
		//Cheching the database listing the name
		for(String Database:MyDB.listDatabaseNames()) {
			System.out.println(Database);
		}
		
		//Switch and use your needed database
		MongoDatabase myBase=MyDB.getDatabase("mylocal");
		
		//Create collection
	   // myBase.createCollection("Admin");
		
		//Get collection names
		MongoCollection myCollection=myBase.getCollection("Admin");
		
	   //Data format to insert
//		Document AdminDetails=new Document();
//		AdminDetails.put("_id",1);
//		AdminDetails.put("Name","Raja");
//		AdminDetails.put("Stream","Developer");
//		AdminDetails.put("College","TCE");
		
		//Insert Data
//		myCollection.insertOne(AdminDetails);
		
	    //Update
//		myCollection.updateOne(Filters.eq("_id", 2), Updates.set("Stream", "Hacker"));
		
		 //Delete
         myCollection.deleteOne(Filters.eq("_id", 2));
        
		
		//Read
		
		BasicDBObject query = new BasicDBObject();

//		query.put("Name", "Pon Raja");
	
     	MongoCursor cursor = myCollection.find(query).iterator();
        while (cursor.hasNext()) {
        System.out.println(((Document) cursor.next()).toJson());
		
        }
		
	}

}