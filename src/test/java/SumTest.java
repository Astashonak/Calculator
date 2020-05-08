import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SumTest {

    private CalculatorFunctions calc = new CalculatorFunctions();

    @DataProvider(name="сложение для детсада")
    public Object[][] dataForSum(){
        return new Object[][]{
                {3, 5, 8},
                {1, 2, 3}
        };
    }

    @Test(dataProvider = "сложение для детсада", description = "Проверка функции '+'")
    public void sumTest(int a, int b, int expectedSum){
        int sum = calc.sum(a, b);
        assertEquals(sum, expectedSum, "not ok");
    }
}
