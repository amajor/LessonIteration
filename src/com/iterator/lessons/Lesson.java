package com.iterator.lessons;

public class Lesson {
	String name;
	String description;
	boolean completed;
 
	public Lesson(
		String name,
		String description,
		boolean completed)
	{
		this.name = name;
		this.description = description;
		this.completed = completed;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public boolean isCompleted() {
		return completed;
	}

	public String toString() {
		return ("\n\n  " + name + "\n  " + description);
	}
}