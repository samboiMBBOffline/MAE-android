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
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint

//try {
//    RunConfiguration.setMobileDriverPreferencesProperty('appPackage', 'com.maybank2u.life.sit')
//
//    RunConfiguration.setMobileDriverPreferencesProperty('appActivity', 'com.maybank2u.life.MainActivity')
//
//    if (GlobalVariable.isApplicationOpened == false) {
//        Mobile.startApplication(GlobalVariable.appPath, false)
//    }
//
//Mobile.delay(5)
//
//if (Mobile.getDeviceManufacturer() == 'samsung') {
//	Mobile.tapAtPosition(459, 2680)
//}else {
//	Mobile.tapAtPosition(355, 2147)
//}

Mobile.startExistingApplication('com.maybank2u.life.uat', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Object Repository/Dashboard/dashboard_maybank2uButton'), 10)

Mobile.tap(findTestObject('Object Repository/Dashboard/dashboard_maybank2uButton'), 0)

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

Mobile.verifyElementVisible(findTestObject('Banking/m2uAccountTypeSelection', [('text') : findTestData('TestData').getValue(4, 92)]), 10)

Mobile.tap(findTestObject('Banking/m2uAccountTypeSelection', [('text') : findTestData('TestData').getValue(4, 92)]), 10)

Mobile.delay(5)

Mobile.tap(findTestObject('Banking/m2uAccountSplitBillIconSelect'), 0)

Mobile.tap(findTestObject('SplitBill/splitBillListSplitaBillBtn'), 0)

Mobile.setText(findTestObject('SplitBill/splitBillCreateBillNameInputField'), findTestData('TestData').getValue(4, 93), 0)

Mobile.setText(findTestObject('SplitBill/splitBillCreateNotesInputField'), findTestData('TestData').getValue(4, 94), 0)

Mobile.hideKeyboard()

Mobile.delay(2)

Mobile.tap(findTestObject('SplitBill/splitBillCreateEvenlyRadioBtn'), 10)

Mobile.tap(findTestObject('SplitBill/splitBillCreateEvenlyRadioBtn'), 10)

Mobile.delay(2)

Mobile.tap(findTestObject('SplitBill/splitBillCreateContinueBtn'), 0)

Mobile.tap(findTestObject('Login Onboarding/PIN1'), 0)

Mobile.delay(3)

Mobile.tap(findTestObject('Login Onboarding/PIN0'), 0)

Mobile.delay(3)

Mobile.tap(findTestObject('Login Onboarding/PIN0'), 0)

Mobile.delay(3)

Mobile.tap(findTestObject('SplitBill/splitBillAmountTickBtn'), 0)

Mobile.delay(3)

Mobile.delay(5)

Mobile.waitForElementPresent(findTestObject('SplitBill/splitBillCreateSearchIconBtn'), 10)

Mobile.tap(findTestObject('SplitBill/splitBillCreateSearchIconBtn'), 0)

Mobile.delay(5)

Mobile.setText(findTestObject('SplitBill/splitBillCreateContactSearchtInputField'), findTestData('TestData').getValue(4, 95), 0)

Mobile.delay(3)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('SplitBill/splitBillCreateContactSelect'), 0)

Mobile.tap(findTestObject('SplitBill/splitBillCreateContactSelect'), 0)

Mobile.delay(3)

Mobile.tap(findTestObject('SplitBill/splitBillCreateDoneBtn'), 0)

Mobile.delay(3)

//AppiumDriver<?> driver = MobileDriverFactory.getDriver()
//
////List<WebElement> elements = driver.findElementByAccessibilityId('mayaImage'),10)
////List<WebElement> elements = driver.findElementByAccessibilityId('mayaImage')
////Mobile.scrollToText('DN')
//'Getting all similar elements and storing in to List'
//List<WebElement> elements = driver.findElementsByClassName('android.widget.ImageView')
//
//println('The size of elements is ::' + elements.size())

Mobile.tap(findTestObject('SplitBill/splitBillCreateContinueBtn'), 0)

Mobile.tap(findTestObject('SplitBill/splitBillConfirmCameraIcon1'), 0)

Mobile.tap(findTestObject('SplitBill/splitBillCameraTakePhotoBtn'), 0)

Mobile.waitForElementPresent(findTestObject('SplitBill/splitBillCameraCaptureBtn'), 10)

//Mobile.verifyElementVisible('SplitBill/splitBillCameraCaptureBtn', 0)
Mobile.tap(findTestObject('SplitBill/splitBillCameraCaptureBtn'), 0)

Mobile.delay(10)

Mobile.tap(findTestObject('SplitBill/splitBillCreateCameraConfirmTickBtn'), 0)

Mobile.delay(10)

//Mobile.verifyElementText(findTestObject('Object Repository/SplitBill/Your receipt image has been successfully added.'), 'Your receipt image has been successfully added.')
Mobile.tap(findTestObject('SplitBill/splitBillSummarySplitNowBtn'), 0)

Mobile.delay(5)

Mobile.waitForElementPresent(findTestObject('Main/mainDoneBtn'), 30)

Mobile.verifyElementText(findTestObject('Main/mainTransactionStatusMessageTxt'), findTestData('TestData').getValue(4, 96))

Mobile.waitForElementPresent(findTestObject('Main/mainDoneBtn'), 10)

Mobile.takeScreenshot('/Users/a00139272/Desktop/Screenshot/createSplitBill.png')

Mobile.tap(findTestObject('Main/mainDoneBtn'), 0)

Mobile.delay(5)

