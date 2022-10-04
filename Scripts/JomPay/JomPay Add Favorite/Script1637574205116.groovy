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

//RunConfiguration.setMobileDriverPreferencesProperty('appPackage', 'com.maybank2u.life.sit')
//
//RunConfiguration.setMobileDriverPreferencesProperty('appActivity', 'com.maybank2u.life.MainActivity')
//
//Mobile.startApplication(GlobalVariable.appPath, false)
Mobile.startExistingApplication('com.maybank2u.life.sit')
//
//Mobile.verifyElementExist(findTestObject('Object Repository/Dashboard/dashboardWalletTopSelect'), 0)
//
//Mobile.verifyElementExist(findTestObject('Object Repository/Dashboard/dashboardQuickActionsTitleTxt'), 0)
Mobile.delay(5)

//Mobile.tapAtPosition(startX, startY)
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
//    Mobile.delay(2)
//}
//
//Mobile.verifyElementVisible(findTestObject('Banking/m2uAccountTypeSelection', [('text') : 'MAE']), 0)
//
//Mobile.tap(findTestObject('Banking/m2uAccountTypeSelection', [('text') : 'MAE']), 0)

Mobile.verifyElementVisible(findTestObject('Banking/m2uAccountPayBillsIconSelect'), 0)

Mobile.tap(findTestObject('Banking/m2uAccountPayBillsIconSelect'), 0)

if (Mobile.verifyElementVisible(findTestObject('Paybill/payBillsEnterPasswordTxt'), 0, FailureHandling.OPTIONAL)) {
    Mobile.setText(findTestObject('Paybill/payBillsPasswordInputField'), findTestData('TestData').getValue(2, 1), 0)

    Mobile.hideKeyboard()

    Mobile.tap(findTestObject('Paybill/payBillsSignInContinueBtn'), 0)
}

Mobile.tap(findTestObject('Banking/m2uAccountPayBillsIconSelect'), 40)

Mobile.tap(findTestObject('JomPay/payBillsJomPayTopMenuSelect'), 0)

Mobile.tap(findTestObject('JomPay/jomPayIconSelect'), 0)

Mobile.setText(findTestObject('JomPay/jomPayBillerInputField'), findTestData('TestData').getValue(8, 1), 0)

Mobile.setText(findTestObject('JomPay/jomPayBillerRefInputField'), findTestData('TestData').getValue(9, 1), 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Login Onboarding/loginExistingContinueBtn'), 0)

Mobile.tap(findTestObject('Login Onboarding/PIN1'), 0)

Mobile.tap(findTestObject('Login Onboarding/PIN0'), 0)

Mobile.tap(findTestObject('Login Onboarding/PIN0'), 0)

Mobile.tap(findTestObject('JomPay/jomPayAmountTickBtn'), 0)

Mobile.delay(10)

Mobile.verifyElementText(findTestObject('Transfer/transferConfirmationFromAccTypeTxt', [('accType') : accType]), accType)

Mobile.verifyElementText(findTestObject('Transfer/transferConfirmationFromAccNoTxt', [('accNoFrom') : accNoFrom]), accNoFrom)

Mobile.verifyElementExist(findTestObject('Main/mainPayNowBtn'), 0)

Mobile.tap(findTestObject('Main/mainPayNowBtn'), 0)

Mobile.delay(3)

if (Mobile.verifyElementVisible(findTestObject('Festive Season/festiveReturnAngpaoTACNoTxt'), 10, FailureHandling.OPTIONAL)) {
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
    Mobile.delay(5)

    Mobile.verifyElementVisible(findTestObject('Main/mainS2UApproveBtn'), 10)

    Mobile.tap(findTestObject('Main/mainS2UApproveBtn'), 0)
}

Mobile.delay(3)

Mobile.verifyElementText(findTestObject('JomPay/jomPaySummarySuccesfulTxt'), findTestData('TestData').getValue(7, 1))

Mobile.tap(findTestObject('Main/mainAddToFavBtn'), 0)

Mobile.delay(5)

Mobile.verifyElementVisible(findTestObject('Main/mainAddToFavBtn'), 0)

Mobile.tap(findTestObject('Main/mainAddToFavBtn'), 0)

Mobile.delay(2)

Mobile.tap(findTestObject('Main/mainCloseFavPopUpBtn'), 0)

Mobile.delay(2)

Mobile.takeScreenshot('/Users/a00139272/Desktop/Screenshot/jomPayAddFav.png')

Mobile.verifyElementVisible(findTestObject('Main/mainDoneBtn'), 0)

Mobile.tap(findTestObject('Main/mainDoneBtn'), 0)

Mobile.delay(5)

