
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

Mobile.waitForElementPresent(findTestObject('Object Repository/Maybank2u/Cards/Step 6/cardsCCApplyStep6MonthNetIncTitleTxt'), 
    0)

Mobile.verifyElementText(findTestObject('Object Repository/Maybank2u/Cards/Step 6/cardsCCApplyStep6MonthNetIncTitleTxt'), 
    findTestData('TestData').getValue(2, 60))

Mobile.setText(findTestObject('Object Repository/Maybank2u/Cards/Step 6/cardsCCApplyStep6MonthNetIncTxt'), findTestData(
        'TestData').getValue(4, 60), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Maybank2u/Cards/Step 6/cardsCCApplyStep6MonthCommitTitleTxt'), 
    findTestData('TestData').getValue(2, 61))

Mobile.setText(findTestObject('Object Repository/Maybank2u/Cards/Step 6/cardsCCApplyStep6MonthCommitTxt'), findTestData(
        'TestData').getValue(4, 61), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Maybank2u/Cards/Step 6/cardsCCApplyStep6IncSourceAftTitleTxt'), 
    findTestData('TestData').getValue(2, 62))

Mobile.tap(findTestObject('Object Repository/Maybank2u/Cards/Step 6/cardsCCApplyStep6IncSourceAftSelectedTxt'), 0)

Mobile.scrollToText(findTestData('TestData').getValue(4, 62))

Mobile.tap(findTestObject('Maybank2u/Cards/Step 4/mainDropdownOption', [('value') : findTestData('TestData').getValue(4, 
                62)]), 0)

Mobile.tap(findTestObject('Object Repository/Main/mainCalenderPickerDoneBtn'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Maybank2u/Cards/Step 6/cardsCCApplyStep6StateDeliSelectedTxt'), 
    0)

Mobile.verifyElementText(findTestObject('Object Repository/Maybank2u/Cards/Step 6/cardsCCApplyStep6StateDeliTitleTxt'), 
    findTestData('TestData').getValue(2, 63))

Mobile.tap(findTestObject('Object Repository/Maybank2u/Cards/Step 6/cardsCCApplyStep6StateDeliSelectedTxt'), 0)

Mobile.scrollToText(findTestData('TestData').getValue(4, 63))

Mobile.tap(findTestObject('Maybank2u/Cards/Step 4/mainDropdownOption', [('value') : findTestData('TestData').getValue(4, 
                63)]), 0)

Mobile.tap(findTestObject('Object Repository/Main/mainCalenderPickerDoneBtn'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Maybank2u/Cards/Step 6/cardsCCApplyStep6CardCollectionSelectedTxt'), 
    0)

Mobile.verifyElementText(findTestObject('Object Repository/Maybank2u/Cards/Step 6/cardsCCApplyStep6CardCollectionTitleTxt'), 
    findTestData('TestData').getValue(2, 64))

Mobile.tap(findTestObject('Object Repository/Maybank2u/Cards/Step 6/cardsCCApplyStep6CardCollectionSelectedTxt'), 0)

Mobile.scrollToText(findTestData('TestData').getValue(4, 64))

Mobile.tap(findTestObject('Maybank2u/Cards/Step 4/mainDropdownOption', [('value') : findTestData('TestData').getValue(4, 
                64)]), 0)

Mobile.tap(findTestObject('Object Repository/Main/mainCalenderPickerDoneBtn'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Maybank2u/Cards/Step 6/cardsCCApplyStep6SaveContinueBtn'), 
    0)

Mobile.tap(findTestObject('Object Repository/Maybank2u/Cards/Step 6/cardsCCApplyStep6SaveContinueBtn'), 0)

