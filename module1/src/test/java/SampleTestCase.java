import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SampleTestCase {
    @Before
    public void setUp() {
        System.out.println("Setup test");
    }

    @Test
    public void testSample() {
        int sum = App01.sumOfNumbers(1, 2);
        Assert.assertTrue("Sum is incorrect. Expected 4, got " + sum, sum == 4);
    }

    @After
    public void tearDown() {
        System.out.println("After test");
    }

}
