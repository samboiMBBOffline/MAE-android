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
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.mobile.keyword.internal.MobileAbstractKeyword as MobileAbstractKeyword
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import io.appium.java_client.AppiumDriver as AppiumDriver
import java.io.FileInputStream as FileInputStream
import java.io.FileNotFoundException as FileNotFoundException
import java.io.IOException as IOException
import java.util.Date as Date
import org.apache.poi.xssf.usermodel.XSSFCell as XSSFCell
import org.apache.poi.xssf.usermodel.XSSFRow as XSSFRow
import org.apache.poi.xssf.usermodel.XSSFSheet as XSSFSheet
import org.apache.poi.xssf.usermodel.XSSFWorkbook as XSSFWorkbook
import java.lang.String as String
import com.kms.katalon.keyword.excel.ExcelKeywords as ExcelKeywords

try {
//    Mobile.startApplication('/Users/a00139272/Katalon Studio/MAE/androidapp/app-sit-universal-release-copy.apk', false)
//
//    RunConfiguration.setMobileDriverPreferencesProperty('appPackage', 'com.maybank2u.life.sit')
//
//    RunConfiguration.setMobileDriverPreferencesProperty('appActivity', 'com.maybank2u.life.MainActivity')

    Mobile.delay(3)

    Mobile.tapAtPosition(953, 2147)

    Mobile.tapAtPosition(953, 2147)

    Mobile.waitForElementPresent(findTestObject('Main/mainMoreNotificationBtn'), 0)

    Mobile.tap(findTestObject('Main/mainMoreNotificationBtn'), 0)

    def verify = ((requestorName + ' has requested RM 0.04 from you for ') + requestRemark) + '.'

    Mobile.waitForElementPresent(findTestObject('Send Request Money/moneyRequestNotificationMessageTxt', [('requestorName') : requestorName
                , ('requestRemark') : requestRemark]), 30)

    Mobile.verifyElementText(findTestObject('Send Request Money/moneyRequestNotificationMessageTxt', [('requestorName') : requestorName
                , ('requestRemark') : requestRemark]), verify)

    Mobile.tap(findTestObject('Send Request Money/moneyRequestNotificationMessageTxt', [('requestorName') : requestorName
                , ('requestRemark') : requestRemark]), 0)

    Mobile.delay(3)

//    if (Mobile.verifyElementVisible(findTestObject('Main/mainEnterPINMessage'), 0, FailureHandling.OPTIONAL)) {
//        Mobile.tap(findTestObject('Login Onboarding/PIN1'), 0)
//
//        Mobile.tap(findTestObject('Login Onboarding/PIN1'), 0)
//
//        Mobile.tap(findTestObject('Login Onboarding/PIN1'), 0)
//
//        Mobile.tap(findTestObject('Login Onboarding/PIN1'), 0)
//
//        Mobile.tap(findTestObject('Login Onboarding/PIN1'), 0)
//
//        Mobile.tap(findTestObject('Login Onboarding/PIN2'), 0)
//
//        //Mobile.tap(findTestObject('Login Onboarding/loginPinTickBtn'), 0)
//        Mobile.delay(2)
//    }
    
    if (Mobile.verifyElementVisible(findTestObject('Tabung/tabungEnterPasswordTxt'), 10, FailureHandling.OPTIONAL)) {
        Mobile.setText(findTestObject('Tabung/tabungSignInInputPasswordField'), Password, 0)

        Mobile.hideKeyboard()

        Mobile.tap(findTestObject('Tabung/tabungSignInContinueBtn'), 0)
    } else {
        Mobile.waitForElementPresent(findTestObject('Send Request Money/requestMoneyIncomingMessageTxt', [('requestorName') : requestorName
                    , ('requestRemark') : requestRemark]), 30)

        Mobile.tap(findTestObject('Send Request Money/requestMoneyIncomingPayNowBtn'), 0)

        Mobile.delay(5)
    }
    
    if (Mobile.verifyElementVisible(findTestObject('Tabung/tabungEnterPasswordTxt'), 10, FailureHandling.OPTIONAL)) {
        Mobile.setText(findTestObject('Tabung/tabungSignInInputPasswordField'), Password, 0)

        Mobile.hideKeyboard()

        Mobile.tap(findTestObject('Tabung/tabungSignInContinueBtn'), 0)
    }
    
    Mobile.waitForElementPresent(findTestObject('Send Request Money/payMoneyConfirmationRequestSendNowBtn'), 0)

    Mobile.verifyElementText(findTestObject('Send Request Money/payMoneyConfirmationRequestNameTxt', [('requestorName2') : requestorName2]), 
        requestorName2)

    Mobile.verifyElementText(findTestObject('Send Request Money/payMoneyConfirmationRequestPhoneNoTxt', [('phoneNum2') : phoneNum2]), 
        phoneNum2)

    Mobile.verifyElementText(findTestObject('Send Request Money/payMoneyConfirmationRequestAmountTxt'), 'RM 0.04')

    Mobile.tap(findTestObject('Send Request Money/payRequestMoneySendNowBtn'), 0)

    Mobile.delay(5)

    if (Mobile.verifyElementVisible(findTestObject('Send Request Money/payMoneyTACNoTxt'), 0, FailureHandling.OPTIONAL)) {
        def OTP = Mobile.getText(findTestObject('Send Request Money/payMoneyTACNoTxt'), 0)

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

        Mobile.tap(findTestObject('Send Request Money/payMoneyTACTickBtn'), 0)
    }else {
        Mobile.delay(3)

        Mobile.verifyElementVisible(findTestObject('Main/mainS2UApproveBtn'), 0)

        Mobile.tap(findTestObject('Main/mainS2UApproveBtn'), 0)
    }
    
    Mobile.delay(3)

    Mobile.waitForElementPresent(findTestObject('Send Request Money/payMoneySummaryDoneBtn'), 30)

    Mobile.verifyElementText(findTestObject('Send Request Money/payMoneySummaryStatusMessageTxt'), 'Transfer successful')

    Mobile.verifyElementText(findTestObject('Send Request Money/payMoneySummaryRequestorNameTxt', [('requestorName2') : requestorName2]), 
        requestorName2)

    Mobile.verifyElementText(findTestObject('Send Request Money/payMoneySummaryContactNoTxt', [('phoneNum2') : phoneNum2]), 
        phoneNum2)

    Mobile.verifyElementText(findTestObject('Send Request Money/payMoneySummaryAmountTxt'), 'RM 0.04')

    referenceID = Mobile.getText(findTestObject('Send Request Money/requestMoneyPaySummaryRefIDTxt'), 0)

    println(referenceID)

    String test = GlobalVariable.dataFolder

    String sheetName = 'Sheet1'

    File file1 = new File(test)

    assert file1.exists() == true

    woorkbook1 = ExcelKeywords.getWorkbook(test)

    sheet1 = ExcelKeywords.getExcelSheet(woorkbook1, sheetName)

    ExcelKeywords.setValueToCellByIndex(sheet1, 0, 0, referenceID)

    ExcelKeywords.saveWorkbook(test, woorkbook1)
		
	Mobile.waitForElementPresent(findTestObject('Send Request Money/payMoneySummaryDoneBtn'), 30)
	
	Mobile.takeScreenshot("/Users/a00139272/Desktop/Screenshot/paidRequestMoney.png")

    Mobile.tap(findTestObject('Send Request Money/payMoneySummaryDoneBtn'), 0)

    Mobile.delay(3)

    Mobile.tap(findTestObject('Main/mainTopLeftBackButton'), 0)

    Mobile.delay(5)
}
catch (Exception e) {
    if (GlobalVariable.isApplicationOpened == false) {
        Mobile.callTestCase(findTestCase('Send Request Money/sendRequestMoney_payRequestMoney'), null)
    }
} 

