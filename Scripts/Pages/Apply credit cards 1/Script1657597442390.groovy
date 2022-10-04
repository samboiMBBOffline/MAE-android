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

Mobile.waitForElementPresent(findTestObject('Object Repository/Maybank2u/Cards/cardsCCApplyCreditCardsTitleTxt'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Maybank2u/Cards/cardsCCApplyCreditCardsTitleTxt'), findTestData('TestData').getValue(2, 5))

Mobile.verifyElementText(findTestObject('Object Repository/Maybank2u/Cards/cardsCCApplyCreditCardsTxt'), findTestData('TestData').getValue(4, 5))

Mobile.verifyElementText(findTestObject('Object Repository/Maybank2u/Cards/cardsCCApplyCreditCardsMonthlyIncomeTitleTxt'), findTestData('TestData').getValue(2, 6))

Mobile.verifyElementText(findTestObject('Object Repository/Maybank2u/Cards/cardsCCApplyCreditCardsMonthlyIncomeSliderAmountTxt'), findTestData('TestData').getValue(4, 6))

Mobile.verifyElementText(findTestObject('Object Repository/Maybank2u/Cards/cardsCCApplyCreditCardsTypeTitleTxt'), findTestData('TestData').getValue(2, 7))

Mobile.verifyElementText(findTestObject('Object Repository/Maybank2u/Cards/cardsCCApplyCreditCardsTypeIslamicTxt'), findTestData('TestData').getValue(4, 7))

Mobile.scrollToText('Lifestyle')

Mobile.tap(findTestObject('Object Repository/Maybank2u/Cards/cardsCCApplyCreditCardsInterestLifeTxt'), 0)

Mobile.tap(findTestObject('Object Repository/Maybank2u/Cards/cardsCCApplyCreditCardsNextBtn'), 0)