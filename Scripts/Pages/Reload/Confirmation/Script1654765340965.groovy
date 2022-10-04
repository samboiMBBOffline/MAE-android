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

Mobile.verifyElementText(findTestObject('Object Repository/Reload/reloadConfirmationProviderNameTxt'), findTestData('TestData').getValue(
        4, 3))

Mobile.verifyElementText(findTestObject('Object Repository/Reload/reloadConfirmationReceiverNoTxt'), findTestData('TestData').getValue(
        4, 5))

Mobile.verifyElementText(findTestObject('Object Repository/Reload/reloadConfirmationAmountTxt'), findTestData('TestData').getValue(
        4, 6))

Mobile.verifyElementExist(findTestObject('Reload/reloadConfirmationDateTitle', [('date') : findTestData('TestData').getValue(
                2, 8)]), 0)

Mobile.verifyElementExist(findTestObject('Reload/reloadConfirmationPayFromTitle', [('payFrom') : findTestData('TestData').getValue(
                2, 9)]), 0)

Mobile.verifyElementText(findTestObject('Transfer/transferConfirmationFromAccTypeTxt', [('accType') : findTestData('TestData').getValue(
                4, 9)]), findTestData('TestData').getValue(4, 9))

Mobile.verifyElementText(findTestObject('Transfer/transferConfirmationFromAccNoTxt', [('accNoFrom') : findTestData('TestData').getValue(
                4, 10)]), findTestData('TestData').getValue(4, 10))

Mobile.tap(findTestObject('Reload/reloadConfirmationPayNowBtn', [('payNow') : findTestData('TestData').getValue(2, 11)]), 
    0)

