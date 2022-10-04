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

//Mobile.startApplication('/Users/a00139272/Katalon Studio/MAE/androidapp/app-sit-universal-release-copy.apk', false)
//
//RunConfiguration.setMobileDriverPreferencesProperty('appPackage', 'com.maybank2u.life.sit')
//
//RunConfiguration.setMobileDriverPreferencesProperty('appActivity', 'com.maybank2u.life.sit.MainActivity')
Mobile.delay(3)

Mobile.tapAtPosition(953, 2147)

Mobile.tapAtPosition(953, 2147)

Mobile.waitForElementPresent(findTestObject('Main/mainMoreNotificationBtn'), 0)

Mobile.tap(findTestObject('Main/mainMoreNotificationBtn'), 0)

Mobile.waitForElementPresent(findTestObject('Notification/notificationFestiveGreetingTitleTxt'), 0)

Mobile.tap(findTestObject('Notification/notificationFestiveGreetingTitleTxt'), 0)

Mobile.verifyElementText(findTestObject('Festive Season/festiveReceivedGreetingMessageTxt'), 'Gong Xi Fa Cai! Have a roaring good year')

Mobile.tap(findTestObject('Festive Season/festiveReturnAngpaoBtn'), 0)

if (Mobile.verifyElementVisible(findTestObject('Login Onboarding/loginEnterPasswordMessage'), 0, FailureHandling.OPTIONAL)) {
    Mobile.setText(findTestObject('Login Onboarding/loginPasswordInputField'), Password, 0)

    Mobile.hideKeyboard()

    Mobile.tap(findTestObject('Login Onboarding/loginExistingContinueBtn'), 0)
}

Mobile.delay(5)

Mobile.waitForElementPresent(findTestObject('Login Onboarding/PIN4'), 30)

Mobile.tap(findTestObject('Login Onboarding/PIN4'), 0)

Mobile.delay(3)

Mobile.tap(findTestObject('Festive Season/seasonalGretingAngpaoAmountTickBtn'), 0)

Mobile.delay(3)

Mobile.verifyElementText(findTestObject('Festive Season/returnAngpaoReceiverNameTxt (1)', [('receipientName') : receipientName]), 
    contactName)

Mobile.tap(findTestObject('Festive Season/seasonalGretingAngpaoSendNowBtn'), 0)

if (Mobile.verifyElementVisible(findTestObject('Festive Season/festiveReturnAngpaoTACNoTxt'), 0, FailureHandling.OPTIONAL)) {
    def OTP = Mobile.getText(findTestObject('Festive Season/festiveReturnAngpaoTACNoTxt'), 0)

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

    Mobile.tap(findTestObject('Festive Season/festiveReturnAngpaoTickBtn'), 0)
} else {
    Mobile.delay(2)

    Mobile.verifyElementVisible(findTestObject('Main/mainS2UApproveBtn'), 10)

    Mobile.tap(findTestObject('Main/mainS2UApproveBtn'), 0)
}

Mobile.delay(3)

Mobile.waitForElementPresent(findTestObject('Festive Season/returnAngpaoReceiverNameTxt'), 0)

Mobile.verifyElementText(findTestObject('Festive Season/returnAngpaoStatusMessageTxt'), 'Transfer successful')

Mobile.verifyElementText(findTestObject('Festive Season/returnAngpaoReceiverNameTxt', [('receipientName') : receipientName]), 
    receipientName)

Mobile.verifyElementText(findTestObject('Festive Season/returnAngpaoReceiverContactNoTxt'), '+6011 2233 1144')

Mobile.verifyElementText(findTestObject('Festive Season/returnAngpaoAmountSendTxt'), 'RM 0.04')

Mobile.tap(findTestObject('Festive Season/seasonalGreetingAngpaoSummaryDoneBtn'), 0)

Mobile.closeApplication()

