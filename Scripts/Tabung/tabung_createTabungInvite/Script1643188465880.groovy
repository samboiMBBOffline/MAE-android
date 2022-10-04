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

//Mobile.startApplication('/Users/a00139272/Katalon Studio/MAE/androidapp/app-sit-universal-release-copy.apk', false)
//
//RunConfiguration.setMobileDriverPreferencesProperty('appPackage', 'com.maybank2u.life.sit')
//
//RunConfiguration.setMobileDriverPreferencesProperty('appActivity', 'com.maybank2u.life.sit.MainActivity')
//
//Mobile.delay(3)
//try {
//    RunConfiguration.setMobileDriverPreferencesProperty('appPackage', 'com.maybank2u.life.sit')
//
//    RunConfiguration.setMobileDriverPreferencesProperty('appActivity', 'com.maybank2u.life.MainActivity')
//
//    if (GlobalVariable.isApplicationOpened == false) {
//        Mobile.startApplication(GlobalVariable.appPath, false)
//    }
Mobile.startExistingApplication('com.maybank2u.life.uat', FailureHandling.STOP_ON_FAILURE)

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

    Mobile.tap(findTestObject('Tabung/tabungCreateTravelSelect'), 0)

    Mobile.setText(findTestObject('Tabung/tabungNameInputField'), findTestData('TestData').getValue(4, 82), 0)

    Mobile.hideKeyboard()

    Mobile.tap(findTestObject('Login Onboarding/loginExistingContinueBtn'), 0)

    Mobile.tap(findTestObject('Login Onboarding/PIN1'), 0)

    Mobile.tap(findTestObject('Login Onboarding/PIN0'), 0)

    Mobile.tap(findTestObject('Login Onboarding/PIN0'), 0)

    Mobile.tap(findTestObject('Login Onboarding/PIN0'), 0)

    Mobile.delay(2)

    Mobile.tap(findTestObject('Tabung/tabungCreateAmountTickBtn'), 0)   //would usually undetected

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

    WebUI.callTestCase(findTestCase('Pages/Enter Password'), [('data') : 1], FailureHandling.CONTINUE_ON_FAILURE)
    
    Mobile.delay(5)

    Mobile.verifyElementVisible(findTestObject('Object Repository/Tabung/tabung_invitePersonIcon'), 0)

    Mobile.tap(findTestObject('Object Repository/Tabung/tabung_invitePersonIcon'), 0)

    Mobile.delay(5)

    Mobile.tap(findTestObject('Object Repository/Tabung/tabung_gotItButton'), 0)

    Mobile.delay(5)

    Mobile.waitForElementPresent(findTestObject('Object Repository/Tabung/tabung_searchFriendsBar'), 10)

    Mobile.tap(findTestObject('Object Repository/Tabung/tabung_searchFriendsBar'), 0)

    Mobile.delay(5)

    Mobile.setText(findTestObject('Object Repository/Tabung/tabung_contactInputField'), findTestData('TestData').getValue(4, 83), 0)

    Mobile.delay(3)

    Mobile.hideKeyboard()

    Mobile.tap(findTestObject('Object Repository/Tabung/tabung_contactSelect', [('contactName') : findTestData('TestData').getValue(4, 83)]), 0)

    Mobile.tap(findTestObject('Object Repository/Tabung/tabung_contactSelect', [('contactName') : findTestData('TestData').getValue(4, 83)]), 0)

    Mobile.delay(3)

    Mobile.tap(findTestObject('Object Repository/Tabung/tabung_addContactButton'), 0)

    Mobile.delay(3)

    Mobile.tap(findTestObject('Object Repository/Tabung/tabung_continueButton'), 0)

    Mobile.delay(5)

    Mobile.verifyElementVisible(findTestObject('Tabung/tabungSelectAccountDropdownBox'), 0)

    Mobile.tap(findTestObject('Tabung/tabungSelectAccountTxt'), 0)

    Mobile.delay(2)

    Mobile.tap(findTestObject('Tabung/tabunCreateFirstAccountSelect'), 0)

    Mobile.delay(5)

    Mobile.tap(findTestObject('Main/mainCalenderPickerDoneBtn'), 0)

    Mobile.delay(10)

    Mobile.verifyElementVisible(findTestObject('Tabung/tabungContinueBtn'), 0)

    Mobile.tap(findTestObject('Tabung/tabungContinueBtn'), 0)

    Mobile.delay(5)

    Mobile.verifyElementVisible(findTestObject('Tabung/tabungConfirmationTxt'), 0)

    Mobile.scrollToText('Auto Deduction (optional)')

    Mobile.verifyElementVisible(findTestObject('Tabung/tabungAutoDeductionText'), 0)

    Mobile.tap(findTestObject('Tabung/tabungConfirmationSelectFrequencyDropdown'), 0)

    Mobile.delay(2)

    Mobile.tap(findTestObject('Tabung/tabungConfirmationFirstFreqDropdownSelect'), 0)

    Mobile.delay(2)

    Mobile.tap(findTestObject('Main/mainCalenderPickerDoneBtn'), 0)

    Mobile.delay(2)

    Mobile.tap(findTestObject('Tabung/tabungDisableESIRadioBtn'), 0)

    Mobile.delay(2)

    Mobile.tap(findTestObject('Tabung/tabungConfirmationCreateTabungBtn'), 0)

    Mobile.delay(3)

    if (Mobile.verifyElementVisible(findTestObject('Object Repository/Tabung/tabung_otpNumberPresentTxt'), 0, FailureHandling.OPTIONAL)) {
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
    
    //Mobile.tap(findTestObject(''), 0)  //festive angpau skip the festive
    Mobile.verifyElementVisible(findTestObject('Main/mainDoneBtn'), 0)

    Mobile.tap(findTestObject('Main/mainDoneBtn'), 0)

    Mobile.delay(5)
	
//}
//catch (Exception e) {
//    if (GlobalVariable.isApplicationOpened == false) {
//        Mobile.callTestCase(findTestCase('Tabung/tabung_createTabungInvite'), null)
//    }
//}