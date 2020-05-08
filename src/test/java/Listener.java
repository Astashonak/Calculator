import org.testng.ITestListener;
import org.testng.ITestResult;

import java.util.concurrent.TimeUnit;

public class Listener implements ITestListener {

    @Override
    public void onTestStart(ITestResult iTestResult) {
        System.out.println(String.format("========================= STARTING TEST %s =======================", iTestResult.getName()));
    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        System.out.println(String.format("======================== FINISHED TEST %s Duration: %ss ============", iTestResult.getName(),
                getExecutionTime(iTestResult)));
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        System.out.println(String.format("===================== FAILED TEST %s Duration: %ss ====================", iTestResult.getName(),
                getExecutionTime(iTestResult)));
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {
        System.out.println(String.format("===================== SKIPPING TEST %s ==========================", iTestResult.getName(),
                getExecutionTime(iTestResult)));
    }

    private long getExecutionTime(ITestResult iTestResult) {
        return TimeUnit.MILLISECONDS.toSeconds(iTestResult.getEndMillis() - iTestResult.getStartMillis());
    }
}
