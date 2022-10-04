import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling

Mobile.startExistingApplication('com.maybank2u.life.uat', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Object Repository/Dashboard/dashboard_maybank2uButton'), 10)

Mobile.tap(findTestObject('Object Repository/Dashboard/dashboard_maybank2uButton'), 0)

if (Mobile.verifyElementVisible(findTestObject('Main/mainEnterPINMessage'), 0, FailureHandling.OPTIONAL)) {
    Mobile.tap(findTestObject('Login Onboarding/PIN1'), 0)

    Mobile.tap(findTestObject('Login Onboarding/PIN1'), 0)

    Mobile.tap(findTestObject('Login Onboarding/PIN1'), 0)

    Mobile.tap(findTestObject('Login Onboarding/PIN1'), 0)

    Mobile.tap(findTestObject('Login Onboarding/PIN1'), 0)

    Mobile.tap(findTestObject('Login Onboarding/PIN2'), 0)

    //Mobile.tap(findTestObject('Login Onboarding/loginPinTickBtn'), 0)
    Mobile.delay(2)
}

Mobile.verifyElementVisible(findTestObject('Banking/m2uAccountTypeSelection', [('text') : findTestData('TestData').getValue(4, 92)]), 10)

Mobile.tap(findTestObject('Banking/m2uAccountTypeSelection', [('text') : findTestData('TestData').getValue(4, 92)]), 10)

Mobile.tap(findTestObject('Banking/m2uAccountSplitBillIconSelect'), 0)

Mobile.waitForElementPresent(findTestObject('SplitBill/splitBillToPayBillStatusTxt'), 0)

Mobile.tap(findTestObject('SplitBill/splitBillToPayBillStatusTxt'), 0)

Mobile.waitForElementPresent(findTestObject('SplitBill/splitBillToPayAcceptBtn'), 0)

Mobile.tap(findTestObject('SplitBill/splitBillToPayAcceptBtn'), 0)

Mobile.delay(2)

if (Mobile.verifyElementVisible(findTestObject('Tabung/tabungEnterPasswordTxt'), 0, FailureHandling.OPTIONAL)) {
    Mobile.setText(findTestObject('Tabung/tabungSignInInputPasswordField'),  findTestData('TestData').getValue(4, 1), 0)

    Mobile.hideKeyboard()

    Mobile.tap(findTestObject('Tabung/tabungSignInContinueBtn'), 0)
}

Mobile.waitForElementPresent(findTestObject('SplitBill/splitBillConfirmNameTxt'), 0)

Mobile.verifyElementText(findTestObject('SplitBill/splitBillConfirmNameTxt'), findTestData('TestData').getValue(4, 93))

Mobile.delay(5)

Mobile.tap(findTestObject('SplitBill/splitBillConfirmPayNowBtn'), 0)

if (Mobile.verifyElementVisible(findTestObject('Send Request Money/payMoneyTACNoTxt'), 0, FailureHandling.OPTIONAL)) {
    def OTP = Mobile.getText(findTestObject('Send Request Money/payMoneyTACNoTxt'), 0)

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

    Mobile.tap(findTestObject('Send Request Money/payMoneyTACTickBtn'), 0)
} else {
    Mobile.delay(5)

    Mobile.waitForElementPresent(findTestObject('Main/mainS2UApproveBtn'), 0)

    Mobile.tap(findTestObject('Main/mainS2UApproveBtn'), 0)
}

Mobile.delay(2)

Mobile.waitForElementPresent(findTestObject('SplitBill/splitBillSummaryStatusTxt'), 0)

Mobile.tap(findTestObject('Main/mainDoneBtn'), 0)

Mobile.delay(5)

