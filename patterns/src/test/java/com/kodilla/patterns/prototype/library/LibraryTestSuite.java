package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class LibraryTestSuite {

    @Test
    public void testGetBooks() {
        //Given
        Library myLibrary = new Library("myLibrary");
        myLibrary.getBooks().add(new Book("Book1", "Author1", LocalDate.of(2005, 12, 12)));


        //making a shallow copy of object board
        Library shallowClonedLibrary = null;
        try {
            shallowClonedLibrary = myLibrary.shallowCopy();
            shallowClonedLibrary.setName("shallowClonedLibrary");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //making a deep copy of object board
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = myLibrary.deepCopy();
            deepClonedLibrary.setName("deepClonedLibrary");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        myLibrary.getBooks().add(new Book("Book2", "Author2", LocalDate.of(2001, 6, 19)));
        shallowClonedLibrary.getBooks().add(new Book("Book3", "Author3", LocalDate.of(2006, 1, 15)));
        deepClonedLibrary.getBooks().add(new Book("Book4", "Author4", LocalDate.of(2026, 1, 15)));

        //Then
        System.out.println(myLibrary);
        System.out.println(shallowClonedLibrary);
        System.out.println(deepClonedLibrary);

        Assertions.assertEquals(3, myLibrary.getBooks().size());
        Assertions.assertEquals(3, shallowClonedLibrary.getBooks().size());
        Assertions.assertEquals(2, deepClonedLibrary.getBooks().size());

    }
}
