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

Mobile.waitForElementPresent(findTestObject('Object Repository/Maybank2u/Cards/Step2/cardsCCApplyGetStartedStep2NameCardTitleTxt'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Maybank2u/Cards/Step2/cardsCCApplyGetStartedStep2NameCardTitleTxt'), findTestData('TestData').getValue(2, 28))

Mobile.setText(findTestObject('Object Repository/Maybank2u/Cards/Step2/cardsCCApplyGetStartedStep2NameCardTxt'), findTestData('TestData').getValue(4, 28), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Maybank2u/Cards/Step2/cardsCCApplyGetStartedStep2HousePhoneTitleTxt'), findTestData('TestData').getValue(2, 29))

Mobile.setText(findTestObject('Object Repository/Maybank2u/Cards/Step2/cardsCCApplyGetStartedStep2HousePhoneTxt'), findTestData('TestData').getValue(4, 30), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Maybank2u/Cards/Step2/cardsCCApplyGetStartedStep2GenderTitleTxt'), findTestData('TestData').getValue(2, 31))

Mobile.verifyElementText(findTestObject('Object Repository/Maybank2u/Cards/Step2/cardsCCApplyGetStartedStep2MaleTxt'), findTestData('TestData').getValue(4, 31))

Mobile.verifyElementText(findTestObject('Object Repository/Maybank2u/Cards/Step2/cardsCCApplyGetStartedStep2RaceTitleTxt'), findTestData('TestData').getValue(2, 32))

Mobile.verifyElementText(findTestObject('Object Repository/Maybank2u/Cards/Step2/cardsCCApplyGetStartedStep2RaceTxt'), findTestData('TestData').getValue(4, 32))

Mobile.verifyElementText(findTestObject('Object Repository/Maybank2u/Cards/Step2/cardsCCApplyGetStartedStep2MaritalStatusTitleTxt'), findTestData('TestData').getValue(2, 33))

Mobile.verifyElementText(findTestObject('Object Repository/Maybank2u/Cards/Step2/cardsCCApplyGetStartedStep2MaritalStatusTxt'), findTestData('TestData').getValue(4, 33))

Mobile.swipe(546, 1588, 546, 1082)

Mobile.verifyElementText(findTestObject('Object Repository/Maybank2u/Cards/Step2/cardsCCApplyGetStartedStep2NationalityTitleTxt'), findTestData('TestData').getValue(2, 34))

Mobile.verifyElementText(findTestObject('Object Repository/Maybank2u/Cards/Step2/cardsCCApplyGetStartedStep2NationalityTxt'), findTestData('TestData').getValue(4, 34))

Mobile.verifyElementText(findTestObject('Object Repository/Maybank2u/Cards/Step2/cardsCCApplyGetStartedStep2MotherNameTitleTxt'), findTestData('TestData').getValue(2, 35))

Mobile.setText(findTestObject('Object Repository/Maybank2u/Cards/Step2/cardsCCApplyGetStartedStep2MotherNameTxt'), findTestData('TestData').getValue(4, 35), 0)

Mobile.tap(findTestObject('Object Repository/Maybank2u/Cards/Step 1/cardsCCApplyGetStartedStep1ContinueBtn'), 0)