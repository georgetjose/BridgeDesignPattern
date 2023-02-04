package browserConfigs;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestBrowserConfigs
{
    @Test
    @Parameters("browser")
    public void testingBrowser(BrowserTypes browser) throws InterruptedException
    {
        BrowserDriver browserDriver = BrowserFlow.testBrowser(browser);
        if (browserDriver != null) {
            browserDriver.launchBrowser();
            browserDriver.launchUrl("https://google.co.in");
            browserDriver.maximize();
            Thread.sleep(3000);
            browserDriver.closeBrowser();
        }
    }

}
