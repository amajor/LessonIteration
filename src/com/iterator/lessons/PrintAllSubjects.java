package com.iterator.lessons;

import java.util.Iterator;

public class PrintAllSubjects {
	static Subject reading = new SubjectReading();

	public static void main(String args[]) {
		printSubjectLessons(reading);
	}
	
	public static void printSubjectLessons(Subject subject) {
		Iterator lessonIterator = subject.createIterator();
		
		System.out.println("\nSUBJECTS\n--------\n\nREADING");
		printSubjectLessons(lessonIterator);
	}
	
	private static void printSubjectLessons(Iterator iterator) {
		while (iterator.hasNext()) {
			Lesson lesson = (Lesson) iterator.next();
			System.out.print(lesson.toString());
		}
	}
}
