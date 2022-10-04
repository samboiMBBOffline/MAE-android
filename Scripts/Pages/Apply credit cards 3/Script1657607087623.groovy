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

Mobile.waitForElementPresent(findTestObject('Object Repository/Maybank2u/Cards/cardsCCApplyGetStartedTitleTxt'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Maybank2u/Cards/cardsCCApplyGetStartedTitleTxt'), findTestData('TestData').getValue(2, 14))

Mobile.verifyElementText(findTestObject('Object Repository/Maybank2u/Cards/cardsCCApplyGetStartedDesc1Txt'), findTestData('TestData').getValue(4, 14))

Mobile.verifyElementText(findTestObject('Object Repository/Maybank2u/Cards/cardsCCApplyGetStartedDesc2Txt'), findTestData('TestData').getValue(4, 15))

Mobile.verifyElementText(findTestObject('Object Repository/Maybank2u/Cards/cardsCCApplyGetStartedDesc3Txt'), findTestData('TestData').getValue(4, 16))

Mobile.tap(findTestObject('Object Repository/Maybank2u/Cards/cardsCCApplyGetStartedProceedBtn'), 0)