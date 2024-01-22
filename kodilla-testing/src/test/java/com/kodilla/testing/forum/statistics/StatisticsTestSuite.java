package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@DisplayName("Those tests check if calculateAdvStatistics method of StatisticCalculator return correct values under given circumstances." +
            "If post, user or comment count for test is not specified defaults 100.")
public class StatisticsTestSuite {

    List<String> usersNames = new ArrayList<>();
    int postCountTestValue;
    int commentCountTestValue;

    void generateUserList(int size) {
        usersNames.clear();
        for(int i = 0; i<size; i++) {
            usersNames.add("user" + i);
        }
    }


    @DisplayName("When posts = 0")
    @Test
    void test1() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticCalculator statisticCalculator = new StatisticCalculator(statisticsMock);
        generateUserList(100);
        postCountTestValue = 0;
        commentCountTestValue = 100;
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(postCountTestValue);
        when(statisticsMock.commentsCount()).thenReturn(commentCountTestValue);

        //When
        Map<String, Double> result = statisticCalculator.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(0, result.get("averagePostCountPerUser"));
        assertEquals(1, result.get("averageCommentCountPerUser"));
        assertEquals(-1, result.get("averageCommentCountPerPost"));
    }

    @DisplayName("When posts = 1000")
    @Test
    void test2() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticCalculator statisticCalculator = new StatisticCalculator(statisticsMock);
        generateUserList(100);
        postCountTestValue = 1000;
        commentCountTestValue = 100;
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(postCountTestValue);
        when(statisticsMock.commentsCount()).thenReturn(commentCountTestValue);

        //When
        Map<String, Double> result = statisticCalculator.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(10, result.get("averagePostCountPerUser"));
        assertEquals(1, result.get("averageCommentCountPerUser"));
        assertEquals(0.1, result.get("averageCommentCountPerPost"));
    }

    @DisplayName("When comments = 0")
    @Test
    void test3() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticCalculator statisticCalculator = new StatisticCalculator(statisticsMock);
        generateUserList(100);
        postCountTestValue = 100;
        commentCountTestValue = 0;
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(postCountTestValue);
        when(statisticsMock.commentsCount()).thenReturn(commentCountTestValue);

        //When
        Map<String, Double> result = statisticCalculator.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(1, result.get("averagePostCountPerUser"));
        assertEquals(0, result.get("averageCommentCountPerUser"));
        assertEquals(0, result.get("averageCommentCountPerPost"));
    }

    @DisplayName("When comments = 100 and posts = 200")
    @Test
    void test4() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticCalculator statisticCalculator = new StatisticCalculator(statisticsMock);
        generateUserList(100);
        postCountTestValue = 200;
        commentCountTestValue = 100;
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(postCountTestValue);
        when(statisticsMock.commentsCount()).thenReturn(commentCountTestValue);

        //When
        Map<String, Double> result = statisticCalculator.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(2, result.get("averagePostCountPerUser"));
        assertEquals(1, result.get("averageCommentCountPerUser"));
        assertEquals(0.5, result.get("averageCommentCountPerPost"));
    }

    @DisplayName("When comments = 200 and posts = 100")
    @Test
    void test5() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticCalculator statisticCalculator = new StatisticCalculator(statisticsMock);
        generateUserList(100);
        postCountTestValue = 100;
        commentCountTestValue = 200;
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(postCountTestValue);
        when(statisticsMock.commentsCount()).thenReturn(commentCountTestValue);

        //When
        Map<String, Double> result = statisticCalculator.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(1, result.get("averagePostCountPerUser"));
        assertEquals(2, result.get("averageCommentCountPerUser"));
        assertEquals(2, result.get("averageCommentCountPerPost"));
    }

    @DisplayName("When users = 0")
    @Test
    void test6() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticCalculator statisticCalculator = new StatisticCalculator(statisticsMock);
        generateUserList(0);
        postCountTestValue = 100;
        commentCountTestValue = 100;
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(postCountTestValue);
        when(statisticsMock.commentsCount()).thenReturn(commentCountTestValue);

        //When
        Map<String, Double> result = statisticCalculator.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(-1, result.get("averagePostCountPerUser"));
        assertEquals(-1, result.get("averageCommentCountPerUser"));
        assertEquals(1, result.get("averageCommentCountPerPost"));
    }

    @DisplayName("When users = 100")
    @Test
    void test7() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticCalculator statisticCalculator = new StatisticCalculator(statisticsMock);
        generateUserList(100);
        postCountTestValue = 100;
        commentCountTestValue = 100;
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(postCountTestValue);
        when(statisticsMock.commentsCount()).thenReturn(commentCountTestValue);

        //When
        Map<String, Double> result = statisticCalculator.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(1, result.get("averagePostCountPerUser"));
        assertEquals(1, result.get("averageCommentCountPerUser"));
        assertEquals(1, result.get("averageCommentCountPerPost"));
    }
}
