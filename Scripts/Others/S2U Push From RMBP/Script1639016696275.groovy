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

//Mobile.tap(findTestObject('Banking/m2uAccountTypeSelection', [('text') : 'MAE']), 10)
Mobile.startApplication('/Users/a00139272/Katalon Studio/MAE/androidapp/app-sit-universal-release-copy.apk', false)

RunConfiguration.setMobileDriverPreferencesProperty('appPackage', 'com.maybank2u.life.sit')

RunConfiguration.setMobileDriverPreferencesProperty('appActivity', 'com.maybank2u.life.sit.MainActivity')

//Mobile.startExistingApplication('com.maybank2u.life.uat')
Mobile.delay(5)

Mobile.tapAtPosition(953, 2147)

Mobile.delay(3)

//Mobile.tap(findTestObject('Main/mainMoreBottomMenuBtn'), 0)
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

Mobile.tap(findTestObject('Main/moreTabungIconSelect'), 0)

Mobile.waitForElementPresent(findTestObject('Tabung/tabungCreateTabungBtn'), 0)

Mobile.tap(findTestObject('Tabung/tabungCreateTabungBtn'), 0)

Mobile.tap(findTestObject('Tabung/tabungCreateTravelSelect'), 0)

Mobile.setText(findTestObject('Tabung/tabungNameInputField'), 'Switzerland', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Login Onboarding/loginExistingContinueBtn'), 0)

Mobile.tap(findTestObject('Login Onboarding/PIN1'), 0)

Mobile.delay(2)

Mobile.tapAtPosition(829, 211)

//Mobile.tapAndHold(findTestObject('Main/mainAmountTickBtn'), 3, 0)

Mobile.delay(2)

Mobile.tap(findTestObject('Login Onboarding/PIN0'), 0)

Mobile.tap(findTestObject('Login Onboarding/PIN0'), 0)

Mobile.tap(findTestObject('Login Onboarding/PIN0'), 0)

Mobile.delay(2)

Mobile.tap(findTestObject('Main/mainAmountTickBtn'), 0)

Mobile.tap(findTestObject('Tabung/tabungSelectStartDateField'), 0)

//Mobile.tap(findTestObject('Tabung/tabungCalendarPickerNextBtn'), 0)
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

if (Mobile.verifyElementVisible(findTestObject('Login Onboarding/enterPasswordMessage'), 0, FailureHandling.OPTIONAL)) {
    Mobile.setText(findTestObject('Login Onboarding/loginPasswordInputField'), Password, 0)

    Mobile.hideKeyboard()

    Mobile.tap(findTestObject('Login Onboarding/loginExistingContinueBtn'), 0)
}

Mobile.delay(10)

Mobile.verifyElementVisible(findTestObject('Tabung/tabungSelectAccountDropdownBox'), 0)

Mobile.tap(findTestObject('Tabung/tabungSelectAccountTxt'), 0)

Mobile.delay(2)

Mobile.tap(findTestObject('Tabung/tabunCreateFirstAccountSelect'), 0)

Mobile.delay(5)

Mobile.tap(findTestObject('Main/mainCalenderPickerDoneBtn'), 0)

Mobile.delay(4)

Mobile.tap(findTestObject('Tabung/tabungContinueBtn'), 0)

Mobile.delay(5)

Mobile.verifyElementVisible(findTestObject('Tabung/tabungConfirmationTxt'), 0)

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

//Mobile.verifyElementVisible(findTestObject('Main/mainS2UApproveBtn'), 0)
//
//Mobile.tap(findTestObject('Main/mainS2UApproveBtn'), 0)
Mobile.delay(2)

Mobile.tapAtPosition(583, 194)

Mobile.delay(3)

Mobile.tap(findTestObject('others/s2uApprove'), 0)

Mobile.delay(3)

Mobile.waitForElementPresent(findTestObject('others/s2uDoneBtn'), 0)

Mobile.tap(findTestObject('others/s2uDoneBtn'), 0)

Mobile.delay(3)

//Mobile.tapAndHoldAtPosition(777, 2313, 3)
Mobile.tapAtPosition(777, 2313)

Mobile.tapAtPosition(777, 2313)

Mobile.delay(3)

Mobile.tapAtPosition(811, 1228)

Mobile.tapAtPosition(811, 1228)

Mobile.verifyElementText(findTestObject('others/tabungSuccessCreateMessageTxt'), 'Tabung created successfully.')

Mobile.delay(3)

Mobile.verifyElementVisible(findTestObject('Main/mainDoneBtn'), 0)

Mobile.tap(findTestObject('Main/mainDoneBtn'), 0)

Mobile.delay(5)

