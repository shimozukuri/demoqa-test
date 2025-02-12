package base;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class TestRetry implements IRetryAnalyzer {

    private int count = 0;

    @Override
    public boolean retry(ITestResult iTestResult) {
        if (!iTestResult.isSuccess()) {
            if (count < 3) {
                count++;
                return true;
            }
        }
        return false;
    }

}
