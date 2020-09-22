package main.java.iterator;

import java.util.Iterator;

public class PrintTodoItems {
	static Subject reading = new SubjectReading();

	public static void main(String args[]) {
		printSubjectLessons(reading);
	}
	
	public static void printSubjectLessons(Subject subject) {
		Iterator lessonIterator = subject.createIterator();
		printUnfinishedLessons(lessonIterator);
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
