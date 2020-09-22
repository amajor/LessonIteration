package com.iterator.lessons;

import java.util.Iterator;

public class SubjectReading implements Subject {
	static final int MAX_LESSONS = 5;
	int numberOfLessons = 0;
	Lesson[] lessons;

	public SubjectReading() {
		lessons = new Lesson[MAX_LESSONS];
		
		// Add some lessons
		addLesson("Lesson 1", "Read pages 1-5.");
		addLesson("Lesson 2", "Read pages 6-9.");
		addLesson("Lesson 3", "Read pages 10-17.");
		addLesson("Lesson 4", "Read pages 18-19.");
		addLesson("Lesson 5", "Read pages 20-27.");
		
		// Complete some lessons
		completeLesson(0);
		completeLesson(1);
	}

	public void addLesson(String name, String description) {
		Lesson lesson = new Lesson(name, description, false);
		if (numberOfLessons >= MAX_LESSONS) {
			System.err.println("Sorry, max number of lessons reached.");
		} else {
			lessons[numberOfLessons] = lesson; 
			numberOfLessons = numberOfLessons + 1;
		}
	}

	public Lesson[] getLessons() {
		return lessons;
	}

	public Iterator createIterator() {
		return new LessonIterator(lessons);
	}
	
	public void completeLesson(int lessonPosition) {
		lessons[lessonPosition].markCompleted();
	}
}
