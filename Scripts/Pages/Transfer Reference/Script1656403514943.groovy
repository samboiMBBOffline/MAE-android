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

if (index == '0') {
    Mobile.verifyElementText(findTestObject('Object Repository/Transfer/transferAmounttAccNoTxt', [('accNo') : findTestData(
                    'TestData').getValue(4, 4)]), findTestData('TestData').getValue(4, 4))

    Mobile.verifyElementText(findTestObject('Object Repository/Transfer/transferAmounttAccNameTxt', [('accName') : findTestData(
                    'TestData').getValue(4, 3)]), findTestData('TestData').getValue(4, 3))

    Mobile.verifyElementText(findTestObject('Object Repository/Transfer/transferAmounttAccBankTxt', [('accBank') : findTestData(
                    'TestData').getValue(4, 5)]), findTestData('TestData').getValue(4, 5))

    Mobile.verifyElementText(findTestObject('Transfer/Own/transferOwnRefEnterMsgTxt'), findTestData('TestData').getValue(
            2, 9))

    Mobile.setText(findTestObject('Banking/transferReferenceInputField'), findTestData('TestData').getValue(4, 10), 0)
	
	Mobile.hideKeyboard()
	
	Mobile.verifyElementAttributeValue(findTestObject('Login Onboarding/loginExistingContinueBtn'),'enabled','true', 0)

    Mobile.tap(findTestObject('Login Onboarding/loginExistingContinueBtn'), 0)
}

