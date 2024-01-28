package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    final private int iD;
    final private String username;
    final private char sex;
    final private LocalDate birthDate;
    final private int postCount;

    public ForumUser(int iD, String username, char sex, LocalDate birthDate, int postCount) {
        this.iD = iD;
        this.username = username;
        this.sex = sex;
        this.birthDate = birthDate;
        this.postCount = postCount;
    }

    public int getiD() {
        return iD;
    }

    public String getUsername() {
        return username;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getPostCount() {
        return postCount;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "iD=" + iD +
                ", username='" + username + '\'' +
                ", sex=" + sex +
                ", birthDate=" + birthDate +
                ", postCount=" + postCount +
                '}';
    }



}
