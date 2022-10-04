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
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.keyword.excel.ExcelKeywords as ExcelKeywords

RunConfiguration.setMobileDriverPreferencesProperty('appPackage', 'com.maybank2u.life.sit')

RunConfiguration.setMobileDriverPreferencesProperty('appActivity', 'com.maybank2u.life.MainActivity')

if (GlobalVariable.isApplicationOpened == false) {
    Mobile.startApplication(GlobalVariable.appPath, false)
}

Mobile.delay(5)

device_Height = Mobile.getDeviceHeight()

device_Width = Mobile.getDeviceWidth()

int startX = device_Width / 3

int startY = device_Height * 0.97

Mobile.tapAtPosition(startX, startY)

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

Mobile.verifyElementVisible(findTestObject('Banking/m2uAccountTypeSelection', [('text') : 'MAE']), 0)

Mobile.tap(findTestObject('Banking/m2uAccountTypeSelection', [('text') : 'MAE']), 10)

Mobile.delay(5)

Mobile.verifyElementVisible(findTestObject('Banking/m2uAccountTransferIconSelect'), 0)

Mobile.tap(findTestObject('Banking/m2uAccountTransferIconSelect'), 0)

Mobile.delay(5)

if (Mobile.verifyElementVisible(findTestObject('Tabung/tabungEnterPasswordTxt'), 0, FailureHandling.OPTIONAL)) {
    Mobile.setText(findTestObject('Tabung/tabungSignInInputPasswordField'), Password, 0)

    Mobile.hideKeyboard()

    Mobile.tap(findTestObject('Tabung/tabungSignInContinueBtn'), 0)
}

//Mobile.tap(findTestObject('Banking/transferOthersTopMenuSelect'), 0)

Mobile.delay(3)

'Verify content (Name, Account No, Bank)'
//Mobile.scrollToText(accName)

WebUI.callTestCase(findTestCase('Pages/Transfer'), [('index') : '1'], FailureHandling.CONTINUE_ON_FAILURE)

//Mobile.verifyElementText(findTestObject('Transfer/transferFavListAccNameTxt', [('accName') : accName]), accName)
//
//Mobile.verifyElementText(findTestObject('Transfer/transferFavListAccNoTxt', [('accNo') : accNo]), accNo)
//
//Mobile.verifyElementText(findTestObject('Transfer/transferFavListAccBankTxt', [('accBank') : accBank]), accBank)
//
//Mobile.tap(findTestObject('Transfer/transferFavListAccNameTxt', [('accName') : accName]), 0)

Mobile.delay(3)

Mobile.verifyElementText(findTestObject('Transfer/transferAmounttAccNameTxt', [('accName') : accName]), accName)

Mobile.verifyElementText(findTestObject('Transfer/transferAmounttAccNoTxt', [('accNo') : accNo]), accNo)

Mobile.verifyElementText(findTestObject('Transfer/transferAmounttAccBankTxt', [('accBank') : accBank]), accBank)

Mobile.verifyElementExist(findTestObject('Transfer/transferAmountRMTxt'), 0)

Mobile.verifyElementExist(findTestObject('Transfer/transferAmountEnterAmountTitleTxt'), 0)

Mobile.verifyElementExist(findTestObject('Login Onboarding/PIN4'), 0)

Mobile.tap(findTestObject('Login Onboarding/PIN4'), 0)

Mobile.verifyElementText(findTestObject('Transfer/transferAmountInputValueTxt', [('value'): checkValue]), checkValue)

Mobile.delay(3)

Mobile.tap(findTestObject('Login Onboarding/loginPinTickBtn'), 0)

Mobile.verifyElementText(findTestObject('Transfer/transferReferenceAccNameTxt', [('accName') : accName]), accName)

Mobile.verifyElementText(findTestObject('Transfer/transferReferenceAccNoTxt', [('accNo') : accNo]), accNo)

Mobile.verifyElementText(findTestObject('Transfer/transferReferenceAccBankTxt', [('accBank') : accBank]), accBank)

Mobile.verifyElementExist(findTestObject('Transfer/transferReferenceInputField'), 0)

Mobile.setText(findTestObject('Banking/transferReferenceInputField'), reference, 0)

Mobile.hideKeyboard()

Mobile.verifyElementText(findTestObject('Transfer/transferReferenceInputFieldAfter', [('reference'): reference]), reference)

Mobile.tap(findTestObject('Login Onboarding/loginExistingContinueBtn'), 0)

Mobile.verifyElementText(findTestObject('Transfer/transferConfirmationAccountNameTxt', [('accName') : accName]), accName)

Mobile.verifyElementText(findTestObject('Transfer/transferConfirmationAccountNoTxt', [('accNo') : accNo]), accNo)

Mobile.verifyElementText(findTestObject('Transfer/transferConfirmationAmountTxt', [('amount'): amount]), amount)

Mobile.verifyElementText(findTestObject('Transfer/transferConfirmationTransactionDateTxt'), 'Today')

Mobile.verifyElementText(findTestObject('Transfer/transferConfirmationTransactionRecRefTxt', [('reference'): reference]), reference)

Mobile.verifyElementText(findTestObject('Transfer/transferConfirmationTransactionBankTxt', [('accBank') : accBank]), accBank)

Mobile.verifyElementText(findTestObject('Transfer/transferConfirmationOptionalGreyWordTxt'), 'Optional')

Mobile.verifyElementExist(findTestObject('Transfer/transferConfirmationBankNameTitleTxt'), 0)

Mobile.verifyElementExist(findTestObject('Transfer/transferConfirmationDateTitleTxt'), 0)

Mobile.verifyElementExist(findTestObject('Transfer/transferConfirmationFTransferFromTitleTxt'), 0)

Mobile.verifyElementExist(findTestObject('Transfer/transferConfirmationRecRefTitleTxt'), 0)

Mobile.verifyElementExist(findTestObject('Transfer/transferConfirmationPaymentDetailsTitleTxt'), 0)

Mobile.verifyElementExist(findTestObject('Transfer/transferConfirmationNoteTitleTxt'), 0)

Mobile.verifyElementExist(findTestObject('Transfer/transferConfirmationNoteContentTxt'), 0)

Mobile.tap(findTestObject('Transfer/transferConfirmationOptionalGreyWordTxt'), 0)

Mobile.setText(findTestObject('Transfer/transferConfirmationDetailsInputField'), referenceC, 0)

Mobile.hideKeyboard()

Mobile.verifyElementText(findTestObject('Transfer/transferConfirmationOptionalGreyWordTxt'), referenceC)

device_Height_2 = Mobile.getDeviceHeight()

device_Width_2 = Mobile.getDeviceWidth()

int startX_2 = device_Width_2 / 2

int endX_2 = startX_2

int startY_2 = device_Height_2 * 0.30

int endY_2 = device_Height_2 * 0.70

Mobile.swipe(startX_2, endY_2, endX_2, startY_2)

Mobile.verifyElementText(findTestObject('Transfer/transferConfirmationFromAccTypeTxt', [('accType') : accType]), accType)

Mobile.verifyElementText(findTestObject('Transfer/transferConfirmationFromAccNoTxt', [('accNoFrom') : accNoFrom]), accNoFrom)

Mobile.verifyElementExist(findTestObject('Transfer/transferConfirmationFromAccBalanceTxt'), 0)

accountBalance = Mobile.getText(findTestObject('Transfer/transferConfirmationFromAccBalanceTxt'), 0)

println(accountBalance)

Mobile.tap(findTestObject('Main/mainTransferNowBtn'), 0)

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

Mobile.takeScreenshot("/Users/a00139272/Desktop/Screenshot/thirdPartyFav.png")

Mobile.verifyElementVisible(findTestObject('Main/mainDoneBtn'), 0)

Mobile.tap(findTestObject('Main/mainDoneBtn'), 0)

Mobile.delay(5)

Mobile.tap(findTestObject('Main/mainTopLeftBackButton'), 0)

Mobile.delay(5)

Mobile.verifyElementVisible(findTestObject('Banking/m2uAccountTypeSelection', [('text') : accType]), 0)

Mobile.tap(findTestObject('Banking/m2uAccountTypeSelection', [('text') : accType]), 10)

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

String value_1 = checkValue

value_2 = value_1.replaceAll('[^0-9.]', '')

float newValue = Float.parseFloat(value_2)

float newBalance = newAccountBalanceF - newValue

println(newBalance)

assert newBalance.round(2) == newAfterBalanceF

Mobile.delay(5)