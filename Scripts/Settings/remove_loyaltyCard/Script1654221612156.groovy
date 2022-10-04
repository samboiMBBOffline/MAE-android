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

not_run: RunConfiguration.setMobileDriverPreferencesProperty('appPackage', 'com.maybank2u.life.uat')

not_run: RunConfiguration.setMobileDriverPreferencesProperty('appActivity', 'com.maybank2u.life.MainActivity')

not_run: Mobile.startApplication(GlobalVariable.appPath, false)

Mobile.delay(3)

Mobile.startExistingApplication('com.maybank2u.life.sit', FailureHandling.STOP_ON_FAILURE)

device_Height = Mobile.getDeviceHeight()

device_Width = Mobile.getDeviceWidth()

int startX = device_Width / 1.25

int startY = device_Height * 0.97

Mobile.tapAtPosition(startX, startY)

Mobile.verifyElementExist(findTestObject('Object Repository/Loyalty Card/more_LoyaltyIcon'), 0)

Mobile.tap(findTestObject('Object Repository/Loyalty Card/more_LoyaltyIcon'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Loyalty Card/cardList_cardNumberTxt'), findTestData('TestData').getValue(
        4, 18))

Mobile.tap(findTestObject('Object Repository/Loyalty Card/cardList_cardNumberTxt'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Loyalty Card/confirmation_cardNameTxt'), findTestData('TestData').getValue(
        4, 7))

Mobile.verifyElementText(findTestObject('Object Repository/Loyalty Card/confirmation_cardNumberTxt'), findTestData('TestData').getValue(
        4, 18))

Mobile.verifyElementText(findTestObject('Loyalty Card/confirmation_cardExpiryDateTxt', [('expiryDate') : findTestData('TestData').getValue(
                4, 11)]), 'Expiry Date ' + findTestData('TestData').getValue(4, 11))

Mobile.verifyElementText(findTestObject('Object Repository/Loyalty Card/confirmation_cardNameTxt'), findTestData('TestData').getValue(
        4, 7))

Mobile.verifyElementText(findTestObject('Object Repository/Loyalty Card/confirmation_cardNumberTxt'), findTestData('TestData').getValue(
        4, 18))

Mobile.verifyElementText(findTestObject('Object Repository/Loyalty Card/confirmation_cardNumberCodeTxt'), findTestData('TestData').getValue(
        4, 9))

Mobile.verifyElementText(findTestObject('Object Repository/Loyalty Card/confirmation_descriptionTitleTxt'), findTestData(
        'TestData').getValue(2, 13))

Mobile.verifyElementText(findTestObject('Object Repository/Loyalty Card/confirmation_descriptionTxt'), findTestData('TestData').getValue(
        4, 14))

Mobile.verifyElementText(findTestObject('Object Repository/Loyalty Card/confirmation_cardPhotoTitleTxt'), findTestData('TestData').getValue(
        2, 15))

Mobile.waitForElementPresent(findTestObject('Object Repository/Loyalty Card/cardDetailsThreeDotsBtn'), 0)

Mobile.tap(findTestObject('Object Repository/Loyalty Card/cardDetailsThreeDotsBtn'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Loyalty Card/cardDetailsRemoveBtn'), 0)

Mobile.tap(findTestObject('Object Repository/Loyalty Card/cardDetailsRemoveBtn'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Loyalty Card/removeCardTitleTxt'), findTestData('TestData').getValue(
        2, 20))

Mobile.verifyElementText(findTestObject('Object Repository/Loyalty Card/removeCardDescriptionTxt'), findTestData('TestData').getValue(
        4, 21))

Mobile.tap(findTestObject('Object Repository/Loyalty Card/removeCardConfirmBtn'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Loyalty Card/removeCardSuccessfulMessage'), findTestData('TestData').getValue(
        4, 22))

Mobile.verifyElementNotExist(findTestObject('Object Repository/Loyalty Card/cardList_cardNumberTxt'), 0)

