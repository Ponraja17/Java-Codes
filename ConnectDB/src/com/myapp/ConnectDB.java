package com.myapp;
import org.bson.Document;

import com.mongodb.BasicDBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;

public class ConnectDB {
	
	

	public static void main(String args[]) {
		//Establish connection
		//connect to the respective DB using above connection
		//Using that connection do crud operation
        //Disconnect the connection

		
			//MongoClient myConnection = new MongoClient( "127.0.0.1" , 27017 );
		MongoClient myConnection=new MongoClient(new MongoClientURI("mongodb+srv://Ponraja:Rajasalvatore29%40@rajas-cluster.zz4ba.mongodb.net/myFirstDatabase?retryWrites=true&w=majority"));
//		MongoClient myConnection = (MongoClient) MongoClients.create("mongodb+srv://Ponraja:Rajasalvatore29%40@rajas-cluster.zz4ba.mongodb.net/myFirstDatabase?retryWrites=true&w=majority");
		
		//Connecting to Respective DB
//		System.out.println(myConnection.listDatabaseNames());
//		for(String a:myConnection.listDatabaseNames())
//		{
//			System.out.println(a);
//		}
		MongoDatabase myDb = myConnection.getDatabase("test");
//		
//		
//		//Create collection
//		myDb.createCollection("customers");
//		System.err.println("Colelction created");
//		
//		
//		//Connnecting to Collection	
//		String valueToUpdate ="Hello";
		MongoCollection myCollection = myDb.getCollection("customers");
		
		//Formatting data to insert
		Document mydocument = new Document();
		mydocument.put("_id", 2);
		mydocument.put("name", "Pon Raja");
		mydocument.put("Role", "Developer");
		
		//Create/insert
		myCollection.insertOne(mydocument);
//		
//		
//        //Update
//		myCollection.updateOne(Filters.eq("name", "athi"), Updates.set("company", valueToUpdate));
//        
//        //Delete
//        //myCollection.deleteOne(Filters.eq("name", "Shubham"));
//        
//		
//		
//		//Read/Find
//		BasicDBObject query = new BasicDBObject();
//
//		query.put("name", "athi");
//		
//      	MongoCursor cursor = myCollection.find(query).iterator();
//        while (cursor.hasNext()) {
//         System.out.println(((Document) cursor.next()).toJson());
//         }
//              
         
      
              
              
	}

}
