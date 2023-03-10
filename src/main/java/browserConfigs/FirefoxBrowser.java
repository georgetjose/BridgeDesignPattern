package browserConfigs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FirefoxBrowser implements BrowserDriver
{
    public static FirefoxDriver driver;

    @Override
    public WebDriver launchBrowser() {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        return new FirefoxDriver();
    }

    @Override
    public void launchUrl(String url)
    {
        driver.get(url);
    }

    @Override
    public WebElement locateElement(String xpathLocator)
    {
        return driver.findElement(By.xpath(xpathLocator));
    }

    @Override
    public void maximize()
    {
        driver.manage().window().maximize();
    }

    @Override
    public void closeBrowser()
    {
        driver.close();
    }

}
