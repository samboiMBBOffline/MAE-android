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

Mobile.startExistingApplication('com.maybank2u.life.sit', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Main/mainMoreBottomMenuBtn'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Loyalty Card/more_LoyaltyIcon'), 0)

Mobile.tap(findTestObject('Object Repository/Loyalty Card/more_LoyaltyIcon'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Loyalty Card/loyalty_descriptionTitleTxt'), findTestData('TestData').getValue(
        2, 3))

Mobile.verifyElementText(findTestObject('Object Repository/Loyalty Card/loyalty_description1Txt'), findTestData('TestData').getValue(
        4, 3))

Mobile.verifyElementText(findTestObject('Object Repository/Loyalty Card/loyalty_description2Txt'), findTestData('TestData').getValue(
        4, 4))

Mobile.tap(findTestObject('Object Repository/Loyalty Card/loyalty_addCardsBtn'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Loyalty Card/addLoyalty_pageTitleTxt'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Loyalty Card/addLoyalty_cardNameTitleTxt'), findTestData('TestData').getValue(
        2, 6))

Mobile.setText(findTestObject('Object Repository/Loyalty Card/addLoyalty_cardNameInputField'), findTestData('TestData').getValue(
        4, 7), 0)

Mobile.verifyElementText(findTestObject('Loyalty Card/addLoyalty_cardNumberTitleTxt'), findTestData('TestData').getValue(
        2, 8))

Mobile.setText(findTestObject('Object Repository/Loyalty Card/addLoyalty_cardNumberInputField'), findTestData('TestData').getValue(
        4, 9), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Loyalty Card/addLoyalty_expiryDateTitleTxt'), findTestData('TestData').getValue(
        2, 10))

Mobile.setText(findTestObject('Object Repository/Loyalty Card/addLoyalty_expiryDateInputField'), findTestData('TestData').getValue(
        4, 11), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Loyalty Card/addLoyalty_cardColourTitleTxt'), findTestData('TestData').getValue(
        2, 12))

Mobile.verifyElementText(findTestObject('Object Repository/Loyalty Card/addLoyalty_descriptionTitleTxt'), findTestData('TestData').getValue(
        2, 13))

Mobile.setText(findTestObject('Object Repository/Loyalty Card/addLoyalty_descriptionInputField'), findTestData('TestData').getValue(
        4, 14), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Loyalty Card/addLoyalty_cardPhotoTitleTxt'), findTestData('TestData').getValue(
        2, 15))

Mobile.verifyElementText(findTestObject('Object Repository/Loyalty Card/addLoyalty_notesTxt'), findTestData('TestData').getValue(
        4, 16))

Mobile.verifyElementText(findTestObject('Object Repository/Loyalty Card/addLoyalty_cardNameInputField'), findTestData('TestData').getValue(
        4, 7))

Mobile.verifyElementText(findTestObject('Object Repository/Loyalty Card/addLoyalty_cardNumberInputField'), findTestData(
        'TestData').getValue(4, 9))

Mobile.verifyElementText(findTestObject('Object Repository/Loyalty Card/addLoyalty_expiryDateInputField'), findTestData(
        'TestData').getValue(4, 11))

Mobile.waitForElementPresent(findTestObject('Object Repository/Loyalty Card/addLoyalty_continueBtn'), 0)

Mobile.tap(findTestObject('Object Repository/Loyalty Card/addLoyalty_continueBtn'), 0)

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

Mobile.waitForElementPresent(findTestObject('Object Repository/Loyalty Card/confirmation_confirmBtn'), 0)

Mobile.tap(findTestObject('Object Repository/Loyalty Card/confirmation_confirmBtn'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Loyalty Card/cardList_cardNumberTxt'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Loyalty Card/cardList_cardNumberTxt'), findTestData('TestData').getValue(
        4, 18))

