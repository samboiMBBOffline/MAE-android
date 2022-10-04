import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

if (index == '0') {
    Mobile.verifyElementVisible(findTestObject('Banking/m2uAccountTransferIconSelect'), 0)

    Mobile.tap(findTestObject('Banking/m2uAccountTransferIconSelect'), 0)
} else if (index == '1') {
    Mobile.verifyElementVisible(findTestObject('Object Repository/Banking/m2uAccountPayBillsIconSelect'), 0)
	
    Mobile.tap(findTestObject('Object Repository/Banking/m2uAccountPayBillsIconSelect'), 0)
} else if  (index == '2') {
	Mobile.verifyElementVisible(findTestObject('Object Repository/Reload/accountsMenuReloadIcon'), 0)
	
	Mobile.tap(findTestObject('Object Repository/Reload/accountsMenuReloadIcon'), 0)
	
}
