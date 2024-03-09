package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {
        //Given
        Millenials millenialUser = new Millenials("millenialUser");
        YGeneration yUser = new YGeneration("YUser");
        ZGeneration zUser = new ZGeneration("ZUser");

        //When&Then
        Assertions.assertEquals("Facebook", millenialUser.socialPublisher.share());
        Assertions.assertEquals("Twitter", yUser.socialPublisher.share());
        Assertions.assertEquals("Snapchat", zUser.socialPublisher.share());
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        Millenials millenialUser = new Millenials("millenialUser");
        YGeneration yUser = new YGeneration("YUser");
        ZGeneration zUser = new ZGeneration("ZUser");

        //When
        millenialUser.setSocialPublisher(new SnapchatPublisher());
        yUser.setSocialPublisher(new FacebookPublisher());
        zUser.setSocialPublisher(new TwitterPublisher());

        //Then
        Assertions.assertEquals("Snapchat", millenialUser.socialPublisher.share());
        Assertions.assertEquals("Facebook", yUser.socialPublisher.share());
        Assertions.assertEquals("Twitter", zUser.socialPublisher.share());

    }
}
