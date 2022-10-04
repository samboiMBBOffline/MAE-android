import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import internal.GlobalVariable as GlobalVariable
import sun.security.util.Password as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint

//Mobile.tap(findTestObject('Main/mainMoreBottomMenuBtn'), 0)
//Mobile.tap(findTestObject('Main/mainSettingsBtn'), 0)
//Mobile.tap(findTestObject('Settings/settingsMaybank2UBtn'), 0)
//Mobile.tap(findTestObject('Settings/settingsUnlinkM2UAccountSelect'), 0)
//Mobile.tap(findTestObject('Settings/settingsUnlinkM2UConfirmBtn'), 0)
not_run: Mobile.startApplication(GlobalVariable.appPath, false)

not_run: RunConfiguration.setMobileDriverPreferencesProperty('appPackage', 'com.maybank2u.life.sit')

not_run: RunConfiguration.setMobileDriverPreferencesProperty('appActivity', 'com.maybank2u.life.sit.MainActivity')

Mobile.startExistingApplication('com.maybank2u.life.uat', FailureHandling.STOP_ON_FAILURE)

Mobile.delay(5)

Mobile.tap(findTestObject('Settings/new_settings_moreMainBtn'), 0)

Mobile.tap(findTestObject('Main/mainSettingsBtn'), 0)

Mobile.tap(findTestObject('Settings/new_settings_m2uBtn'), 0)

Mobile.delay(5)

//if(Mobile.verifyElementVisible(findTestObject('Settings/new_settings_enterYourPasswordTxt'), 3, FailureHandling.OPTIONAL)) 
//{
//	Mobile.setText(findTestObject('Login Onboarding/loginPasswordInputField'), Password, 0)
//
//	Mobile.hideKeyboard()
//
//	Mobile.tap(findTestObject('Tabung/tabungSignInContinueBtn'), 0)
//}
if (Mobile.verifyElementExist(findTestObject('Settings/new_settings_enterYourPasswordTxt'), 0)) {
    Mobile.setText(findTestObject('Login Onboarding/loginPasswordInputField'), Password, 0)

    Mobile.hideKeyboard()

    Mobile.tap(findTestObject('Tabung/tabungSignInContinueBtn'), 0)
}

Mobile.scrollToText('Unlink Maybank2u Account', FailureHandling.STOP_ON_FAILURE)

//Mobile.setText(findTestObject('Login Onboarding/loginPasswordInputField'), Password, 0)
//
//Mobile.hideKeyboard()
//
//Mobile.tap(findTestObject('Tabung/tabungSignInContinueBtn'), 0)
Mobile.tap(findTestObject('Settings/settingsUnlinkM2UAccountSelect'), 0)

Mobile.delay(5)

Mobile.tap(findTestObject('Settings/settingsUnlinkM2UConfirmBtn'), 0)

Mobile.delay(5)

