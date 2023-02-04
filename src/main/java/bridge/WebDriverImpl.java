package bridge;

import java.time.Duration;

import browserConfigs.BrowserDriver;
import browserConfigs.BrowserFlow;
import browserConfigs.BrowserTypes;

public class WebDriverImpl implements WebActions{

	private BrowserDriver driver;
	
	@Override

	public void launch(String url, BrowserTypes browsers) {
		driver = BrowserFlow.testBrowser(browsers);
		driver.launchBrowser();
		driver.launchUrl(url);
	}

	@Override
	public void type(String locator, String text) {
		driver.locateElement(locator).clear();
		driver.locateElement(locator).sendKeys(text);
	}

	@Override
	public void click(String locator) {
		driver.locateElement(locator).click();
	}

	@Override
	public String getText(String locator) {
		return driver.locateElement(locator).getText();
	}

	@Override
	public void close() {
		driver.closeBrowser();
	}

}
