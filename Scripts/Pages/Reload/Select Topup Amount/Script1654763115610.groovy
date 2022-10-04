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

Mobile.delay(7)

Mobile.waitForElementPresent(findTestObject('Reload/reloadAmountServiceNameTxt', [('provider') : findTestData('TestData').getValue(
                4, 3)]), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Reload/reloadAmountServiceNameTxt', [('provider') : findTestData('TestData').getValue(
                4, 3)]), findTestData('TestData').getValue(4, 3))

Mobile.verifyElementText(findTestObject('Object Repository/Reload/reloadAmountReceiverNoTxt'), findTestData('TestData').getValue(
        4, 5))

Mobile.verifyElementText(findTestObject('Reload/reloadAmountTitle', [('amountSelectTitle') : findTestData('TestData').getValue(
                2, 6)]), findTestData('TestData').getValue(2, 6))

Mobile.verifyElementVisible(findTestObject('Object Repository/Reload/reloadAmountValueSelect', [('amount') : findTestData(
                'TestData').getValue(4, 6)]), 0)

Mobile.tap(findTestObject('Reload/reloadAmountValueSelect', [('amount') : findTestData('TestData').getValue(4, 6)]), 0)

checked = Mobile.getAttribute(findTestObject('Object Repository/Reload/reloadCheckedAmount'), 'clickable', 0)

assert checked == 'false'

Mobile.tap(findTestObject('Reload/reloadAmountContinueBtn', [('continue') : findTestData('TestData').getValue(2, 7)]), 0)

