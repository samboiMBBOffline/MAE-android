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

//Mobile.startApplication('/Users/a00139272/Katalon Studio/MAE/androidapp/app-sit-universal-release-copy.apk', false)
//
//RunConfiguration.setMobileDriverPreferencesProperty('appPackage', 'com.maybank2u.life.sit')
//
//RunConfiguration.setMobileDriverPreferencesProperty('appActivity', 'com.maybank2u.life.sit.MainActivity')
//
//Mobile.delay(5)
//
//Mobile.tapAtPosition(355, 2147)
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
//    //Mobile.tap(findTestObject('Login Onboarding/loginPinTickBtn'), 0)
//    Mobile.delay(2)
//}

//Mobile.verifyElementVisible(findTestObject('Banking/m2uAccountTypeSelection', [('text') : 'MAE']), 10)
//
////Mobile.tap(findTestObject('Main/mainMaybank2uBottomMenuBtn'), 0)
//Mobile.tap(findTestObject('Banking/m2uAccountTypeSelection', [('text') : 'MAE']), 10)
//
//Mobile.tap(findTestObject('Banking/m2uAccountSplitBillIconSelect'), 0)
Mobile.startApplication(GlobalVariable.appPath, false)

RunConfiguration.setMobileDriverPreferencesProperty('appPackage', 'com.maybank2u.life.sit')

RunConfiguration.setMobileDriverPreferencesProperty('appActivity', 'com.maybank2u.life.sit.MainActivity')

Mobile.delay(5)

//Mobile.tapAtPosition(355, 2147)
Mobile.tap(findTestObject('SplitBill/new_splitBillWalletIconBtn'), 0)

if (Mobile.verifyElementVisible(findTestObject('Main/mainEnterPINMessage'), 0, FailureHandling.OPTIONAL)) {
	Mobile.tap(findTestObject('Login Onboarding/PIN1'), 0)

	Mobile.tap(findTestObject('Login Onboarding/PIN1'), 0)

	Mobile.tap(findTestObject('Login Onboarding/PIN1'), 0)

	Mobile.tap(findTestObject('Login Onboarding/PIN1'), 0)

	Mobile.tap(findTestObject('Login Onboarding/PIN1'), 0)

	Mobile.tap(findTestObject('Login Onboarding/PIN2'), 0)

	//Mobile.tap(findTestObject('Login Onboarding/loginPinTickBtn'), 0)
	Mobile.delay(2)
}

//Mobile.delay(3)
//
//Mobile.swipe(900, 1245, 300, 1245)
//
//Mobile.delay(3)
//
//Mobile.swipe(900, 1245, 300, 1245)
//Mobile.delay(3)

//Mobile.tap(findTestObject('SplitBill/splitBillListSplitaBillBtn'), 0)

Mobile.delay(3)

Mobile.tap(findTestObject('Banking/m2uAccountSplitBillIconSelect'), 0)

Mobile.waitForElementPresent(findTestObject('SplitBill/new_splitBillTxt'), 45)

Mobile.delay(3)

device_Height = Mobile.getDeviceHeight()

device_Width = Mobile.getDeviceWidth()

int startY = device_Height / 2

int endY = startY

int startX = device_Width * 0.30

int endX = device_Width * 0.70

Mobile.delay(3)

Mobile.swipe(startX, startY, endX, endY)

if(Mobile.verifyElementNotExist(findTestObject('SplitBill/splitBillToCollectListBillNameTxt', [('name') : 'Lunch']), 0, FailureHandling.OPTIONAL)) {
	Mobile.swipe(324, 1076, 850, 1076)
}



Mobile.delay(3)

Mobile.waitForElementPresent(findTestObject('SplitBill/splitBillToCollectListBillNameTxt', [('name') : 'Lunch']), 0)

Mobile.tap(findTestObject('SplitBill/splitBillToCollectListBillNameTxt', [('name') : 'Lunch']), 0)

Mobile.delay(3)

Mobile.waitForElementPresent(findTestObject('SplitBill/splitBillDetailsThreeDotsBtn'), 0)

Mobile.tap(findTestObject('SplitBill/splitBillDetailsThreeDotsBtn'), 0)

Mobile.waitForElementPresent(findTestObject('SplitBill/splitBillDetailsThreeDotsRemoveBillBtn'), 0)

Mobile.tap(findTestObject('SplitBill/splitBillDetailsThreeDotsRemoveBillBtn'), 0)

Mobile.waitForElementPresent(findTestObject('SplitBill/splitBillRemoveConfirmBtn'), 0)

Mobile.tap(findTestObject('SplitBill/splitBillRemoveConfirmBtn'), 0)

Mobile.delay(3)

Mobile.verifyElementNotExist(findTestObject('SplitBill/splitBillToCollectListBillNameTxt', [('name') : 'Lunch']), 0)

