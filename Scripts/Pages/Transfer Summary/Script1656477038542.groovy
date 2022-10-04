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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Mobile.delay(5)

Mobile.verifyElementExist(findTestObject('Festive Season/returnAngpaoStatusMessageTxt'), 0)

def message = Mobile.getText(findTestObject('Festive Season/returnAngpaoStatusMessageTxt'), 10)

println(message)

if (index == '0') {
    assert message == findTestData('TestData').getValue(2, 22)
} else if (index == '1') {
	assert message == findTestData('TestData').getValue(5, 22)
}

Mobile.verifyElementExist(findTestObject('Transfer/transferSummaryDateTimeTitleTxt'), 0)

Mobile.verifyElementExist(findTestObject('Transfer/transferSummaryRefIDTitleTxt'), 0)

Mobile.verifyElementExist(findTestObject('Transfer/transferSummaryShareReceiptBtn'), 0)

Mobile.verifyElementVisible(findTestObject('Main/mainDoneBtn'), 0)

Mobile.takeScreenshot('/Users/a00139272/Desktop/Screenshot/ownTransfer.png')

Mobile.tap(findTestObject('Main/mainDoneBtn'), 0)

Mobile.delay(5)