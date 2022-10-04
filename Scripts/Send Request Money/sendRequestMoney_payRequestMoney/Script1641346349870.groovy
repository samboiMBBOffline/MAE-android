import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling

Mobile.startExistingApplication('com.maybank2u.life.uat', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Dashboard/mainBottomMenuMaybank2uBtn'), 0)

if (Mobile.verifyElementVisible(findTestObject('Main/mainEnterPINMessage'), 0, FailureHandling.OPTIONAL)) {
    Mobile.tap(findTestObject('Login Onboarding/PIN1'), 0)

    Mobile.tap(findTestObject('Login Onboarding/PIN1'), 0)

    Mobile.tap(findTestObject('Login Onboarding/PIN1'), 0)

    Mobile.tap(findTestObject('Login Onboarding/PIN1'), 0)

    Mobile.tap(findTestObject('Login Onboarding/PIN1'), 0)

    Mobile.tap(findTestObject('Login Onboarding/PIN2'), 0 )
	
}

Mobile.verifyElementVisible(findTestObject('Banking/m2uAccountTypeSelection', [('text') : findTestData('TestData').getValue(4, 2)]), 10)

Mobile.tap(findTestObject('Banking/m2uAccountTypeSelection', [('text') : findTestData('TestData').getValue(4, 2)]), 10)

Mobile.delay(3)

Mobile.verifyElementVisible(findTestObject('Banking/m2uAccountSendReqIconSelect'), 0)

Mobile.tap(findTestObject('Banking/m2uAccountSendReqIconSelect'), 0)

Mobile.delay(3)

Mobile.waitForElementPresent(findTestObject('Send Request Money/requestMoney_incomingStatus'), 0)

Mobile.tap(findTestObject('Send Request Money/requestMoney_incomingStatus'), 0)

def verify = ((findTestData('TestData').getValue(4, 3) + ' has requested '+findTestData('TestData').getValue(4, 4)+' from you for ') + findTestData('TestData').getValue(4, 5)) + '.'

println(verify)

Mobile.verifyElementText(findTestObject('Send Request Money/moneyRequestNotificationMessageTxt', [('requestorName') : findTestData('TestData').getValue(4, 3)
	, ('requestAmount') : findTestData('TestData').getValue(4, 4), ('requestRemark') : findTestData('TestData').getValue(4, 5)]), verify)

Mobile.tap(findTestObject('Send Request Money/requestMoneyIncomingPayNowBtn'), 0)

Mobile.delay(5)
	
if (Mobile.verifyElementVisible(findTestObject('Tabung/tabungEnterPasswordTxt'), 10, FailureHandling.OPTIONAL)) {
	Mobile.setText(findTestObject('Tabung/tabungSignInInputPasswordField'), findTestData('TestData').getValue(4, 1), 0)

	Mobile.hideKeyboard()

	Mobile.tap(findTestObject('Tabung/tabungSignInContinueBtn'), 0)
}

Mobile.delay(5)

Mobile.tap(findTestObject('Send Request Money/payRequestMoneySendNowBtn'), 0)

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
    }else {
        Mobile.delay(3)

        Mobile.verifyElementVisible(findTestObject('Main/mainS2UApproveBtn'), 0)

        Mobile.tap(findTestObject('Main/mainS2UApproveBtn'), 0)
    }
    
    Mobile.delay(3)

    Mobile.waitForElementPresent(findTestObject('Send Request Money/payMoneySummaryDoneBtn'), 30)

    Mobile.verifyElementText(findTestObject('Send Request Money/payMoneySummaryStatusMessageTxt'), findTestData('TestData').getValue(4, 6))

    Mobile.verifyElementText(findTestObject('Send Request Money/payMoneySummaryRequestorNameTxt', [('requestorName2') : findTestData('TestData').getValue(4, 3)]), 
        findTestData('TestData').getValue(4, 3))

//  Mobile.verifyElementText(findTestObject('Send Request Money/payMoneySummaryContactNoTxt', [('phoneNum2') : phoneNum2]), phoneNum2)

	Mobile.verifyElementText(findTestObject('Send Request Money/payMoneySummaryAmountTxt'), findTestData('TestData').getValue(4, 4))
	
	Mobile.waitForElementPresent(findTestObject('Send Request Money/payMoneySummaryDoneBtn'), 30)
	
	Mobile.takeScreenshot("/Users/a00139272/Desktop/Screenshot/paidRequestMoney.png")

    Mobile.tap(findTestObject('Send Request Money/payMoneySummaryDoneBtn'), 0)

    Mobile.delay(3)

    Mobile.tap(findTestObject('Main/mainTopLeftBackButton'), 0)

    Mobile.delay(5)
//}
//catch (Exception e) {
//    if (GlobalVariable.isApplicationOpened == false) {
//        Mobile.callTestCase(findTestCase('Send Request Money/sendRequestMoney_payRequestMoney'), null)
//    }
//} 

