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
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import io.appium.java_client.AppiumDriver as AppiumDriver

RunConfiguration.setMobileDriverPreferencesProperty('appPackage', 'com.maybank2u.life.sit')

RunConfiguration.setMobileDriverPreferencesProperty('appActivity', 'com.maybank2u.life.MainActivity')

Mobile.startApplication(GlobalVariable.appPath, false)

Mobile.delay(3)

device_Height = Mobile.getDeviceHeight()

device_Width = Mobile.getDeviceWidth()

int startX = device_Width / 1.25

int startY = device_Height * 0.97

Mobile.tapAtPosition(startX, startY)

Mobile.tap(findTestObject('Main/mainSettingsBtn'), 0)

Mobile.tap(findTestObject('Settings/settingsMaybank2UBtn'), 0)

if (Mobile.verifyElementVisible(findTestObject('Login Onboarding/loginEnterPasswordMessage'), 0, FailureHandling.OPTIONAL)) {
    Mobile.setText(findTestObject('Login Onboarding/loginPasswordInputField'), Password, 0)

    Mobile.hideKeyboard()

    Mobile.tap(findTestObject('Login Onboarding/loginExistingContinueBtn'), 0)
}

Mobile.delay(5)

Mobile.verifyElementExist(findTestObject('Settings/settingS2UToggle'), 0)

Mobile.tap(findTestObject('Settings/settingS2UToggle'), 0)

Mobile.tap(findTestObject('Banking/s2UActivateNowBtn'), 0)

Mobile.tap(findTestObject('Banking/s2UConfirmBtn'), 0)

def OTP = Mobile.getText(findTestObject('Login Onboarding/secureGetOTPTxt'), 0)

for (def i = 16; i <= 21; i++) {
    if ((OTP[i]) == '0') {
        Mobile.tap(findTestObject('Login Onboarding/PIN0'), 0)
    }
    
    if ((OTP[i]) == '1') {
        Mobile.tap(findTestObject('Login Onboarding/PIN1'), 0)
    }
    
    if ((OTP[i]) == '2') {
        Mobile.tap(findTestObject('Login Onboarding/PIN2'), 0)
    }
    
    if ((OTP[i]) == '3') {
        Mobile.tap(findTestObject('Login Onboarding/PIN3'), 0)
    }
    
    if ((OTP[i]) == '4') {
        Mobile.tap(findTestObject('Login Onboarding/PIN4'), 0)
    }
    
    if ((OTP[i]) == '5') {
        Mobile.tap(findTestObject('Login Onboarding/PIN5'), 0)
    }
    
    if ((OTP[i]) == '6') {
        Mobile.tap(findTestObject('Login Onboarding/PIN6'), 0)
    }
    
    if ((OTP[i]) == '7') {
        Mobile.tap(findTestObject('Login Onboarding/PIN7'), 0)
    }
    
    if ((OTP[i]) == '8') {
        Mobile.tap(findTestObject('Login Onboarding/PIN8'), 0)
    }
    
    if ((OTP[i]) == '9') {
        Mobile.tap(findTestObject('Login Onboarding/PIN9'), 0)
    }
}

Mobile.delay(3)

Mobile.tap(findTestObject('Login Onboarding/TickOTP'), 0)

Mobile.setText(findTestObject('Banking/s2UIDNumberInputField'), S2U_ID, 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Login Onboarding/loginExistingContinueBtn'), 0)

Mobile.delay(3)

Mobile.hideKeyboard()

Mobile.takeScreenshot('/Users/a00139272/Desktop/Screenshot/s2u.png')

Mobile.waitForElementPresent(findTestObject('Login Onboarding/loginExistingContinueBtn'), 0)

Mobile.tap(findTestObject('Login Onboarding/loginExistingContinueBtn'), 0)

Mobile.delay(3)

Mobile.tap(findTestObject('Login Onboarding/loginExistingContinueBtn'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Main/mainTopLeftBackButton'), 0)

Mobile.tap(findTestObject('Object Repository/Main/mainTopLeftBackButton'), 0)

Mobile.delay(5)

