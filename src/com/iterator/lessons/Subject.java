package com.iterator.lessons;

import java.util.Iterator;

public interface Subject {
	public Iterator<Lesson> createIterator();
}