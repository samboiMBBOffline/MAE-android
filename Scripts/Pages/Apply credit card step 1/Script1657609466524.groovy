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

Mobile.waitForElementPresent(findTestObject('Object Repository/Maybank2u/Cards/Step 1/cardsCCApplyGetStartedStep1TitleTitleTxt'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Maybank2u/Cards/Step 1/cardsCCApplyGetStartedStep1TitleTitleTxt'), findTestData('TestData').getValue(2, 18))

Mobile.verifyElementText(findTestObject('Object Repository/Maybank2u/Cards/Step 1/cardsCCApplyGetStartedStep1TitleTxt'), findTestData('TestData').getValue(4, 18))

Mobile.verifyElementText(findTestObject('Object Repository/Maybank2u/Cards/Step 1/cardsCCApplyGetStartedStep1NameTitleTxt'), findTestData('TestData').getValue(2, 19))

Mobile.verifyElementText(findTestObject('Object Repository/Maybank2u/Cards/Step 1/cardsCCApplyGetStartedStep1NameTxt',[('namePerId'):findTestData('TestData').getValue(4, 19)]), findTestData('TestData').getValue(4, 19))

Mobile.verifyElementText(findTestObject('Object Repository/Maybank2u/Cards/Step 1/cardsCCApplyGetStartedStep1DOBTitleTxt',[('dateOfBirthTxt'):findTestData('TestData').getValue(2, 20)]), findTestData('TestData').getValue(2, 20))

Mobile.verifyElementText(findTestObject('Object Repository/Maybank2u/Cards/Step 1/cardsCCApplyGetStartedStep1DOBTxt',[('dateOfBirth'):findTestData('TestData').getValue(4, 20)]), findTestData('TestData').getValue(4, 20))

Mobile.verifyElementText(findTestObject('Object Repository/Maybank2u/Cards/Step 1/cardsCCApplyGetStartedStep1IDTypeTitleTxt'), findTestData('TestData').getValue(2, 21))

Mobile.verifyElementText(findTestObject('Object Repository/Maybank2u/Cards/Step 1/cardsCCApplyGetStartedStep1IDTypeTxt'), findTestData('TestData').getValue(4, 21))

Mobile.verifyElementText(findTestObject('Object Repository/Maybank2u/Cards/Step 1/cardsCCApplyGetStartedStep1IDNumberTitleTxt'), findTestData('TestData').getValue(2, 22))

Mobile.verifyElementText(findTestObject('Object Repository/Maybank2u/Cards/Step 1/cardsCCApplyGetStartedStep1IDNumberTxt',[('idNumber'):findTestData('TestData').getValue(4, 22)]), findTestData('TestData').getValue(4, 22))

Mobile.swipe(546, 1588, 546, 1082)

Mobile.verifyElementText(findTestObject('Object Repository/Maybank2u/Cards/Step 1/cardsCCApplyGetStartedStep1EmailTitleTxt'), findTestData('TestData').getValue(2, 23))

Mobile.setText(findTestObject('Object Repository/Maybank2u/Cards/Step 1/cardsCCApplyGetStartedStep1EmailTxt'), findTestData('TestData').getValue(4, 23), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Maybank2u/Cards/Step 1/cardsCCApplyGetStartedStep1MbNoTitleTxt'), findTestData('TestData').getValue(2, 24))

Mobile.setText(findTestObject('Object Repository/Maybank2u/Cards/Step 1/cardsCCApplyGetStartedStep1MbNoTxt'), findTestData('TestData').getValue(4, 25), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Maybank2u/Cards/Step 1/cardsCCApplyGetStartedStep1EducationTitleTxt',[('educationLevelTitle'):findTestData('TestData').getValue(4, 19)]), findTestData('TestData').getValue(2, 26))

Mobile.verifyElementText(findTestObject('Object Repository/Maybank2u/Cards/Step 1/cardsCCApplyGetStartedStep1EducationTxt',[('educationLevel'):findTestData('TestData').getValue(4, 26)]), findTestData('TestData').getValue(4, 26))

Mobile.tap(findTestObject('Object Repository/Maybank2u/Cards/Step 1/cardsCCApplyGetStartedStep1ContinueBtn'), 0)