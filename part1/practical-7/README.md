# Practical 7

## Practical 7.1

In the `Book` class, add the following fields. These fields must be *private* and *final*

- title
- author
- genre
- publisher
- numberOfPages

Use appropriate types to represent the fields



```java
public class Book {

 //complete

    public Book() { //complete

    }
}

```


## Practical 7.2

You will notice that if you created the fields in the previous section,
then they will be erroring. This is because the fields need to be
initialised if they are final. This is because they are immutable (cannot
be changed once declared). Create a constructor and initialise these variables


## Practical 7.3

Because the fields in this class are private and final, they cannot be
changed or accessed just yet. Create 'getter' methods to be able to return
the values of these fields

## Practical 7.4

Create a couple of Book objects with some dummy data. You will notice that
when you do the following:
 
 ```java
Book b1 = new Book("Fake Book","Fake Author","Fake Genre","Fake Publisher
", 250);
System.out.println(b1);
```

You will get a print statement to the console something similar to this 
Book@38af3868

This is not a good representation of the object. Do some background reading
about toString() methods - https://www.baeldung.com/java-tostring and add
one to the Book class

## Practical 7.5

There is a CSV file that looks like the following

```csv

Fake Book,Fake Author,Fake Genre,Fake Publisher,250
Fake Book1,Fake Author1,Fake Genre1,Fake Publisher1,250
Fake Book2,Fake Author2,Fake Genre2,Fake Publisher2,250
Fake Book3,Fake Author3,Fake Genre3,Fake Publisher3,250
Fake Book4,Fake Author4,Fake Genre4,Fake Publisher4,250

```

In the main method, read in the CSV file and then print the fields of the
Books back to the console.

