import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.model.FailureHandling

import io.appium.java_client.AppiumDriver as AppiumDriver

Mobile.startExistingApplication('com.maybank2u.life.uat', FailureHandling.STOP_ON_FAILURE)

//Mobile.waitForElementPresent(findTestObject('Login Onboarding/onboardWelcomeSkipBtn'), 03)
if (Mobile.verifyElementVisible(findTestObject('Login Onboarding/onboardWelcomeSkipBtn'), 0, FailureHandling.OPTIONAL)) {
    Mobile.waitForElementPresent(findTestObject('Login Onboarding/onboardWelcomeSkipBtn'), 3000)

    Mobile.tap(findTestObject('Login Onboarding/onboardWelcomeSkipBtn'), 0)

    Mobile.tap(findTestObject('Login Onboarding/onboardTNCAgreeBtn'), 0)
}

Mobile.tap(findTestObject('Dashboard/dashboardSetUpWalletIcon'), 0)

Mobile.tap(findTestObject('Login Onboarding/getStartedExistingUserBtn'), 0)

//datafiles TestData sheets Transfer
Mobile.setText(findTestObject('Login Onboarding/loginExistingUsernameInputField'), findTestData('TestData').getValue(4, 78), 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Login Onboarding/loginExistingContinueBtn'), 0)

Mobile.waitForElementPresent(findTestObject('Login Onboarding/loginExistingMineConfirmationBtn'), 50)

Mobile.tap(findTestObject('Login Onboarding/loginExistingMineConfirmationBtn'), 0)

Mobile.setText(findTestObject('Login Onboarding/loginPasswordInputField'), findTestData('TestData').getValue(4,79), 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Login Onboarding/loginExistingContinueBtn'), 0)

if (Mobile.verifyElementVisible(findTestObject('Login Onboarding/Proceed'), 3, FailureHandling.OPTIONAL)) {
    Mobile.tap(findTestObject('Login Onboarding/Proceed'), 5)
} else {
}

Mobile.tap(findTestObject('Login Onboarding/PIN1'), 0)

Mobile.tap(findTestObject('Login Onboarding/PIN1'), 0)

Mobile.tap(findTestObject('Login Onboarding/PIN1'), 0)

Mobile.tap(findTestObject('Login Onboarding/PIN1'), 0)

Mobile.tap(findTestObject('Login Onboarding/PIN1'), 0)

Mobile.tap(findTestObject('Login Onboarding/PIN2'), 0)

Mobile.tap(findTestObject('Login Onboarding/loginPinTickBtn'), 0)

Mobile.delay(2)

//Mobile.waitForElementPresent(findTestObject('Dashboard/dashboardSetUpWalletIcon'), 50)
Mobile.tap(findTestObject('Login Onboarding/PIN1'), 0)

Mobile.tap(findTestObject('Login Onboarding/PIN1'), 0)

Mobile.tap(findTestObject('Login Onboarding/PIN1'), 0)

Mobile.tap(findTestObject('Login Onboarding/PIN1'), 0)

Mobile.tap(findTestObject('Login Onboarding/PIN1'), 0)

Mobile.tap(findTestObject('Login Onboarding/PIN2'), 0)

Mobile.delay(2)

Mobile.tap(findTestObject('Login Onboarding/loginPinTickBtn'), 0)

Mobile.tap(findTestObject('Login Onboarding/loginTouchIDSetUpLaterBtn'), 0)

Mobile.tap(findTestObject('Login Onboarding/loginVerifyNumberYesProceedBtn'), 0)

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

Mobile.waitForElementPresent(findTestObject('Login Onboarding/onboardNameInputField'), 0)

Mobile.setText(findTestObject('Login Onboarding/onboardNameInputField'), findTestData('TestData').getValue(4, 80), 0)

Mobile.hideKeyboard()

Mobile.delay(2)

Mobile.tap(findTestObject('Login Onboarding/loginExistingContinueBtn'), 0)

Mobile.delay(2)

Mobile.verifyElementVisible(findTestObject('Object Repository/Transfer/onboardSelectWallet_AccountType'), 0)

Mobile.tap(findTestObject('Object Repository/Transfer/onboardSelectWallet_AccountType'), 0)

Mobile.tap(findTestObject('Login Onboarding/loginExistingContinueBtn'), 0)

Mobile.tap(findTestObject('Login Onboarding/onboardReferSkipBtn'), 0)

Mobile.delay(2)

Mobile.takeScreenshot('/Users/a00139272/Desktop/Screenshot/Onboard.png')

Mobile.tap(findTestObject('Main/mainDoneBtn'), 0)

Mobile.delay(5)

