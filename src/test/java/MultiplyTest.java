import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.Random;

import static org.testng.Assert.assertEquals;

@Listeners(Listener.class)

public class MultiplyTest {

    @DataProvider()
    public Object[][] dataForMul(){
        return new Object[][]{
                {0, 1, 0},
                {1, 1, 1},
                {5, 5, 25}
        };
    }

    @Test(description = "умножение, повторим тест", invocationCount = 6, threadPoolSize = 3)
    public void testMultiply1() throws InterruptedException {
        Thread.sleep(2000);
        int multiply = new CalculatorFunctions().mul(2,3);
        assertEquals(multiply, 6, "not ok" );
    }

    @Test(description = "умножение, подключим RetryAnalyzer", retryAnalyzer = RetryAnalyzer.class)
    public void testMultiply2() throws InterruptedException {
        Thread.sleep(5000);
        int multiply = new CalculatorFunctions().mul(5,5);
        assertEquals(multiply, 25, "not ok" );
        if (new Random().nextBoolean()) {
            Assert.fail();
        }
    }

    @Test(dataProvider = "dataForMul", description = "Проверка функции 'умножить'")
    public void testMultiply3(int a, int b, int expectedMul){
        int mul = new CalculatorFunctions().mul(a, b);
        assertEquals(mul, expectedMul, "not ok" );
    }
}
