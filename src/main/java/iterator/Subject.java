package main.java.iterator;

import java.util.Iterator;

public interface Subject {
	public Iterator<Lesson> createIterator();
}