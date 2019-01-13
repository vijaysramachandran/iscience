package com.iscience.tutoring.store;

import com.mongodb.MongoClient;

public class MongoStore {
	
	private MongoClient dbClient;
	
	public MongoStore() {
		init();
	}
	
	private void init() { 
		dbClient = new MongoClient();
	}

	public MongoClient getDBClient() {
		return this.dbClient;
	}
	
	public static void main(String[] args) {
		MongoStore store = new MongoStore();
		store.getDBClient().getDatabaseNames().forEach(db -> System.out.println(db));
		store.getDBClient().getDB("iscience").getCollectionNames().forEach(aCollection -> System.out.println(aCollection));
	}
}
