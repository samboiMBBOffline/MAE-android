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
import com.kms.katalon.core.mobile.keyword.internal.MobileAbstractKeyword as MobileAbstractKeyword
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import io.appium.java_client.AppiumDriver as AppiumDriver

//Mobile.startApplication('/Users/a00139272/Katalon Studio/MAE/androidapp/app-sit-universal-release-copy.apk', false)
//
//RunConfiguration.setMobileDriverPreferencesProperty('appPackage', 'com.maybank2u.life.sit')
//
//RunConfiguration.setMobileDriverPreferencesProperty('appActivity', 'com.maybank2u.life.sit.MainActivity')

Mobile.delay(5)

Mobile.waitForElementPresent(findTestObject('Festive Season/festiveSeasonDashboardQuickActionBtn'), 3)

Mobile.tap(findTestObject('Festive Season/festiveSeasonDashboardQuickActionBtn'), 0)

Mobile.delay(3)

Mobile.tap(findTestObject('Festive Season/festiveSeasonQuickScanPayBtn'), 0)

Mobile.delay(3)

Mobile.waitForElementPresent(findTestObject('Festive Season/festiveSeasonScanPayFromGalleryBtn'), 0)

Mobile.tap(findTestObject('Festive Season/festiveSeasonScanPayFromGalleryBtn'), 0)

Mobile.delay(3)

Mobile.tap(findTestObject('Festive Season/scanPayPhoneStorageDestinationDownload'), 0)

Mobile.delay(3)

Mobile.scrollToText('22922529925147.png')

Mobile.tap(findTestObject('Festive Season/scanPayPhoneStorageQRFileSelect'), 0)

Mobile.delay(3)

Mobile.tap(findTestObject('Festive Season/scanPayPhoneStorageOKBtn'), 0)

Mobile.delay(5)

Mobile.tap(findTestObject('Login Onboarding/PIN1'), 0)

Mobile.tap(findTestObject('Login Onboarding/PIN0'), 0)

Mobile.tap(findTestObject('Main/mainAmountTickBtn (1)'), 0)

Mobile.waitForElementPresent(findTestObject('Festive Season/scanPayConfirmationToAccountNameTxt'), 0)

Mobile.waitForElementPresent(findTestObject('Festive Season/festiveSeasonQuickScanPayBtn'), 0)

Mobile.verifyElementText(findTestObject('Festive Season/scanPayConfirmationToAccountNameTxt'), 'JSJSJDJDJJDJDJDNDNDNDNNDJ')

Mobile.verifyElementText(findTestObject('Festive Season/scanPayConfirmationToAccountNumberTxt'), '5140 1298 7769')

Mobile.verifyElementText(findTestObject('Festive Season/scanPayConfirmationToAmountTxt'), 'RM 0.10')

Mobile.tap(findTestObject('Festive Season/scanPayConfirmationPayNowBtn'), 0)

