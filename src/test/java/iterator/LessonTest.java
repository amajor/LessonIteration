package test.java.iterator;
import org.junit.jupiter.api.Test;

import main.java.iterator.Lesson;

import static org.junit.jupiter.api.Assertions.*;

class LessonTest {
	String lessonName = "MyLesson";
	String lessonDescription = "This is a description of MyLesson";
	boolean lessonCompleted = false;

	Lesson lesson = new Lesson(
		lessonName,
		lessonDescription,
		false
	);

	@Test
	void testConstructor() {
		assertEquals(lessonName, lesson.getName());
		assertEquals(lessonDescription, lesson.getDescription());
		assertFalse(lesson.isCompleted());
		
		String expectedString = lessonName + "\n---------------\n" + lessonDescription;
		assertEquals(expectedString, lesson.toString());
	}
}
