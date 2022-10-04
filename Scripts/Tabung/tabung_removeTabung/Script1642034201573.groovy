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

Mobile.startExistingApplication('com.maybank2u.life.uat', FailureHandling.STOP_ON_FAILURE)

//Mobile.startApplication('/Users/a00139272/Katalon Studio/MAE/androidapp/app-sit-universal-release-copy.apk', false)
//
//RunConfiguration.setMobileDriverPreferencesProperty('appPackage', 'com.maybank2u.life.sit')
//
//RunConfiguration.setMobileDriverPreferencesProperty('appActivity', 'com.maybank2u.life.sit.MainActivity')
//
//Mobile.delay(3)
//
if (Mobile.getDeviceManufacturer() == 'samsung') {
    Mobile.tapAtPosition(1250, 2667)

    Mobile.tapAtPosition(1250, 2667)
} else {
    Mobile.tapAtPosition(953, 2147)

    Mobile.tapAtPosition(953, 2147)
}


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

'Remove Tabung'
//Mobile.delay(5)
//
Mobile.tap(findTestObject('Tabung/tabungNameSelection', [('text') : findTestData('TestData').getValue(4, 82)]), 10)

Mobile.delay(2)

Mobile.tap(findTestObject('Tabung/tabungThreeDotsBtn'), 0)

Mobile.delay(2)

Mobile.tap(findTestObject('Tabung/tabungThreeDtosRemoveBtn'), 0)

Mobile.delay(2)

Mobile.tap(findTestObject('Tabung/tabungRemoveConfirmBtn'), 0)

Mobile.delay(5)

Mobile.tap(findTestObject('Tabung/tabungContinueBtn'), 0)

Mobile.delay(2)

if (Mobile.verifyElementVisible(findTestObject('Tabung/tabungEnterPasswordTxt'), 10, FailureHandling.OPTIONAL)) {
    Mobile.setText(findTestObject('Tabung/tabungSignInInputPasswordField'), findTestData('TestData').getValue(4, 1), 0)

    Mobile.hideKeyboard()

    Mobile.tap(findTestObject('Tabung/tabungSignInContinueBtn'), 0)
	
	Mobile.delay(10)
}

Mobile.tap(findTestObject('Tabung/tabungWithdrawFundBtn'), 0)

Mobile.delay(2)

if (Mobile.verifyElementVisible(findTestObject('Object Repository/Festive Season/festiveReturnAngpaoTACNoTxt'), 10, FailureHandling.OPTIONAL)) {
    def OTP = Mobile.getText(findTestObject('Object Repository/Festive Season/festiveReturnAngpaoTACNoTxt'), 0)
	
    Mobile.delay(2)

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
    
    Mobile.delay(3)

    Mobile.tap(findTestObject('Festive Season/festiveReturnAngpaoTickBtn'), 0)
} else {
    Mobile.verifyElementVisible(findTestObject('Main/mainS2UApproveBtn'), 0)

    Mobile.tap(findTestObject('Main/mainS2UApproveBtn'), 0)

    Mobile.delay(10)
}

def message = Mobile.getText(findTestObject('Tabung/tabungRemoveSummaryTransferTxt'), 10)

Mobile.delay(2)

Mobile.verifyElementText(findTestObject('Tabung/tabungRemoveSummaryTransferTxt'), findTestData('TestData').getValue(4, 87))

Mobile.takeScreenshot("/Users/a00139272/Desktop/Screenshot/removeTabung.png")

Mobile.verifyElementVisible(findTestObject('Main/mainDoneBtn'), 0)

Mobile.tap(findTestObject('Main/mainDoneBtn'), 0)

Mobile.delay(5)