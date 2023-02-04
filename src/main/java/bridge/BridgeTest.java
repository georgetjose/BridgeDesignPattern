package bridge;

import browserConfigs.BrowserTypes;
import org.testng.annotations.Test;

public class BridgeTest extends RetryAnalyzer
{

	@Test(retryAnalyzer = bridge.RetryAnalyzer.class)
	public void createLead() {

		WebActions impl = getImpl();

		impl.launch("http://leaftaps.com/opentaps",BrowserTypes.EDGE);
		impl.type("//input[@id='username']", "demosalesmanager");
		impl.type("//input[@id='password']", "crmsfa");
		impl.click("//input[@class='decorativeSubmit']");
		impl.click("//a[contains(text(),'CRM/SFA')]");
		impl.click("//a[text()='Leads']");
		impl.click("//a[text()='Create Lead']");
		impl.type("//input[@id='createLeadForm_companyName']", "TestLeaf");
		impl.type("//input[@id='createLeadForm_firstName']", "Test");
		impl.type("//input[@id='createLeadForm_lastName']", "Architect");
		impl.click("//*[@name='submitButton']");
		System.out.println(impl.getText("//*[@id='viewLead_firstName_sp']"));
		impl.close();

	}

}
