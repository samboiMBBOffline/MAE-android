import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling

//import com.kms.katalon.keyword.excel.ExcelKeywords as ExcelKeywords
Mobile.startExistingApplication('com.maybank2u.life.uat', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Object Repository/Dashboard/mainBottomMenuMaybank2uBtn'), 0)

Mobile.tap(findTestObject('Object Repository/Dashboard/mainBottomMenuMaybank2uBtn'), 0)

if (Mobile.verifyElementVisible(findTestObject('Main/mainEnterPINMessage'), 0, FailureHandling.OPTIONAL)) {
    Mobile.tap(findTestObject('Login Onboarding/PIN1'), 0)

    Mobile.tap(findTestObject('Login Onboarding/PIN1'), 0)

    Mobile.tap(findTestObject('Login Onboarding/PIN1'), 0)

    Mobile.tap(findTestObject('Login Onboarding/PIN1'), 0)

    Mobile.tap(findTestObject('Login Onboarding/PIN1'), 0)

    Mobile.tap(findTestObject('Login Onboarding/PIN2'), 0)

    Mobile.delay(2)
}

Mobile.verifyElementVisible(findTestObject('Banking/m2uAccountTypeSelection', [('text') : findTestData('TestData').getValue(4, 2)]), 10)

Mobile.tap(findTestObject('Banking/m2uAccountTypeSelection', [('text') : findTestData('TestData').getValue(4, 2)]), 10)

Mobile.delay(3)

Mobile.verifyElementVisible(findTestObject('Banking/m2uAccountSendReqIconSelect'), 0)

Mobile.tap(findTestObject('Banking/m2uAccountSendReqIconSelect'), 0)

Mobile.delay(3)

Mobile.verifyElementVisible(findTestObject('Send Request Money/sendMoneyIconSelect'), 0)

Mobile.tap(findTestObject('Send Request Money/sendMoneyIconSelect'), 0)

Mobile.delay(3)

if (Mobile.verifyElementVisible(findTestObject('Tabung/tabungEnterPasswordTxt'), 0, FailureHandling.OPTIONAL)) {
    Mobile.setText(findTestObject('Tabung/tabungSignInInputPasswordField'), findTestData('TestData').getValue(4, 1), 0)

    Mobile.hideKeyboard()

    Mobile.tap(findTestObject('Tabung/tabungSignInContinueBtn'), 0)
}

Mobile.delay(5)

Mobile.waitForElementPresent(findTestObject('Send Request Money/sendMoneyContactIconSelect'), 0)

Mobile.tap(findTestObject('Send Request Money/sendMoneyContactIconSelect'), 0)

Mobile.delay(5)

Mobile.setText(findTestObject('Send Request Money/sendMoneyContactSearchInputField'), findTestData('TestData').getValue(4, 7), 0)

Mobile.delay(3)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Send Request Money/requestMoneyContactSelect', [('contactName') : findTestData('TestData').getValue(4, 7)]), 0)

Mobile.tap(findTestObject('Send Request Money/requestMoneyContactSelect', [('contactName') : findTestData('TestData').getValue(4, 7)]), 0)

Mobile.delay(3)

Mobile.tap(findTestObject('Login Onboarding/PIN4'), 0)

Mobile.delay(3)

Mobile.tap(findTestObject('Main/mainAmountTickBtn'), 0)

Mobile.delay(3)

Mobile.tap(findTestObject('Send Request Money/payMoneyConfirmationRequestSendNowBtn'), 0)

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

referenceID = Mobile.getText(findTestObject('Send Request Money/requestMoneyPaySummaryRefIDTxt'), 0)

println(referenceID)

//not_run: String test = GlobalVariable.dataFolder
//
//not_run: String sheetName = 'Sheet1'
//
//not_run: File file1 = new File(test)
//
//not_run: assert file1.exists() == true
//
//not_run: woorkbook1 = ExcelKeywords.getWorkbook(test)
//
//not_run: sheet1 = ExcelKeywords.getExcelSheet(woorkbook1, sheetName)
//
//not_run: ExcelKeywords.setValueToCellByIndex(sheet1, 0, 1, referenceID //index row column(0,1) = (1,2) 
//    )
//
//not_run: ExcelKeywords.saveWorkbook(test, woorkbook1)
def message = Mobile.getText(findTestObject('Main/mainTransactionStatusMessageTxt'), 10)

println(message)

Mobile.verifyElementExist(findTestObject('Main/mainDoneBtn'), 10)

Mobile.takeScreenshot('/Users/a00139272/Desktop/Screenshot/sendMoney.png')

Mobile.tap(findTestObject('Main/mainDoneBtn'), 0)

Mobile.delay(3)

