import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint

Mobile.startApplication(GlobalVariable.appPath, false)

RunConfiguration.setMobileDriverPreferencesProperty('appPackage', 'com.maybank2u.life.sit')

RunConfiguration.setMobileDriverPreferencesProperty('appActivity', 'com.maybank2u.life.sit.MainActivity')

Mobile.delay(5)

Mobile.tap(findTestObject('Settings/new_settings_moreMainBtn'), 0)

Mobile.tap(findTestObject('Notification/notifications_notificationsIconButton'), 0)

Mobile.delay(5)

Mobile.waitForElementPresent(findTestObject('Notification/notification_titleTxt', [('title') : title]), 10)

Mobile.scrollToText(title)

Mobile.takeScreenshotAsCheckpoint('Split Bill Paid Verification')

Mobile.verifyElementText(findTestObject('Notification/notification_titleTxt', [('title') : title]), title)

Mobile.verifyElementVisible(findTestObject('Notification/notification_titleTxt', [('title') : title]), 0)

def validate = ((((mayaName + ' has paid you RM ') + value) + ' for the Split Bill request ') + billName) + '.'

Mobile.verifyElementText(findTestObject('Notification/notiCreatorSplitBillPaid_bodyTxt', [('mayaName') : mayaName, ('value') : value
            , ('billName') : billName]), validate)
