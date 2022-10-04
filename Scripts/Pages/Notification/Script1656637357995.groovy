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

Mobile.waitForElementPresent(findTestObject('Object Repository/Settings/Notifications/notificationSettingsHeaderTxt'), 0)

Mobile.verifyElementText(findTestObject('Settings/Notifications/notificationSettingsDescriptionTxt', [('notiDesc') : findTestData('TestData').getValue(4, 23)]), 
	findTestData('TestData').getValue(4, 23))

if (index == '1') {
    Mobile.verifyElementText(findTestObject('Object Repository/Settings/Notifications/notificationSettingsPromotionsTxt', [('promotions') : findTestData('TestData').getValue(2, 24)]), 
        findTestData('TestData').getValue(2, 24))

    Mobile.tap(findTestObject('Object Repository/Settings/Notifications/notificationSettingsPromotionsToggle'), 0)

    Mobile.waitForElementPresent(findTestObject('Object Repository/Settings/Notifications/notificationSettingsPromotionsSuccessDisableTxt', [('promoSuccessDis') : findTestData('TestData').getValue(4, 24)]), 
        0)

    Mobile.verifyElementText(findTestObject('Object Repository/Settings/Notifications/notificationSettingsPromotionsSuccessDisableTxt', [('promoSuccessDis') : findTestData('TestData').getValue(4, 24)]), 
        findTestData('TestData').getValue(4, 24))

	Mobile.delay(10)
	
    Mobile.verifyElementNotExist(findTestObject('Object Repository/Settings/Notifications/notificationSettingsPromotionsSuccessDisableTxt', [('promoSuccessDis') : findTestData('TestData').getValue(4, 24)]), 
        0)
	
    Mobile.tap(findTestObject('Object Repository/Settings/Notifications/notificationSettingsPromotionsToggle'), 0)

    Mobile.waitForElementPresent(findTestObject('Object Repository/Settings/Notifications/notificationSettingsPromotionsSuccessEnableTxt', [('promoSuccessEnab') : findTestData('TestData').getValue(4, 25)]), 
        0)

    Mobile.verifyElementText(findTestObject('Object Repository/Settings/Notifications/notificationSettingsPromotionsSuccessEnableTxt', [('promoSuccessEnab') : findTestData('TestData').getValue(4, 25)]), 
        findTestData('TestData').getValue(4, 25))
	
} else if (index == '2') {
    Mobile.verifyElementText(findTestObject('Object Repository/Settings/Notifications/notificationSettingsMoneyRecTxt', [('moneyReceived') : findTestData('TestData').getValue(2, 26)]), 
        findTestData('TestData').getValue(2, 26))

    Mobile.tap(findTestObject('Object Repository/Settings/Notifications/notificationSettingsMoneySoundImage'), 0)

    Mobile.delay(5)

    Mobile.tap(findTestObject('Object Repository/Settings/Notifications/notificationSettingsMoneyToggle'), 0)
	
    Mobile.waitForElementPresent(findTestObject('Object Repository/Settings/Notifications/notificationSettingsMoneyRecSuccessDisableTxt', [('moneySuccessDis') : findTestData('TestData').getValue(4, 26)]), 
        0)
	
    Mobile.verifyElementText(findTestObject('Object Repository/Settings/Notifications/notificationSettingsMoneyRecSuccessDisableTxt', [('moneySuccessDis') : findTestData('TestData').getValue(4, 26)]), 
        findTestData('TestData').getValue(4, 26))

	Mobile.delay(20)
	
    Mobile.waitForElementNotPresent(findTestObject('Object Repository/Settings/Notifications/notificationSettingsMoneyRecSuccessDisableTxt', [('moneySuccessDis') : findTestData('TestData').getValue(4, 26)]), 
        0)

    Mobile.tap(findTestObject('Object Repository/Settings/Notifications/notificationSettingsMoneyToggle'), 0)
	
    Mobile.waitForElementPresent(findTestObject('Object Repository/Settings/Notifications/notificationSettingsMoneyRecSuccessEnableTxt', [('moneySuccessEnab') : findTestData('TestData').getValue(4, 27)]), 
        0)

    Mobile.verifyElementText(findTestObject('Object Repository/Settings/Notifications/notificationSettingsMoneyRecSuccessEnableTxt', [('moneySuccessEnab') : findTestData('TestData').getValue(4, 27)]), 
        findTestData('TestData').getValue(4, 27))
}

