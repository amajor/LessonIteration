# Lesson Iteration

This is very simple system of Subject and Lessons to explore the Iterator Pattern.

## Iterator Pattern Definition

> **The Iterator Pattern** provides a way to access the elements of an
> aggregate object sequentially without exposing its underlying representation.

## This Project

**Subject** is an interface that holds lessons and can iterate through the lessons.

**Lesson** has a name, description, and whether it has been completed. It can
also be marked as completed. When printed to string, it includes a checkbox
next to the name to indicate if it has been completed.

**LessonIterator** implements Iterator and overrides the `hasNext()` and
`next` methods with its own implementations, enabling `Subject` to iterate
without knowing what holds the data.

To see the classes in action, we can run the different JUnit test files.
* `LessonTest`
* `LessonIteratorTest`

We can also run `PrintAllSubjects` or `PrintTodoItems` to see different sets
of data as indicated by the class names. This is just to get an idea of 
what we're working with.
