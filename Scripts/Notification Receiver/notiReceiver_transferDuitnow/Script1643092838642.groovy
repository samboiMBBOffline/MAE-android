import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

import internal.GlobalVariable as GlobalVariable

Mobile.startApplication(GlobalVariable.appPath, false)

RunConfiguration.setMobileDriverPreferencesProperty('appPackage', 'com.maybank2u.life.sit')

RunConfiguration.setMobileDriverPreferencesProperty('appActivity', 'com.maybank2u.life.sit.MainActivity')

Mobile.delay(5)

Mobile.tap(findTestObject('Settings/new_settings_moreMainBtn'), 0)

Mobile.tap(findTestObject('Notification/notifications_notificationsIconButton'), 0)

Mobile.delay(5)

Mobile.waitForElementPresent(findTestObject('Notification/notification_titleTxt', [('title') : title]), 10)

Mobile.scrollToText(title)

Mobile.takeScreenshotAsCheckpoint('Transfer DuitNow Verification')

Mobile.verifyElementText(findTestObject('Notification/notification_titleTxt', [('title') : title]), title)

Mobile.verifyElementVisible(findTestObject('Notification/notification_titleTxt', [('title') : title]), 0)

def data = findTestData('MAE Noti').getValue(2, 5)

println(data)

def validate = ((((('You’ve just received RM ' + value) + ' in your account ending ') + endAccount) + '. REF: ') + data) 

Mobile.verifyElementText(findTestObject('Notification/notiReceiverTransferDuitnow_bodyTxt', [('value') : value, ('endAccount') : endAccount
            , ('RefId') : findTestData('MAE Noti').getValue(2, 5)]), validate)

