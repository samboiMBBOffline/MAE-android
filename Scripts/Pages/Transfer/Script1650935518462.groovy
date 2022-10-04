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

//sheets Transfer
if (index == '0') {
    Mobile.verifyElementExist(findTestObject('Banking/transferOthersTopMenuSelect'), 0)

    Mobile.tap(findTestObject('Banking/transferOthersTopMenuSelect'), 0)

    Mobile.tap(findTestObject('Banking/transferBanksIconSelect'), 0)
} else if (index == '1') {
    Mobile.tap(findTestObject('Banking/transferOthersTopMenuSelect'), 0)

    Mobile.delay(3)

    Mobile.tap(findTestObject('Object Repository/Transfer/othersFavInputField'), 0)

    Mobile.setText(findTestObject('Object Repository/Transfer/favInputtedSearchField'), findTestData('Test data').getValue(
            5, 3), 0)

    Mobile.hideKeyboard()

    Mobile.verifyElementText(findTestObject('Transfer/transferFavListAccNameTxt', [('accName') : findTestData('Test data').getValue(
                    5, 3)]), findTestData('Test data').getValue(5, 3))

    Mobile.verifyElementText(findTestObject('Transfer/transferFavListAccNoTxt', [('accNo') : findTestData('Test data').getValue(
                    5, 4)]), findTestData('Test data').getValue(5, 4))

    Mobile.verifyElementText(findTestObject('Transfer/transferFavListAccBankTxt', [('accBank') : findTestData('Test data').getValue(
                    4, 5)]), findTestData('Test data').getValue(4, 5))

    Mobile.tap(findTestObject('Transfer/transferFavListAccNameTxt', [('accName') : findTestData('Test data').getValue(5, 
                    3)]), 0)
} else if (index == '2') {
    Mobile.tap(findTestObject('Object Repository/Banking/transferDuitNowTopMenuSelect'), 0)

    Mobile.tap(findTestObject('Object Repository/Banking/duitNowOtherIconSelect'), 0)
	
//sheets Transfer
} else if (index == '3') {
    Mobile.verifyElementExist(findTestObject('Object Repository/Banking/transferSelfTopMenuSelect'), 0)

    Mobile.tap(findTestObject('Object Repository/Banking/transferSelfTopMenuSelect'), 0)

    Mobile.verifyElementText(findTestObject('Transfer/transferFavListAccNameTxt', [('accName') : findTestData('TestData').getValue(
                    4, 3)]), findTestData('TestData').getValue(4, 3))

    Mobile.verifyElementText(findTestObject('Transfer/transferFavListAccNoTxt', [('accNo') : findTestData('TestData').getValue(
                    4, 4)]), findTestData('TestData').getValue(4, 4))

    Mobile.tap(findTestObject('Transfer/transferFavListAccNameTxt', [('accName') : findTestData('TestData').getValue(4, 
                    4)]), 0)
} else if (index == '4') {
	Mobile.tap(findTestObject('Object Repository/Banking/transferDuitNowTopMenuSelect'), 0)
	
    Mobile.delay(3)

    Mobile.tap(findTestObject('Object Repository/Transfer/duitNowFavInputField'), 0)
	
    Mobile.setText(findTestObject('Object Repository/Transfer/favInputtedSearchField'), findTestData('Test data').getValue(
            4, 27), 0)

    Mobile.hideKeyboard()

    Mobile.verifyElementText(findTestObject('Transfer/transferFavListAccNameTxt', [('accName') : findTestData('Test data').getValue(
                    4, 27)]), findTestData('Test data').getValue(4, 27))

    Mobile.verifyElementText(findTestObject('Transfer/transferFavListAccNoTxt', [('accNo') : findTestData('Test data').getValue(
                    4, 28)]), findTestData('Test data').getValue(4, 28))

    Mobile.verifyElementText(findTestObject('Transfer/transferFavListAccBankTxt', [('accBank') : findTestData('Test data').getValue(
                    4, 29)]), findTestData('Test data').getValue(4, 29))

    Mobile.tap(findTestObject('Transfer/transferFavListAccNameTxt', [('accName') : findTestData('Test data').getValue(4, 
                    27)]), 0)
}