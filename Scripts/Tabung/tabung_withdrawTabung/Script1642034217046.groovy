import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling

Mobile.startExistingApplication('com.maybank2u.life.uat', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Object Repository/Dashboard/dashboard_moreButton'), 10)

Mobile.tap(findTestObject('Object Repository/Dashboard/dashboard_moreButton'), 0)

Mobile.waitForElementPresent(findTestObject('Main/moreTabungIconSelect'), 0)

Mobile.takeScreenshot("/Users/a00139272/Katalon Studio/Screenshot/s2/Withdraw/Screenshot 2.png")

Mobile.tap(findTestObject('Main/moreTabungIconSelect'), 0)

if (Mobile.verifyElementVisible(findTestObject('Main/mainEnterPINMessage'), 0, FailureHandling.OPTIONAL)) {
    Mobile.tap(findTestObject('Login Onboarding/PIN1'), 0)

    Mobile.tap(findTestObject('Login Onboarding/PIN1'), 0)

    Mobile.tap(findTestObject('Login Onboarding/PIN1'), 0)

    Mobile.tap(findTestObject('Login Onboarding/PIN1'), 0)

    Mobile.tap(findTestObject('Login Onboarding/PIN1'), 0)

    Mobile.tap(findTestObject('Login Onboarding/PIN2'), 0)

    Mobile.delay(2)
}

'Withdraw Tabung'
//Mobile.delay(2)
//
//Mobile.takeScreenshot("/Users/a00139272/Katalon Studio/Screenshot/s2/Withdraw/Screenshot 2.png")

Mobile.tap(findTestObject('Tabung/tabungNameSelection', [('text') : findTestData('TestData').getValue(4, 82)]), 10)

Mobile.delay(5)

Mobile.tap(findTestObject('Tabung/tabungThreeDotsBtn'), 0)

Mobile.delay(2)

Mobile.tap(findTestObject('Tabung/tabungWithdrawFundBtn'), 0)

Mobile.delay(2)

Mobile.tap(findTestObject('Tabung/tabungWithdrawConfirmBtn'), 0)

Mobile.delay(2)

Mobile.tap(findTestObject('Login Onboarding/PIN1'), 0)

Mobile.delay(2)

Mobile.tap(findTestObject('Tabung/tabungFundAmountTickBtn'), 0)

Mobile.delay(2)

if (Mobile.verifyElementVisible(findTestObject('Tabung/tabungEnterPasswordTxt'), 10, FailureHandling.OPTIONAL)) {
    Mobile.setText(findTestObject('Tabung/tabungSignInInputPasswordField'), findTestData('TestData').getValue(4, 1), 0)

    Mobile.hideKeyboard()

    Mobile.tap(findTestObject('Tabung/tabungSignInContinueBtn'), 0)
	
	Mobile.delay(10)
}

//Mobile.tap(findTestObject('Banking/m2uAccountTypeSelection', [('text') : 'Savings Account']), 10)

Mobile.tap(findTestObject('Tabung/tabungWithdrawFundBtn'), 0)

if (Mobile.verifyElementVisible(findTestObject('Object Repository/Festive Season/festiveReturnAngpaoTACNoTxt'), 10, FailureHandling.OPTIONAL)) {
    def OTP = Mobile.getText(findTestObject('Object Repository/Festive Season/festiveReturnAngpaoTACNoTxt'), 0)

	//Mobile.takeScreenshot("/Users/a00139272/Katalon Studio/Screenshot/s2/Withdraw/Screenshot 8.png")

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
            Mobile.tap(findTestObject('Login Onboarding/PIN9'), 0 //Mobile.delay(1)
                )
        }
    }

    Mobile.tap(findTestObject('Festive Season/festiveReturnAngpaoTickBtn'), 0)
} else {
    Mobile.verifyElementVisible(findTestObject('Main/mainS2UApproveBtn'), 0)

    Mobile.tap(findTestObject('Main/mainS2UApproveBtn'), 0)

    Mobile.delay(10)
}

Mobile.delay(3)

Mobile.verifyElementVisible(findTestObject('Tabung/tabungWithdrawalSummarySuccessTxt'), 0)

Mobile.verifyElementText(findTestObject('Tabung/tabungWithdrawalSummarySuccessTxt'), findTestData('TestData').getValue(4, 89))

Mobile.delay(3)

Mobile.takeScreenshot("/Users/a00139272/Desktop/Screenshot/withdrawTabung.png")

Mobile.verifyElementVisible(findTestObject('Main/mainDoneBtn'), 0)

Mobile.tap(findTestObject('Main/mainDoneBtn'), 0)

Mobile.delay(5)