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
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.mobile.keyword.internal.MobileAbstractKeyword as MobileAbstractKeyword
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import io.appium.java_client.AppiumDriver as AppiumDriver

not_run: RunConfiguration.setMobileDriverPreferencesProperty('appPackage', 'com.maybank2u.life.uat')

not_run: RunConfiguration.setMobileDriverPreferencesProperty('appActivity', 'com.maybank2u.life.MainActivity')

not_run: Mobile.startApplication(GlobalVariable.appPath, false)

Mobile.startExistingApplication('com.maybank2u.life.uat', FailureHandling.STOP_ON_FAILURE)

not_run: Mobile.verifyElementExist(findTestObject('Object Repository/Dashboard/dashboardWalletTopSelect'), 0)

not_run: Mobile.verifyElementExist(findTestObject('Object Repository/Dashboard/dashboardQuickActionsTitleTxt'), 0)

device_Height = Mobile.getDeviceHeight()

device_Width = Mobile.getDeviceWidth()

int startX = device_Width / 3

int startY = device_Height * 0.97

Mobile.tapAtPosition(startX, startY)

if (Mobile.verifyElementVisible(findTestObject('Main/mainEnterPINMessage'), 0, FailureHandling.OPTIONAL)) {
    Mobile.tap(findTestObject('Login Onboarding/PIN1'), 0)

    Mobile.tap(findTestObject('Login Onboarding/PIN1'), 0)

    Mobile.tap(findTestObject('Login Onboarding/PIN1'), 0)

    Mobile.tap(findTestObject('Login Onboarding/PIN1'), 0)

    Mobile.tap(findTestObject('Login Onboarding/PIN1'), 0)

    Mobile.tap(findTestObject('Login Onboarding/PIN1'), 0)

    Mobile.delay(2)
}

Mobile.verifyElementVisible(findTestObject('Banking/m2uAccountTypeSelection', [('text') : findTestData('TestData').getValue(
                4, 2)]), 10)

Mobile.tap(findTestObject('Banking/m2uAccountTypeSelection', [('text') : findTestData('TestData').getValue(4, 2)]), 10)

Mobile.verifyElementVisible(findTestObject('Object Repository/Banking/m2uAccountTopUpMAEIconSelect'), 10)

Mobile.tap(findTestObject('Object Repository/Banking/m2uAccountTopUpMAEIconSelect'), 0)

if (Mobile.verifyElementVisible(findTestObject('Login Onboarding/loginEnterPasswordMessage'), 0, FailureHandling.OPTIONAL)) {
    Mobile.setText(findTestObject('Login Onboarding/loginPasswordInputField'), findTestData('TestData').getValue(4, 1), 
        0)

    Mobile.hideKeyboard()

    Mobile.tap(findTestObject('Login Onboarding/loginExistingContinueBtn'), 0)
}

Mobile.waitForElementPresent(findTestObject('Object Repository/others/maeTopupOnlineBankingTopSelect'), 40)

Mobile.tap(findTestObject('Object Repository/others/maeTopupOnlineBankingTopSelect'), 0)

Mobile.scrollToText(findTestData('TestData').getValue(4, 3))

Mobile.tap(findTestObject('Object Repository/others/maeTopupFPXSBIASelect'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/others/maeTopupToAccNoTxt'), findTestData('TestData').getValue(
        4, 5))

Mobile.verifyElementText(findTestObject('Object Repository/others/maeTopupToAccTypeTxt'), findTestData('TestData').getValue(
        4, 6))

Mobile.verifyElementText(findTestObject('Object Repository/others/maeTopupToAccBankTxt'), findTestData('TestData').getValue(
        4, 7))

Mobile.verifyElementText(findTestObject('Object Repository/others/maeTopupEnterAmountTitleTxt'), findTestData('TestData').getValue(
        2, 4))

Mobile.verifyElementExist(findTestObject('Object Repository/others/maeTopupAmountRMTxt'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/others/maeTopupAmountTxt'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/others/maeTopupMinAmountMessageTxt'), findTestData('TestData').getValue(
        4, 10))

String trxAmount = findTestData('TestData').getValue(4, 11)

def length = trxAmount.length()

Mobile.delay(5)

Mobile.tapAtPosition(startX, startY)

for (def i = 0; i < length; i++) {
    if ((trxAmount[i]) == '0') {
        Mobile.tap(findTestObject('Login Onboarding/PIN0'), 0)
    }
    
    if ((trxAmount[i]) == '1') {
        Mobile.tap(findTestObject('Login Onboarding/PIN1'), 0)
    }
    
    if ((trxAmount[i]) == '2') {
        Mobile.tap(findTestObject('Login Onboarding/PIN2'), 0)
    }
    
    if ((trxAmount[i]) == '3') {
        Mobile.tap(findTestObject('Login Onboarding/PIN3'), 0)
    }
    
    if ((trxAmount[i]) == '4') {
        Mobile.tap(findTestObject('Login Onboarding/PIN4'), 0)
    }
    
    if ((trxAmount[i]) == '5') {
        Mobile.tap(findTestObject('Login Onboarding/PIN5'), 0)
    }
    
    if ((trxAmount[i]) == '6') {
        Mobile.tap(findTestObject('Login Onboarding/PIN6'), 0)
    }
    
    if ((trxAmount[i]) == '7') {
        Mobile.tap(findTestObject('Login Onboarding/PIN7'), 0)
    }
    
    if ((trxAmount[i]) == '8') {
        Mobile.tap(findTestObject('Login Onboarding/PIN8'), 0)
    }
    
    if ((trxAmount[i]) == '9') {
        Mobile.tap(findTestObject('Login Onboarding/PIN9'), 0)
    }
}

WebUI.delay(3)

Mobile.tap(findTestObject('Object Repository/others/maeTopupAmountTickBtn'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/others/maeTopupFPXSSignInScreenTitleTxt'), findTestData('TestData').getValue(
        2, 12))

Mobile.setText(findTestObject('Object Repository/others/maeTopupFPXSSignInUserIDInput'), findTestData('TestData').getValue(
        4, 13), 0)

Mobile.setText(findTestObject('Object Repository/others/maeTopupFPXSSignInPasswordInput'), findTestData('TestData').getValue(
        4, 14), 0)

Mobile.tap(findTestObject('Object Repository/others/maeTopupFPXSSignInBtn'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/others/maeTopupFPXAccountSelectionScreenTitle'), findTestData(
        'TestData').getValue(2, 15))

Mobile.verifyElementVisible(findTestObject('Object Repository/others/maeTopupFPXAccountSelectionSavingsTxt'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/others/maeTopupFPXAccountAmountTxt'), findTestData('TestData').getValue(
        4, 17))

Mobile.tap(findTestObject('Object Repository/others/maeTopupFPXConfirmBtn'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

int startX2 = device_Width / 5

int startY2 = device_Height / 2.3

Mobile.tapAtPosition(startX2, startY2)

Mobile.waitForElementPresent(findTestObject('Object Repository/others/maeTopupSuccessStatusTxt'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/others/maeTopupSuccessStatusTxt'), findTestData('TestData').getValue(
        4, 19))

Mobile.waitForElementPresent(findTestObject('Main/mainDoneBtn'), 0)

Mobile.tap(findTestObject('Main/mainDoneBtn'), 0)

