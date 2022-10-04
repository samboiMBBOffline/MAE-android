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

if (index == '1') {
	
	Mobile.waitForElementPresent(findTestObject('Object Repository/Settings/Notifications/settingsNotificationsTxt'), 0)
	
	Mobile.verifyElementExist(findTestObject('Object Repository/Settings/Notifications/settingsNotificationsDescTxt'), 0)
	
	Mobile.tap(findTestObject('Object Repository/Settings/Notifications/settingsNotificationsTxt'), 0)
	
}else if(index == '2') {
	
	Mobile.waitForElementPresent(findTestObject('Object Repository/Settings/Notifications/settingsProfileTxt'), 0)
	
	Mobile.verifyElementExist(findTestObject('Object Repository/Settings/Notifications/settingsProfileDescTxt'), 0)
	
	Mobile.tap(findTestObject('Object Repository/Settings/Notifications/settingsProfileTxt'), 0)
	
}else if (index == '3') {
	
	Mobile.waitForElementPresent(findTestObject('Object Repository/Settings/Notifications/settingsSecurityTxt'), 0)
	
	Mobile.verifyElementExist(findTestObject('Object Repository/Settings/Notifications/settingsSecurityDescTxt'), 0)
	
	Mobile.tap(findTestObject('Object Repository/Settings/Notifications/settingsSecurityTxt'), 0)
	
}else if (index == '4') {
	Mobile.waitForElementPresent(findTestObject('Object Repository/Settings/Security/settingsSecurityChangePinTxt'), 0)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Settings/Security/settingsSecurityChangePinTxt'), findTestData('TestData').getValue(2, 41))
	
	Mobile.tap(findTestObject('Object Repository/Settings/Security/settingsSecurityChangePinTxt'), 0)
}else if (index == '5') {
	Mobile.waitForElementPresent(findTestObject('Object Repository/others/PIN/settingsPINSuccessTxt'), 0)
	
	Mobile.verifyElementText(findTestObject('Object Repository/others/PIN/settingsPINSuccessTxt'), findTestData('TestData').getValue(4, 44))
	
}else if (index == '6') {
	Mobile.waitForElementPresent(findTestObject('Object Repository/Settings/Security/settingsSecurityBiometricToggle'), 0)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Settings/Security/settingsSecurityBiometricTxt'), findTestData('TestData').getValue(2, 40))
	
	Mobile.tap(findTestObject('Object Repository/Settings/Security/settingsSecurityBiometricToggle'), 0)
	
	Mobile.waitForElementPresent(findTestObject('Object Repository/Settings/Security/settingsBioPopupDisableTitleTxt'), 0)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Settings/Security/settingsBioPopupDisableTitleTxt'), findTestData('TestData').getValue(2, 46))
	
	Mobile.verifyElementText(findTestObject('Object Repository/Settings/Security/settingsBioPopupDisableTxt'), findTestData('TestData').getValue(4, 46))
	
	Mobile.tap(findTestObject('Object Repository/Settings/Security/settingsBioPopupDisableConfirmBtn'), 0)
	
	Mobile.waitForElementPresent(findTestObject('Object Repository/Settings/Security/settingsBioPopupDisableSuccessTxt'), 0)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Settings/Security/settingsBioPopupDisableSuccessTxt'), findTestData('TestData').getValue(4, 47))
	
}

