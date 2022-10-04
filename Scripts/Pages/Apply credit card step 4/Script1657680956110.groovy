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

Mobile.waitForElementPresent(findTestObject('Object Repository/Maybank2u/Cards/Step 4/cardsCCApplyGetStartedStep4EmpNameTitleTxt'), 
    0)

Mobile.verifyElementText(findTestObject('Object Repository/Maybank2u/Cards/Step 4/cardsCCApplyGetStartedStep4EmpNameTitleTxt'), 
    findTestData('TestData').getValue(2, 43))

Mobile.setText(findTestObject('Object Repository/Maybank2u/Cards/Step 4/cardsCCApplyGetStartedStep4EmpNameTxt'), findTestData(
        'TestData').getValue(4, 43), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Maybank2u/Cards/Step 4/cardsCCApplyGetStartedStep4OccupationTitleTxt'), 
    findTestData('TestData').getValue(2, 44))

Mobile.tap(findTestObject('Object Repository/Maybank2u/Cards/Step 4/cardsCCApplyGetStartedStep4OccupationSelectedDropdown'), 
    0)

Mobile.scrollToText(findTestData('TestData').getValue(4, 44))

Mobile.tap(findTestObject('Maybank2u/Cards/Step 4/mainDropdownOption', [('value') : findTestData('TestData').getValue(4, 
                44)]), 0)

Mobile.tap(findTestObject('Object Repository/Main/mainCalenderPickerDoneBtn'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Maybank2u/Cards/Step 4/cardsCCApplyGetStartedStep4BussClassSelectedDropdown'), 
    0)

Mobile.verifyElementText(findTestObject('Object Repository/Maybank2u/Cards/Step 4/cardsCCApplyGetStartedStep4BussClassTitleTxt'), 
    findTestData('TestData').getValue(2, 45))

Mobile.tap(findTestObject('Object Repository/Maybank2u/Cards/Step 4/cardsCCApplyGetStartedStep4BussClassSelectedDropdown'), 
    0)

Mobile.scrollToText(findTestData('TestData').getValue(4, 45))

Mobile.tap(findTestObject('Maybank2u/Cards/Step 4/mainDropdownOption', [('value') : findTestData('TestData').getValue(4,
	45)]), 0)

Mobile.tap(findTestObject('Object Repository/Main/mainCalenderPickerDoneBtn'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Maybank2u/Cards/Step 4/cardsCCApplyGetStartedStep4SectorSelectedDropdown'), 
    0)

Mobile.verifyElementText(findTestObject('Object Repository/Maybank2u/Cards/Step 4/cardsCCApplyGetStartedStep4SectorTitleTxt'), 
    findTestData('TestData').getValue(2, 46))

Mobile.tap(findTestObject('Object Repository/Maybank2u/Cards/Step 4/cardsCCApplyGetStartedStep4SectorSelectedDropdown'), 
    0)

Mobile.scrollToText(findTestData('TestData').getValue(4, 46))

Mobile.tap(findTestObject('Maybank2u/Cards/Step 4/mainDropdownOption', [('value') : findTestData('TestData').getValue(4,
	46)]), 0)

Mobile.tap(findTestObject('Object Repository/Main/mainCalenderPickerDoneBtn'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Maybank2u/Cards/Step 4/cardsCCApplyGetStartedStep4EmployTypeSelectedDropdown'), 
    0)

Mobile.verifyElementText(findTestObject('Object Repository/Maybank2u/Cards/Step 4/cardsCCApplyGetStartedStep4EmployTypeTitleTxt'), 
    findTestData('TestData').getValue(2, 47))

Mobile.tap(findTestObject('Object Repository/Maybank2u/Cards/Step 4/cardsCCApplyGetStartedStep4EmployTypeSelectedDropdown'), 
    0)

Mobile.scrollToText(findTestData('TestData').getValue(4, 47))

Mobile.tap(findTestObject('Maybank2u/Cards/Step 4/mainDropdownOption', [('value') : findTestData('TestData').getValue(4,
	47)]), 0)

Mobile.tap(findTestObject('Object Repository/Main/mainCalenderPickerDoneBtn'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Maybank2u/Cards/Step 4/cardsCCApplyGetStartedStep4IServiceYearSelectedDropdown'), 
    0)

Mobile.swipe(546, 1588, 546, 1082)

Mobile.verifyElementText(findTestObject('Object Repository/Maybank2u/Cards/Step 4/cardsCCApplyGetStartedStep4IServiceTitleTxt'), 
    findTestData('TestData').getValue(2, 48))

Mobile.tap(findTestObject('Object Repository/Maybank2u/Cards/Step 4/cardsCCApplyGetStartedStep4IServiceYearSelectedDropdown'), 
    0)

Mobile.scrollToText(findTestData('TestData').getValue(4, 48))

Mobile.tap(findTestObject('Maybank2u/Cards/Step 4/mainDropdownOption', [('value') : findTestData('TestData').getValue(4,
	48)]), 0)

Mobile.tap(findTestObject('Object Repository/Main/mainCalenderPickerDoneBtn'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Maybank2u/Cards/Step 4/cardsCCApplyGetStartedStep4IServiceMonthSelectedDropdown'), 
    0)

Mobile.tap(findTestObject('Object Repository/Maybank2u/Cards/Step 4/cardsCCApplyGetStartedStep4IServiceMonthSelectedDropdown'), 
    0)

Mobile.scrollToText(findTestData('TestData').getValue(4, 49))

Mobile.tap(findTestObject('Maybank2u/Cards/Step 4/mainDropdownOption', [('value') : findTestData('TestData').getValue(4,
	49)]), 0)

Mobile.tap(findTestObject('Object Repository/Main/mainCalenderPickerDoneBtn'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Maybank2u/Cards/Step 4/cardsCCApplyGetStartedStep4IEmployTermsSelectedDropdown'), 
    0)

Mobile.verifyElementText(findTestObject('Object Repository/Maybank2u/Cards/Step 4/cardsCCApplyGetStartedStep4IEmployTermsTitleTxt'), 
    findTestData('TestData').getValue(2, 50))

Mobile.tap(findTestObject('Object Repository/Maybank2u/Cards/Step 4/cardsCCApplyGetStartedStep4IEmployTermsSelectedDropdown'), 
    0)

Mobile.scrollToText(findTestData('TestData').getValue(4, 50))

Mobile.tap(findTestObject('Maybank2u/Cards/Step 4/mainDropdownOption', [('value') : findTestData('TestData').getValue(4,
	50)]), 0)

Mobile.tap(findTestObject('Object Repository/Main/mainCalenderPickerDoneBtn'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Maybank2u/Cards/Step 4/cardsCCApplyGetStartedStep4IncomeSelectedDropdown'), 
    0)

Mobile.swipe(546, 1588, 546, 1082)

Mobile.verifyElementText(findTestObject('Object Repository/Maybank2u/Cards/Step 4/cardsCCApplyGetStartedStep4IncomeTitleTxt'), 
    findTestData('TestData').getValue(2, 51))

Mobile.tap(findTestObject('Object Repository/Maybank2u/Cards/Step 4/cardsCCApplyGetStartedStep4IncomeSelectedDropdown'), 
    0)

Mobile.scrollToText(findTestData('TestData').getValue(4, 51))

Mobile.tap(findTestObject('Maybank2u/Cards/Step 4/mainDropdownOption', [('value') : findTestData('TestData').getValue(4,
	51)]), 0)

Mobile.tap(findTestObject('Object Repository/Main/mainCalenderPickerDoneBtn'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Maybank2u/Cards/Step 4/cardsCCApplyGetStartedStep4ContinueBtn'), 
    0)

Mobile.tap(findTestObject('Object Repository/Maybank2u/Cards/Step 4/cardsCCApplyGetStartedStep4ContinueBtn'), 0)

