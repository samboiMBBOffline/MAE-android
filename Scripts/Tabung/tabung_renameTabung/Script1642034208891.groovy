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

Mobile.startExistingApplication('com.maybank2u.life.sit', FailureHandling.STOP_ON_FAILURE)

//Mobile.startApplication('/Users/a00139272/Katalon Studio/MAE/androidapp/app-sit-universal-release-copy.apk', false)
//
//RunConfiguration.setMobileDriverPreferencesProperty('appPackage', 'com.maybank2u.life.sit')
//
//RunConfiguration.setMobileDriverPreferencesProperty('appActivity', 'com.maybank2u.life.sit.MainActivity')
//
//Mobile.delay(3)
//
device_Height = Mobile.getDeviceHeight()

device_Width = Mobile.getDeviceWidth()

int startX = device_Width / 1.25

int startY = device_Height * 0.97

Mobile.tapAtPosition(startX, startY)

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

'Renname Tabung'
Mobile.tap(findTestObject('Tabung/tabungNameSelection', [('text') : findTestData('TestData').getValue(4, 82)]), 10)

Mobile.delay(2)

Mobile.tap(findTestObject('Tabung/tabungThreeDotsBtn'), 0)

Mobile.tap(findTestObject('Tabung/tabungThreeDotsRenameBtn'), 0)

Mobile.delay(2)

Mobile.clearText(findTestObject('Tabung/tabungRenameInputField'), 10)

Mobile.setText(findTestObject('Tabung/tabungRenameInputField'), findTestData('TestData').getValue(4, 84), 0)

Mobile.hideKeyboard()

Mobile.verifyElementVisible(findTestObject('Tabung/tabungConfirmBtn'), 0)

Mobile.tap(findTestObject('Tabung/tabungConfirmBtn'), 0)

Mobile.delay(5)

Mobile.takeScreenshot('/Users/a00139272/Desktop/Screenshot/renameTabung.png')

Mobile.verifyElementVisible(findTestObject('Tabung/tabungNameSelection', [('text') : findTestData('TestData').getValue(4, 
                84)]), 0)

