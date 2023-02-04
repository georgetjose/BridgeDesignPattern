package bridge;

public class DriverFactory {
	
	
	public static WebActions driverFactory(DriverTypes type) {
		
		switch(type) {
			case Playwright : return new PlaywrightImpl();
			case Webdriver : return new WebDriverImpl();
			default : return null;
		}
		
	}

}
