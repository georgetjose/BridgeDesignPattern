package browserConfigs;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Playwright;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BrowserFlowPW
{
    public static Playwright pw;
    public static Browser testBrowser(BrowserTypes type)
    {
        System.out.println("Playwright getting triggered!!");
        pw = Playwright.create();
        switch(type)
        {
            case CHROME: return pw.chromium().launch(new BrowserType.LaunchOptions().setChannel("chrome").setHeadless(false));
            case FIREFOX: return pw.firefox().launch(new BrowserType.LaunchOptions().setChannel("firefox").setHeadless(false));
            case EDGE: return pw.chromium().launch(new BrowserType.LaunchOptions().setChannel("edge").setHeadless(false));
            default:
                System.out.println("Wrong Browser selection!!!");
        }
        return null;
    }

}
