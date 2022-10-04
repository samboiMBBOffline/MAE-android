import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.Proxy.ProxyType as ProxyType
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.keyword.excel.ExcelKeywords as ExcelKeywords
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

Mobile.startApplication('/Users/a00139272/Katalon Studio/MAE/androidapp/app-sit-universal-release-copy.apk', false)

RunConfiguration.setMobileDriverPreferencesProperty('appPackage', 'com.maybank2u.life.sit')

RunConfiguration.setMobileDriverPreferencesProperty('appActivity', 'com.maybank2u.life.sit.MainActivity')

String newDate = CustomKeywords.'com.my.keywords.android.dateKeywords.getDate'()

println(newDate)

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

    Mobile.delay(2)
}

Mobile.verifyElementVisible(findTestObject('Banking/m2uAccountTypeSelection', [('text') : 'MAE']), 10)

Mobile.tap(findTestObject('Banking/m2uAccountTypeSelection', [('text') : 'MAE']), 10)

Mobile.delay(5)

Mobile.tap(findTestObject('Banking/m2uAccountTransferIconSelect'), 0)

Mobile.delay(3)

if (Mobile.verifyElementVisible(findTestObject('Tabung/tabungEnterPasswordTxt'), 0, FailureHandling.OPTIONAL)) {
    Mobile.setText(findTestObject('Tabung/tabungSignInInputPasswordField'), Password, 0)

    Mobile.hideKeyboard()

    Mobile.tap(findTestObject('Tabung/tabungSignInContinueBtn'), 0)
}

Mobile.delay(3)

Mobile.tap(findTestObject('ASNB/transferASNBTopBtn'), 0)

Mobile.tap(findTestObject('ASNB/asnbTransferBtn'), 0)

Mobile.verifyElementExist(findTestObject('ASNB/transferASNBProductNameTitleTxt'), 0)

Mobile.verifyElementExist(findTestObject('ASNB/transferASNBProductNameSelectTxt', [('productName') : productNameInitial]), 
    0)

Mobile.tap(findTestObject('ASNB/asnbSelectProductDropdown'), 0)

Mobile.verifyElementText(findTestObject('ASNB/asnbProductEquity3DropdownSelection', [('productType') : productType]), productType)

Mobile.tap(findTestObject('ASNB/asnbProductEquity3DropdownSelection', [('productType') : productType]), 0)

Mobile.tap(findTestObject('Main/mainCalenderPickerDoneBtn'), 0)

Mobile.verifyElementText(findTestObject('ASNB/transferASNBProductNameSelectTxt', [('productName') : productType]), productType)

Mobile.verifyElementExist(findTestObject('ASNB/SelectASNBMember', [('idSelectType') : productNameInitial]), 0)

Mobile.verifyElementExist(findTestObject('ASNB/transferASNBIDTypeTitleTxt'), 0)

Mobile.tap(findTestObject('Object Repository/ASNB/SelectASNBMember', [('idSelectType') : productNameInitial]), 0)

Mobile.verifyElementText(findTestObject('ASNB/asnbIDTypeDropdown', [('idType') : idType]), idType)

Mobile.tap(findTestObject('ASNB/asnbIDTypeDropdown', [('idType') : idType]), 0)

Mobile.tap(findTestObject('Main/mainCalenderPickerDoneBtn'), 0)

Mobile.verifyElementText(findTestObject('ASNB/SelectASNBMember', [('idSelectType') : idType]), idType)

Mobile.verifyElementExist(findTestObject('ASNB/transferASNBIDNumberTitleTxt'), 0)

Mobile.verifyElementExist(findTestObject('ASNB/transferASNBIDNumberPlaceholderTxt', [('id') : idPlaceholder]), 0)

Mobile.setText(findTestObject('ASNB/asnbIDNumberInputField'), idNo, 0)

Mobile.hideKeyboard()

Mobile.verifyElementText(findTestObject('ASNB/transferASNBIDNumberPlaceholderTxt', [('id') : idNo]), idNo)

Mobile.verifyElementExist(findTestObject('ASNB/transferASNBMemberNumberTitleTxt'), 0)

Mobile.verifyElementExist(findTestObject('ASNB/transferASNBMemberNumberPlaceholderTxt', [('member') : memberNoPlaceholder]), 
    0)

Mobile.setText(findTestObject('ASNB/asnbMembershipNoInputField'), asnbMemberNo, 0)

Mobile.hideKeyboard()

Mobile.verifyElementText(findTestObject('ASNB/transferASNBMemberNumberPlaceholderTxt', [('member') : accNo]), accNo)

Mobile.verifyElementExist(findTestObject('ASNB/transferASNBRelationshipTitleTxt'), 0)

Mobile.verifyElementExist(findTestObject('ASNB/transferASNBRelationshipSelectTxt', [('relationship') : productNameInitial]), 
    0)

Mobile.tap(findTestObject('ASNB/asnbRelationshipDropdownSelection'), 0)

Mobile.verifyElementText(findTestObject('ASNB/asnbRelationParentDropdownSelection', [('relationships') : relationship]), 
    relationship)

Mobile.tap(findTestObject('ASNB/asnbRelationParentDropdownSelection', [('relationships') : relationship]), 0)

Mobile.tap(findTestObject('Main/mainCalenderPickerDoneBtn'), 0)

Mobile.verifyElementText(findTestObject('ASNB/transferASNBRelationshipSelectTxt', [('relationship') : relationship]), relationship)

Mobile.verifyElementExist(findTestObject('ASNB/transferASNBPurposeTitleTxt'), 0)

Mobile.verifyElementExist(findTestObject('ASNB/transferASNBPurposeSelectTxt', [('purpose') : productNameInitial]), 0)

Mobile.tap(findTestObject('ASNB/asnbPurposeDropdownSelection'), 0)

Mobile.verifyElementText(findTestObject('ASNB/asnbPurposeSavingDropdownSelection', [('purposes') : purpose]), purpose)

Mobile.tap(findTestObject('ASNB/asnbPurposeSavingDropdownSelection', [('purposes') : purpose]), 0)

Mobile.tap(findTestObject('Main/mainCalenderPickerDoneBtn'), 0)

Mobile.verifyElementText(findTestObject('ASNB/transferASNBPurposeSelectTxt', [('purpose') : purpose]), purpose)

Mobile.tap(findTestObject('ASNB/asnbContinueBtn'), 0)

Mobile.delay(2)

Mobile.verifyElementText(findTestObject('ASNB/transferASNBAmountAccountNameTxt'), accName)

Mobile.verifyElementText(findTestObject('ASNB/transferASNBAmountAccountNoTxt', [('accNo') : accNo]), accNo)

Mobile.verifyElementText(findTestObject('ASNB/transferASNBAmountAccountTypeTxt', [('accType') : productType]), productType)

Mobile.verifyElementExist(findTestObject('ASNB/transferASNBAmountCurrencyTxt'), 0)

Mobile.verifyElementExist(findTestObject('ASNB/transferASNBAmountEnterAmountTitleTxt'), 0)

Mobile.verifyElementExist(findTestObject('ASNB/transferASNBAmountValueTxt', [('value') : initialValue]), 0)

Mobile.tap(findTestObject('Login Onboarding/PIN4'), 0)

Mobile.delay(2)

Mobile.verifyElementText(findTestObject('ASNB/transferASNBAmountValueTxt', [('value') : value]), value)

Mobile.tap(findTestObject('ASNB/asnbAmountTickBtn'), 0)

Mobile.delay(2)

Mobile.verifyElementText(findTestObject('ASNB/transferASNBConfirmationAccountNameTxt'), accName)

Mobile.verifyElementText(findTestObject('ASNB/transferASNBConfirmationAccountNoTxt', [('accNoC') : accNo]), accNo)

Mobile.verifyElementText(findTestObject('ASNB/transferASNBConfirmationAmountTxt', [('amount') : amount]), amount)

Mobile.verifyElementExist(findTestObject('ASNB/transferASNBConfirmationDateTitleTxt'), 0)

Mobile.verifyElementExist(findTestObject('ASNB/transferASNBConfirmationProductNameTitleTxt'), 0)

Mobile.verifyElementExist(findTestObject('ASNB/transferASNBConfirmationPurposeTitleTxt'), 0)

Mobile.verifyElementExist(findTestObject('ASNB/transferASNBConfirmationRelationshipTitleTxt'), 0)

Mobile.verifyElementExist(findTestObject('ASNB/transferASNBConfirmationTransferTypeTitleTxt'), 0)

Mobile.verifyElementText(findTestObject('ASNB/transferASNBConfirmationTransferTypeTxt', [('transferType') : transferType]), 
    transferType)

Mobile.verifyElementText(findTestObject('ASNB/transferASNBConfirmationRelationshipTxt', [('relationshipC') : relationship]), 
    relationship)

Mobile.verifyElementText(findTestObject('ASNB/transferASNBConfirmationPurposeTxt', [('purposeC') : purpose]), purpose)

Mobile.verifyElementText(findTestObject('ASNB/transferASNBConfirmationProductNameTxt', [('productTypeC') : productType]), 
    productType)

Mobile.verifyElementText(findTestObject('ASNB/transferASNBConfirmationDateTxt', [('date') : newDate]), newDate)

device_Height_2 = Mobile.getDeviceHeight()

device_Width_2 = Mobile.getDeviceWidth()

int startX_2 = device_Width_2 / 2

int endX_2 = startX_2

int startY_2 = device_Height_2 * 0.30

int endY_2 = device_Height_2 * 0.70

Mobile.swipe(startX_2, endY_2, endX_2, startY_2)

Mobile.verifyElementExist(findTestObject('ASNB/transferASNBConfirmationNoteTitleTxt'), 0)

Mobile.verifyElementExist(findTestObject('ASNB/transferASNBConfirmationNote1Txt'), 0)

Mobile.verifyElementExist(findTestObject('ASNB/transferASNBConfirmationNote1ContentTxt'), 0)

Mobile.verifyElementExist(findTestObject('ASNB/transferASNBConfirmationNote2Txt'), 0)

Mobile.verifyElementExist(findTestObject('ASNB/transferASNBConfirmationNote2ContentTxt'), 0)

Mobile.verifyElementExist(findTestObject('ASNB/transferASNBConfirmationNote3Txt'), 0)

Mobile.verifyElementExist(findTestObject('ASNB/transferASNBConfirmationNote3ContentTxt'), 0)

Mobile.verifyElementText(findTestObject('Transfer/transferConfirmationFromAccTypeTxt'), accType)

Mobile.verifyElementText(findTestObject('Transfer/transferConfirmationFromAccNoTxt'), accNoFrom)

Mobile.verifyElementExist(findTestObject('Transfer/transferConfirmationFromAccBalanceTxt'), 0)

accountBalance = Mobile.getText(findTestObject('Transfer/transferConfirmationFromAccBalanceTxt'), 0)

println(accountBalance)

Mobile.tap(findTestObject('ASNB/asnbTransferNowBtn'), 0)

if (Mobile.verifyElementVisible(findTestObject('Main/mainTACNumberTxt'), 10, FailureHandling.OPTIONAL)) {
    def OTP1 = Mobile.getText(findTestObject('Transfer/duitNowTACNumber'), 0)

    for (def i = 16; i <= 21; i++) {
        if ((OTP1[i]) == '0') {
            Mobile.tap(findTestObject('Login Onboarding/PIN0'), 0)
        }
        
        if ((OTP1[i]) == '1') {
            Mobile.tap(findTestObject('Login Onboarding/PIN1'), 0)
        }
        
        if ((OTP1[i]) == '2') {
            Mobile.tap(findTestObject('Login Onboarding/PIN2'), 0)
        }
        
        if ((OTP1[i]) == '3') {
            Mobile.tap(findTestObject('Login Onboarding/PIN3'), 0)
        }
        
        if ((OTP1[i]) == '4') {
            Mobile.tap(findTestObject('Login Onboarding/PIN4'), 0)
        }
        
        if ((OTP1[i]) == '5') {
            Mobile.tap(findTestObject('Login Onboarding/PIN5'), 0)
        }
        
        if ((OTP1[i]) == '6') {
            Mobile.tap(findTestObject('Login Onboarding/PIN6'), 0)
        }
        
        if ((OTP1[i]) == '7') {
            Mobile.tap(findTestObject('Login Onboarding/PIN7'), 0)
        }
        
        if ((OTP1[i]) == '8') {
            Mobile.tap(findTestObject('Login Onboarding/PIN8'), 0)
        }
        
        if ((OTP1[i]) == '9') {
            Mobile.tap(findTestObject('Login Onboarding/PIN9'), 0)
        }
    }
    
    Mobile.delay(3)

    Mobile.tap(findTestObject('Main/mainTACTickBtn'), 0)

    Mobile.delay(5)
} else {
    Mobile.delay(5)

    Mobile.verifyElementVisible(findTestObject('Main/mainS2UApproveBtn'), 10)

    Mobile.tap(findTestObject('Main/mainS2UApproveBtn'), 0)
}

Mobile.delay(10)

Mobile.verifyElementExist(findTestObject('Festive Season/returnAngpaoStatusMessageTxt'), 0)

def message = Mobile.getText(findTestObject('Festive Season/returnAngpaoStatusMessageTxt'), 10)

println(message)

assert message == successTransactionMessage

Mobile.delay(5)

Mobile.verifyElementExist(findTestObject('Duit Now/duitNowSummaryDateTimeTitleTxt'), 0)

Mobile.verifyElementExist(findTestObject('Duit Now/duitNowSummaryRefernceIDTitleTxt'), 0)

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

ExcelKeywords.setValueToCellByIndex(sheet1, 4, 1, referenceID //index row column(4,1) = (5,2)
    )

ExcelKeywords.saveWorkbook(test, woorkbook1)

Mobile.delay(2)

Mobile.tap(findTestObject('Main/mainAddToFavBtn'), 0)

Mobile.delay(2)

Mobile.tap(findTestObject('Main/mainAddToFavBtn'), 0)

if (Mobile.verifyElementVisible(findTestObject('Main/mainTACNumberTxt'), 10, FailureHandling.OPTIONAL)) {
    def OTP1 = Mobile.getText(findTestObject('Transfer/duitNowTACNumber'), 0)

    for (def i = 16; i <= 21; i++) {
        if ((OTP1[i]) == '0') {
            Mobile.tap(findTestObject('Login Onboarding/PIN0'), 0)
        }
        
        if ((OTP1[i]) == '1') {
            Mobile.tap(findTestObject('Login Onboarding/PIN1'), 0)
        }
        
        if ((OTP1[i]) == '2') {
            Mobile.tap(findTestObject('Login Onboarding/PIN2'), 0)
        }
        
        if ((OTP1[i]) == '3') {
            Mobile.tap(findTestObject('Login Onboarding/PIN3'), 0)
        }
        
        if ((OTP1[i]) == '4') {
            Mobile.tap(findTestObject('Login Onboarding/PIN4'), 0)
        }
        
        if ((OTP1[i]) == '5') {
            Mobile.tap(findTestObject('Login Onboarding/PIN5'), 0)
        }
        
        if ((OTP1[i]) == '6') {
            Mobile.tap(findTestObject('Login Onboarding/PIN6'), 0)
        }
        
        if ((OTP1[i]) == '7') {
            Mobile.tap(findTestObject('Login Onboarding/PIN7'), 0)
        }
        
        if ((OTP1[i]) == '8') {
            Mobile.tap(findTestObject('Login Onboarding/PIN8'), 0)
        }
        
        if ((OTP1[i]) == '9') {
            Mobile.tap(findTestObject('Login Onboarding/PIN9'), 0)
        }
    }
    
    Mobile.delay(3)

    Mobile.tap(findTestObject('Main/mainTACTickBtn'), 0)

    Mobile.delay(5)
} else {
    Mobile.delay(5)

    Mobile.verifyElementVisible(findTestObject('Main/mainS2UApproveBtn'), 10)

    Mobile.tap(findTestObject('Main/mainS2UApproveBtn'), 0)
}

Mobile.delay(3)

Mobile.verifyElementVisible(findTestObject('Main/mainDoneBtn'), 0)

Mobile.tap(findTestObject('Main/mainDoneBtn'), 0)

//Mobile.delay(5)
//
//Mobile.tap(findTestObject('Main/mainTopLeftBackButton'), 0)
//
////Mobile.delay(5)
////
////Mobile.verifyElementVisible(findTestObject('Banking/m2uAccountTypeSelection', [('text') : 'MAE']), 0)
////
////Mobile.tap(findTestObject('Banking/m2uAccountTypeSelection', [('text') : 'MAE']), 10)
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

