package kg.geektech.lessons6;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CustomMathTest {

    private  CustomMath math;

    @Before
    public void setUp(){
        math = new CustomMath();
        System.out.println("Before");
    }
    @After
    public void tearDown(){
        math = null;
        System.out.println("After");
    }

    @Test
    public  void simpleAddCase(){
        assertEquals("4",math.add(2,2));
        System.out.println("simpleAddCase");
    }
    @Test
    public void simpleSubCase(){
        assertEquals("5",math.sub(20,15));
        System.out.println("simpleSubCase");
    }
    @Test
    public void simpleMultCase(){
        assertEquals("10",math.multiply(2,5));
    }
    @Test
    public  void simpleDivCase(){
        assertEquals("10",math.div(20,2));
    }
    @Test
    public void divByZero(){
        assertEquals("нельзя делить на ноль",math.div(4,0));
        System.out.println("divByZero");
    }


}
