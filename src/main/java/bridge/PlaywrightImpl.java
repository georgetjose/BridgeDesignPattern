package bridge;

import java.time.Duration;

import browserConfigs.BrowserDriver;
import browserConfigs.BrowserFlow;
import browserConfigs.BrowserFlowPW;
import browserConfigs.BrowserTypes;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class PlaywrightImpl implements WebActions{

	private Playwright pw;
	private Browser browser;
	private Page page;

	private BrowserDriver driver;
	
	@Override
	public void launch(String url,BrowserTypes browsers) {

		browser = BrowserFlowPW.testBrowser(browsers);
		//browser = pw.chromium().launch(new BrowserType.LaunchOptions().setChannel("chrome").setHeadless(false));
		page = browser.newPage();
		page.navigate(url);
	}

	@Override
	public void type(String locator, String text) {
		page.locator(locator).clear();
		page.locator(locator).type(text);
	}

	@Override
	public void click(String locator) {
		page.locator(locator).click();
	}

	@Override
	public String getText(String locator) {
		return page.locator(locator).innerText();
	}

	@Override
	public void close() {
		pw.close();
	}

}
