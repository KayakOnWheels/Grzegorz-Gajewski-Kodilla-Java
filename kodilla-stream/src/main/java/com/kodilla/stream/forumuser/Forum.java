package com.kodilla.stream.forumuser;

import java.util.*;
import java.time.*;

public class Forum {
    private List<ForumUser> userList = new ArrayList<>();

    public Forum() {
        userList.add(new ForumUser(1432, "gfdsg", 'M', LocalDate.of(2012, 12, 12), 993));
        userList.add(new ForumUser(4532, "hbdfs", 'F', LocalDate.of(2014, 12, 12), 113));
        userList.add(new ForumUser(6433, "wearf", 'M', LocalDate.of(2005, 12, 12), 343));
        userList.add(new ForumUser(2354, "nbfg", 'F', LocalDate.of(2019, 12, 12), 13));
        userList.add(new ForumUser(1426, "htrsa", 'M', LocalDate.of(2001, 12, 12), 454));
    }
    public List<ForumUser> getUserList() {
        return userList;
    }


}
