package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import com.kodilla.patterns2.adapter.bookclassifier.librarya.Classifier;

import java.util.List;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {

    @Override
    public int publicationYearMedian(Set<Book> bookSet) {
        List<Integer> sortedPublicationYearList;
        sortedPublicationYearList = bookSet.stream().map(Book::getPublicationYear).sorted().toList();

        if(sortedPublicationYearList.size() % 2 == 0) {
            return sortedPublicationYearList.get(((sortedPublicationYearList.size() / 2) + (sortedPublicationYearList.size() / 2 - 1)) / 2);
        }
        else {
            return sortedPublicationYearList.get(sortedPublicationYearList.size() / 2 - 1);
        }
    }
}
