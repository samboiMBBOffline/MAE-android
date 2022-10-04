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
import com.kms.katalon.core.mobile.keyword.internal.MobileAbstractKeyword as MobileAbstractKeyword
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import io.appium.java_client.AppiumDriver as AppiumDriver

//Mobile.startApplication('/Users/a00139272/Katalon Studio/MAE/androidapp/app-sit-universal-release-copy.apk', false)
//
//RunConfiguration.setMobileDriverPreferencesProperty('appPackage', 'com.maybank2u.life.sit')
//
//RunConfiguration.setMobileDriverPreferencesProperty('appActivity', 'com.maybank2u.life.sit.MainActivity')
Mobile.delay(3)

Mobile.tap(findTestObject('Festive Season/festiveSeasonMenuBackBtn'), 0)

Mobile.delay(3)

Mobile.tapAtPosition(953, 2147)

Mobile.tapAtPosition(953, 2147)

Mobile.waitForElementPresent(findTestObject('Main/mainMoreNotificationBtn'), 0)

Mobile.tap(findTestObject('Main/mainMoreNotificationBtn'), 0)

Mobile.waitForElementPresent(findTestObject('Notification/notificationFestiveGreetingTitleTxt'), 0)

Mobile.tap(findTestObject('Notification/notificationFestiveGreetingTitleTxt'), 0)

Mobile.verifyElementText(findTestObject('Festive Season/festiveReceivedGreetingMessageTxt'), 'Gong Xi Fa Cai! Have a roaring good year')

Mobile.waitForElementPresent(findTestObject('Festive Season/festiveReceivedReturnGreetingBtn'), 0)

Mobile.tap(findTestObject('Festive Season/festiveReceivedReturnGreetingBtn'), 0)

Mobile.verifyElementText(findTestObject('Festive Season/seasonalSendGreetingChineseDefaultGreeting'), 'Gong Xi Fa Cai! Have a roaring good year')

Mobile.setText(findTestObject('Festive Season/seasonalSendGreetingChineseDefaultGreeting'), 'Happy Chinese New Year 2022', 
    0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Festive Season/seasonalSendGreetingDesign2'), 0)

Mobile.tap(findTestObject('Festive Season/seasonalSendGreetingDesignContinueBtn'), 0)

Mobile.delay(3)

Mobile.verifyElementText(findTestObject('Festive Season/seasonalSendGreetingConfirmationMessageTxt'), 'Happy Chinese New Year 2022')

Mobile.verifyElementText(findTestObject('Festive Season/seasonalSendGreetingReceipientNameTxt', [('receipientName') : receipientName]), 
    receipientName)

Mobile.tap(findTestObject('Festive Season/seasonalSendGreetingConfirmationSendNowBtn'), 0)

Mobile.delay(5)

Mobile.verifyElementText(findTestObject('Festive Season/seasonalSendGreetingSummarySuccessMessageTxt'), 'Greeting sent successfully')

Mobile.tap(findTestObject('Festive Season/seasonalSendGreetingSummaryDoneBtn'), 0)

