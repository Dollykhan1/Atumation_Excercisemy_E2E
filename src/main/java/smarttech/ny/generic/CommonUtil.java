package smarttech.ny.generic;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import smarttech.ny.basepage.BasePage;

public class CommonUtil extends BasePage{
	{
}
	public static void actionClick(WebElement ele) {
		Actions ac = new Actions(driver);
		ac.click(ele).build().perform();	

	}
	//public static void jsClick() {
	//	JavaScriptExecuter js = (JavaScriptExecuter)driver
	}

