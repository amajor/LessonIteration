package com.iterator.lessons;

import java.util.Iterator;

public class SubjectReading implements Subject {
	static final int MAX_LESSONS = 5;
	int numberOfLessons = 0;
	Lesson[] lessons;

	public SubjectReading() {
		lessons = new Lesson[MAX_LESSONS];
		
		addItem("Lesson 1", "Read pages 1-5.");
		addItem("Lesson 2", "Read pages 6-9.");
		addItem("Lesson 3", "Read pages 10-17.");
		addItem("Lesson 4", "Read pages 18-19.");
		addItem("Lesson 5", "Read pages 20-27.");
	}

	public void addItem(String name, String description) {
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
}
