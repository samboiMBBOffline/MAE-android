import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling

Mobile.startExistingApplication('com.maybank2u.life.uat')

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

Mobile.verifyElementVisible(findTestObject('Banking/m2uAccountSendReqIconSelect'), 10)

Mobile.tap(findTestObject('Banking/m2uAccountSendReqIconSelect'), 0)

Mobile.tap(findTestObject('Send Request Money/requestMoneyListStatusTxt'), 0)

Mobile.delay(3)

Mobile.verifyElementText(findTestObject('Send Request Money/requestMoneyDetailsNameTxt'), findTestData('TestData').getValue(4, 3))

Mobile.verifyElementText(findTestObject('Send Request Money/requestMoneyDetailsAmountTxt'), findTestData('TestData').getValue(4, 4))

Mobile.verifyElementText(findTestObject('Send Request Money/requestMoneyDetailsNotesTxt'), findTestData('TestData').getValue(4, 5))

Mobile.tap(findTestObject('Send Request Money/requestMoneyDetailsThreeDotsBtn'), 0)

Mobile.tap(findTestObject('Send Request Money/requestMoneyThreeDotsMarksPaidBtn'), 0)

Mobile.delay(3)

//Mobile.takeScreenshot('/Users/a00139272/Desktop/Screenshot/markAsPaidRequestMoney.png')

Mobile.verifyElementNotVisible(findTestObject('Send Request Money/requestMoneyListStatusTxt'), 0)

Mobile.delay(10)

Mobile.tap(findTestObject('Main/mainTopLeftBackButton'), 0)

Mobile.tap(findTestObject('Main/mainTopLeftBackButton'), 0)

Mobile.delay(5)

//Mobile.verifyElementVisible(findTestObject('Banking/m2uAccountSendReqIconSelect'), 10)
Mobile.tap(findTestObject('Main/mainTopLeftBackButton'), 0)

Mobile.delay(5)

