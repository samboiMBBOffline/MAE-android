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

Mobile.waitForElementPresent(findTestObject('Object Repository/Maybank2u/Cards/Step 5/cardsCCApplyGetStartedStep5OffAdd1TitleTxt'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Maybank2u/Cards/Step 5/cardsCCApplyGetStartedStep5OffAdd1TitleTxt'), findTestData('TestData').getValue(2, 52))

Mobile.setText(findTestObject('Object Repository/Maybank2u/Cards/Step 5/cardsCCApplyGetStartedStep5OffAdd1Txt'), findTestData('TestData').getValue(4, 52), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Maybank2u/Cards/Step 5/cardsCCApplyGetStartedStep5OffAdd2TitleTxt'), findTestData('TestData').getValue(2, 53))

Mobile.setText(findTestObject('Object Repository/Maybank2u/Cards/Step 5/cardsCCApplyGetStartedStep5OffAdd2Txt'), findTestData('TestData').getValue(4, 53), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Maybank2u/Cards/Step 5/cardsCCApplyGetStartedStep5OffAdd3TitleTxt'), findTestData('TestData').getValue(2, 54))

Mobile.setText(findTestObject('Object Repository/Maybank2u/Cards/Step 5/cardsCCApplyGetStartedStep5OffAdd3Txt'), findTestData('TestData').getValue(4, 54), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Maybank2u/Cards/Step 5/cardsCCApplyGetStartedStep5PostcodeTitleTxt'), findTestData('TestData').getValue(2, 55))

Mobile.setText(findTestObject('Object Repository/Maybank2u/Cards/Step 5/cardsCCApplyGetStartedStep5PostcodeTxt'), findTestData('TestData').getValue(4, 55), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Maybank2u/Cards/Step 5/cardsCCApplyGetStartedStep5CityTitleTxt'), findTestData('TestData').getValue(2, 56))

Mobile.setText(findTestObject('Object Repository/Maybank2u/Cards/Step 5/cardsCCApplyGetStartedStep5CityTxt'), findTestData('TestData').getValue(4, 56), 0)

Mobile.swipe(546, 1588, 546, 1082)

Mobile.verifyElementText(findTestObject('Object Repository/Maybank2u/Cards/Step 5/cardsCCApplyGetStartedStep5StateTitleTxt'), findTestData('TestData').getValue(2, 57))

Mobile.tap(findTestObject('Object Repository/Maybank2u/Cards/Step 5/cardsCCApplyGetStartedStep5StateSelectedDropdown'), 0)

Mobile.scrollToText(findTestData('TestData').getValue(4, 57))

Mobile.tap(findTestObject('Maybank2u/Cards/Step 4/mainDropdownOption', [('value') : findTestData('TestData').getValue(4,
	57)]), 0)

Mobile.tap(findTestObject('Object Repository/Main/mainCalenderPickerDoneBtn'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Maybank2u/Cards/Step 5/cardsCCApplyGetStartedStep5OffNumberPrefixTxt'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Maybank2u/Cards/Step 5/cardsCCApplyGetStartedStep5OffNumberTitleTxt'), findTestData('TestData').getValue(2, 58))

Mobile.setText(findTestObject('Object Repository/Maybank2u/Cards/Step 5/cardsCCApplyGetStartedStep5OffNumberTxt'), findTestData('TestData').getValue(4, 59), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Maybank2u/Cards/Step 5/cardsCCApplyGetStartedStep5SaveContinueBtn'), 0)

Mobile.tap(findTestObject('Object Repository/Maybank2u/Cards/Step 5/cardsCCApplyGetStartedStep5SaveContinueBtn'), 0)