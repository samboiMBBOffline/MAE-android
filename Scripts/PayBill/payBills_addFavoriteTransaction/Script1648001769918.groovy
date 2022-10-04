import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
//import com.kms.katalon.keyword.excel.ExcelKeywords as ExcelKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint

//RunConfiguration.setMobileDriverPreferencesProperty('appPackage', 'com.maybank2u.life.uat')
//
//RunConfiguration.setMobileDriverPreferencesProperty('appActivity', 'com.maybank2u.life.MainActivity')
//
//Mobile.startApplication(GlobalVariable.appPath, false)
Mobile.delay(5)

Mobile.startExistingApplication('com.maybank2u.life.sit', FailureHandling.STOP_ON_FAILURE)

device_Height = Mobile.getDeviceHeight()

device_Width = Mobile.getDeviceWidth()

int startX = device_Width / 3

int startY = device_Height * 0.97

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
//    //Mobile.tap(findTestObject('Login Onboarding/loginPinTickBtn'), 0)
//    Mobile.delay(2)
//}
//
//Mobile.tap(findTestObject('Banking/m2uAccountTypeSelection', [('text') : accType]), 10)
Mobile.tap(findTestObject('Banking/m2uAccountPayBillsIconSelect'), 0)

//if (Mobile.verifyElementVisible(findTestObject('Login Onboarding/loginEnterPasswordMessage'), 0, FailureHandling.OPTIONAL)) {
//    Mobile.setText(findTestObject('Login Onboarding/loginPasswordInputField'), Password, 0)
//
//    Mobile.hideKeyboard()
//
//    Mobile.tap(findTestObject('Login Onboarding/loginExistingContinueBtn'), 0)
//}
Mobile.waitForElementPresent(findTestObject('Paybill/payBillsIconSelect'), 0)

Mobile.tap(findTestObject('Paybill/payBillsIconSelect'), 0)

Mobile.tap(findTestObject('Paybill/payBillSearchBillerInputField'), 0)

Mobile.setText(findTestObject('Paybill/payBillBillerNameInputField'), payeeName, 0)

Mobile.delay(3)

Mobile.tap(findTestObject('Paybill/payBillBillerSelect', [('payeeName') : payeeName]), 10)

Mobile.tap(findTestObject('Paybill/payBillBillerSelect', [('payeeName') : payeeName]), 10)

Mobile.delay(3)

Mobile.verifyElementText(findTestObject('Paybill/payBillsAccountPayeeNameTxt', [('payee') : payeeName]), payeeName)

Mobile.verifyElementExist(findTestObject('Paybill/payBillsAccountNumberTitleTxt'), 0)

Mobile.setText(findTestObject('Paybill/PayBillAccountNumberInputField'), AccountNo, 0)

Mobile.hideKeyboard()

Mobile.verifyElementText(findTestObject('Paybill/payBillsAccountNumberInputtedTxt', [('AccountNo') : AccountNo]), AccountNo)

Mobile.tap(findTestObject('Login Onboarding/loginExistingContinueBtn'), 0)

Mobile.delay(3)

Mobile.verifyElementText(findTestObject('Paybill/payBillsAmountPayeeNameTxt', [('payee') : payeeName]), payeeName)

Mobile.verifyElementText(findTestObject('Paybill/payBillsAmountPayeeAccountNoTxt', [('accNo') : accNo]), accNo)

Mobile.verifyElementExist(findTestObject('Paybill/payBillsAmountInitialTxt'), 0)

Mobile.verifyElementExist(findTestObject('Paybill/payBillsAmountCurrencyTxt'), 0)

Mobile.verifyElementExist(findTestObject('Paybill/payBillsAmountEnterTitleTxt'), 0)

Mobile.tap(findTestObject('Login Onboarding/PIN5'), 0)

Mobile.tap(findTestObject('Login Onboarding/PIN0'), 0)

Mobile.tap(findTestObject('Login Onboarding/PIN0'), 0)

Mobile.tap(findTestObject('Login Onboarding/PIN0'), 0)

Mobile.delay(3)

Mobile.verifyElementText(findTestObject('Paybill/payBillsAmountInputtedTxt', [('value') : values]), values)

Mobile.tap(findTestObject('Main/mainAmountTickBtn'), 0)

Mobile.delay(5)

Mobile.verifyElementText(findTestObject('Paybill/payBillsConfirmPayeeNameTxt', [('payeeName') : payeeName]), payeeName)

Mobile.verifyElementText(findTestObject('Paybill/payBillsConfirmPayeeAccountNoTxt', [('accNo') : accNo]), accNo)

Mobile.verifyElementText(findTestObject('Paybill/payBillsConfirmAmountTxt', [('amount') : amount]), amount)

Mobile.verifyElementExist(findTestObject('Paybill/payBillsConfirmDateTitleTxt'), 0)

Mobile.verifyElementText(findTestObject('Paybill/payBillsConfirmDateTxt', [('trxDate') : trxDate]), trxDate)

Mobile.verifyElementExist(findTestObject('Paybill/payBillsConfirmPayFromTxt'), 0)

Mobile.verifyElementText(findTestObject('Transfer/transferConfirmationFromAccTypeTxt', [('accType') : accType]), accType)

Mobile.verifyElementText(findTestObject('Transfer/transferConfirmationFromAccNoTxt', [('accNoFrom') : accNoFrom]), accNoFrom)

Mobile.verifyElementExist(findTestObject('Transfer/transferConfirmationFromAccBalanceTxt'), 0)

accountBalance = Mobile.getText(findTestObject('Transfer/transferConfirmationFromAccBalanceTxt'), 0)

println(accountBalance)

Mobile.waitForElementPresent(findTestObject('Main/mainPayNowBtn'), 5)

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

    Mobile.delay(5)
} else {
    Mobile.delay(5)

    Mobile.verifyElementVisible(findTestObject('Main/mainS2UApproveBtn'), 10)

    Mobile.tap(findTestObject('Main/mainS2UApproveBtn'), 0)

    Mobile.delay(5)
}

Mobile.verifyElementExist(findTestObject('Festive Season/returnAngpaoStatusMessageTxt'), 0)

def message = Mobile.getText(findTestObject('Festive Season/returnAngpaoStatusMessageTxt'), 10)

println(message)

assert message == successTransactionMessage

Mobile.delay(5)

Mobile.verifyElementExist(findTestObject('Paybill/payBillsSummaryDateTimeTitleTxt'), 0)

Mobile.verifyElementExist(findTestObject('Duit Now/duitNowSummaryRefernceIDTitleTxt'), 0)

Mobile.verifyElementExist(findTestObject('Transfer/transferSummaryShareReceiptBtn'), 0)

Mobile.delay(5)

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

Mobile.delay(2)

Mobile.tap(findTestObject('Main/mainAddToFavBtn'), 0)

Mobile.delay(2)

Mobile.tap(findTestObject('Main/mainAddToFavBtn'), 0)

Mobile.delay(2)

Mobile.tap(findTestObject('Main/mainCloseFavPopUpBtn'), 0)

Mobile.delay(3)

Mobile.verifyElementVisible(findTestObject('Main/mainDoneBtn'), 0)

Mobile.takeScreenshot('/Users/a00139272/Desktop/Screenshot/payBillsAddFav.png')

Mobile.tap(findTestObject('Main/mainDoneBtn'), 0)

Mobile.delay(5)

//Mobile.tap(findTestObject('Main/mainTopLeftBackButton'), 0)
//
//Mobile.delay(5)
//
//Mobile.verifyElementVisible(findTestObject('Banking/m2uAccountTypeSelection', [('text') : accType]), 0)
//
//Mobile.tap(findTestObject('Banking/m2uAccountTypeSelection', [('text') : accType]), 10)
//
//Mobile.delay(5)
//
//afterBalance = Mobile.getText(findTestObject('Main/mainAccountsBalanceTxt'), 0)
//
//newAfterBalance = afterBalance.replaceAll('[^0-9.]', '')
//
//newAccountBalance = accountBalance.replaceAll('[^0-9.]', '')
//
//float newAfterBalanceF = Float.parseFloat(newAfterBalance)
//
//float newAccountBalanceF = Float.parseFloat(newAccountBalance)
//
//println(afterBalance)
//
//println(accountBalance)
//
//println(newAfterBalanceF)
//
//println(newAccountBalanceF)
//
//float newValue = Float.parseFloat(value)
//
//float newBalance = newAccountBalanceF - newValue
//
//println(newBalance)
//
//assert newBalance.round(2) == newAfterBalanceF
Mobile.delay(3)

