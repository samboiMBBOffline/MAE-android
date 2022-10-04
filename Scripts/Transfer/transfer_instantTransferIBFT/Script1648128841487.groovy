import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI


Mobile.startExistingApplication('com.maybank2u.life.sit')

//
//def start = 'Starts'
//
//println(start)

//Mobile.delay(5)
//

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
//Mobile.verifyElementVisible(findTestObject('Banking/m2uAccountTypeSelection', [('text') : accType]), 30)
//
//Mobile.tap(findTestObject('Banking/m2uAccountTypeSelection', [('text') : accType]), 10)
//
//Mobile.delay(5)

Mobile.verifyElementVisible(findTestObject('Banking/m2uAccountTransferIconSelect'), 0)

Mobile.tap(findTestObject('Banking/m2uAccountTransferIconSelect'), 0)

Mobile.delay(5)

if (Mobile.verifyElementVisible(findTestObject('Tabung/tabungEnterPasswordTxt'), 10, FailureHandling.OPTIONAL)) {
    Mobile.setText(findTestObject('Tabung/tabungSignInInputPasswordField'), findTestData('TestData').getValue(4, 1), 0)   //data files Testdata sheets Transfger

    Mobile.hideKeyboard()

    Mobile.tap(findTestObject('Tabung/tabungSignInContinueBtn'), 0)
}

println('InterBank Test Case Started')

Mobile.verifyElementExist(findTestObject('Banking/transferOthersTopMenuSelect'), 0)

Mobile.tap(findTestObject('Banking/transferOthersTopMenuSelect'), 0)

Mobile.tap(findTestObject('Banking/transferBanksIconSelect'), 0)

Mobile.scrollToText('PUBLIC BANK', FailureHandling.STOP_ON_FAILURE)

//data files TestData, sheet TRANSFER
Mobile.tap(findTestObject('Banking/transferBankSelection', [('text') : findTestData('TestData').getValue(4, 41)]), 10)

Mobile.setText(findTestObject('Banking/transferAccountNoInputField'), findTestData('TestData').getValue(4, 39), 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Login Onboarding/loginExistingContinueBtn'), 0)

Mobile.verifyElementText(findTestObject('Transfer/transferAmounttAccNoTxt', [('accNo') : findTestData('TestData').getValue(4, 42)]), findTestData('TestData').getValue(4, 42))

Mobile.verifyElementText(findTestObject('Transfer/transferAmounttAccBankTxt', [('accBank') : findTestData('TestData').getValue(4, 41)]), findTestData('TestData').getValue(4, 41))

Mobile.verifyElementExist(findTestObject('Transfer/transferAmountRMTxt'), 0)

Mobile.verifyElementExist(findTestObject('Duit Now/duitNowAmountInitialValueTxt'), 0)

Mobile.verifyElementExist(findTestObject('Transfer/transferAmountEnterAmountTitleTxt'), 0)

String trxAmount = findTestData('TestData').getValue(4, 47)

def length = trxAmount.length()

Mobile.delay(5)

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

WebUI.delay(3)

Mobile.verifyElementText(findTestObject('Transfer/transferAmountInputValueTxt', [('value') : findTestData('TestData').getValue(4, 48)]), findTestData('TestData').getValue(4, 48))

Mobile.delay(3)

Mobile.tap(findTestObject('Login Onboarding/loginPinTickBtn'), 0)

WebUI.delay(3)

Mobile.verifyElementText(findTestObject('Transfer/transferReferenceAccNoTxt', [('accNo') : findTestData('TestData').getValue(4, 42)]), findTestData('TestData').getValue(4, 42))

Mobile.verifyElementText(findTestObject('Transfer/transferReferenceAccBankTxt', [('accBank') : findTestData('TestData').getValue(4, 41)]), findTestData('TestData').getValue(4, 41))

Mobile.verifyElementExist(findTestObject('Transfer/transferReferenceInputField'), 0)

Mobile.setText(findTestObject('Banking/transferReferenceInputField'), findTestData('TestData').getValue(4, 49), 0)

Mobile.hideKeyboard()

Mobile.verifyElementText(findTestObject('Transfer/transferReferenceInputFieldAfter', [('reference') : findTestData('TestData').getValue(4, 49)]), findTestData('TestData').getValue(4, 49))

Mobile.tap(findTestObject('Login Onboarding/loginExistingContinueBtn'), 0)

Mobile.verifyElementText(findTestObject('Transfer/transferReferenceAccNoTxt', [('accNo') : findTestData('TestData').getValue(4, 42)]), findTestData('TestData').getValue(4, 42))

Mobile.verifyElementText(findTestObject('Transfer/transferReferenceAccBankTxt', [('accBank') : findTestData('TestData').getValue(4, 41)]), findTestData('TestData').getValue(4, 41))

Mobile.tap(findTestObject('Banking/transferTypeDropdownSelection'), 0)

Mobile.scrollToText('Fund Transfer', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Banking/tansferTypeFundDropdownSelection'), 0)

Mobile.tap(findTestObject('Banking/transferModeDropdownDoneBtn'), 0)

Mobile.delay(3)

Mobile.verifyElementExist(findTestObject('Transfer/instantTransferModeDuitTxt', [('mode') : findTestData('TestData').getValue(4, 45)]), 0)

Mobile.tap(findTestObject('Banking/transferModeDropdownDoneBtn'), 0)

Mobile.delay(3)

Mobile.verifyElementExist(findTestObject('Transfer/instantTransferModeDuitTxt', [('mode') : findTestData('TestData').getValue(4, 46)]), 0)

Mobile.verifyElementExist(findTestObject('Transfer/instantTransferModeTitleTxt'), 0)

Mobile.verifyElementExist(findTestObject('Transfer/instantTransferTypeFundTxt'), 0)

Mobile.verifyElementExist(findTestObject('Transfer/instantTransferTypeTitleTxt'), 0)

Mobile.tap(findTestObject('Login Onboarding/loginExistingContinueBtn'), 0)

Mobile.delay(5)

Mobile.verifyElementText(findTestObject('Transfer/instantIBGNameAccountNoTxt', [('accNo') : findTestData('TestData').getValue(4, 42)]), findTestData('TestData').getValue(4, 42))

Mobile.verifyElementText(findTestObject('Transfer/instantIBGNameAccountBankTxt', [('accBank') : findTestData('TestData').getValue(4, 41)]), findTestData('TestData').getValue(4, 41))

Mobile.verifyElementExist(findTestObject('Transfer/instantIBGNameEnterNameTitleTxt'), 0)

Mobile.setText(findTestObject('Banking/transferReferenceInputField'), findTestData('TestData').getValue(4, 40), 0)

Mobile.hideKeyboard()

Mobile.verifyElementText(findTestObject('Transfer/instantIBGNameInputtedNameTxt', [('accName') : findTestData('TestData').getValue(4, 40)]), findTestData('TestData').getValue(4, 40))

Mobile.tap(findTestObject('Login Onboarding/loginExistingContinueBtn'), 0)

'Verify confirmation page'
Mobile.delay(5)

Mobile.verifyElementText(findTestObject('Transfer/transferConfirmationTransactionDateTxt'), findTestData('TestData').getValue(4, 50))

Mobile.verifyElementText(findTestObject('Transfer/transferConfirmationAccountNameTxt', [('accName') : findTestData('TestData').getValue(4, 40)]), findTestData('TestData').getValue(4, 40))

Mobile.verifyElementText(findTestObject('Transfer/transferConfirmationAccountNoTxt', [('accNo') : findTestData('TestData').getValue(4, 42)]), findTestData('TestData').getValue(4, 42))

Mobile.verifyElementText(findTestObject('Transfer/transferConfirmationAmountTxt', [('amount') : findTestData('TestData').getValue(4, 41)]), findTestData('TestData').getValue(4, 41))

Mobile.verifyElementText(findTestObject('Transfer/transferConfirmationTransactionRecRefTxt', [('reference') : findTestData('TestData').getValue(4, 49)]), findTestData('TestData').getValue(4, 49))

Mobile.verifyElementText(findTestObject('Transfer/transferConfirmationTransactionBankTxt', [('accBank') : findTestData('TestData').getValue(4, 41)]), findTestData('TestData').getValue(4, 41))

Mobile.verifyElementText(findTestObject('Transfer/transferConfirmationOptionalGreyWordTxt'), 'Optional')

Mobile.verifyElementText(findTestObject('Transfer/instantTransferConfirmationTransactionTypeTxt'), findTestData('TestData').getValue(4, 53))

Mobile.verifyElementText(findTestObject('Transfer/instantTransferConfirmationTransactionModeTxt', [('modeC') : findTestData('TestData').getValue(4, 46)]), 
    findTestData('TestData').getValue(4, 46))

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

Mobile.setText(findTestObject('Transfer/transferConfirmationDetailsInputField'), findTestData('TestData').getValue(4, 56), 0)

Mobile.hideKeyboard()

Mobile.verifyElementText(findTestObject('Transfer/transferConfirmationOptionalGreyWordTxt'), findTestData('TestData').getValue(4, 56))

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

Mobile.verifyElementText(findTestObject('Transfer/transferConfirmationFromAccTypeTxt', [('accType') : findTestData('TestData').getValue(4, 55)]), findTestData('TestData').getValue(4, 55))

Mobile.verifyElementText(findTestObject('Transfer/transferConfirmationFromAccNoTxt', [('accNoFrom') : findTestData('TestData').getValue(4, 57)]), findTestData('TestData').getValue(4, 57))

Mobile.verifyElementExist(findTestObject('Transfer/transferConfirmationFromAccBalanceTxt'), 0)

accountBalance = Mobile.getText(findTestObject('Transfer/transferConfirmationFromAccBalanceTxt'), 0)

println(accountBalance)

Mobile.tap(findTestObject('Main/mainTransferNowBtn'), 0)

Mobile.delay(5)

if (findTestData('TestData').getValue(4, 47) <= findTestData('TestData').getValue(4, 52)) {
    if (Mobile.verifyElementVisible(findTestObject('Festive Season/seasonalGreetingAngpaoTACNoTxt'), 10, FailureHandling.OPTIONAL)) {
        def OTP = Mobile.getText(findTestObject('Festive Season/seasonalGreetingAngpaoTACNoTxt'), 10)

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

        //Mobile.tap(findTestObject('others/maeTopupAmountTickBtn'), 0) 
		Mobile.tap(findTestObject('Festive Season/festiveSendGreetingAngpaoTACTickBtn'), 0)
		
    } else {
		
        Mobile.delay(3)

        Mobile.verifyElementVisible(findTestObject('Main/mainS2UApproveBtn'), 0)

        Mobile.tap(findTestObject('Main/mainS2UApproveBtn'), 0)
    }
}

Mobile.delay(5)

Mobile.verifyElementExist(findTestObject('Festive Season/returnAngpaoStatusMessageTxt'), 0)

def message = Mobile.getText(findTestObject('Festive Season/returnAngpaoStatusMessageTxt'), 10)

println(message)

assert message == findTestData('TestData').getValue(4, 44)

Mobile.delay(5)

if (findTestData('TestData').getValue(4, 47) > findTestData('TestData').getValue(4, 52)) {
    Mobile.verifyElementExist(findTestObject('Main/mainSummaryTransactionLimitErrorTxt'), 0)

    Mobile.verifyElementExist(findTestObject('Duit Now/duitNowSummaryDateTimeTitleTxt'), 0)

    Mobile.verifyElementExist(findTestObject('Duit Now/duitNowSummaryRefernceIDTitleTxt'), 0)
} else {
    Mobile.verifyElementExist(findTestObject('Transfer/transferSummaryDateTimeTitleTxt'), 0)

    Mobile.verifyElementExist(findTestObject('Transfer/transferSummaryRefIDTitleTxt'), 0)

    Mobile.verifyElementExist(findTestObject('Transfer/transferSummaryShareReceiptBtn'), 0)
}

Mobile.delay(5)

//referenceID = Mobile.getText(findTestObject('Send Request Money/requestMoneyPaySummaryRefIDTxt'), 0)
//
//println(referenceID)
//
//String test = GlobalVariable.dataFolder
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
//    )
//
//ExcelKeywords.saveWorkbook(test, woorkbook1)

//Mobile.takeScreenshot("/Users/a00139272/Desktop/Screenshot/instantIBG.png")

Mobile.verifyElementVisible(findTestObject('Main/mainDoneBtn'), 0)

Mobile.tap(findTestObject('Main/mainDoneBtn'), 0)

if (findTestData('TestData').getValue(4, 47) < findTestData('TestData').getValue(4, 52)) {
    Mobile.delay(5)

    Mobile.tap(findTestObject('Main/mainTopLeftBackButton'), 0)

    Mobile.delay(5)

    Mobile.verifyElementVisible(findTestObject('Banking/m2uAccountTypeSelection', [('text') : findTestData('TestData').getValue(4, 43)]), 0)

    Mobile.tap(findTestObject('Banking/m2uAccountTypeSelection', [('text') : findTestData('TestData').getValue(4, 43)]), 10)

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
}