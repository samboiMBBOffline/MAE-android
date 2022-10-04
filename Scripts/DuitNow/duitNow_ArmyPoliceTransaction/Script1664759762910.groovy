import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.Proxy.ProxyType as ProxyType
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
//import com.kms.katalon.keyword.excel.ExcelKeywords as ExcelKeywords
import ExcelKeywords.Keywords.com.kms.katalon.keyword.excel.ExcelKeywords as ExcelKeywords
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint

//RunConfiguration.setMobileDriverPreferencesProperty('appPackage', 'com.maybank2u.life.sit')
//
//RunConfiguration.setMobileDriverPreferencesProperty('appActivity', 'com.maybank2u.life.MainActivity')
//
//if (GlobalVariable.isApplicationOpened == false) {
//    Mobile.startApplication(GlobalVariable.appPath, false)
//}
Mobile.startExistingApplication('com.maybank2u.life.sit')

Mobile.delay(5)

Mobile.tap(findTestObject('Dashboard/mainBottomMenuMaybank2uBtn'), 0)

'password set in test data'
if (Mobile.verifyElementVisible(findTestObject('Main/mainEnterPINMessage'), 0, FailureHandling.OPTIONAL)) {
    Mobile.tap(findTestObject('Login Onboarding/PIN1'), 0)

    Mobile.tap(findTestObject('Login Onboarding/PIN1'), 0)

    Mobile.tap(findTestObject('Login Onboarding/PIN1'), 0)

    Mobile.tap(findTestObject('Login Onboarding/PIN1'), 0)

    Mobile.tap(findTestObject('Login Onboarding/PIN1'), 0)

    Mobile.tap(findTestObject('Login Onboarding/PIN1'), 0)

    Mobile.delay(2)
}

'type of acc set in test data'
Mobile.verifyElementVisible(findTestObject('Banking/m2uAccountTypeSelection', [('text') : findTestData('TestData').getValue(
                5, 1)]), 10)

Mobile.tap(findTestObject('Banking/m2uAccountTypeSelection', [('text') : findTestData('TestData').getValue(5, 1)]), 10)

Mobile.delay(3)

Mobile.verifyElementVisible(findTestObject('Banking/m2uAccountTransferIconSelect'), 10)

Mobile.tap(findTestObject('Banking/m2uAccountTransferIconSelect'), 0)

if (Mobile.verifyElementVisible(findTestObject('Tabung/tabungEnterPasswordTxt'), 0, FailureHandling.OPTIONAL)) {
    Mobile.setText(findTestObject('Tabung/tabungSignInInputPasswordField'), findTestData('TestData').getValue(2, 1), 0)

    Mobile.hideKeyboard()

    Mobile.tap(findTestObject('Tabung/tabungSignInContinueBtn'), 0)
}

Mobile.verifyElementVisible(findTestObject('Banking/transferDuitNowTopMenuSelect'), 5)

Mobile.tap(findTestObject('Banking/transferDuitNowTopMenuSelect'), 0)

Mobile.delay(3)

Mobile.tap(findTestObject('Banking/duitNowOtherIconSelect'), 0)

Mobile.delay(3)

Mobile.verifyElementExist(findTestObject('Banking/duitNowIDTypeDropdownSelect'), 0)

Mobile.tap(findTestObject('Banking/duitNowIDTypeDropdownSelect'), 0)

Mobile.scrollToText('Business Registration Number', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Banking/duitNowBusinessRegIDTypeDropdown', [('proxy') : findTestData('TestData').getValue(
                1, 8)]), 0)

Mobile.tap(findTestObject('Banking/duitNowBusinessRegIDTypeDropdown', [('proxy') : findTestData('TestData').getValue(1, 
                8)]), 0)

Mobile.tap(findTestObject('Main/mainCalenderPickerDoneBtn'), 0)

Mobile.delay(3)

Mobile.verifyElementExist(findTestObject('Banking/duitNowBusinessRegNoInputField', [('proxyPlaceholder') : findTestData(
                'TestData').getValue(5, 8)]), 0)

Mobile.setText(findTestObject('Banking/duitNowBusinessRegNoInputField', [('proxyPlaceholder') : findTestData('TestData').getValue(
                5, 8)]), findTestData('TestData').getValue(3, 8), 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Login Onboarding/loginExistingContinueBtn'), 0)

Mobile.delay(5)

Mobile.verifyElementText(findTestObject('Duit Now/duitNowAmountProxyNumberTxt', [('proxyNumber') : findTestData('TestData').getValue(
                3, 8)]), findTestData('TestData').getValue(3, 8))

Mobile.verifyElementText(findTestObject('Duit Now/duitNowAmountReceipientNameTxt', [('recName') : findTestData('TestData').getValue(
                2, 8)]), findTestData('TestData').getValue(2, 8))

Mobile.verifyElementText(findTestObject('Duit Now/duitNowAmountProxyTypeTxt', [('proxyType') : findTestData('TestData').getValue(
                1, 8)]), findTestData('TestData').getValue(1, 8))

Mobile.verifyElementExist(findTestObject('Duit Now/duitNowAmountCurrencyTypeTxt'), 0)

Mobile.verifyElementExist(findTestObject('Duit Now/duitNowAmountEnterAmountTitleTxt'), 0)

Mobile.verifyElementExist(findTestObject('Duit Now/duitNowAmountInitialValueTxt'), 0)

String trxAmount = findTestData('TestData').getValue(4, 1)

def length = trxAmount.length()

Mobile.delay(5)

for (def i = 0; i < length; i++) {
    TapNo = (trxAmount[i])

    println(TapNo)

    Mobile.tap(findTestObject('Forget Password/PIN tap', [('TapNo') : TapNo]), 0)
}

Mobile.verifyElementText(findTestObject('Duit Now/duitNowAmountValueTxt', [('value') : findTestData('TestData').getValue(
                3, 1)]), findTestData('TestData').getValue(3, 1))

Mobile.verifyElementVisible(findTestObject('Login Onboarding/loginPinTickBtn'), 5)

Mobile.tap(findTestObject('Login Onboarding/loginPinTickBtn'), 0)

Mobile.delay(5)

Mobile.verifyElementText(findTestObject('Duit Now/duitNowReferenceProxyNumberTxt', [('proxyNumber') : findTestData('TestData').getValue(
                3, 8)]), findTestData('TestData').getValue(3, 8))

Mobile.verifyElementText(findTestObject('Duit Now/duitNowReferenceProxyTypeTxt', [('proxyType') : findTestData('TestData').getValue(
                1, 8)]), findTestData('TestData').getValue(1, 8))

Mobile.verifyElementText(findTestObject('Duit Now/duitNowReferenceReceipientNameTxt', [('recName') : findTestData('TestData').getValue(
                2, 8)]), findTestData('TestData').getValue(2, 8))

Mobile.verifyElementExist(findTestObject('Duit Now/duitNowReferenceEnterTitleTxt'), 0)

Mobile.setText(findTestObject('Banking/duitNowReferenceInputField'), findTestData('TestData').getValue(8, 8), 0)

Mobile.hideKeyboard()

Mobile.verifyElementText(findTestObject('Duit Now/duitNowReferenceContentTxt', [('reference') : findTestData('TestData').getValue(
                8, 8)]), findTestData('TestData').getValue(8, 8))

Mobile.tap(findTestObject('Login Onboarding/loginExistingContinueBtn'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Duit Now/duitNowConfirmationReceipientNameTxt', [('recName') : findTestData('TestData').getValue(
                2, 8)]), findTestData('TestData').getValue(2, 8))

Mobile.verifyElementText(findTestObject('Duit Now/duitNowConfirmationReceipientProxyNumTxt', [('proxyNumber') : findTestData(
                'TestData').getValue(3, 8)]), findTestData('TestData').getValue(3, 8))

Mobile.verifyElementText(findTestObject('Duit Now/duitNowConfirmationAmountTxt', [('amount') : 'RM ' + findTestData('TestData').getValue(
                3, 1)]), 'RM ' + findTestData('TestData').getValue(3, 1))

Mobile.verifyElementExist(findTestObject('Duit Now/duitNowConfirmationDateTitleTxt'), 0)

Mobile.verifyElementExist(findTestObject('Duit Now/duitNowConfirmationIDTypeTitleTxt'), 0)

Mobile.verifyElementExist(findTestObject('Duit Now/duitNowConfirmationTransferTypeTitleTxt'), 0)

Mobile.verifyElementExist(findTestObject('Duit Now/duitNowConfirmationPaymentDetailsTitleTxt'), 0)

Mobile.verifyElementExist(findTestObject('Duit Now/duitNowConfirmationReferenceTitleTxt'), 0)

Mobile.verifyElementExist(findTestObject('Duit Now/duitNowConfirmationServiceFeeTitleTxt'), 0)

Mobile.verifyElementText(findTestObject('Duit Now/duitNowConfirmationIDTypeTxt', [('proxy') : findTestData('TestData').getValue(
                1, 8)]), findTestData('TestData').getValue(1, 8))

Mobile.verifyElementText(findTestObject('Duit Now/duitNowConfirmationReceiveDateTxt'), 'Today')

Mobile.verifyElementText(findTestObject('Duit Now/duitNowConfirmationReferenceTxt', [('reference') : findTestData('TestData').getValue(
                8, 8)]), findTestData('TestData').getValue(8, 8))

Mobile.verifyElementText(findTestObject('Duit Now/duitNowConfirmationServiceFeeAmountTxt'), 'RM 0.00')

Mobile.tap(findTestObject('Duit Now/duitNowConfirmationPaymentDetailsGreyWordTxt'), 0)

Mobile.setText(findTestObject('Duit Now/duitNowConfirmationPaymentDetailsGreyWordTxt'), findTestData('TestData').getValue(
        9, 8), 0)

Mobile.hideKeyboard()

Mobile.verifyElementText(findTestObject('Duit Now/duitNowConfirmationPaymentDetailsInputtedTxt', [('details') : findTestData(
                'TestData').getValue(9, 8)]), findTestData('TestData').getValue(9, 8))

device_Height_2 = Mobile.getDeviceHeight()

device_Width_2 = Mobile.getDeviceWidth()

int startX_2 = device_Width_2 / 2

int endX_2 = startX_2

int startY_2 = device_Height_2 * 0.30

int endY_2 = device_Height_2 * 0.70

Mobile.swipe(startX_2, endY_2, endX_2, startY_2)

Mobile.verifyElementExist(findTestObject('Transfer/transferConfirmationFTransferFromTitleTxt'), 0)

Mobile.verifyElementExist(findTestObject('Duit Now/duitNowConfirmationNoteTitleTxt'), 0)

Mobile.verifyElementExist(findTestObject('Duit Now/duitNowConfirmationDeclarationTitleTxt'), 0)

Mobile.verifyElementExist(findTestObject('Duit Now/duitNowConfirmationTnCTitleTxt'), 0)

Mobile.verifyElementExist(findTestObject('Duit Now/duitNowConfirmationNoteContentTxt'), 0)

Mobile.verifyElementExist(findTestObject('Duit Now/duitNowConfirmationDeclarationContentTxt'), 0)

Mobile.verifyElementText(findTestObject('Transfer/transferConfirmationFromAccTypeTxt', [('accType') : findTestData('TestData').getValue(
                5, 1)]), findTestData('TestData').getValue(5, 1))

Mobile.verifyElementText(findTestObject('Transfer/transferConfirmationFromAccNoTxt', [('accNoFrom') : findTestData('TestData').getValue(
                6, 1)]), findTestData('TestData').getValue(6, 1))

Mobile.verifyElementExist(findTestObject('Transfer/transferConfirmationFromAccBalanceTxt'), 0)

accountBalance = Mobile.getText(findTestObject('Transfer/transferConfirmationFromAccBalanceTxt'), 0)

println(accountBalance)

Mobile.tap(findTestObject('Main/mainTransferNowBtn'), 0)

if (Mobile.verifyElementVisible(findTestObject('Festive Season/festiveReturnAngpaoTACNoTxt'), 0, FailureHandling.OPTIONAL)) {
    def OTP = Mobile.getText(findTestObject('Festive Season/festiveReturnAngpaoTACNoTxt'), 0)

    Mobile.delay(5)

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

    Mobile.tap(findTestObject('Festive Season/festiveReturnAngpaoTickBtn'), 0)
} else {
    Mobile.delay(5)

    Mobile.verifyElementVisible(findTestObject('Main/mainS2UApproveBtn'), 10)

    Mobile.tap(findTestObject('Main/mainS2UApproveBtn'), 0)
}

Mobile.delay(10)

Mobile.verifyElementExist(findTestObject('Festive Season/returnAngpaoStatusMessageTxt'), 0)

def message = Mobile.getText(findTestObject('Festive Season/returnAngpaoStatusMessageTxt'), 10)

println(message)

assert message == findTestData('TestData').getValue(7, 3)

Mobile.delay(2)

Mobile.verifyElementExist(findTestObject('Duit Now/duitNowSummaryDateTimeTitleTxt'), 0)

Mobile.verifyElementExist(findTestObject('Duit Now/duitNowSummaryRefernceIDTitleTxt'), 0)

Mobile.verifyElementExist(findTestObject('Transfer/transferSummaryShareReceiptBtn'), 0)

Mobile.delay(2)

referenceID = Mobile.getText(findTestObject('Send Request Money/requestMoneyPaySummaryRefIDTxt'), 0)

println(referenceID)

String test = GlobalVariable.dataFolder

println(test)

String sheetName = 'Sheet1'

File file1 = new File(test)

assert file1.exists() == true

woorkbook1 = ExcelKeywords.getWorkbook(test)

sheet1 = ExcelKeywords.getExcelSheet(woorkbook1, sheetName)

ExcelKeywords.setValueToCellByIndex(sheet1, 4, 1, referenceID //index row column(4,1) = (5,2)
    )

ExcelKeywords.saveWorkbook(test, woorkbook1)

Mobile.delay(3)

Mobile.verifyElementVisible(findTestObject('Main/mainDoneBtn'), 0)

Mobile.tap(findTestObject('Main/mainDoneBtn'), 0)

Mobile.delay(5)

Mobile.verifyElementVisible(findTestObject('Banking/m2uAccountTypeSelection', [('text') : findTestData('TestData').getValue(
                5, 1)]), 0)

Mobile.tap(findTestObject('Banking/m2uAccountTypeSelection', [('text') : findTestData('TestData').getValue(5, 1)]), 10)

Mobile.delay(5)

afterBalance = Mobile.getText(findTestObject('Main/mainAccountsBalanceTxt'), 0)

newAfterBalance = afterBalance.replaceAll('[^0-9.]', '')

newAccountBalance = accountBalance.replaceAll('[^0-9.]', '')

float newAfterBalanceF = Float.parseFloat(newAfterBalance)

float newAccountBalanceF = Float.parseFloat(newAccountBalance)

println(afterBalance)

println(accountBalance)

println(newAfterBalance)

println(newAccountBalance)

float newBalance = newAccountBalanceF - 0.04

println(newBalance)

