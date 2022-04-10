package kg.geektech.lessons6;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ReversWordsTest {
    ReverseWords reverseWords;

    @Before
    public void setUp(){
        reverseWords = new ReverseWords();
    }
    @Test
    public void reversTwoWords(){
        assertEquals("Two One",reverseWords.reverseString("One Two"));
    }
    @Test
    public void reversThreeAndMoreWords(){
        assertEquals("Five Four Three Two One",reverseWords.reverseString("One Two Three Four Five"));
    }
    @Test
    public void reversSpacedWords(){
        assertEquals("Three Two One",reverseWords.reverseString("   One Two Three   "));
    }
}
