[![Build Status](https://travis-ci.com/amajor/LessonIteration.svg?branch=master)](https://travis-ci.com/amajor/LessonIteration)

# Lesson Iteration

This is a simple system of Subject and Lessons to explore the Iterator
Pattern.

## Iterator Pattern Definition

> **The Iterator Pattern** provides a way to access the elements of an
> aggregate object sequentially without exposing its underlying representation.

## This Project

**[Subject](https://github.com/amajor/LessonIteration/blob/master/src/main/java/iterator/Subject.java)** is an interface that holds lessons and can iterate through the lessons. **[SubjectReading](https://github.com/amajor/LessonIteration/blob/master/src/main/java/iterator/SubjectReading.java)** implements this interface.

**[Lesson](https://github.com/amajor/LessonIteration/blob/master/src/main/java/iterator/Lesson.java)** has a name, description, and whether it has been completed. It can also be marked as completed. When printed to string, it includes a checkbox
next to the name to indicate if it has been completed.

**[LessonIterator](https://github.com/amajor/LessonIteration/blob/master/src/main/java/iterator/LessonIterator.java)** implements Iterator and overrides the `hasNext()` and `next` methods with its own implementations, enabling `Subject` to iterate without knowing what holds the data.

To see the classes in action, we can run the different JUnit test files.
* [LessonTest](https://github.com/amajor/LessonIteration/blob/master/src/test/java/iterator/LessonTest.java)
* [LessonIteratorTest](https://github.com/amajor/LessonIteration/blob/master/src/test/java/iterator/LessonIteratorTest.java)

We can also run `PrintAllSubjects` or `PrintTodoItems` to see different sets
of data as indicated by the class names. This is just to get an idea of
what we're working with.
