import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling

//RunConfiguration.setMobileDriverPreferencesProperty('appPackage', 'com.maybank2u.life.sit')
//
//RunConfiguration.setMobileDriverPreferencesProperty('appActivity', 'com.maybank2u.life.MainActivity')
//
//Mobile.startApplication(GlobalVariable.appPath, false)

Mobile.startExistingApplication('com.maybank2u.life.uat', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Object Repository/Dashboard/dashboardWalletTopSelect'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Dashboard/dashboardQuickActionsTitleTxt'), 0)

Mobile.delay(5)

Mobile.verifyElementVisible(findTestObject('Object Repository/Dashboard/dashboard_moreButton'), 10)

Mobile.tap(findTestObject('Object Repository/Dashboard/dashboard_moreButton'), 0)

Mobile.waitForElementPresent(findTestObject('Main/moreTabungIconSelect'), 0)

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

Mobile.waitForElementPresent(findTestObject('Tabung/tabungCreateTabungBtn'), 0)

Mobile.tap(findTestObject('Tabung/tabungCreateTabungBtn'), 0)

Mobile.delay(2)

Mobile.tap(findTestObject('Tabung/tabungCreateTravelSelect'), 0)

Mobile.setText(findTestObject('Tabung/tabungNameInputField'), findTestData('TestData').getValue(4, 82), 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Login Onboarding/loginExistingContinueBtn'), 0)

Mobile.tap(findTestObject('Login Onboarding/PIN1'), 0)

Mobile.tap(findTestObject('Login Onboarding/PIN0'), 0)

Mobile.tap(findTestObject('Login Onboarding/PIN0'), 0)

Mobile.tap(findTestObject('Login Onboarding/PIN0'), 0)

Mobile.delay(2)

Mobile.tap(findTestObject('Tabung/tabungCreateAmountTickBtn'), 0)

Mobile.tap(findTestObject('Tabung/tabungSelectStartDateField'), 0)

Mobile.tap(findTestObject('Tabung/tabungDatePickerSelect'), 0)

Mobile.tap(findTestObject('Main/mainCalenderPickerDoneBtn'), 0)

Mobile.delay(2)

Mobile.tap(findTestObject('Tabung/tabungContinueBtn'), 0)

Mobile.tap(findTestObject('Tabung/tabungSelectEndDateField'), 0)

Mobile.tap(findTestObject('Tabung/tabungCalendarPickerNextBtn'), 0)

Mobile.tap(findTestObject('Tabung/tabungDatePickerSelect'), 0)

Mobile.tap(findTestObject('Main/mainCalenderPickerDoneBtn'), 0)

Mobile.delay(2)

Mobile.tap(findTestObject('Tabung/tabungContinueBtn'), 0)

Mobile.callTestCase(findTestCase('Pages/Enter Password'), [('data') : 1], FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(30)

Mobile.verifyElementVisible(findTestObject('Tabung/tabungSelectAccountDropdownBox'), 0)

Mobile.tap(findTestObject('Tabung/tabungSelectAccountTxt'), 0)

Mobile.delay(5)

Mobile.verifyElementVisible(findTestObject('Tabung/tabunCreateFirstAccountSelect'), 0)

Mobile.tap(findTestObject('Tabung/tabunCreateFirstAccountSelect'), 0)

Mobile.delay(5)

Mobile.tap(findTestObject('Main/mainCalenderPickerDoneBtn'), 0)

Mobile.delay(4)

Mobile.tap(findTestObject('Tabung/tabungContinueBtn'), 0)

Mobile.delay(5)

Mobile.verifyElementVisible(findTestObject('Tabung/tabungConfirmationTxt'), 0)

Mobile.verifyElementVisible(findTestObject('Tabung/tabungAutoDeductionText'), 0)

Mobile.tap(findTestObject('Tabung/tabungConfirmationSelectFrequencyDropdown'), 0)

Mobile.delay(5)

Mobile.tap(findTestObject('Tabung/tabungConfirmationFirstFreqDropdownSelect'), 0)

Mobile.delay(5)

Mobile.tap(findTestObject('Main/mainCalenderPickerDoneBtn'), 0)

Mobile.delay(2)

Mobile.tap(findTestObject('Tabung/tabungDisableESIRadioBtn'), 0)

Mobile.delay(2)

Mobile.tap(findTestObject('Tabung/tabungConfirmationCreateTabungBtn'), 0)

Mobile.delay(3)

if (Mobile.verifyElementVisible(findTestObject('Object Repository/Tabung/tabung_otpNumberPresentTxt'), 10, FailureHandling.OPTIONAL)) {
    def OTP = Mobile.getText(findTestObject('Object Repository/Tabung/tabung_otpNumberTxt'), 0)

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

    Mobile.tap(findTestObject('Object Repository/Tabung/tabung_otpTacTickButton'), 0)
} else {
    Mobile.verifyElementVisible(findTestObject('Main/mainS2UApproveBtn'), 0)

    Mobile.tap(findTestObject('Main/mainS2UApproveBtn'), 0)

    Mobile.delay(10)
}

Mobile.verifyElementText(findTestObject('Tabung/tabungSummaryStatusTxt'), 'Tabung created successfully.')

Mobile.verifyElementVisible(findTestObject('Main/mainDoneBtn'), 0)

Mobile.takeScreenshot('/Users/a00139272/Desktop/Screenshot/createTabung.png')

Mobile.tap(findTestObject('Main/mainDoneBtn'), 0)

Mobile.delay(5)

Mobile.waitForElementPresent(findTestObject('Tabung/tabungNameSelection', [('text') : findTestData('TestData').getValue(4, 82)]), 0)

Mobile.verifyElementVisible(findTestObject('Tabung/tabungNameSelection', [('text') : findTestData('TestData').getValue(4, 82)]), 0)

Mobile.delay(5)

