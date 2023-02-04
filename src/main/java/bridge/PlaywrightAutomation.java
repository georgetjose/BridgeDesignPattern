package bridge;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class PlaywrightAutomation {

	public static void main(String[] args) {

		// Initialize Playwright
		Playwright pw = Playwright.create();

		Browser browser = pw.chromium().launch(
				new BrowserType.LaunchOptions().setChannel("chrome").setHeadless(false)
				);

		// Open a new page
		Page page = browser.newPage();


		// load the url
		page.navigate("http://leaftaps.com/opentaps");

		// Find the username and enter the value
		page.locator("id=username").type("demosalesmanager");

		// Find the password and enter the value
		page.locator("#password").type("crmsfa");

		// Find the login and click
		page.locator(".decorativeSubmit").click();

		// Click on the CRM/SFA
		page.locator("text=CRM/SFA").click();

		// Click Leads Tab
		page.locator("a:has-text('Leads')").click();

		// Click Create Lead
		page.locator("//a[text()='Create Lead']").click();

		// Type Company Name, First Name and Last Name
		page.locator("#createLeadForm_companyName").type("TestLeaf");
		page.locator("#createLeadForm_firstName").type("Babu");
		page.locator("#createLeadForm_lastName").type("Manickam");

		// Click Create Lead Button
		page.locator(".smallSubmit").click();

		// Print the status of the created lead
		String status = page.locator("#viewLead_statusId_sp").innerText();
		System.out.println(status);
		
		// close
		pw.close();
	}

}
