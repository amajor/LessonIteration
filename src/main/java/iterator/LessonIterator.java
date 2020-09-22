package main.java.iterator;
import java.util.Iterator;

public class LessonIterator implements Iterator {
	Lesson[] lessons;
	int position = 0;

	public LessonIterator(Lesson[] lessons) {
		this.lessons = lessons;
	}

	@Override
	public boolean hasNext() {
		return lessons.length > position;
	}

	@Override
	public Object next() {
		return lessons[position++];
	}
}
