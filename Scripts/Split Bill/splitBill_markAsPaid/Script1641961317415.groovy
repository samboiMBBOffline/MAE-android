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

Mobile.delay(3)

//Mobile.tap(findTestObject('Banking/m2uAccountSplitBillIconSelect'), 0)

Mobile.waitForElementPresent(findTestObject('SplitBill/new_splitBillTxt'), 45)

//device_Height = Mobile.getDeviceHeight()
//
//device_Width = Mobile.getDeviceWidth()
//
//int startY = device_Height / 2
//
//int endY = startY
//
//int startX = device_Width * 0.30
//
//int endX = device_Width * 0.70
//
//Mobile.delay(3)
//
//Mobile.swipe(startX, startY, endX, endY)

Mobile.tap(findTestObject('Object Repository/SplitBill/splitBill_toCollectTab'), 0)

Mobile.delay(3)

Mobile.waitForElementPresent(findTestObject('SplitBill/splitBillToCollectListBillNameTxt', [('name') : findTestData('TestData').getValue(4, 93)]), 0)

Mobile.tap(findTestObject('SplitBill/splitBillToCollectListBillNameTxt', [('name') : findTestData('TestData').getValue(4, 93)]), 0)

Mobile.delay(3)

Mobile.waitForElementPresent(findTestObject('SplitBill/splitBillDetailsParticipantMoreBtn'), 0)

Mobile.tap(findTestObject('SplitBill/splitBillDetailsParticipantMoreBtn'), 0)

Mobile.waitForElementPresent(findTestObject('SplitBill/splitBillDetailsParticipantMarkCollectedDropdownSelect'), 0)

Mobile.tap(findTestObject('SplitBill/splitBillDetailsParticipantMarkCollectedDropdownSelect'), 0)

Mobile.waitForElementPresent(findTestObject('SplitBill/splitBillDetailsParticipantDoneBtn'), 0)

Mobile.tap(findTestObject('SplitBill/splitBillDetailsParticipantDoneBtn'), 0)

Mobile.delay(3)

Mobile.takeScreenshot("/Users/a00139272/Desktop/Screenshot/markPaidSplitBill.png")

Mobile.verifyElementExist(findTestObject('SplitBill/splitBillDetailsParticipantPaidStatusTxt'), 0)

Mobile.delay(5)

Mobile.waitForElementPresent(findTestObject('Main/mainTopLeftBackButton'), 0)

Mobile.tap(findTestObject('Main/mainTopLeftBackButton'), 0)

Mobile.delay(5)

