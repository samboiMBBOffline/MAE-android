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

Mobile.delay(5)

if (index == '0') {
	
	//datafiles TestData, sheets Transfer
    Mobile.verifyElementText(findTestObject('Transfer/transferConfirmationTransactionDateTxt'), findTestData('TestData').getValue(4, 13))
	
} else if (index == '1') {
    Mobile.tap(findTestObject('Transfer/transferConfirmationTransactionDateTxt'), 0)

    Mobile.tap(findTestObject('Main/mainCalenderPickerNextBtn'), 0)

    Mobile.delay(3)

    Mobile.tap(findTestObject('Main/mainDatePicker1'), 0)

    Mobile.tap(findTestObject('Main/mainCalenderPickerDoneBtn'), 0)
	
	Mobile.waitForElementNotPresent(findTestObject('Transfer/transferConfirmationTransactionDateTxt'), 0)

    Mobile.verifyElementNotExist(findTestObject('Transfer/transferConfirmationTransactionDateTxt'), 0)
}

Mobile.verifyElementText(findTestObject('Transfer/transferConfirmationAccountNameTxt', [('accName') : findTestData('TestData').getValue(
                4, 3)]), findTestData('TestData').getValue(4, 3))

Mobile.verifyElementText(findTestObject('Transfer/transferConfirmationAccountNoTxt', [('accNo') : findTestData('TestData').getValue(
                4, 4)]), findTestData('TestData').getValue(4, 4))

Mobile.verifyElementText(findTestObject('Transfer/transferConfirmationAmountTxt', [('amount') : findTestData('TestData').getValue(
                4, 12)]), findTestData('TestData').getValue(4, 12))

Mobile.verifyElementText(findTestObject('Transfer/transferConfirmationTransactionRecRefTxt', [('reference') : findTestData(
                'TestData').getValue(4, 14)]), findTestData('TestData').getValue(4, 14))

Mobile.verifyElementText(findTestObject('Transfer/transferConfirmationTransactionBankTxt', [('accBank') : findTestData('TestData').getValue(
                4, 15)]), findTestData('TestData').getValue(4, 15))

Mobile.verifyElementText(findTestObject('Transfer/transferConfirmationOptionalGreyWordTxt'), 'Optional')

Mobile.tap(findTestObject('Transfer/transferConfirmationOptionalGreyWordTxt'), 0)

Mobile.setText(findTestObject('Transfer/transferConfirmationDetailsInputField'), findTestData('TestData').getValue(4, 17), 
    0)

Mobile.hideKeyboard()

Mobile.verifyElementText(findTestObject('Transfer/transferConfirmationOptionalGreyWordTxt'), findTestData('TestData').getValue(
        4, 17))

Mobile.verifyElementExist(findTestObject('Object Repository/Transfer/Own/transferOwnConfirmationRefTitleTxt'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Transfer/Own/transferOwnConfirmationDateTitleTxt'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Transfer/Own/transferOwnConfirmationBankTitleTxt'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Transfer/Own/transferOwnConfirmationRefTitleTxt'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Transfer/Own/transferOwnConfirmationNoteTitleTxt'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Transfer/Own/transferOwnConfirmationNoteTxt'), findTestData('TestData').getValue(
        4, 18))

device_Height_2 = Mobile.getDeviceHeight()

device_Width_2 = Mobile.getDeviceWidth()

int startX_2 = device_Width_2 / 2

int endX_2 = startX_2

int startY_2 = device_Height_2 * 0.30

int endY_2 = device_Height_2 * 0.70

Mobile.swipe(startX_2, endY_2, endX_2, startY_2)

Mobile.verifyElementExist(findTestObject('Object Repository/Transfer/Own/transferOwnConfirmationTrfFromTitleTxt'), 0)

Mobile.verifyElementText(findTestObject('Transfer/transferConfirmationFromAccTypeTxt', [('accType') : findTestData('TestData').getValue(
                4, 19)]), findTestData('TestData').getValue(4, 19))

Mobile.verifyElementText(findTestObject('Transfer/transferConfirmationFromAccNoTxt', [('accNoFrom') : findTestData('TestData').getValue(
                4, 20)]), findTestData('TestData').getValue(4, 20))

Mobile.verifyElementExist(findTestObject('Transfer/transferConfirmationFromAccBalanceTxt'), 0)

accountBalance = Mobile.getText(findTestObject('Transfer/transferConfirmationFromAccBalanceTxt'), 0)

println(accountBalance)

Mobile.waitForElementPresent(findTestObject('Main/mainTransferNowBtn'), 0)

Mobile.tap(findTestObject('Main/mainTransferNowBtn'), 0)