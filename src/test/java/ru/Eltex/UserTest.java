package ru.Eltex;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.Assert;
import ru.Eltex.domain.User;


public class UserTest {
    private User testUser;

    @Test
    public void setUserName() {
        testUser = new User();
        String expected = "Johny";
        testUser.setUsername(expected);
        Assert.assertEquals(expected, testUser.getUsername());
    }

    @Test
    public void setUserPassword() {
        testUser = new User();
        String expected = "12345";
        testUser.setPassword(expected);
        Assert.assertEquals(expected, testUser.getPassword());
    }

}
