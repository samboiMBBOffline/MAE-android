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
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import io.appium.java_client.AppiumDriver as AppiumDriver
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint

//import com.kms.katalon.keyword.excel.ExcelKeywords as ExcelKeywords
//RunConfiguration.setMobileDriverPreferencesProperty('appPackage', 'com.maybank2u.life.uat')
//
//RunConfiguration.setMobileDriverPreferencesProperty('appActivity', 'com.maybank2u.life.MainActivity')
//
//Mobile.startApplication(GlobalVariable.appPath, false)
//
//Mobile.verifyElementExist(findTestObject('Object Repository/Dashboard/dashboardWalletTopSelect'), 0)
//
//Mobile.verifyElementExist(findTestObject('Object Repository/Dashboard/dashboardQuickActionsTitleTxt'), 0)
Mobile.startExistingApplication('com.maybank2u.life.uat', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Dashboard/mainBottomMenuMaybank2uBtn'), 0)

if (Mobile.verifyElementVisible(findTestObject('Main/mainEnterPINMessage'), 0, FailureHandling.OPTIONAL)) {
    Mobile.tap(findTestObject('Login Onboarding/PIN1'), 0)

    Mobile.tap(findTestObject('Login Onboarding/PIN1'), 0)

    Mobile.tap(findTestObject('Login Onboarding/PIN1'), 0)

    Mobile.tap(findTestObject('Login Onboarding/PIN1'), 0)

    Mobile.tap(findTestObject('Login Onboarding/PIN1'), 0)

    Mobile.tap(findTestObject('Login Onboarding/PIN2'), 0 )
	
}

Mobile.verifyElementVisible(findTestObject('Banking/m2uAccountTypeSelection', [('text') : findTestData('TestData').getValue(4, 2)]), 10)

Mobile.tap(findTestObject('Banking/m2uAccountTypeSelection', [('text') : findTestData('TestData').getValue(4, 2)]), 10)

Mobile.delay(3)

Mobile.verifyElementVisible(findTestObject('Banking/m2uAccountSendReqIconSelect'), 0)

Mobile.tap(findTestObject('Banking/m2uAccountSendReqIconSelect'), 0)

Mobile.delay(3)

Mobile.verifyElementVisible(findTestObject('Send Request Money/requestMoneyIconSelect'), 10)

Mobile.tap(findTestObject('Send Request Money/requestMoneyIconSelect'), 0)

Mobile.delay(5)

Mobile.verifyElementVisible(findTestObject('Send Request Money/sendRequestContactSearchIconSelect'), 10)

Mobile.tap(findTestObject('Send Request Money/sendRequestContactSearchIconSelect'), 0)

Mobile.delay(3)

Mobile.setText(findTestObject('Send Request Money/requestMoneyContactInputField'), findTestData('TestData').getValue(4, 7), 0)

Mobile.delay(3)

Mobile.hideKeyboard()

Mobile.delay(3)

Mobile.verifyElementVisible(findTestObject('Send Request Money/requestMoneyContactSelect', [('contactName') : findTestData('TestData').getValue(4, 7)]), 
    0)

Mobile.tap(findTestObject('Send Request Money/requestMoneyContactSelect', [('contactName') : findTestData('TestData').getValue(4, 7)]), 0)

Mobile.tap(findTestObject('Send Request Money/requestMoneyContactSelect', [('contactName') : findTestData('TestData').getValue(4, 7)]), 0)

Mobile.delay(5)

Mobile.tap(findTestObject('Login Onboarding/PIN4'), 0)

Mobile.delay(3)

Mobile.tap(findTestObject('Main/mainAmountTickBtn'), 0)

Mobile.delay(3)

Mobile.verifyElementText(findTestObject('Send Request Money/requestMoneyConfirmationContactNameTxt', [('contactName') : findTestData('TestData').getValue(4, 7)]), 
    findTestData('TestData').getValue(4, 7))

Mobile.verifyElementText(findTestObject('Send Request Money/requestMoneyConfirmationAmountBtn'), findTestData('TestData').getValue(4, 8))

Mobile.tap(findTestObject('Send Request Money/requestMoneyNotesSelect'), 0)

Mobile.setText(findTestObject('Send Request Money/requestMoneyNotesSelect'),findTestData('TestData').getValue(4, 9), 0)

Mobile.delay(3)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Send Request Money/requestMoneyConfirmationSendRequestBtn'), 0)

Mobile.delay(5)

Mobile.verifyElementText(findTestObject('Send Request Money/requestMoneySummaryNameTxt', [('contactName') : findTestData('TestData').getValue(4, 7)]), 
    findTestData('TestData').getValue(4, 7))

Mobile.verifyElementVisible(findTestObject('Send Request Money/requestMoneySummaryDoneBtn'), 0)

Mobile.verifyElementText(findTestObject('Send Request Money/requestMoneySummarySuccessMessageTxt'), findTestData('TestData').getValue(4, 10))

Mobile.verifyElementText(findTestObject('Send Request Money/requestMoneySummaryAmountTxt'), findTestData('TestData').getValue(4, 8))

Mobile.verifyElementVisible(findTestObject('Send Request Money/requestMoneySummaryDoneBtn'), 10)

Mobile.takeScreenshot('/Users/a00139272/Desktop/Screenshot/requestMoney.png')

Mobile.tap(findTestObject('Send Request Money/requestMoneySummaryDoneBtn'), 0)

