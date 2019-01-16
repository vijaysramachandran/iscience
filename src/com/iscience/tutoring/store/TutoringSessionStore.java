package com.iscience.tutoring.store;

import static com.mongodb.client.model.Filters.*;
import com.iscience.tutoring.model.TutoringSession;
import com.mongodb.client.MongoCollection;

public class TutoringSessionStore extends MongoStore {

	private MongoCollection<TutoringSession> tutoringSessionsCollection;

	public TutoringSessionStore() {
		super();
		tutoringSessionsCollection = dbClient.getDatabase("iscience").getCollection("tutoringSessionsCollection",
				TutoringSession.class);
	}

	public boolean createTutoringSession(TutoringSession newSession) {
		if (findTutoringSession(newSession.getSubject(), newSession.getDay(), newSession.getTime()) != null) {
			System.out.println(
					"Session " + newSession + " is already present. Please use update Tutoring Session option.");
			return false;
		}
		tutoringSessionsCollection.insertOne(newSession);
		return true;
	}

	public TutoringSession findTutoringSession(String subject, String day, String time) {
		return tutoringSessionsCollection.find(and(eq("subject", subject), eq("day", day), eq("time", time))).first();
	}

	public void updateTutoringSession(TutoringSession updated) {
		tutoringSessionsCollection.findOneAndReplace(
				and(eq("subject", updated.getSubject()), eq("day", updated.getDay()), eq("time", updated.getTime())),
				updated);
	}

	public boolean deleteTutoringSession(String subject, String day, String time) {
		if (findTutoringSession(subject, day, time) == null) {
			System.out.println("Session " + subject + "-" + day + "-" + time + " is not present. Nothing to delete");
			return false;
		}
		tutoringSessionsCollection.findOneAndDelete(and(eq("subject", subject), eq("day", day), eq("time", time)));
		return true;
	}
}
