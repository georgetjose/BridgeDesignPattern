package browserConfigs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public interface BrowserDriver
{
    WebDriver launchBrowser();

    void launchUrl(String url);

    WebElement locateElement(String xpathLocator);

    void maximize();

    void closeBrowser();
}
