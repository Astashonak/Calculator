import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BasePage {

    CalculatorFunctions calculator;

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Open");
        calculator = new CalculatorFunctions();
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("Close");
    }
}
