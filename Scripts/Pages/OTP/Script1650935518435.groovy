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

def OTP = Mobile.getText(findTestObject('Festive Season/seasonalGreetingAngpaoTACNoTxt'), 5)

Mobile.delay(5)

device_Height = Mobile.getDeviceHeight()

device_Width = Mobile.getDeviceWidth()

int startX = device_Width / 3

int startY = device_Height * 0.97

Mobile.tapAtPosition(startX, startY)

for (def i = 16; i <= 21; i++) {
	if ((OTP[i]) == '0') {
		Mobile.tap(findTestObject('Login Onboarding/PIN0'), 0)
	}
	
	if ((OTP[i]) == '1') {
		Mobile.tap(findTestObject('Login Onboarding/PIN1'), 0)
	}
	
	if ((OTP[i]) == '2') {
		Mobile.tap(findTestObject('Login Onboarding/PIN2'), 0)
	}
	
	if ((OTP[i]) == '3') {
		Mobile.tap(findTestObject('Login Onboarding/PIN3'), 0)
	}
	
	if ((OTP[i]) == '4') {
		Mobile.tap(findTestObject('Login Onboarding/PIN4'), 0)
	}
	
	if ((OTP[i]) == '5') {
		Mobile.tap(findTestObject('Login Onboarding/PIN5'), 0)
	}
	
	if ((OTP[i]) == '6') {
		Mobile.tap(findTestObject('Login Onboarding/PIN6'), 0)
	}
	
	if ((OTP[i]) == '7') {
		Mobile.tap(findTestObject('Login Onboarding/PIN7'), 0)
	}
	
	if ((OTP[i]) == '8') {
		Mobile.tap(findTestObject('Login Onboarding/PIN8'), 0)
	}
	
	if ((OTP[i]) == '9') {
		Mobile.tap(findTestObject('Login Onboarding/PIN9'), 0)
	}
}

Mobile.delay(3)

Mobile.tap(findTestObject('Festive Season/festiveSendGreetingAngpaoTACTickBtn'), 0)