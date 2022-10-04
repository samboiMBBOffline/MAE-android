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

Mobile.callTestCase(findTestCase('Login Onboard/onboard_onboardIntoMAE'), [('Username') : Username1, ('Password') : Password1], FailureHandling.OPTIONAL)
//Mobile.startExistingApplication('com.maybank2u.life.uat')

Mobile.tap(findTestObject('Main/mainMaybank2uBottomMenuBtn'), 0)

//Mobile.tap(findTestObject('Banking/m2uAccountTypeSelection'), 0)
Mobile.tap(findTestObject('Wallet/maybank2uCardsTopMenuSelect'), 0)

Mobile.tap(findTestObject('Object Repository/CardManagement/MAE Visa Card'), 0)

Mobile.tap(findTestObject('Object Repository/CardManagement/Freeze Card'), 0)

Mobile.tap(findTestObject('Banking/s2UActivateNowBtn'), 0)
Mobile.tap(findTestObject('Banking/s2UConfirmBtn'), 0)
def OTP= Mobile.getText(findTestObject('Login Onboarding/secureGetOTPTxt'), 0)
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
Mobile.delay(03)
Mobile.tap(findTestObject('Login Onboarding/TickOTP'), 0)
Mobile.setText(findTestObject('Banking/s2UIDNumberInputField'), '730101109991', 0)
Mobile.hideKeyboard()
Mobile.tap(findTestObject('Login Onboarding/loginExistingContinueBtn'), 0)
Mobile.delay(03)
Mobile.hideKeyboard()
Mobile.tap(findTestObject('Login Onboarding/loginExistingContinueBtn'), 0)
Mobile.delay(03)
Mobile.tap(findTestObject('Login Onboarding/loginExistingContinueBtn'), 0)
Mobile.tap(findTestObject('Main/mainS2UApproveBtn'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/CardManagement/Card freeze successful'), 'Card freeze successful.')

Mobile.tap(findTestObject('Main/mainDoneBtn'), 0)

Mobile.tap(findTestObject('Object Repository/CardManagement/Freeze Card'), 0)

Mobile.tap(findTestObject('Main/mainS2UApproveBtn'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/CardManagement/Card unfreeze successful'), 'Card unfreeze successful.')

Mobile.tap(findTestObject('Main/mainDoneBtn'), 0)

Mobile.tap(findTestObject('Object Repository/CardManagement/Overseas Debit'), 0)

Mobile.tap(findTestObject('Object Repository/CardManagement/Enter start date'), 0)

Mobile.tap(findTestObject('Object Repository/CardManagement/Nextmonth'), 0)

Mobile.tap(findTestObject('Object Repository/CardManagement/Date3'), 0)

Mobile.tap(findTestObject('Main/mainCalenderPickerDoneBtn'), 0)

Mobile.tap(findTestObject('Object Repository/CardManagement/Enter end date'), 0)

Mobile.tap(findTestObject('Object Repository/CardManagement/Nextmonth'), 0)

Mobile.tap(findTestObject('Object Repository/CardManagement/Date3'), 0)

Mobile.tap(findTestObject('Main/mainCalenderPickerDoneBtn'), 0)

Mobile.tap(findTestObject('Login Onboarding/loginExistingContinueBtn'), 0)

Mobile.tap(findTestObject('Main/mainS2UApproveBtn'), 0)

Mobile.tap(findTestObject('Main/mainDoneBtn'), 0)

Mobile.tap(findTestObject('Object Repository/CardManagement/Overseas Debit'), 0)

Mobile.tap(findTestObject('Object Repository/CardManagement/OverseasdebitDeactivate'), 0)

Mobile.tap(findTestObject('Main/mainS2UApproveBtn'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/CardManagement/Overseas debit successfully deactivated'), 'Overseas debit successfully deactivated.')

Mobile.tap(findTestObject('Main/mainDoneBtn'), 0)

Mobile.tap(findTestObject('Object Repository/CardManagement/Change Card PIN'), 0)

Mobile.tap(findTestObject('Login Onboarding/PIN1'), 0)

Mobile.tap(findTestObject('Login Onboarding/PIN1'), 0)

Mobile.tap(findTestObject('Login Onboarding/PIN1'), 0)

Mobile.tap(findTestObject('Login Onboarding/PIN1'), 0)

Mobile.tap(findTestObject('Login Onboarding/PIN1'), 0)

Mobile.tap(findTestObject('Login Onboarding/PIN2'), 0)

Mobile.tap(findTestObject('Object Repository/CardManagement/Tickmark'), 0)

Mobile.delay(2)

Mobile.tap(findTestObject('Login Onboarding/PIN1'), 0)

Mobile.tap(findTestObject('Login Onboarding/PIN1'), 0)

Mobile.tap(findTestObject('Login Onboarding/PIN1'), 0)

Mobile.tap(findTestObject('Login Onboarding/PIN1'), 0)

Mobile.tap(findTestObject('Login Onboarding/PIN1'), 0)

Mobile.tap(findTestObject('Login Onboarding/PIN2'), 0)

Mobile.delay(2)

Mobile.tap(findTestObject('Object Repository/CardManagement/Tickmark'), 0)

Mobile.tap(findTestObject('Main/mainS2UApproveBtn'), 0)

Mobile.tap(findTestObject('Main/mainDoneBtn'), 0)

