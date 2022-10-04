import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling

Mobile.startExistingApplication('com.maybank2u.life.uat', FailureHandling.STOP_ON_FAILURE)

Mobile.delay(5)

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

//Mobile.delay(3)
//
//Mobile.swipe(900, 1245, 300, 1245)
//
//Mobile.delay(3)
//
//Mobile.swipe(900, 1245, 300, 1245)
//
//Mobile.delay(3)

Mobile.verifyElementVisible(findTestObject('Object Repository/SplitBill/splitBill_pastTab'),10)

Mobile.tap(findTestObject('Object Repository/SplitBill/splitBill_pastTab'), 0)

Mobile.waitForElementPresent(findTestObject('SplitBill/splitBillToCollectListBillNameTxt', [('name') : findTestData('TestData').getValue(4, 93)]), 0)

Mobile.tap(findTestObject('SplitBill/splitBillToCollectListBillNameTxt', [('name') : findTestData('TestData').getValue(4, 93)]), 0)

Mobile.delay(3)

Mobile.waitForElementPresent(findTestObject('SplitBill/splitBillDetailsThreeDotsBtn'), 0)

Mobile.tap(findTestObject('SplitBill/splitBillDetailsThreeDotsBtn'), 0)

Mobile.waitForElementPresent(findTestObject('SplitBill/splitBillDetailsThreeDotsRemoveBillBtn'), 0)

Mobile.tap(findTestObject('SplitBill/splitBillDetailsThreeDotsRemoveBillBtn'), 0)

Mobile.waitForElementPresent(findTestObject('SplitBill/splitBillRemoveConfirmBtn'), 0)

Mobile.tap(findTestObject('SplitBill/splitBillRemoveConfirmBtn'), 0)

Mobile.delay(10)

Mobile.takeScreenshot("/Users/a00139272/Desktop/Screenshot/removePastSplit.png")

Mobile.verifyElementNotExist(findTestObject('SplitBill/splitBillToCollectListBillNameTxt', [('name') : findTestData('TestData').getValue(4, 93)]), 0)

Mobile.delay(5)

