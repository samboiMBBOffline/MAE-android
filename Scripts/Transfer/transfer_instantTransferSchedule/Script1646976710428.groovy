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
import com.kms.katalon.keyword.excel.ExcelKeywords as ExcelKeywords

//Mobile.startApplication('/Users/a00139272/Katalon Studio/MAE/androidapp/app-sit-universal-release-copy.apk', false)
//
//RunConfiguration.setMobileDriverPreferencesProperty('appPackage', 'com.maybank2u.life.sit')
//
//RunConfiguration.setMobileDriverPreferencesProperty('appActivity', 'com.maybank2u.life.sit.MainActivity')
//
//def start = 'Starts'
//
//println(start)

Mobile.delay(5)

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
//Mobile.verifyElementVisible(findTestObject('Banking/m2uAccountTypeSelection', [('text') : 'MAE']), 10)
//
//Mobile.tap(findTestObject('Banking/m2uAccountTypeSelection', [('text') : 'MAE']), 10)
//
//Mobile.delay(5)

Mobile.verifyElementVisible(findTestObject('Banking/m2uAccountTransferIconSelect'), 0)

Mobile.tap(findTestObject('Banking/m2uAccountTransferIconSelect'), 0)

Mobile.delay(5)

//if (Mobile.verifyElementVisible(findTestObject('Tabung/tabungEnterPasswordTxt'), 0, FailureHandling.OPTIONAL)) {
//    Mobile.setText(findTestObject('Tabung/tabungSignInInputPasswordField'), Password, 0)
//
//    Mobile.hideKeyboard()
//
//    Mobile.tap(findTestObject('Tabung/tabungSignInContinueBtn'), 0)
//}

println('InterBank Test Case Started')

Mobile.tap(findTestObject('Banking/transferOthersTopMenuSelect'), 0)

Mobile.tap(findTestObject('Banking/transferBanksIconSelect'), 0)

Mobile.scrollToText('PUBLIC BANK', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Banking/transferBankSelection', [('text') : 'PUBLIC BANK']), 10)

Mobile.setText(findTestObject('Banking/transferAccountNoInputField'), accountNum, 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Login Onboarding/loginExistingContinueBtn'), 0)

Mobile.delay(5)

Mobile.verifyElementText(findTestObject('Transfer/transferAmounttAccNoTxt', [('accNo') : accNo]), accNo)

Mobile.verifyElementText(findTestObject('Transfer/transferAmounttAccBankTxt', [('accBank') : accBank]), accBank)

Mobile.verifyElementExist(findTestObject('Transfer/transferAmountRMTxt'), 0)

Mobile.verifyElementExist(findTestObject('Transfer/transferAmountEnterAmountTitleTxt'), 0)

Mobile.verifyElementExist(findTestObject('Login Onboarding/PIN4'), 0)

Mobile.tap(findTestObject('Login Onboarding/PIN4'), 0)

WebUI.delay(3)

Mobile.verifyElementText(findTestObject('Transfer/transferAmountInputValueTxt', [('value') : '0.04']), '0.04')

Mobile.delay(3)

Mobile.tap(findTestObject('Login Onboarding/loginPinTickBtn'), 0)

WebUI.delay(3)

Mobile.verifyElementText(findTestObject('Transfer/transferReferenceAccNoTxt', [('accNo') : accNo]), accNo)

Mobile.verifyElementText(findTestObject('Transfer/transferReferenceAccBankTxt', [('accBank') : accBank]), accBank)

Mobile.verifyElementExist(findTestObject('Transfer/transferReferenceInputField'), 0)

Mobile.setText(findTestObject('Banking/transferReferenceInputField'), 'InstantTransferSched', 0)

Mobile.hideKeyboard()

Mobile.verifyElementText(findTestObject('Transfer/transferReferenceInputFieldAfter', [('reference') : 'InstantTransferSched']), 'InstantTransferSched')

Mobile.tap(findTestObject('Login Onboarding/loginExistingContinueBtn'), 0)

Mobile.verifyElementText(findTestObject('Transfer/transferReferenceAccNoTxt', [('accNo') : accNo]), accNo)

Mobile.verifyElementText(findTestObject('Transfer/transferReferenceAccBankTxt', [('accBank') : accBank]), accBank)

Mobile.tap(findTestObject('Banking/transferTypeDropdownSelection'), 0)

Mobile.scrollToText('Fund Transfer', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Banking/tansferTypeFundDropdownSelection'), 0)

Mobile.tap(findTestObject('Banking/transferModeDropdownDoneBtn'), 0)

Mobile.delay(3)

Mobile.verifyElementExist(findTestObject('Transfer/instantTransferModeDuitTxt', [('mode') : 'DuitNow Transfer']), 0)

Mobile.verifyElementExist(findTestObject('Transfer/instantTransferModeTitleTxt'), 0)

Mobile.verifyElementExist(findTestObject('Transfer/instantTransferTypeFundTxt'), 0)

Mobile.verifyElementExist(findTestObject('Transfer/instantTransferTypeTitleTxt'), 0)

Mobile.tap(findTestObject('Login Onboarding/loginExistingContinueBtn'), 0)

'Verify confirmation page'
Mobile.verifyElementText(findTestObject('Transfer/transferConfirmationTransactionDateTxt'), 'Today')

Mobile.tap(findTestObject('Transfer/transferConfirmationTransactionDateTxt'), 0)

Mobile.tap(findTestObject('Main/mainCalenderPickerNextBtn'), 0)

Mobile.delay(3)

Mobile.tap(findTestObject('Main/mainDatePicker1'), 0)

Mobile.tap(findTestObject('Main/mainCalenderPickerDoneBtn'), 0)

Mobile.verifyElementText(findTestObject('Transfer/transferConfirmationAccountNameTxt', [('accName') : accName]), accName)

Mobile.verifyElementText(findTestObject('Transfer/transferConfirmationAccountNoTxt', [('accNo') : accNo]), accNo)

Mobile.verifyElementText(findTestObject('Transfer/transferConfirmationAmountTxt', [('amount') : 'RM 0.04']), 'RM 0.04')

Mobile.verifyElementText(findTestObject('Transfer/transferConfirmationTransactionRecRefTxt', [('reference') : 'InstantTransferSched']), 'InstantTransferSched')

Mobile.verifyElementText(findTestObject('Transfer/transferConfirmationTransactionBankTxt', [('accBank') : accBank]), accBank)

Mobile.verifyElementText(findTestObject('Transfer/transferConfirmationOptionalGreyWordTxt'), 'Optional')

Mobile.verifyElementText(findTestObject('Transfer/instantTransferConfirmationTransactionTypeTxt'), 'Fund Transfer')

Mobile.verifyElementText(findTestObject('Transfer/instantTransferConfirmationTransactionModeTxt', [('modeC') : 'DuitNow Transfer']), 'DuitNow Transfer')

Mobile.verifyElementText(findTestObject('Transfer/instantTransferConfirmationTransactionServiceTxt'), 'RM 0.00')

Mobile.verifyElementExist(findTestObject('Transfer/transferConfirmationBankNameTitleTxt'), 0)

Mobile.verifyElementExist(findTestObject('Transfer/transferConfirmationDateTitleTxt'), 0)

Mobile.verifyElementExist(findTestObject('Transfer/transferConfirmationRecRefTitleTxt'), 0)

Mobile.verifyElementExist(findTestObject('Transfer/transferConfirmationPaymentDetailsTitleTxt'), 0)

Mobile.verifyElementExist(findTestObject('Transfer/instantTransferConfirmationModeTitleTxt'), 0)

Mobile.verifyElementExist(findTestObject('Transfer/instantTransferConfirmationServiceFeeTitleTxt'), 0)

Mobile.verifyElementExist(findTestObject('Transfer/instantTransferConfirmationTypeTitleTxt'), 0)

Mobile.verifyElementExist(findTestObject('Transfer/transferConfirmationNoteTitleTxt'), 0)

Mobile.tap(findTestObject('Transfer/transferConfirmationOptionalGreyWordTxt'), 0)

Mobile.setText(findTestObject('Transfer/transferConfirmationDetailsInputField'), 'Test Fav', 0)

Mobile.hideKeyboard()

Mobile.verifyElementText(findTestObject('Transfer/transferConfirmationOptionalGreyWordTxt'), 'Test Fav')

device_Height_2 = Mobile.getDeviceHeight()

device_Width_2 = Mobile.getDeviceWidth()

int startX_2 = device_Width_2 / 2

int endX_2 = startX_2

int startY_2 = device_Height_2 * 0.30

int endY_2 = device_Height_2 * 0.70

Mobile.swipe(startX_2, endY_2, endX_2, startY_2)

Mobile.verifyElementExist(findTestObject('Transfer/instantTransferConfirmationNotes1Txt'), 0)

Mobile.verifyElementExist(findTestObject('Transfer/transferConfirmationFTransferFromTitleTxt'), 0)

Mobile.verifyElementExist(findTestObject('Transfer/instantTransferConfirmationNotes2Txt'), 0)

Mobile.verifyElementText(findTestObject('Transfer/transferConfirmationFromAccTypeTxt', [('accType') : accType]), accType)

Mobile.verifyElementText(findTestObject('Transfer/transferConfirmationFromAccNoTxt', [('accNoFrom') : accNoFrom]), accNoFrom)

Mobile.verifyElementExist(findTestObject('Transfer/transferConfirmationFromAccBalanceTxt'), 0)

accountBalance = Mobile.getText(findTestObject('Transfer/transferConfirmationFromAccBalanceTxt'), 0)

println(accountBalance)

Mobile.tap(findTestObject('Main/mainTransferNowBtn'), 0)

Mobile.delay(5)

if (Mobile.verifyElementVisible(findTestObject('Festive Season/seasonalGreetingAngpaoTACNoTxt'), 10, FailureHandling.OPTIONAL)) {
    def OTP = Mobile.getText(findTestObject('Festive Season/seasonalGreetingAngpaoTACNoTxt'), 10)

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

    Mobile.tap(findTestObject('Festive Season/festiveSendGreetingAngpaoTACTickBtn'), 0)
} else {
    Mobile.delay(3)

    Mobile.verifyElementVisible(findTestObject('Main/mainS2UApproveBtn'), 0)

    Mobile.tap(findTestObject('Main/mainS2UApproveBtn'), 0)
}

Mobile.delay(5)

Mobile.verifyElementExist(findTestObject('Festive Season/returnAngpaoStatusMessageTxt'), 0)

def message = Mobile.getText(findTestObject('Festive Season/returnAngpaoStatusMessageTxt'), 10)

println(message)

assert message == successTransactionMessage

Mobile.verifyElementExist(findTestObject('Transfer/transferSummaryDateTimeTitleTxt'), 0)

Mobile.verifyElementExist(findTestObject('Transfer/transferSummaryRefIDTitleTxt'), 0)

Mobile.verifyElementExist(findTestObject('Transfer/transferSummaryShareReceiptBtn'), 0)

Mobile.delay(5)

referenceID = Mobile.getText(findTestObject('Send Request Money/requestMoneyPaySummaryRefIDTxt'), 0)

println(referenceID)

String test = GlobalVariable.dataFolder

String sheetName = 'Sheet1'

File file1 = new File(test)

assert file1.exists() == true

woorkbook1 = ExcelKeywords.getWorkbook(test)

sheet1 = ExcelKeywords.getExcelSheet(woorkbook1, sheetName)

ExcelKeywords.setValueToCellByIndex(sheet1, 3, 1, referenceID //index row column(3,1) = (4,2)
    )

ExcelKeywords.saveWorkbook(test, woorkbook1)

Mobile.delay(3)

Mobile.takeScreenshot("/Users/a00139272/Desktop/Screenshot/instantSchedule.png")

Mobile.verifyElementVisible(findTestObject('Main/mainDoneBtn'), 0)

Mobile.tap(findTestObject('Main/mainDoneBtn'), 0)

Mobile.delay(5)

Mobile.tap(findTestObject('Main/mainTopLeftBackButton'), 0)

Mobile.delay(5)

Mobile.verifyElementVisible(findTestObject('Banking/m2uAccountTypeSelection', [('text') : 'MAE']), 0)

Mobile.tap(findTestObject('Banking/m2uAccountTypeSelection', [('text') : 'MAE']), 10)

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

//assert newBalance.round(2) == newAfterBalanceF
Mobile.delay(5)

