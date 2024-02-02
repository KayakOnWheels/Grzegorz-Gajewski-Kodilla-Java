package com.kodilla.stream;

import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.portfolio.StringReverser;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {
  /*      BookDirectory theBookDirectory = new BookDirectory();
        String theResultStringOfBooks = theBookDirectory.getList().stream()  // [1]
                .filter(book -> book.getYearOfPublication() > 2005)
                .map(Book::toString)
                .collect(Collectors.joining(",\n","<<",">>"));                    // [2]

        System.out.println(theResultStringOfBooks);
*/

        Forum forum = new Forum();
        Map<Integer, ForumUser> resultMap = forum.getUserList().stream()
                .filter(user -> user.getSex() == 'M')
                .filter(user -> LocalDate.from(user.getBirthDate()).until(LocalDate.now(), ChronoUnit.YEARS) >= 20)
                .filter(user -> user.getPostCount() >= 1)
                .collect(Collectors.toMap(ForumUser::getiD, user -> user));

        System.out.println("# elements: " + resultMap.size());
        resultMap.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}