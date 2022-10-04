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

try {
    RunConfiguration.setMobileDriverPreferencesProperty('appPackage', 'com.maybank2u.life.sit')

    RunConfiguration.setMobileDriverPreferencesProperty('appActivity', 'com.maybank2u.life.MainActivity')

    if (GlobalVariable.isApplicationOpened == false) {
        Mobile.startApplication(GlobalVariable.appPath, false)
    }
    
    Mobile.delay(3)

    if (Mobile.getDeviceManufacturer() == 'samsung') {
        Mobile.tapAtPosition(1250, 2667)
    } else {
        Mobile.tapAtPosition(953, 2147)
    }
    
    Mobile.tap(findTestObject('Object Repository/Settings/new_settings_moreMainBtn'), 0)

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
    
    Mobile.delay(2)

    Mobile.tap(findTestObject('Tabung/tabungNameSelection', [('text') : tabungName]), 10)

    Mobile.tap(findTestObject('Tabung/tabungThreeDotsBtn'), 0)

    Mobile.tap(findTestObject('Tabung/tabungThreeDotsFundBtn'), 0)

    Mobile.delay(2)

    Mobile.tap(findTestObject('Login Onboarding/PIN5'), 0)

    Mobile.tap(findTestObject('Login Onboarding/PIN0'), 0)

    Mobile.tap(findTestObject('Login Onboarding/PIN0'), 0)

    Mobile.delay(2)

    Mobile.tap(findTestObject('Tabung/tabungFundAmountTickBtn'), 0)

    Mobile.delay(2)

    if (Mobile.verifyElementVisible(findTestObject('Tabung/tabungEnterPasswordTxt'), 0, FailureHandling.OPTIONAL)) {
        Mobile.setText(findTestObject('Tabung/tabungSignInInputPasswordField'), Password, 0)

        Mobile.hideKeyboard()

        Mobile.tap(findTestObject('Tabung/tabungSignInContinueBtn'), 0)
    }
    
    //Mobile.tap(findTestObject('Banking/m2uAccountTypeSelection', [('text') : 'Savings Account']), 10)
    Mobile.tap(findTestObject('Tabung/tabungFundTabungBtn'), 0)

    Mobile.delay(2)

    Mobile.verifyElementExist(findTestObject('Main/mainS2UApproveBtn'), 0)

    Mobile.tap(findTestObject('Main/mainS2UApproveBtn'), 0)

    Mobile.delay(3)

    Mobile.verifyElementText(findTestObject('Tabung/tabungFundSummaryTopupSuccesfullTxt'), 'Topup Successful')

    Mobile.delay(3)

    Mobile.verifyElementExist(findTestObject('Main/mainDoneBtn'), 0)

    Mobile.tap(findTestObject('Main/mainDoneBtn'), 0)

    Mobile.delay(5)
}
catch (Exception e) {
    if (GlobalVariable.isApplicationOpened == false) {
        Mobile.callTestCase(findTestCase('Tabung/tabung_fundTabungComplete'), null)
    }
}