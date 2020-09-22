package test.java.iterator;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Iterator;
import org.junit.jupiter.api.Test;

import main.java.iterator.Lesson;
import main.java.iterator.Subject;
import main.java.iterator.SubjectReading;

class LessonIteratorTest {
	static Subject reading = new SubjectReading();
	Iterator readingLessonIterator = reading.createIterator();

	@Test
	void test() {
		// Test Lesson 1
		assertTrue(readingLessonIterator.hasNext());
		Lesson lesson = (Lesson) readingLessonIterator.next();
		assertEquals("Lesson 1", lesson.getName());
		
		// Test Lesson 2
		assertTrue(readingLessonIterator.hasNext());
		lesson = (Lesson) readingLessonIterator.next();
		assertEquals("Lesson 2", lesson.getName());
		
		// Test Lesson 3
		assertTrue(readingLessonIterator.hasNext());
		lesson = (Lesson) readingLessonIterator.next();
		assertEquals("Lesson 3", lesson.getName());
		
		// Test Lesson 4
		assertTrue(readingLessonIterator.hasNext());
		lesson = (Lesson) readingLessonIterator.next();
		assertEquals("Lesson 4", lesson.getName());
		
		// Test Lesson 5
		assertTrue(readingLessonIterator.hasNext());
		lesson = (Lesson) readingLessonIterator.next();
		assertEquals("Lesson 5", lesson.getName());
		
		// End of Lessons
		assertFalse(readingLessonIterator.hasNext());
	}

}
