import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.airbnb.co.in/')

WebUI.click(findTestObject('Test_1_OR/Page_Holiday Lets, Homes, Experiences  Plac_4cfc37/input_Location_query'))

WebUI.setText(findTestObject('Test_1_OR/Page_Holiday Lets, Homes, Experiences  Plac_4cfc37/input_Location_query'), 'Bangalore')

WebUI.click(findTestObject('Test_1_OR/Page_Holiday Lets, Homes, Experiences  Plac_4cfc37/div_Add dates'))

WebUI.click(findTestObject('Test_1_OR/Page_Holiday Lets, Homes, Experiences  Plac_4cfc37/button_Sa__187sg6v'))

WebUI.click(findTestObject('Test_1_OR/Page_Holiday Lets, Homes, Experiences  Plac_4cfc37/div_4'))

WebUI.click(findTestObject('Test_1_OR/Page_Holiday Lets, Homes, Experiences  Plac_4cfc37/div_5'))

WebUI.click(findTestObject('Test_1_OR/Page_Holiday Lets, Homes, Experiences  Plac_4cfc37/div_Add guests'))

WebUI.click(findTestObject('Test_1_OR/Page_Holiday Lets, Homes, Experiences  Plac_4cfc37/span_Ages 13 or above__8ovatg'))

WebUI.click(findTestObject('Test_1_OR/Page_Holiday Lets, Homes, Experiences  Plac_4cfc37/svg'))

WebUI.click(findTestObject('Test_1_OR/Page_Holiday Lets, Homes, Experiences  Plac_4cfc37/span_Are you bringing a pet__m9v25n'))

WebUI.verifyElementText(findTestObject('Test_1_OR/Page_Bengaluru  Stays  Airbnb/h1_Stays in Bengaluru'), 'Stay in Bengaluru', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeBrowser()

