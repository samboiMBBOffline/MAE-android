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

Mobile.waitForElementPresent(findTestObject('Object Repository/Reload/reloadSummaryTrxStatusTxt'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Reload/reloadSummaryTrxStatusTxt'), findTestData('TestData').getValue(
        4, 12))

Mobile.verifyElementText(findTestObject('Object Repository/Reload/reloadSummaryProviderTxt'), findTestData('TestData').getValue(
        4, 3))

Mobile.verifyElementText(findTestObject('Object Repository/Reload/reloadSummaryMobileNoTxt'), findTestData('TestData').getValue(
        4, 5))

Mobile.verifyElementText(findTestObject('Object Repository/Reload/reloadSummaryAmountTxt'), findTestData('TestData').getValue(
        4, 6))

Mobile.verifyElementExist(findTestObject('Reload/reloadSummaryRefIDTitle', [('refID') : findTestData('TestData').getValue(
                2, 13)]), 0)

Mobile.verifyElementExist(findTestObject('Reload/reloadSummaryDateTimeTitle', [('dateTime') : findTestData('TestData').getValue(
                2, 14)]), 0)

Mobile.verifyElementExist(findTestObject('Reload/reloadSummaryProviderTitle', [('provider') : findTestData('TestData').getValue(
                2, 15)]), 0)

Mobile.verifyElementExist(findTestObject('Reload/reloadSummaryMobileNoTitle', [('mobileNo') : findTestData('TestData').getValue(
                2, 16)]), 0)

Mobile.verifyElementExist(findTestObject('Reload/reloadSummaryAmountTitle', [('amount') : findTestData('TestData').getValue(
                2, 17)]), 0)

Mobile.verifyElementExist(findTestObject('Reload/reloadSummaryShareReceiptBtn', [('shareReceipt') : findTestData('TestData').getValue(
                2, 19)]), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Reload/reloadSummaryDoneBtn', [('done') : findTestData('TestData').getValue(
                2, 18)]), 0)

Mobile.tap(findTestObject('Reload/reloadSummaryDoneBtn', [('done') : findTestData('TestData').getValue(2, 18)]), 0)

