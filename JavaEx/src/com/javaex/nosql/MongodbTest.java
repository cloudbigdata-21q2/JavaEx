package com.javaex.nosql;

import org.bson.Document;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class MongodbTest {
	static String MONGODB_IP = "127.0.0.1";	//	localhost
	static int MONGODB_PORT = 27017;
	static String DB_NAME = "javaMongo";
	static String COLL_NAME = "testCollection";
	
	public static void main(String[] args) {
//		connect();
		getCollection(DB_NAME, COLL_NAME);
	}
	
	private static MongoCollection<Document> getCollection(
			String databaseName, String collectionName) {
		//	접속
		MongoClient client = connect();
		//	use 데이터베이스
		MongoDatabase db = client.getDatabase(databaseName);	//	use javaMongo
		System.out.println("DATABASE:" + db);
		//	컬렉션 접속
		MongoCollection<Document> coll = 
				db.getCollection(collectionName);
		System.out.println("COLLECTION:" + coll);
		return coll;
	}
	
	private static MongoClient connect() {
		//	몽고 DB 접속
		MongoClient client = MongoClients.create();
		
		System.out.println(client);
		return client;
	}

}
