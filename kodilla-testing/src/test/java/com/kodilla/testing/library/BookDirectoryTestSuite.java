package com.kodilla.testing.library;

import java.util.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class BookDirectoryTestSuite {

    @Mock
    private LibraryDatabase libraryDatabaseMock;


    private List<Book> generateListOfNBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<>();
        for (int n = 1; n <= booksQuantity; n++) {
            Book theBook = new Book("Title " + n, "Author " + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }


    @Test
    void testListBooksWithConditionsReturnList() {

        // Given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOfBooks = new ArrayList<>();
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
        resultListOfBooks.add(book1);
        resultListOfBooks.add(book2);
        resultListOfBooks.add(book3);
        resultListOfBooks.add(book4);
        when(libraryDatabaseMock.listBooksWithCondition("Secret")).thenReturn(resultListOfBooks);

        // When
        List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");

        // Then
        assertEquals(4, theListOfBooks.size());
    }

    @Test
    void testListBooksWithConditionMoreThan20() {

        // Given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf0Books = new ArrayList<>();
        List<Book> resultListOf15Books = generateListOfNBooks(15);
        List<Book> resultListOf40Books = generateListOfNBooks(40);
        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf15Books);
        when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks"))
                .thenReturn(resultListOf0Books);
        when(libraryDatabaseMock.listBooksWithCondition("FortyBooks"))
                .thenReturn(resultListOf40Books);

        // When
        List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");
        List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any title");
        List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FortyBooks");
        // Then

        assertEquals(0, theListOfBooks0.size());
        assertEquals(15, theListOfBooks15.size());
        assertEquals(0, theListOfBooks40.size());
    }

    @Test
    void testListBooksWithConditionFragmentShorterThan3() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);

        // When
        List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("An");

        // Then
        assertEquals(0, theListOfBooks10.size());
        verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());
    }

    @Test
    void testListBooksInHandsOf_BorrowedZero() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        LibraryUser user = new LibraryUser("John", "Collins", "123456789");

        // When
        List<Book> listOfBorrowedBooks = bookLibrary.listBooksInHandsOf(user);

        // Then
        assertEquals(0, listOfBorrowedBooks.size());
    }

    @Test
    void testListBooksInHandsOf_BorrowedOne() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        LibraryUser user = new LibraryUser("John", "Collins", "123456789");
        List<Book> listOf40Books = generateListOfNBooks(40);
        List<Book> listOfBorrowedBooks = bookLibrary.listBooksInHandsOf(user);

        when(libraryDatabaseMock.rentABook(user, listOf40Books.get(4))).thenReturn(listOfBorrowedBooks.add(listOf40Books.get(4)));
        libraryDatabaseMock.rentABook(user, listOf40Books.get(4));



        // When

        // Then
        assertEquals(1, listOfBorrowedBooks.size());
        assertEquals(listOf40Books.get(4), listOfBorrowedBooks.get(0));
    }

    @Test
    void testListBooksInHandsOf_BorrowedFive() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        LibraryUser user = new LibraryUser("John", "Collins", "123456789");
        List<Book> listOfBorrowedBooks = bookLibrary.listBooksInHandsOf(user);
        List<Book> listOf40Books = generateListOfNBooks(40);

        when(libraryDatabaseMock.rentABook(user, listOf40Books.get(0))).thenReturn(listOfBorrowedBooks.add(listOf40Books.get(0)));
        when(libraryDatabaseMock.rentABook(user, listOf40Books.get(4))).thenReturn(listOfBorrowedBooks.add(listOf40Books.get(4)));
        when(libraryDatabaseMock.rentABook(user, listOf40Books.get(6))).thenReturn(listOfBorrowedBooks.add(listOf40Books.get(6)));
        when(libraryDatabaseMock.rentABook(user, listOf40Books.get(18))).thenReturn(listOfBorrowedBooks.add(listOf40Books.get(18)));
        when(libraryDatabaseMock.rentABook(user, listOf40Books.get(39))).thenReturn(listOfBorrowedBooks.add(listOf40Books.get(39)));

        libraryDatabaseMock.rentABook(user, listOf40Books.get(0));
        libraryDatabaseMock.rentABook(user, listOf40Books.get(4));
        libraryDatabaseMock.rentABook(user, listOf40Books.get(6));
        libraryDatabaseMock.rentABook(user, listOf40Books.get(18));
        libraryDatabaseMock.rentABook(user, listOf40Books.get(39));

        // When


        // Then
        assertEquals(5, listOfBorrowedBooks.size());
        assertEquals(listOf40Books.get(0), listOfBorrowedBooks.get(0));
        assertEquals(listOf40Books.get(4), listOfBorrowedBooks.get(1));
        assertEquals(listOf40Books.get(6), listOfBorrowedBooks.get(2));
        assertEquals(listOf40Books.get(18), listOfBorrowedBooks.get(3));
        assertEquals(listOf40Books.get(39), listOfBorrowedBooks.get(4));
    }
}