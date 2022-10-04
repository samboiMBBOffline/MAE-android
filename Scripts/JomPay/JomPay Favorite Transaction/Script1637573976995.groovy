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

RunConfiguration.setMobileDriverPreferencesProperty('appPackage', 'com.maybank2u.life.uat')

RunConfiguration.setMobileDriverPreferencesProperty('appActivity', 'com.maybank2u.life.MainActivity')

Mobile.startApplication('D:\\Users\\00139711\\Downloads\\my_9.1_uat_1609.apk', false)

//
//Mobile.verifyElementExist(findTestObject('Object Repository/Dashboard/dashboardWalletTopSelect'), 0)
//
//Mobile.verifyElementExist(findTestObject('Object Repository/Dashboard/dashboardQuickActionsTitleTxt'), 0)
//
//Mobile.delay(5)
//
//device_Height = Mobile.getDeviceHeight()
//
//device_Width = Mobile.getDeviceWidth()
//
//int startX = device_Width / 3
//
//int startY = device_Height * 0.97
//
//Mobile.tapAtPosition(startX, startY)
//
//if (Mobile.verifyElementVisible(findTestObject('Main/mainEnterPINMessage'), 0, FailureHandling.OPTIONAL)) {
//    Mobile.tap(findTestObject('Login Onboarding/PIN1'), 0)
//
//    Mobile.tap(findTestObject('Login Onboarding/PIN1'), 0)
//
//    Mobile.tap(findTestObject('Login Onboarding/PIN1'), 0)
//
//    Mobile.tap(findTestObject('Login Onboarding/PIN1'), 0)
//
//    Mobile.tap(findTestObject('Login Onboarding/PIN1'), 0)
//
//    Mobile.tap(findTestObject('Login Onboarding/PIN2'), 0)
//
//    Mobile.delay(2)
//}
//
//Mobile.tap(findTestObject('Banking/m2uAccountTypeSelection', [('text') : 'MAE']), 10)
Mobile.delay(5)

Mobile.startExistingApplication('com.maybank2u.life.sit')

Mobile.tap(findTestObject('Banking/m2uAccountPayBillsIconSelect'), 0)

//if (Mobile.verifyElementVisible(findTestObject('Paybill/payBillsEnterPasswordTxt'), 0, FailureHandling.OPTIONAL)) {
//    Mobile.setText(findTestObject('Paybill/payBillsPasswordInputField'), findTestData('TestData').getValue(2, 1), 0)
//
//    Mobile.hideKeyboard()
//
//    Mobile.tap(findTestObject('Paybill/payBillsSignInContinueBtn'), 0)
//}
//Mobile.tap(findTestObject('Banking/m2uAccountPayBillsIconSelect'), 0)
println('JOMPAY Fav Transaction')

Mobile.tap(findTestObject('JomPay/payBillsJomPayTopMenuSelect'), 40)

Mobile.tap(findTestObject('Main/mainFavBodySelect'), 0)

Mobile.tap(findTestObject('Login Onboarding/PIN1'), 0)

Mobile.tap(findTestObject('Login Onboarding/PIN0'), 0)

Mobile.tap(findTestObject('Login Onboarding/PIN0'), 0)

Mobile.tap(findTestObject('JomPay/jomPayAmountTickBtn'), 0)

Mobile.delay(5)

Mobile.verifyElementText(findTestObject('Transfer/transferConfirmationFromAccTypeTxt', [('accType') : accType]), accType)

Mobile.verifyElementText(findTestObject('Transfer/transferConfirmationFromAccNoTxt', [('accNoFrom') : accNoFrom]), accNoFrom)

Mobile.verifyElementVisible(findTestObject('Main/mainPayNowBtn'), 0)

Mobile.tap(findTestObject('Main/mainPayNowBtn'), 0)

Mobile.delay(5)

Mobile.verifyElementVisible(findTestObject('Object Repository/Transfer/transferSummaryShareReceiptBtn'), 0)

Mobile.verifyElementVisible(findTestObject('Main/mainDoneBtn'), 0)

Mobile.takeScreenshot('/Users/a00139272/Desktop/Screenshot/jomPayFav.png')

Mobile.tap(findTestObject('Main/mainDoneBtn'), 0)

Mobile.delay(5)

