package new_Keywords

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.core.util.KeywordUtil

import internal.GlobalVariable
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.By

public class Custom_Keyword {

	private static int intflag = 0;

	@Keyword
	void myCustomPrint(String msg) {
		System.out.println 'the message is: ' + msg
	}

	@Keyword
	void selectDate(String strDate){
		WebDriver driver = DriverFactory.getWebDriver();

		List<WebElement> dateTbl = driver.findElements(By.className("_1258d0t"));
		for(int i=0;i<=dateTbl.size()-32;i++){
			if(dateTbl.get(i).getAttribute("data-testid").contains(strDate)){
				KeywordUtil.logInfo("Clicking on the Date");
				dateTbl.get(i).click();
				KeywordUtil.markPassed("Date has been clicked")
				intflag = 1;
				break;
			}
		}
		if(intflag==0){
			KeywordUtil.logInfo("Clicking on the Next Button");
			driver.findElement(By.xpath("//button[contains(@aria-label,'Next')]")).click();
			KeywordUtil.markPassed("Next Button has been clicked")
			Thread.sleep(2000);
			selectDate(strDate)
		}
	}
}