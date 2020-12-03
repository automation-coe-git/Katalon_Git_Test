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

WebUI.openBrowser(GlobalVariable.url)

WebUI.waitForPageLoad(5)

WebUI.setText(findTestObject('OrangeHRM_OR/Page_OrangeHRM/input_LOGIN Panel_txtUsername'), GlobalVariable.userName)

WebUI.setText(findTestObject('OrangeHRM_OR/Page_OrangeHRM/input_Username_txtPassword'), GlobalVariable.password)

/*for (def rowNum = 1; rowNum <= findTestData('TestData/TestData').getRowNumbers(); rowNum++) {
    WebUI.setText(findTestObject('OrangeHRM_OR/Page_OrangeHRM/input_LOGIN Panel_txtUsername'), findTestData('TestData/TestData').getValue(
            1, rowNum))

    WebUI.setText(findTestObject('OrangeHRM_OR/Page_OrangeHRM/input_Username_txtPassword'), findTestData('TestData/TestData').getValue(
            2, rowNum))

    Thread.sleep(3000)
}*/
WebUI.click(findTestObject('OrangeHRM_OR/Page_OrangeHRM/input_Password_Submit'))

WebUI.waitForElementAttributeValue(findTestObject('OrangeHRM_OR/Page_OrangeHRM/a_Welcome Paul'), 'text', 'Welcome Paul', 
    2, FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

