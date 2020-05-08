import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class DivideTest extends BasePage{

    @Parameters({"a", "b", "expectedDiv"})
    @Test(description = "деление, использую parameters")
    public void testDiv(@Optional("6.6")double a, @Optional("2")double b, @Optional("3.3")double expectedDiv) {
            double div = calculator.div(a, b);
            assertEquals(div, expectedDiv, "not ok");
    }
}
