package com.iscience.tutoring.store;

import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;
import static com.mongodb.client.model.Filters.*;
import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;

import com.iscience.tutoring.model.Student;
import com.iscience.tutoring.model.Tutor;
import com.iscience.tutoring.model.TutoringSession;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientOptions;
import com.mongodb.client.MongoCollection;

public class MongoStore {
	
	private MongoClient dbClient;
	protected MongoCollection<Tutor> tutorsCollection;
	protected MongoCollection<Student> studentsCollection;
	protected MongoCollection<TutoringSession> tutoringSessionsCollection;
	
	public MongoStore() {
		init();
	}
	
	private void init() { 
		CodecRegistry pojoCodecRegistry = fromRegistries(MongoClient.getDefaultCodecRegistry(),
                fromProviders(PojoCodecProvider.builder().automatic(true).build()));
		 dbClient = new MongoClient("localhost", 
				 MongoClientOptions.builder().codecRegistry(pojoCodecRegistry).build());
		tutorsCollection = dbClient.getDatabase("iscience").getCollection("tutors", Tutor.class);
		studentsCollection = dbClient.getDatabase("iscience").getCollection("students", Student.class);
		tutoringSessionsCollection = dbClient.getDatabase("iscience").getCollection("tutoringsessions", TutoringSession.class);
	}
}
