import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SubTest {

    @Test(description="вычетание, должно выполнится вторым", priority = 2)
    public void subtraction1() {
        int sub1 = new CalculatorFunctions().sub(10, 5);
        assertEquals(sub1, 5 );
    }

    @Test(description="вычетание, должно выполнится первым", priority = 1)
    public void subtraction2() {
        int sub2 = new CalculatorFunctions().sub(13, 3);
        assertEquals(sub2, 10);
    }
}
