package com.kodilla.testing.forum.statistics;

import java.util.*;

public class StatisticCalculator {

    private Statistics statistics;

    public StatisticCalculator(Statistics statistics) {
        this.statistics = statistics;
    }

    private int userCount;
    private int postCount;
    private int commentCount;
    private double averagePostCountPerUser;
    private double averageCommentCountPerUser;
    private double averageCommentCountPerPost;


    public Map<String, Double> calculateAdvStatistics(Statistics statistics) {
        Map<String, Double> statisticsList = new HashMap<>();
        userCount = statistics.usersNames().size();
        postCount = statistics.postsCount();
        commentCount = statistics.commentsCount();

        if(userCount != 0) {
            averagePostCountPerUser = (double)postCount / userCount;
            averageCommentCountPerUser = (double)commentCount / userCount;
        } else {
            averagePostCountPerUser = -1;
            averageCommentCountPerUser = -1;
        }
        if(postCount != 0) {
            averageCommentCountPerPost = (double)commentCount / postCount;
        } else {
            averageCommentCountPerPost = -1;
        }
        statisticsList.put("averagePostCountPerUser", averagePostCountPerUser);
        statisticsList.put("averageCommentCountPerUser", averageCommentCountPerUser);
        statisticsList.put("averageCommentCountPerPost", averageCommentCountPerPost);

        return statisticsList;
    }

    /*public Map<String, Double> showStatistics() {
        Map<String, Double> showStatistics = new HashMap<>();
        showStatistics.put("averagePostCountPerUser", averagePostCountPerUser);
        showStatistics.put("averageCommentCountPerUser", averageCommentCountPerUser);
        showStatistics.put("averageCommentCountPerPost", averageCommentCountPerPost);
        return showStatistics;
    } */
}
