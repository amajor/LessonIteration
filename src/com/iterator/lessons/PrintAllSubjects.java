package com.iterator.lessons;

import java.util.Iterator;

public class PrintAllSubjects {
	static Subject reading = new SubjectReading();

	public static void main(String args[]) {
		printSubjectLessons(reading);
	}
	
	public static void printSubjectLessons(Subject subject) {
		Iterator lessonIterator = subject.createIterator();
		
		// Print all lessons
		// printSubjectLessons(lessonIterator);
		
		// Print only unfinished lessons
		printUnfinishedLessons(lessonIterator);
	}
	
	private static void printSubjectLessons(Iterator iterator) {
		System.out.println("\nSUBJECTS\n--------\n\nREADING");
		while (iterator.hasNext()) {
			Lesson lesson = (Lesson) iterator.next();
			System.out.print(lesson.toString());
		}
	}
	
	private static void printUnfinishedLessons(Iterator iterator) {
		System.out.println("\n\nTODO ITEMS\n----------\n\n");
		while (iterator.hasNext()) {
			Lesson lesson = (Lesson) iterator.next();
			if (lesson.isUnfinished()) {
				System.out.print(lesson.toString());
			}
		}
	}
}
