import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
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

Mobile.takeScreenshotAsCheckpoint('Tabung Booster Scan & Save Verification')

Mobile.verifyElementText(findTestObject('Notification/notification_titleTxt', [('title') : title]), title)

Mobile.verifyElementVisible(findTestObject('Notification/notification_titleTxt', [('title') : title]), 0)

def data = findTestData('MAE Noti').getValue(1, 4)

println(data)

def validate = (((('Great going! You\'ve just channeled RM ' + value) + ' into your ') + tabungName) + ' goal from using the Scan & Save Booster. REF: ') + 
data

Mobile.verifyElementText(findTestObject('Notification/notiCreatorTabungBoosterScanSave_bodyTxt', [('tabungName') : tabungName
            , ('value') : value, ('RefId') : findTestData('MAE Noti').getValue(1, 4)]), validate)

