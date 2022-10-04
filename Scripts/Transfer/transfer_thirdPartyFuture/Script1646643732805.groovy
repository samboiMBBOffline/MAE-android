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

//import com.kms.katalon.keyword.excel.ExcelKeywords as ExcelKeywords
//RunConfiguration.setMobileDriverPreferencesProperty('appPackage', 'com.maybank2u.life.sit')
//
//RunConfiguration.setMobileDriverPreferencesProperty('appActivity', 'com.maybank2u.life.MainActivity')
//
//if (GlobalVariable.isApplicationOpened == false) {
//    Mobile.startApplication(GlobalVariable.appPath, false)
//}
Mobile.startExistingApplication('com.maybank2u.life.sit')

//Mobile.verifyElementVisible(findTestObject('Banking/m2uAccountTransferIconSelect'), 0)
//
//Mobile.tap(findTestObject('Banking/m2uAccountTransferIconSelect'), 0)
//
//Mobile.delay(5)
//
//if (Mobile.verifyElementVisible(findTestObject('Tabung/tabungEnterPasswordTxt'), 10, FailureHandling.OPTIONAL)) {
//    Mobile.setText(findTestObject('Tabung/tabungSignInInputPasswordField'), findTestData('TestData').getValue(4, 1), 0)   //data files Testdata sheets Transfger
//
//    Mobile.hideKeyboard()
//
//    Mobile.tap(findTestObject('Tabung/tabungSignInContinueBtn'), 0)
//}
//
//Mobile.tap(findTestObject('Banking/transferOthersTopMenuSelect'), 0)
//
//Mobile.delay(2)
//
//Mobile.tap(findTestObject('Banking/transferBanksIconSelect'), 0)
//
//Mobile.tap(findTestObject('Banking/transferToMaybankSelect'), 0)
//
//Mobile.delay(3)
//
//Mobile.verifyElementExist(findTestObject('Banking/transferAccountNoInputField'), 0)
//
//Mobile.setText(findTestObject('Banking/transferAccountNoInputField'), findTestData('TestData').getValue(4, 27), 0)
//
//Mobile.hideKeyboard()
//
//Mobile.tap(findTestObject('Login Onboarding/loginExistingContinueBtn'), 0)
//
//Mobile.verifyElementText(findTestObject('Transfer/transferAmounttAccNameTxt', [('accName') : findTestData('TestData').getValue(4, 28)]), findTestData('TestData').getValue(4, 28))
//
//Mobile.verifyElementText(findTestObject('Transfer/transferAmounttAccNoTxt', [('accNo') : findTestData('TestData').getValue(4, 31)]), findTestData('TestData').getValue(4, 31))
//
//Mobile.verifyElementText(findTestObject('Transfer/transferAmounttAccBankTxt', [('accBank') : findTestData('TestData').getValue(4, 29)]), findTestData('TestData').getValue(4, 29))
//
//Mobile.verifyElementExist(findTestObject('Transfer/transferAmountRMTxt'), 0)
//
//Mobile.verifyElementExist(findTestObject('Transfer/transferAmountEnterAmountTitleTxt'), 0)
//
//Mobile.verifyElementExist(findTestObject('Login Onboarding/PIN4'), 0)
//
//Mobile.tap(findTestObject('Login Onboarding/PIN4'), 0)
//
//Mobile.verifyElementText(findTestObject('Transfer/transferAmountInputValueTxt', [('value') : findTestData('TestData').getValue(4, 30)]), findTestData('TestData').getValue(4, 30))
//
//Mobile.delay(3)
//
//Mobile.tap(findTestObject('Login Onboarding/loginPinTickBtn'), 0)
//
//Mobile.verifyElementText(findTestObject('Transfer/transferReferenceAccNameTxt', [('accName') : findTestData('TestData').getValue(4, 28)]), findTestData('TestData').getValue(4, 28))
//
//
//Mobile.verifyElementText(findTestObject('Transfer/transferReferenceAccNoTxt',[('accNo') : findTestData('TestData').getValue(4, 31)]), findTestData('TestData').getValue(4, 31))
//
//Mobile.verifyElementText(findTestObject('Transfer/transferReferenceAccBankTxt', [('accBank') : findTestData('TestData').getValue(4, 29)]), findTestData('TestData').getValue(4, 29))
//
//Mobile.verifyElementExist(findTestObject('Transfer/transferReferenceInputField'), 0)
//
//Mobile.setText(findTestObject('Banking/transferReferenceInputField'),  findTestData('TestData').getValue(4, 32), 0)
//
//Mobile.hideKeyboard()
//
//Mobile.verifyElementText(findTestObject('Transfer/transferReferenceInputFieldAfter', [('reference') :  findTestData('TestData').getValue(4, 32)]),  findTestData('TestData').getValue(4, 32))
//
//Mobile.tap(findTestObject('Login Onboarding/loginExistingContinueBtn'), 0)
//
//Mobile.verifyElementText(findTestObject('Transfer/transferConfirmationAccountNameTxt', [('accName') : findTestData('TestData').getValue(4, 28)]), findTestData('TestData').getValue(4, 28))
//
//Mobile.verifyElementText(findTestObject('Transfer/transferConfirmationAccountNoTxt', [('accNo') : findTestData('TestData').getValue(4, 31)]), findTestData('TestData').getValue(4, 31))
//
//Mobile.verifyElementText(findTestObject('Transfer/transferConfirmationAmountTxt', [('amount') :  findTestData('TestData').getValue(4, 33)]),  findTestData('TestData').getValue(4, 33))
//
//Mobile.verifyElementText(findTestObject('Transfer/transferConfirmationTransactionDateTxt'), 'Today')
//
//Mobile.verifyElementText(findTestObject('Transfer/transferConfirmationTransactionRecRefTxt', [('reference') :  findTestData('TestData').getValue(4, 32)]),  findTestData('TestData').getValue(4, 32))
//
//Mobile.verifyElementText(findTestObject('Transfer/transferConfirmationTransactionBankTxt', [('accBank') :  findTestData('TestData').getValue(4, 29)]),  findTestData('TestData').getValue(4, 29))
//
//Mobile.verifyElementText(findTestObject('Transfer/transferConfirmationOptionalGreyWordTxt'), 'Optional')
//
//Mobile.verifyElementExist(findTestObject('Transfer/transferConfirmationBankNameTitleTxt'), 0)
//
//Mobile.verifyElementExist(findTestObject('Transfer/transferConfirmationDateTitleTxt'), 0)
//
//Mobile.verifyElementExist(findTestObject('Transfer/transferConfirmationFTransferFromTitleTxt'), 0)
//
//Mobile.verifyElementExist(findTestObject('Transfer/transferConfirmationRecRefTitleTxt'), 0)
//
//Mobile.verifyElementExist(findTestObject('Transfer/transferConfirmationPaymentDetailsTitleTxt'), 0)
//
//Mobile.verifyElementExist(findTestObject('Transfer/transferConfirmationNoteTitleTxt'), 0)
//
//Mobile.verifyElementExist(findTestObject('Transfer/transferConfirmationNoteContentTxt'), 0)
//
////-------future
//Mobile.tap(findTestObject('Main/mainDatePickerTodaySelect'), 0)
//
//Mobile.tap(findTestObject('Main/mainCalenderPickerNextBtn'), 0)
//
//Mobile.delay(3)
//
//Mobile.tap(findTestObject('Main/mainDatePicker1'), 0)
//
//Mobile.tap(findTestObject('Main/mainCalenderPickerDoneBtn'), 0)
//
//def date = Mobile.getText(findTestObject('Main/mainGetTransactionDateTxt'), 10)
//
//println('Date is ' + date)
////----------------
//
//Mobile.tap(findTestObject('Transfer/transferConfirmationOptionalGreyWordTxt'), 0)
//
//Mobile.setText(findTestObject('Transfer/transferConfirmationDetailsInputField'),  findTestData('TestData').getValue(4, 34), 0)
//
//Mobile.hideKeyboard()
//
//Mobile.verifyElementText(findTestObject('Transfer/transferConfirmationOptionalGreyWordTxt'), findTestData('TestData').getValue(4, 34))
//
//device_Height_2 = Mobile.getDeviceHeight()
//
//device_Width_2 = Mobile.getDeviceWidth()
//
//int startX_2 = device_Width_2 / 2
//
//int endX_2 = startX_2
//
//int startY_2 = device_Height_2 * 0.30
//
//int endY_2 = device_Height_2 * 0.70
//
//Mobile.swipe(startX_2, endY_2, endX_2, startY_2)
//
//Mobile.verifyElementText(findTestObject('Transfer/transferConfirmationFromAccTypeTxt', [('accType') : findTestData('TestData').getValue(4, 35)]), findTestData('TestData').getValue(4, 35))

Mobile.verifyElementText(findTestObject('Transfer/transferConfirmationFromAccNoTxt', [('accNoFrom') : findTestData('TestData').getValue(4, 36)]), findTestData('TestData').getValue(4, 36))

Mobile.verifyElementExist(findTestObject('Transfer/transferConfirmationFromAccBalanceTxt'), 0)

accountBalance = Mobile.getText(findTestObject('Transfer/transferConfirmationFromAccBalanceTxt'), 0)

println(accountBalance)

Mobile.tap(findTestObject('Main/mainTransferNowBtn'), 0)

if (Mobile.verifyElementVisible(findTestObject('Festive Season/seasonalGreetingAngpaoTACNoTxt'), 5, FailureHandling.OPTIONAL)) {
    def OTP = Mobile.getText(findTestObject('Festive Season/seasonalGreetingAngpaoTACNoTxt'), 5)

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
    Mobile.delay(5)

    Mobile.verifyElementVisible(findTestObject('Main/mainS2UApproveBtn'), 0)

    Mobile.tap(findTestObject('Main/mainS2UApproveBtn'), 0)
}

Mobile.delay(5)

Mobile.verifyElementExist(findTestObject('Festive Season/returnAngpaoStatusMessageTxt'), 0)

def message = Mobile.getText(findTestObject('Festive Season/returnAngpaoStatusMessageTxt'), 10)

println(message)

assert message == findTestData('TestData').getValue(4, 37)

Mobile.verifyElementExist(findTestObject('Transfer/transferSummaryDateTimeTitleTxt'), 0)

Mobile.verifyElementExist(findTestObject('Transfer/transferSummaryRefIDTitleTxt'), 0)

Mobile.verifyElementExist(findTestObject('Transfer/transferSummaryShareReceiptBtn'), 0)

Mobile.delay(5)

referenceID = Mobile.getText(findTestObject('Send Request Money/requestMoneyPaySummaryRefIDTxt'), 0)

println(referenceID)

//
//String test = '/Users/a00139272/git/MAEAutomation2/Performance.xlsx'
//
//String sheetName = 'Sheet1' 
//
//File file1 = new File(test)
//
//assert file1.exists() == true
//
//woorkbook1 = ExcelKeywords.getWorkbook(test)
//
//sheet1 = ExcelKeywords.getExcelSheet(woorkbook1, sheetName)
//
//ExcelKeywords.setValueToCellByIndex(sheet1, 3, 1, referenceID //index row column(3,1) = (4,2)
//	)
//
//ExcelKeywords.saveWorkbook(test, woorkbook1)
Mobile.delay(3)

Mobile.takeScreenshot('D:\\Users\\00141903\\Katalon Studio\\mae-test-automation-scripts\\3rdParty.png')

Mobile.verifyElementVisible(findTestObject('Main/mainDoneBtn'), 0)

Mobile.tap(findTestObject('Main/mainDoneBtn'), 0)

not_run: Mobile.delay(5)

not_run: Mobile.tap(findTestObject('Main/mainTopLeftBackButton'), 0)

not_run: Mobile.verifyElementVisible(findTestObject('Banking/m2uAccountTypeSelection', [('text') : findTestData('TestData').getValue(4, 35)]), 0)

not_run: Mobile.tap(findTestObject('Banking/m2uAccountTypeSelection', [('text') :  findTestData('TestData').getValue(4, 35)]), 10)

not_run: Mobile.delay(5)

not_run: afterBalance = Mobile.getText(findTestObject('Main/mainAccountsBalanceTxt'), 0)

not_run: newAfterBalance = afterBalance.replaceAll('[^0-9.]', '')

not_run: newAccountBalance = accountBalance.replaceAll('[^0-9.]', '')

not_run: float newAfterBalanceF = Float.parseFloat(newAfterBalance)

not_run: float newAccountBalanceF = Float.parseFloat(newAccountBalance)

not_run: println(afterBalance)

not_run: println(accountBalance)

not_run: println(newAfterBalance)

not_run: println(newAccountBalance)

not_run: String value_1 =  findTestData('TestData').getValue(4, 30)

not_run: value_2 = value_1.replaceAll('[^0-9.]', '')

not_run: float newValue = Float.parseFloat(value_2)

not_run: float newBalance = newAccountBalanceF - newValue

not_run: println(newBalance)

not_run: assert newBalance.round(2) == newAfterBalanceF

not_run: Mobile.delay(5)

