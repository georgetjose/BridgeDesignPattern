package browserConfigs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class EdgeBrowser implements BrowserDriver
{
    public static EdgeDriver driver;

    @Override
    public WebDriver launchBrowser() {
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        return driver;
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
