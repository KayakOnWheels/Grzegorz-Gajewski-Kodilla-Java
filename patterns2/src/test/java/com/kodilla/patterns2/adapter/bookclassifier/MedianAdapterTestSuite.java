package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class MedianAdapterTestSuite {

    @Test
    void publicationYearMedianTest() {

        //Given
        Set<Book> bookSet = new HashSet<>(Set.of(
                new Book("Author 1", "Title 1", 2001, "SIG001"),
                new Book("Author 2", "Title 2", 2002, "SIG002"),
                new Book("Author 3", "Title 3", 2003, "SIG003"),
                new Book("Author 4", "Title 4", 2004, "SIG004"),
                new Book("Author 5", "Title 5", 2005, "SIG005"),
                new Book("Author 6", "Title 6", 2006, "SIG006"),
                new Book("Author 7", "Title 7", 2007, "SIG007"),
                new Book("Author 8", "Title 8", 2008, "SIG008"),
                new Book("Author 9", "Title 9", 2009, "SIG009"),
                new Book("Author 10", "Title 10", 2010, "SIG010")
        ));

        //When
        MedianAdapter medianAdapter = new MedianAdapter();
        int median = medianAdapter.publicationYearMedian(bookSet);

        //Then
        assertEquals(2005, median);

    }
}
