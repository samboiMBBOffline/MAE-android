import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.mobile.keyword.internal.MobileAbstractKeyword as MobileAbstractKeyword
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

if (index == '1') {
    Mobile.waitForElementPresent(findTestObject('Object Repository/Settings/Profile/profileUpdateProfilePageTitleTxt'), 
        0)

    Mobile.verifyElementText(findTestObject('Object Repository/Settings/Profile/profileLastLoginTitleTxt'), findTestData(
            'TestData').getValue(2, 28))

    Mobile.verifyElementText(findTestObject('Object Repository/Settings/Profile/profileNameTitleTxt', [('profNameTitle') : findTestData(
                    'TestData').getValue(2, 29)]), findTestData('TestData').getValue(2, 29))

    Mobile.verifyElementText(findTestObject('Settings/Profile/profileNameTxt', [('profileName') : findTestData('TestData').getValue(
                    4, 29)]), findTestData('TestData').getValue(4, 29))

    Mobile.verifyElementText(findTestObject('Object Repository/Settings/Profile/profileMobileNoTitleTxt', [('mobileNoTitle') : findTestData(
                    'TestData').getValue(2, 30)]), findTestData('TestData').getValue(2, 30))

    Mobile.verifyElementText(findTestObject('Object Repository/Settings/Profile/profileMobileNoTxt', [('mobileNo') : findTestData(
                    'TestData').getValue(4, 30)]), '+' + findTestData('TestData').getValue(4, 30))

    Mobile.verifyElementText(findTestObject('Object Repository/Settings/Profile/profileEmailTitleTxt', [('emailTitle') : findTestData(
                    'TestData').getValue(2, 31)]), findTestData('TestData').getValue(2, 31))

    Mobile.verifyElementText(findTestObject('Object Repository/Settings/Profile/profileEmailTxt', [('email') : findTestData(
                    'TestData').getValue(4, 31)]), findTestData('TestData').getValue(4, 31))

    Mobile.verifyElementText(findTestObject('Object Repository/Settings/Profile/profileReferralCodeTitleTxt', [('refCodeTitle') : findTestData(
                    'TestData').getValue(2, 32)]), findTestData('TestData').getValue(2, 32))
} else if (index == '2') {
    Mobile.setText(findTestObject('Object Repository/Settings/Profile/profileNameTxt', [('profileName') : findTestData('TestData').getValue(
                    4, 29)]), findTestData('TestData').getValue(5, 29), 0)

    Mobile.waitForElementPresent(findTestObject('Object Repository/Settings/Profile/profileSaveChangesBtn'), 0)

    Mobile.tap(findTestObject('Object Repository/Settings/Profile/profileSaveChangesBtn'), 0)

    Mobile.waitForElementPresent(findTestObject('Object Repository/Settings/Profile/profileInvalidNameFormatToaster'), 0)

    Mobile.verifyElementText(findTestObject('Object Repository/Settings/Profile/profileInvalidNameFormatToaster'), findTestData(
            'TestData').getValue(4, 34))

    Mobile.delay(10)

    Mobile.setText(findTestObject('Object Repository/Settings/Profile/profileNameTxt', [('profileName') : findTestData('TestData').getValue(
                    5, 29)]), findTestData('TestData').getValue(6, 29), 0)

    Mobile.tap(findTestObject('Object Repository/Settings/Profile/profileSaveChangesBtn'), 0)

    Mobile.waitForElementPresent(findTestObject('Object Repository/Settings/Profile/profileSuccessUpdateToaster'), 0)

    Mobile.verifyElementText(findTestObject('Object Repository/Settings/Profile/profileSuccessUpdateToaster'), findTestData(
            'TestData').getValue(4, 35))
} else if (index == '3') {
    Mobile.setText(findTestObject('Object Repository/Settings/Profile/profileEmailTxt', [('email') : findTestData('TestData').getValue(
                    4, 31)]), findTestData('TestData').getValue(5, 31), 0)

    Mobile.waitForElementPresent(findTestObject('Object Repository/Settings/Profile/profileSaveChangesBtn'), 0)

    Mobile.tap(findTestObject('Object Repository/Settings/Profile/profileSaveChangesBtn'), 0)

    Mobile.waitForElementPresent(findTestObject('Object Repository/Settings/Profile/profileInvalidEmailFormatToaster'), 
        0)

    Mobile.verifyElementText(findTestObject('Object Repository/Settings/Profile/profileInvalidEmailFormatToaster'), findTestData(
            'TestData').getValue(4, 36))

    Mobile.delay(5)

    Mobile.setText(findTestObject('Object Repository/Settings/Profile/profileEmailTxt', [('email') : findTestData('TestData').getValue(
                    5, 31)]), findTestData('TestData').getValue(6, 31), 0)

    Mobile.tap(findTestObject('Object Repository/Settings/Profile/profileSaveChangesBtn'), 0)

    Mobile.waitForElementPresent(findTestObject('Object Repository/Settings/Profile/profileSuccessUpdateToaster'), 0)

    Mobile.verifyElementText(findTestObject('Object Repository/Settings/Profile/profileSuccessUpdateToaster'), findTestData(
            'TestData').getValue(4, 35))
} else if (index == '4') {
    Mobile.waitForElementPresent(findTestObject('Object Repository/Settings/Profile/profileMobileNoTxt', [('mobileNo') : findTestData(
                    'TestData').getValue(4, 30)]), 0)

    Mobile.tap(findTestObject('Object Repository/Settings/Profile/profileMobileNoTxt', [('mobileNo') : findTestData('TestData').getValue(
                    4, 30)]), 0)
} else if (index == '5') {
    Mobile.verifyElementText(findTestObject('Object Repository/Settings/Profile/profileMobileNoTxt', [('mobileNo') : findTestData(
                    'TestData').getValue(8, 30)]), '+' + findTestData('TestData').getValue(8, 30))
} else if (index == '6') {
    Mobile.verifyElementExist(findTestObject('Object Repository/Settings/Profile/profileImageBox'), 0)

    Mobile.tap(findTestObject('Object Repository/Settings/Profile/profileImageBox'), 0)

    Mobile.waitForElementPresent(findTestObject('Object Repository/Settings/Profile/profileTakePhotoCameraBtn'), 0)

    Mobile.tap(findTestObject('Object Repository/Settings/Profile/profileTakePhotoCameraBtn'), 0)
} else if (index == '7') {
    Mobile.waitForElementPresent(findTestObject('Object Repository/Settings/Profile/profileSuccessUpdateToaster'), 0)

    Mobile.verifyElementText(findTestObject('Object Repository/Settings/Profile/profileSuccessUpdateToaster'), findTestData(
            'TestData').getValue(4, 35))
}

//if (agriculture) {
//    Mobile.tap(findTestObject('Object Repository/Settings/Profile/profileEmailTxt', [('email') : findTestData('TestData').getValue(
//                    4, 31)]), 0, FailureHandling.OPTIONAL)
//} else if (mining) {
//    Mobile.tap(findTestObject('Object Repository/Settings/Profile/profileEmailTxt', [('email') : findTestData('TestData').getValue(
//                    4, 32)]), 0)
//}

