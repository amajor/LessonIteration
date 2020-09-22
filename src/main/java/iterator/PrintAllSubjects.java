package main.java.iterator;

import java.util.Iterator;

public class PrintAllSubjects {
	static Subject reading = new SubjectReading();

	public static void main(String args[]) {
		printSubjectLessons(reading);
	}
	
	public static void printSubjectLessons(Subject subject) {
		Iterator lessonIterator = subject.createIterator();
		 printSubjectLessons(lessonIterator);
	}
	
	private static void printSubjectLessons(Iterator iterator) {
		System.out.println("\nSUBJECTS\n--------\n\nREADING");
		while (iterator.hasNext()) {
			Lesson lesson = (Lesson) iterator.next();
			System.out.print(lesson.toString());
		}
	}
}
