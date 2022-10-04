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

not_run: Mobile.startApplication('/Users/a00139272/Katalon Studio/MAE/androidapp/app-sit-universal-release-copy.apk', false)

not_run: RunConfiguration.setMobileDriverPreferencesProperty('appPackage', 'com.maybank2u.life.sit')

not_run: RunConfiguration.setMobileDriverPreferencesProperty('appActivity', 'com.maybank2u.life.sit.MainActivity')

Mobile.startExistingApplication('com.maybank2u.life.sit', FailureHandling.STOP_ON_FAILURE)

//Mobile.waitForElementPresent(findTestObject('Main/mainTopLeftBackButton'), 0)
//
//Mobile.tap(findTestObject('Main/mainTopLeftBackButton'), 0)
Mobile.delay(3)

Mobile.tap(findTestObject('More Button'), 0)

Mobile.tap(findTestObject('Dashboard/dashboardWalletTopSelect'), 0)

Mobile.tap(findTestObject('Wallet/walletThreeDotsBtn'), 10)

Mobile.tap(findTestObject('Wallet/walletThreeDotsChangeWalletSelect'), 10)

Mobile.tap(findTestObject('Banking/m2uAccountTypeSelection', [('text') : 'M2U Savers']), 10)

Mobile.tap(findTestObject('Tabung/tabungConfirmBtn'), 10)

Mobile.tap(findTestObject('Wallet/walletViewTransactionBtn'), 10)

Mobile.tap(findTestObject('Wallet/walletTransactionHistoryDropdownBox'), 10)

Mobile.delay(4)

Mobile.scrollToText('M2U History', FailureHandling.STOP_ON_FAILURE)

Mobile.delay(3)

Mobile.tap(findTestObject('Wallet/walletTransactionM2UHistoryDropdownSelect'), 10)

Mobile.delay(3)

Mobile.tap(findTestObject('Main/mainCalenderPickerDoneBtn'), 10)

