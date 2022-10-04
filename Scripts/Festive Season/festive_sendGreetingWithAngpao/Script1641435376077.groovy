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
Mobile.delay(5)

Mobile.waitForElementPresent(findTestObject('Festive Season/festiveSeasonDashboardQuickActionBtn'), 30)

Mobile.tap(findTestObject('Festive Season/festiveSeasonDashboardQuickActionBtn'), 0)

Mobile.delay(3)

Mobile.tap(findTestObject('Festive Season/seasonalSendGreetingsBtn'), 0)

Mobile.delay(3)

Mobile.waitForElementPresent(findTestObject('Festive Season/sendGreetingSearchIconBtn'), 10)

Mobile.tap(findTestObject('Festive Season/sendGreetingSearchIconBtn'), 0)

Mobile.delay(5)

Mobile.setText(findTestObject('Festive Season/sendGreetingContactInputField'), contactName, 0)

Mobile.delay(3)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Festive Season/sendGreetingContactSelect', [('contactName') : contactName]), 0)

Mobile.tap(findTestObject('Festive Season/sendGreetingContactSelect', [('contactName') : contactName]), 0)

Mobile.delay(3)

Mobile.tap(findTestObject('Festive Season/sendGreetingContactAddBtn'), 0)

Mobile.delay(3)

Mobile.verifyElementText(findTestObject('Festive Season/seasonalSendGreetingSelectedContactNameTxt', [('receipientName') : receipientName]), 
    receipientName)

Mobile.tap(findTestObject('Festive Season/seasonalSendGreetingContinueBtn'), 0)

Mobile.delay(3)

Mobile.verifyElementText(findTestObject('Festive Season/seasonalSendGreetingChineseDefaultGreeting'), 'Gong Xi Fa Cai! Have a roaring good year')

Mobile.setText(findTestObject('Festive Season/seasonalSendGreetingChineseDefaultGreeting'), 'Happy Chinese New Year 2022', 
    0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Festive Season/seasonalSendGreetingDesign2'), 0)

Mobile.tap(findTestObject('Festive Season/seasonalSendGreetingDesignContinueBtn'), 0)

Mobile.delay(3)

Mobile.verifyElementText(findTestObject('Festive Season/seasonalSendGreetingConfirmationMessageTxt'), 'Happy Chinese New Year 2022')

Mobile.verifyElementText(findTestObject('Festive Season/seasonalSendGreetingReceipientNameTxt', [('receipientName') : receipientName]), 
    receipientName)

Mobile.tap(findTestObject('Festive Season/seasonalSendGreetingConfirmIncludeAngpaoBtn'), 0)

if (Mobile.verifyElementVisible(findTestObject('Festive Season/seasonalGreetingAngpaoEnterPasswordTxt'), 0, FailureHandling.OPTIONAL)) {
    Mobile.setText(findTestObject('Festive Season/seasonalGreetingAngpaoPasswordInputField'), Password, 0)

    Mobile.hideKeyboard()

    Mobile.tap(findTestObject('Login Onboarding/loginExistingContinueBtn'), 0)

    Mobile.delay(5)
}

Mobile.tap(findTestObject('Login Onboarding/PIN4'), 0)

Mobile.delay(3)

Mobile.tap(findTestObject('Festive Season/festiveSendGreetingAngpaoAmountTickBtn'), 0)

Mobile.delay(3)

Mobile.verifyElementText(findTestObject('Festive Season/seasonalGretingAngpaoConfirmationContactNameTxt', [('contactName') : contactName]), 
    contactName)

Mobile.tap(findTestObject('Festive Season/seasonalGretingAngpaoSendNowBtn'), 0)

if (Mobile.verifyElementVisible(findTestObject('Festive Season/seasonalGreetingAngpaoTACNoTxt'), 0, FailureHandling.OPTIONAL)) {
    def OTP = Mobile.getText(findTestObject('Festive Season/seasonalGreetingAngpaoTACNoTxt'), 0)

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

    Mobile.tap(findTestObject('Festive Season/festiveSendGreetingAngpaoTACTickBtn'), 0)
} else {
    Mobile.delay(2)

    Mobile.verifyElementVisible(findTestObject('Main/mainS2UApproveBtn'), 10)

    Mobile.tap(findTestObject('Main/mainS2UApproveBtn'), 0)
}

Mobile.delay(3)

Mobile.verifyElementText(findTestObject('Festive Season/seasonalGreetingAngpaoSummarySuccessMessageTxt'), 'Greeting sent successfully')

Mobile.tap(findTestObject('Festive Season/seasonalGreetingAngpaoSummaryDoneBtn'), 0)

