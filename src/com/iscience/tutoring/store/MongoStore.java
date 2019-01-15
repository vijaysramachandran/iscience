package com.iscience.tutoring.store;

import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;
import static com.mongodb.client.model.Filters.*;
import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;

import com.iscience.tutoring.model.Tutor;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientOptions;
import com.mongodb.client.MongoCollection;

public class MongoStore {
	
	private MongoClient dbClient;
	private MongoCollection<Tutor> tutorsCollection;
	
	public MongoStore() {
		init();
	}
	
	private void init() { 
		CodecRegistry pojoCodecRegistry = fromRegistries(MongoClient.getDefaultCodecRegistry(),
                fromProviders(PojoCodecProvider.builder().automatic(true).build()));
		 dbClient = new MongoClient("localhost", 
				 MongoClientOptions.builder().codecRegistry(pojoCodecRegistry).build());
		tutorsCollection = dbClient.getDatabase("iscience").getCollection("tutors", Tutor.class);
	}

	public boolean createTutor(Tutor newTutor) {
		if(findTutor(newTutor.getTutorName()) != null) {
			System.out.println("Tutor " + newTutor.getTutorName() + " is already present. Please use update Tutor option.");
			return false;
		}
		tutorsCollection.insertOne(newTutor);		
		return true;
	}
	
	public Tutor findTutor(String fullName) {
		return tutorsCollection.find(eq("tutorName", fullName)).first();
	}
	
	public void updateTutor(Tutor updated) {
		tutorsCollection.findOneAndReplace(eq("tutorName", updated.getTutorName()), updated);
	}
	
	public boolean deleteTutor(String fullName) {
		if(findTutor(fullName) == null) {
			System.out.println("Tutor " + fullName + " is not present. Nothing to delete");
			return false;
		}
		tutorsCollection.findOneAndDelete(eq("tutorName", fullName));
		return true;
	}
	
	public static void main(String[] args) {
		MongoStore store = new MongoStore();
		Tutor aparna = new Tutor("Aparna Lanka");
		aparna.setPhoneNumber("408-368-0754");
		store.createTutor(aparna);
		aparna.setPhoneNumber("408-996-7221");
		store.updateTutor(aparna);
		store.deleteTutor(aparna.getTutorName());
	}
}
