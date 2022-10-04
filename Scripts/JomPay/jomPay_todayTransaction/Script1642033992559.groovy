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
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import io.appium.java_client.AppiumDriver as AppiumDriver
import io.appium.java_client.MobileCommand as MobileCommand

//import com.kms.katalon.keyword.excel.ExcelKeywords as ExcelKeywords
//RunConfiguration.setMobileDriverPreferencesProperty('appPackage', 'com.maybank2u.life.uat')
//
//RunConfiguration.setMobileDriverPreferencesProperty('appActivity', 'com.maybank2u.life.MainActivity')
//
//Mobile.startApplication(GlobalVariable.appPath, false)
//
//Mobile.verifyElementExist(findTestObject('Object Repository/Dashboard/dashboardWalletTopSelect'), 0)
//
//Mobile.verifyElementExist(findTestObject('Object Repository/Dashboard/dashboardQuickActionsTitleTxt'), 0)
//
Mobile.startExistingApplication('com.maybank2u.life.sit')

device_Height = Mobile.getDeviceHeight()

device_Width = Mobile.getDeviceWidth()

int startX = device_Width / 3

int startY = device_Height * 0.97

//
//Mobile.tapAtPosition(startX, startY)
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
//    Mobile.delay(2)
//}
//
//Mobile.verifyElementExist(findTestObject('Banking/m2uAccountTypeSelection', [('text') : findTestData('TestData').getValue(
//                5, 1)]), 0)
//
//Mobile.tap(findTestObject('Banking/m2uAccountTypeSelection', [('text') : findTestData('TestData').getValue(5, 1)]), 0)
Mobile.verifyElementExist(findTestObject('Banking/m2uAccountPayBillsIconSelect'), 0)

Mobile.tap(findTestObject('Banking/m2uAccountPayBillsIconSelect'), 0)

if (Mobile.verifyElementVisible(findTestObject('Paybill/payBillsEnterPasswordTxt'), 0, FailureHandling.OPTIONAL)) {
    Mobile.setText(findTestObject('Paybill/payBillsPasswordInputField'), findTestData('TestData').getValue(2, 1), 0)

    Mobile.hideKeyboard()

    Mobile.tap(findTestObject('Paybill/payBillsSignInContinueBtn'), 0)
}
println('JOMPAY OFF US')

Mobile.verifyElementExist(findTestObject('JomPay/payBillsJomPayTopMenuSelect'), 0)

Mobile.tap(findTestObject('JomPay/payBillsJomPayTopMenuSelect'), 0)

Mobile.verifyElementExist(findTestObject('JomPay/jomPayIconSelect'), 0)

Mobile.tap(findTestObject('JomPay/jomPayIconSelect'), 0)

//Mobile.waitForElementPresent(findTestObject('Object Repository/JomPay/jomPayHeaderTxt'), 0)
Mobile.delay(3)

Mobile.verifyElementExist(findTestObject('Object Repository/JomPay/jomPayHeaderTxt'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/JomPay/jomPayBillerCodeTitleTxt'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/JomPay/jomPayReference1TitleTxt'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/JomPay/jomPayReference2TitleTxt'), 0)

Mobile.setText(findTestObject('JomPay/jomPayBillerInputField'), findTestData('TestData').getValue(8, 1), 0)

Mobile.setText(findTestObject('JomPay/jomPayBillerRefInputField'), findTestData('TestData').getValue(9, 1), 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Login Onboarding/loginExistingContinueBtn'), 0)

Mobile.verifyElementExist(findTestObject('JomPay/jomPayBillerCodeTxt', [('billerCode') : findTestData('TestData').getValue(
                8, 1)]), 0)

Mobile.verifyElementExist(findTestObject('JomPay/jomPayBillerRefTxt', [('refNum') : findTestData('TestData').getValue(9, 
                1)]), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/JomPay/jomPayAmountEnterAmountTitleTxt'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/JomPay/jomPayAmountInitialTxt'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/JomPay/jomPayAmountEnterAmountTitleTxt'), 0)

String trxAmount = findTestData('TestData').getValue(3, 1)

def length = trxAmount.length()

Mobile.delay(5)

Mobile.tapAtPosition(startX, startY)

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

Mobile.delay(5)

Mobile.tap(findTestObject('JomPay/jomPayAmountTickBtn'), 0)

Mobile.verifyElementExist(findTestObject('JomPay/jomPayConfirmationAmountTxt', [('amount') : findTestData('TestData').getValue(
                4, 1)]), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/JomPay/jomPayConfirmationBillerCodeTxt', [('billerCode') : findTestData(
                'TestData').getValue(8, 2)]), 0)

Mobile.verifyElementExist(findTestObject('JomPay/jomPayConfirmationBillerRefTxt', [('billRef') : findTestData('TestData').getValue(
                10, 1)]), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/JomPay/jomPayConfirmationDateTxt'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/JomPay/jomPayConfirmationDateTitleTxt'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/JomPay/jomPayConfirmationDeclarationTitleTxt'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/JomPay/jomPayConfirmationDeclarationNotesTxt'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/JomPay/jomPayConfirmationRef2TitleTxt'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/JomPay/jomPayConfirmationTnCTitleTxt'), 0)

Mobile.verifyElementText(findTestObject('Transfer/transferConfirmationFromAccTypeTxt', [('accType') : findTestData('TestData').getValue(
                5, 1)]), findTestData('TestData').getValue(5, 1))

Mobile.verifyElementText(findTestObject('Transfer/transferConfirmationFromAccNoTxt', [('accNoFrom') : findTestData('TestData').getValue(
                6, 1)]), findTestData('TestData').getValue(6, 1))

Mobile.verifyElementExist(findTestObject('Transfer/transferConfirmationFromAccBalanceTxt'), 0)

accountBalance = Mobile.getText(findTestObject('Transfer/transferConfirmationFromAccBalanceTxt'), 0)

println(accountBalance)

Mobile.verifyElementExist(findTestObject('Main/mainPayNowBtn'), 0)

Mobile.tap(findTestObject('Main/mainPayNowBtn'), 0)

if (Mobile.verifyElementVisible(findTestObject('Festive Season/festiveReturnAngpaoTACNoTxt'), 10, FailureHandling.OPTIONAL)) {
    def OTP = Mobile.getText(findTestObject('Festive Season/festiveReturnAngpaoTACNoTxt'), 0)

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

    Mobile.tap(findTestObject('Festive Season/festiveReturnAngpaoTickBtn'), 0)
} else {
    Mobile.delay(5)

    Mobile.verifyElementVisible(findTestObject('Main/mainS2UApproveBtn'), 10)

    Mobile.tap(findTestObject('Main/mainS2UApproveBtn'), 0)
}

Mobile.delay(5)

Mobile.verifyElementText(findTestObject('JomPay/jomPaySummarySuccesfulTxt'), findTestData('TestData').getValue(7, 1))

Mobile.verifyElementExist(findTestObject('Object Repository/JomPay/jomPaySummaryDateTimeTitleTxt'), 0)

Mobile.verifyElementExist(findTestObject('Duit Now/duitNowSummaryRefernceIDTitleTxt'), 0)

Mobile.verifyElementExist(findTestObject('Transfer/transferSummaryShareReceiptBtn'), 0)

referenceID = Mobile.getText(findTestObject('Send Request Money/requestMoneyPaySummaryRefIDTxt'), 0)

println(referenceID)

not_run: String test = GlobalVariable.dataFolder

not_run: String sheetName = 'Sheet1'

not_run: File file1 = new File(test)

not_run: assert file1.exists() == true

not_run: woorkbook1 = ExcelKeywords.getWorkbook(test)

not_run: sheet1 = ExcelKeywords.getExcelSheet(woorkbook1, sheetName)

not_run: ExcelKeywords.setValueToCellByIndex(sheet1, 4, 1, referenceID //index row column(4,1) = (5,2)
    )

not_run: ExcelKeywords.saveWorkbook(test, woorkbook1)

Mobile.delay(3)

//Mobile.takeScreenshot('/Users/a00139272/Desktop/Screenshot/jomPayInstant.png')

Mobile.verifyElementVisible(findTestObject('Main/mainDoneBtn'), 0)

Mobile.tap(findTestObject('Main/mainDoneBtn'), 0)

Mobile.delay(5)

