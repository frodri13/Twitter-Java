package tech.makers.twitter.appuser;

import org.junit.jupiter.api.Test;

public class AppUserTest {

    @Test
    public void testCreateAppUser(){

        AppUser subject = new AppUser();
        subject.setEmail("robot@test.com");
        subject.setUsername("Mr Robot");
        subject.setName("Elliot");
        subject.setPassword("EvilCorp");

    }
}
