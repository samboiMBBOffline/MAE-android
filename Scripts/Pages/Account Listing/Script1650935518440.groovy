import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

//datafiles TestData,
// for sheet Reload, data: 1
// for sheet Request, Topup, Transfer, data : '2'
// for sheet Cards, data:3

if (index == '1') {
	
    Mobile.verifyElementVisible(findTestObject('Banking/m2uAccountTypeSelection', [('text') : findTestData('TestData').getValue(
                    4, data)]), 0)

    Mobile.tap(findTestObject('Banking/m2uAccountTypeSelection', [('text') : findTestData('TestData').getValue(4, data)]), 
        0)
	
//Cards Tab
} else if (index == '2') {
	
	Mobile.verifyElementVisible(findTestObject('Banking/m2uAccountTypeSelection', [('text') : findTestData('TestData').getValue(
		4, data)]), 0)
	
	Mobile.tap(findTestObject('Object Repository/Maybank2u/Cards/maybank2UCardsMenuText'), 0)
	
	Mobile.waitForElementPresent(findTestObject('Object Repository/Maybank2u/Cards/maybank2UCardsApplyCCDescTxt'), 0)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Maybank2u/Cards/maybank2UCardsApplyCCTitleTxt'), findTestData('TestData').getValue(
		2, 4))
	
	Mobile.tap(findTestObject('Object Repository/Maybank2u/Cards/maybank2UCardsApplyCCTitleTxt'), 0)
	
}