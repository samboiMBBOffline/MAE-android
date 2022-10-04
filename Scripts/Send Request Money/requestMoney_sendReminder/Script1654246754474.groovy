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
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import io.appium.java_client.AppiumDriver as AppiumDriver

Mobile.startExistingApplication('com.maybank2u.life.uat')

Mobile.verifyElementExist(findTestObject('Dashboard/mainBottomMenuMaybank2uBtn'), 0)

Mobile.tap(findTestObject('Dashboard/mainBottomMenuMaybank2uBtn'), 0)

if (Mobile.verifyElementVisible(findTestObject('Main/mainEnterPINMessage'), 0, FailureHandling.OPTIONAL)) {
    Mobile.tap(findTestObject('Login Onboarding/PIN1'), 0)

    Mobile.tap(findTestObject('Login Onboarding/PIN1'), 0)

    Mobile.tap(findTestObject('Login Onboarding/PIN1'), 0)

    Mobile.tap(findTestObject('Login Onboarding/PIN1'), 0)

    Mobile.tap(findTestObject('Login Onboarding/PIN1'), 0)

    Mobile.tap(findTestObject('Login Onboarding/PIN2'), 0)

    Mobile.delay(2)
}

Mobile.verifyElementVisible(findTestObject('Banking/m2uAccountTypeSelection', [('text') : findTestData('TestData').getValue(
        4, 2)]), 10)

Mobile.tap(findTestObject('Banking/m2uAccountTypeSelection', [('text') : findTestData('TestData').getValue(
        4, 2)]), 10)

Mobile.delay(3)

Mobile.verifyElementVisible(findTestObject('Banking/m2uAccountSendReqIconSelect'), 10)

Mobile.tap(findTestObject('Banking/m2uAccountSendReqIconSelect'), 0)

Mobile.delay(5)

Mobile.tap(findTestObject('Send Request Money/requestMoneyListStatusTxt'), 0)

Mobile.delay(3)

Mobile.verifyElementText(findTestObject('Send Request Money/requestMoneyDetailsNameTxt'), findTestData('TestData').getValue(4, 14))

Mobile.verifyElementText(findTestObject('Send Request Money/requestMoneyDetailsAmountTxt'), findTestData('TestData').getValue(
        4, 4))

Mobile.verifyElementText(findTestObject('Send Request Money/requestMoneyDetailsNotesTxt'), findTestData('TestData').getValue(
        4, 5))

Mobile.delay(3)

Mobile.waitForElementPresent(findTestObject('Object Repository/Send Request Money/requestMoneyDetailsSendReminderBtn'), 0)

Mobile.tap(findTestObject('Object Repository/Send Request Money/requestMoneyDetailsSendReminderBtn'), 0)

//Mobile.verifyElementText(findTestObject('Object Repository/Send Request Money/requestMoneySuccessReminderTxt'), findTestData('TestData').getValue(4, 11))

Mobile.delay(5)