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
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.keyword.excel.ExcelKeywords as ExcelKeywords
import java.util.concurrent.TimeUnit as TimeUnit

RunConfiguration.setMobileDriverPreferencesProperty('appPackage', 'com.maybank2u.life.sit')

RunConfiguration.setMobileDriverPreferencesProperty('appActivity', 'com.maybank2u.life.MainActivity')

if (GlobalVariable.isApplicationOpened == false) {
    Mobile.startApplication(GlobalVariable.appPath, false)
}

int start = System.currentTimeMillis()

Mobile.verifyElementVisible(findTestObject('Dashboard/dashboardWalletTopSelect'), 20)

int end = System.currentTimeMillis()

int loadintime = end - start

float newLoad = TimeUnit.MILLISECONDS.toSeconds(loadintime)

def manu = Mobile.getDeviceManufacturer()

def os = Mobile.getDeviceOS()

def osVersion = Mobile.getDeviceOSVersion()

println(manu)

println(os)

println(osVersion)

String test = GlobalVariable.dataFolder

String sheetName = 'Sheet1'

File file1 = new File(test)

assert file1.exists() == true

woorkbook1 = ExcelKeywords.getWorkbook(test)

sheet1 = ExcelKeywords.getExcelSheet(woorkbook1, sheetName)

network = findTestData('PerfTestData').getValue(2, 1)

ExcelKeywords.setValueToCellByIndex(sheet1, 0, 0, network //index row column(3,1) = (4,2)
    )

ExcelKeywords.setValueToCellByIndex(sheet1, 0, 1, manu //index row column(3,1) = (4,2)
    )

ExcelKeywords.setValueToCellByIndex(sheet1, 0, 2, os)

ExcelKeywords.setValueToCellByIndex(sheet1, 0, 3, osVersion)

ExcelKeywords.setValueToCellByIndex(sheet1, 0, 4, newLoad)

ExcelKeywords.saveWorkbook(test, woorkbook1)

device_Height = Mobile.getDeviceHeight()

device_Width = Mobile.getDeviceWidth()

int startX = device_Width / 3

int startY = device_Height * 0.97

Mobile.tapAtPosition(startX, startY)

int start1 = System.currentTimeMillis()

Mobile.verifyElementVisible(findTestObject('Main/mainEnterPINMessage'), 0, FailureHandling.OPTIONAL)

int end1 = System.currentTimeMillis()

int loadintime1 = end1 - start1

float newLoad1 = TimeUnit.MILLISECONDS.toSeconds(loadintime1)

ExcelKeywords.setValueToCellByIndex(sheet1, 0, 5, newLoad1)

Mobile.tap(findTestObject('Login Onboarding/PIN1'), 0)

Mobile.tap(findTestObject('Login Onboarding/PIN1'), 0)

Mobile.tap(findTestObject('Login Onboarding/PIN1'), 0)

Mobile.tap(findTestObject('Login Onboarding/PIN1'), 0)

Mobile.tap(findTestObject('Login Onboarding/PIN1'), 0)

Mobile.tap(findTestObject('Login Onboarding/PIN2'), 0)

int start2 = System.currentTimeMillis()

Mobile.verifyElementVisible(findTestObject('Banking/m2uAccountTypeSelection', [('text') : findTestData('PerfTestData').getValue(
                1, 1)]), 20)

int end2 = System.currentTimeMillis()

int loadintime2 = end2 - start2

float newLoad2 = TimeUnit.MILLISECONDS.toSeconds(loadintime2)

ExcelKeywords.setValueToCellByIndex(sheet1, 0, 6, newLoad2)

ExcelKeywords.saveWorkbook(test, woorkbook1)

Mobile.tap(findTestObject('Banking/m2uAccountTypeSelection', [('text') : findTestData('PerfTestData').getValue(
	1, 1)]), 20)

//Mobile.tap(findTestObject('Object Repository/Main/mainTopLeftBackButton'), 10)

//int startHome = device_Width / 6.5
//
//Mobile.tapAtPosition(startHome, startY)

//Mobile.tap(findTestObject('Object Repository/Main/dashboardTransferIcontxt'), 20)

Mobile.delay(3)

Mobile.tap(findTestObject('Object Repository/Banking/m2uAccountPayBillsIconSelect'), 0)

int start3 = System.currentTimeMillis()

Mobile.verifyElementVisible(findTestObject('Object Repository/Main/maybankLogo'), 0, FailureHandling.OPTIONAL)

int end3 = System.currentTimeMillis()

int loadintime3 = end3 - start3

float newLoad3 = TimeUnit.MILLISECONDS.toSeconds(loadintime3)

ExcelKeywords.setValueToCellByIndex(sheet1, 0, 7, newLoad3)

ExcelKeywords.saveWorkbook(test, woorkbook1)

Mobile.setText(findTestObject('Tabung/tabungSignInInputPasswordField'), findTestData('PerfTestData').getValue(
	3, 1), 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Tabung/tabungSignInContinueBtn'), 0)

int start4 = System.currentTimeMillis()

Mobile.verifyElementVisible(findTestObject('Object Repository/Transfer/transferFavTxt'), 40, FailureHandling.OPTIONAL)

int end4 = System.currentTimeMillis()

int loadintime4 = end4 - start4

float newLoad4 = TimeUnit.MILLISECONDS.toSeconds(loadintime4)

ExcelKeywords.setValueToCellByIndex(sheet1, 0, 8, newLoad4)

ExcelKeywords.saveWorkbook(test, woorkbook1)