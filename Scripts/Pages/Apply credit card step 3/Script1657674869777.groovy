import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.Keys
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling

Mobile.waitForElementPresent(findTestObject('Object Repository/Maybank2u/Cards/Step 3/cardsCCApplyGetStartedStep3Add1Title'), 0)

//def inputLength =Mobile.getText(findTestObject('Object Repository/Maybank2u/Cards/Step 3/cardsCCApplyGetStartedStep3Add1Title'), 0)
//
//if(inputLength.length()>0) {

//}

Mobile.verifyElementText(findTestObject('Object Repository/Maybank2u/Cards/Step 3/cardsCCApplyGetStartedStep3Add1Title'), findTestData('TestData').getValue(2, 36))

Mobile.setText(findTestObject('Object Repository/Maybank2u/Cards/Step 3/cardsCCApplyGetStartedStep3Add1InputField'), findTestData('TestData').getValue(4, 36), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Maybank2u/Cards/Step 3/cardsCCApplyGetStartedStep3Add2Title'), findTestData('TestData').getValue(2, 37))

Mobile.setText(findTestObject('Object Repository/Maybank2u/Cards/Step 3/cardsCCApplyGetStartedStep3Add2InputField'), findTestData('TestData').getValue(4, 37), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Maybank2u/Cards/Step 3/cardsCCApplyGetStartedStep3Add3Title'), findTestData('TestData').getValue(2, 38))

Mobile.setText(findTestObject('Object Repository/Maybank2u/Cards/Step 3/cardsCCApplyGetStartedStep3Add3InputField'), findTestData('TestData').getValue(4, 38), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Maybank2u/Cards/Step 3/cardsCCApplyGetStartedStep3PostcodeTitle'), findTestData('TestData').getValue(2, 39))

Mobile.setText(findTestObject('Object Repository/Maybank2u/Cards/Step 3/cardsCCApplyGetStartedStep3PostcodeInputField'), findTestData('TestData').getValue(4, 39), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Maybank2u/Cards/Step 3/cardsCCApplyGetStartedStep3CityTitle'), findTestData('TestData').getValue(2, 40))

Mobile.setText(findTestObject('Object Repository/Maybank2u/Cards/Step 3/cardsCCApplyGetStartedStep3CityInputField'), findTestData('TestData').getValue(4, 40), 0)

Mobile.swipe(546, 1588, 546, 1082)

Mobile.verifyElementText(findTestObject('Object Repository/Maybank2u/Cards/Step 3/cardsCCApplyGetStartedStep3StateTitle'), findTestData('TestData').getValue(2, 41))

Mobile.tap(findTestObject('Object Repository/Maybank2u/Cards/Step 3/cardsCCApplyGetStartedStep3StateDropdown'), 0)

Mobile.scrollToText(findTestData('TestData').getValue(4, 41))

Mobile.tap(findTestObject('Object Repository/Maybank2u/Cards/Step 3/cardsCCApplyGetStartedStep3State_1', [('state') : findTestData('TestData').getValue(4, 41)]), 0)

Mobile.tap(findTestObject('Object Repository/Main/mainCalenderPickerDoneBtn'), 0)

Mobile.delay(5)

Mobile.verifyElementText(findTestObject('Object Repository/Maybank2u/Cards/Step 3/cardsCCApplyGetStartedStep3ResidentialTitleTxt'), findTestData('TestData').getValue(2, 42))

Mobile.tap(findTestObject('Object Repository/Maybank2u/Cards/Step 3/cardsCCApplyGetStartedStep3ResidentialDropdown'), 0)

Mobile.scrollToText(findTestData('TestData').getValue(4, 42))

Mobile.tap(findTestObject('Object Repository/Maybank2u/Cards/Step 3/cardsCCApplyGetStartedStep3State_1', [('state') : findTestData('TestData').getValue(4, 
                42)]), 0)
Mobile.tap(findTestObject('Object Repository/Main/mainCalenderPickerDoneBtn'), 0)

Mobile.delay(5)

Mobile.tap(findTestObject('Object Repository/Maybank2u/Cards/Step 3/cardsCCApplyGetStartedStep3SaveContinueBtn'), 0)