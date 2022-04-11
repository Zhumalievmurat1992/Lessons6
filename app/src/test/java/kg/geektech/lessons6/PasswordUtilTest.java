package kg.geektech.lessons6;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class PasswordUtilTest {
    private PasswordUtils passwordUtils;

    @Before
    public void setUp(){
        passwordUtils = new PasswordUtils();
    }
    @Test
    public void moreSixSymbols(){
        assertFalse(passwordUtils.isStrongPassword("A1"));
        assertTrue(passwordUtils.isStrongPassword("Password123"));
    }
    @Test
    public void capitalLetters(){
        assertFalse(passwordUtils.isStrongPassword("password123"));
        assertTrue(passwordUtils.isStrongPassword("Password123"));
    }
    @Test
    public void elevenSymbols(){
        assertFalse(passwordUtils.isStrongPassword("Password"));
        assertTrue(passwordUtils.isStrongPassword("Password123"));
    }
}
