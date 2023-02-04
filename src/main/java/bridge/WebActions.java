package bridge;

import browserConfigs.BrowserTypes;

public interface WebActions {
	
	public void launch(String url, BrowserTypes browsers);
	public void type(String locator, String text);
	public void click(String locator);
	public String getText(String locator);
	public void close();

}
