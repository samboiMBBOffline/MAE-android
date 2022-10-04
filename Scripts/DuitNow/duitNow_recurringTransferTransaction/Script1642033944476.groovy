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

//Mobile.startApplication('/Users/a00139272/Katalon Studio/MAE/androidapp/app-sit-universal-release-copy.apk', false)
//
//RunConfiguration.setMobileDriverPreferencesProperty('appPackage', 'com.maybank2u.life.sit')
//
//RunConfiguration.setMobileDriverPreferencesProperty('appActivity', 'com.maybank2u.life.sit.MainActivity')
//
//Mobile.delay(5)
//
//Mobile.tapAtPosition(355, 2147)
//
//if (Mobile.verifyElementVisible(findTestObject('Main/mainEnterPINMessage'), 0, FailureHandling.OPTIONAL)) {
//    Mobile.tap(findTestObject('Login Onboarding/PIN1'), 0)
//
//    Mobile.tap(findTestObject('Login Onboarding/PIN1'), 0)
//
//    Mobile.tap(findTestObject('Login Onboarding/PIN1'), 0)
//
//    Mobile.tap(findTestObject('Login Onboarding/PIN1'), 0)
//
//    Mobile.tap(findTestObject('Login Onboarding/PIN1'), 0)
//
//    Mobile.tap(findTestObject('Login Onboarding/PIN2'), 0)
//
//    //Mobile.tap(findTestObject('Login Onboarding/loginPinTickBtn'), 0)
//    Mobile.delay(2)
//}
//
//Mobile.verifyElementVisible(findTestObject('Banking/m2uAccountTypeSelection', [('text') : 'MAE']), 10)
//
//Mobile.tap(findTestObject('Banking/m2uAccountTypeSelection', [('text') : 'MAE']), 10)
Mobile.delay(3)

Mobile.tap(findTestObject('Banking/m2uAccountTransferIconSelect'), 0)

//if (Mobile.verifyElementVisible(findTestObject('Tabung/tabungEnterPasswordTxt'), 0, FailureHandling.OPTIONAL)) {
//    Mobile.setText(findTestObject('Tabung/tabungSignInInputPasswordField'), Password, 0)
//
//    Mobile.hideKeyboard()
//
//    Mobile.tap(findTestObject('Tabung/tabungSignInContinueBtn'), 0)
//}
Mobile.tap(findTestObject('Banking/transferDuitNowTopMenuSelect'), 10)

Mobile.tap(findTestObject('Banking/duitNowOtherIconSelect'), 10)

Mobile.setText(findTestObject('Banking/duitNowMobileInputField'), findTestData('TestData').getValue(4, 4), 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Login Onboarding/loginExistingContinueBtn'), 0)

Mobile.tap(findTestObject('Login Onboarding/PIN4'), 0)

Mobile.delay(2)

Mobile.tap(findTestObject('Login Onboarding/loginPinTickBtn'), 0)

Mobile.setText(findTestObject('Banking/duitNowReferenceInputField'), findTestData('TestData').getValue(8, 3), 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Login Onboarding/loginExistingContinueBtn'), 0)

Mobile.tap(findTestObject('Banking/duitNowSummaryOneOffTxt'), 0)

Mobile.tap(findTestObject('Banking/duitNowRecurringDropdownSelection'), 0)

Mobile.tap(findTestObject('Main/mainCalenderPickerDoneBtn'), 0)

Mobile.delay(2)

Mobile.tap(findTestObject('Main/mainTransferNowBtn'), 0)

Mobile.delay(2)

if (Mobile.verifyElementVisible(findTestObject('Main/mainTACNumberTxt'), 10, FailureHandling.OPTIONAL)) {
    def OTP1 = Mobile.getText(findTestObject('Transfer/duitNowTACNumber'), 0)

    for (def i = 16; i <= 21; i++) {
        if ((OTP1[i]) == '0') {
            Mobile.tap(findTestObject('Login Onboarding/PIN0'), 0)
        }
        
        if ((OTP1[i]) == '1') {
            Mobile.tap(findTestObject('Login Onboarding/PIN1'), 0)
        }
        
        if ((OTP1[i]) == '2') {
            Mobile.tap(findTestObject('Login Onboarding/PIN2'), 0)
        }
        
        if ((OTP1[i]) == '3') {
            Mobile.tap(findTestObject('Login Onboarding/PIN3'), 0)
        }
        
        if ((OTP1[i]) == '4') {
            Mobile.tap(findTestObject('Login Onboarding/PIN4'), 0)
        }
        
        if ((OTP1[i]) == '5') {
            Mobile.tap(findTestObject('Login Onboarding/PIN5'), 0)
        }
        
        if ((OTP1[i]) == '6') {
            Mobile.tap(findTestObject('Login Onboarding/PIN6'), 0)
        }
        
        if ((OTP1[i]) == '7') {
            Mobile.tap(findTestObject('Login Onboarding/PIN7'), 0)
        }
        
        if ((OTP1[i]) == '8') {
            Mobile.tap(findTestObject('Login Onboarding/PIN8'), 0)
        }
        
        if ((OTP1[i]) == '9') {
            Mobile.tap(findTestObject('Login Onboarding/PIN9'), 0)
        }
    }
    
    Mobile.delay(3)

    Mobile.tap(findTestObject('Festive Season/festiveSendGreetingAngpaoTACTickBtn'), 0)

    Mobile.delay(5)
} else {
    Mobile.delay(5)

    Mobile.verifyElementVisible(findTestObject('Main/mainS2UApproveBtn'), 0)

    Mobile.tap(findTestObject('Main/mainS2UApproveBtn'), 0)
}

Mobile.delay(3)

Mobile.takeScreenshot('/Users/a00139272/Desktop/Screenshot/duitNowRecurring.png')

Mobile.verifyElementVisible(findTestObject('Main/mainDoneBtn'), 0)

Mobile.tap(findTestObject('Main/mainDoneBtn'), 0)

Mobile.delay(5)

