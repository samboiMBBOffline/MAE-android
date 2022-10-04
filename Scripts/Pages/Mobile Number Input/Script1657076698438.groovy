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

Mobile.waitForElementPresent(findTestObject('Object Repository/others/MobileNo/othersMobileNumberInputTitleTxt'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/others/MobileNo/othersMobileNumberInputDescTxt'), findTestData('TestData').getValue(4, 37))

Mobile.verifyElementExist(findTestObject('Object Repository/others/MobileNo/othersMobileNumberInitial60Txt'), 0)

String trxAmount = findTestData('TestData').getValue(5, 30)

def length = trxAmount.length()

Mobile.delay(3)

//Mobile.tapAtPosition(startX, startY)

for (def i = 0; i < length; i++) {
	if ((trxAmount[i]) == '0') {
		Mobile.tap(findTestObject('Login Onboarding/PIN0'), 0)
	}
	
	if ((trxAmount[i]) == '1') {
		Mobile.tap(findTestObject('Login Onboarding/PIN1'), 0)
	}
	
	if ((trxAmount[i]) == '2') {
		Mobile.tap(findTestObject('Login Onboarding/PIN2'), 0)
	}
	
	if ((trxAmount[i]) == '3') {
		Mobile.tap(findTestObject('Login Onboarding/PIN3'), 0)
	}
	
	if ((trxAmount[i]) == '4') {
		Mobile.tap(findTestObject('Login Onboarding/PIN4'), 0)
	}
	
	if ((trxAmount[i]) == '5') {
		Mobile.tap(findTestObject('Login Onboarding/PIN5'), 0)
	}
	
	if ((trxAmount[i]) == '6') {
		Mobile.tap(findTestObject('Login Onboarding/PIN6'), 0)
	}
	
	if ((trxAmount[i]) == '7') {
		Mobile.tap(findTestObject('Login Onboarding/PIN7'), 0)
	}
	
	if ((trxAmount[i]) == '8') {
		Mobile.tap(findTestObject('Login Onboarding/PIN8'), 0)
	}
	
	if ((trxAmount[i]) == '9') {
		Mobile.tap(findTestObject('Login Onboarding/PIN9'), 0)
	}
}

WebUI.delay(3)

//Mobile.verifyElementText(findTestObject('Transfer/transferAmountInputValueTxt', [('value') : checkValue]), checkValue)
//
//Mobile.delay(3)

Mobile.tap(findTestObject('Object Repository/others/MobileNo/othersMobileNumberInputTickBtn'), 0)

WebUI.delay(3)

Mobile.waitForElementPresent(findTestObject('Object Repository/others/MobileNo/otherMobileNumberInputInvalidTxt'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/others/MobileNo/otherMobileNumberInputInvalidTxt'), findTestData('TestData').getValue(4, 38))

String trxAmount2 = findTestData('TestData').getValue(6, 30)

def length2 = trxAmount2.length()

Mobile.delay(3)

//Mobile.tapAtPosition(startX, startY)

for (def j = 0; j < length2; j++) {
	if ((trxAmount2[j]) == '0') {
		Mobile.tap(findTestObject('Login Onboarding/PIN0'), 0)
	}
	
	if ((trxAmount2[j]) == '1') {
		Mobile.tap(findTestObject('Login Onboarding/PIN1'), 0)
	}
	
	if ((trxAmount2[j]) == '2') {
		Mobile.tap(findTestObject('Login Onboarding/PIN2'), 0)
	}
	
	if ((trxAmount2[j]) == '3') {
		Mobile.tap(findTestObject('Login Onboarding/PIN3'), 0)
	}
	
	if ((trxAmount2[j]) == '4') {
		Mobile.tap(findTestObject('Login Onboarding/PIN4'), 0)
	}
	
	if ((trxAmount2[j]) == '5') {
		Mobile.tap(findTestObject('Login Onboarding/PIN5'), 0)
	}
	
	if ((trxAmount2[j]) == '6') {
		Mobile.tap(findTestObject('Login Onboarding/PIN6'), 0)
	}
	
	if ((trxAmount2[j]) == '7') {
		Mobile.tap(findTestObject('Login Onboarding/PIN7'), 0)
	}
	
	if ((trxAmount2[j]) == '8') {
		Mobile.tap(findTestObject('Login Onboarding/PIN8'), 0)
	}
	
	if ((trxAmount2[j]) == '9') {
		Mobile.tap(findTestObject('Login Onboarding/PIN9'), 0)
	}
}

WebUI.delay(3)

Mobile.verifyElementText(findTestObject('Object Repository/others/MobileNo/otherMobileNumberInputtedTxt', [('inputMobile') : findTestData('TestData').getValue(
                    7, 30)]), findTestData('TestData').getValue(7, 30))

Mobile.tap(findTestObject('Object Repository/others/MobileNo/othersMobileNumberInputTickBtn'), 0)

WebUI.delay(3)
