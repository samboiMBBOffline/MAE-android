import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint

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
//
//Mobile.startApplication(GlobalVariable.appPath, false)
//
//RunConfiguration.setMobileDriverPreferencesProperty('appPackage', 'com.maybank2u.life.sit')
//
//RunConfiguration.setMobileDriverPreferencesProperty('appActivity', 'com.maybank2u.life.sit.MainActivity')
not_run: Mobile.delay(5)

Mobile.startExistingApplication('com.maybank2u.life.sit', FailureHandling.STOP_ON_FAILURE)

not_run: Mobile.tap(findTestObject('Settings/new_settings_moreMainBtn'), 0)

not_run: Mobile.tap(findTestObject('Main/mainSettingsBtn'), 0)

not_run: Mobile.tap(findTestObject('Settings/new_settings_m2uBtn'), 0)

not_run: Mobile.delay(3)

not_run: if (Mobile.verifyElementVisible(findTestObject('Tabung/tabungEnterPasswordTxt'), 0, FailureHandling.OPTIONAL)) {
    not_run: Mobile.setText(findTestObject('Tabung/tabungSignInInputPasswordField'), Password, 0)

    not_run: Mobile.hideKeyboard()

    not_run: Mobile.tap(findTestObject('Tabung/tabungSignInContinueBtn'), 0)
}

not_run: Mobile.tap(findTestObject('Banking/m2uAccountsScanPayIconSelect'), 0)

not_run: Mobile.delay(5)

not_run: Mobile.waitForElementPresent(findTestObject('QR/qrRegistrationGetStartedBtn'), 0)

not_run: Mobile.tap(findTestObject('QR/qrRegistrationGetStartedBtn'), 0)

Mobile.dragAndDrop(findTestObject('QR/firstscroll'), findTestObject('QR/thirdscroll'), 10)

Mobile.tap(findTestObject('QR/qrRegistrationConfirmBtn'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.delay(3)

Mobile.tap(findTestObject('QR/qrRegistrationConfirmBtn'), 0)

def OTP = Mobile.getText(findTestObject('QR/qrRegistrationOTPTxt'), 0)

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

Mobile.tap(findTestObject('Forget Password/TickTACButton'), 0)

Mobile.delay(2)

Mobile.tap(findTestObject('Login Onboarding/loginExistingContinueBtn'), 0)

Mobile.delay(3)

Mobile.tap(findTestObject('Object Repository/QR/CloseFinal'), 0)

Mobile.delay(5)

