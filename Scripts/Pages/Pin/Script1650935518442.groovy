import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

if (index == '1') {
    Mobile.verifyElementVisible(findTestObject('Main/mainEnterPINMessage'), 0, FailureHandling.OPTIONAL)

} else if (index == '2') {
    Mobile.verifyElementVisible(findTestObject('Object Repository/others/PIN/settingsPINCurrentEnterTxt'), 0, FailureHandling.OPTIONAL)

} else if (index == '3') {
    Mobile.verifyElementVisible(findTestObject('Object Repository/others/PIN/settingsPINNewEnterTitleTxt'), 0, FailureHandling.OPTIONAL)

} else if (index == '4') {
    Mobile.verifyElementVisible(findTestObject('Object Repository/others/PIN/settingsPINNewConfirmTxt'), 0, FailureHandling.OPTIONAL)
}else if (index == '5') {
	
	String pinNumber
	//sheets Transfer
    pinNumber = findTestData('TestData').getValue(5, 1)
	
	
	//sheets Settings
    //pinNumber = findTestData('TestData').getValue(4, 42)

    def length = pinNumber.length()

    Mobile.delay(3)

    for (def i = 0; i < length; i++) {
        if ((pinNumber[i]) == '0') {
            Mobile.tap(findTestObject('Login Onboarding/PIN0'), 0)
        }
        
        if ((pinNumber[i]) == '1') {
            Mobile.tap(findTestObject('Login Onboarding/PIN1'), 0)
        }
        
        if ((pinNumber[i]) == '2') {
            Mobile.tap(findTestObject('Login Onboarding/PIN2'), 0)
        }
        
        if ((pinNumber[i]) == '3') {
            Mobile.tap(findTestObject('Login Onboarding/PIN3'), 0)
        }
        
        if ((pinNumber[i]) == '4') {
            Mobile.tap(findTestObject('Login Onboarding/PIN4'), 0)
        }
        
        if ((pinNumber[i]) == '5') {
            Mobile.tap(findTestObject('Login Onboarding/PIN5'), 0)
        }
        
        if ((pinNumber[i]) == '6') {
            Mobile.tap(findTestObject('Login Onboarding/PIN6'), 0)
        }
        
        if ((pinNumber[i]) == '7') {
            Mobile.tap(findTestObject('Login Onboarding/PIN7'), 0)
        }
        
        if ((pinNumber[i]) == '8') {
            Mobile.tap(findTestObject('Login Onboarding/PIN8'), 0)
        }
        
        if ((pinNumber[i]) == '9') {
            Mobile.tap(findTestObject('Login Onboarding/PIN9'), 0)
        }
    }
    
    WebUI.delay(5)

    Mobile.tap(findTestObject('Object Repository/others/PIN/settingsPINNewTickBtn'), 0, FailureHandling.OPTIONAL)

    //Mobile.waitForElementPresent(findTestObject('Object Repository/others/PIN/settingsPINNewMismatchMsgTxt'), 0)

	//sheets Settings
   // Mobile.verifyElementText(findTestObject('Object Repository/others/PIN/settingsPINNewMismatchMsgTxt'), findTestData('TestData').getValue(4, 45))
}

//
//pinNumber = findTestData('TestData').getValue(4, data)
//
//def length = pinNumber.length()
//
//Mobile.delay(3)
//
//for (def i = 0; i < length; i++) {
//    if ((pinNumber[i]) == '0') {
//        Mobile.tap(findTestObject('Login Onboarding/PIN0'), 0)
//    }
//    
//    if ((pinNumber[i]) == '1') {
//        Mobile.tap(findTestObject('Login Onboarding/PIN1'), 0)
//    }
//    
//    if ((pinNumber[i]) == '2') {
//        Mobile.tap(findTestObject('Login Onboarding/PIN2'), 0)
//    }
//    
//    if ((pinNumber[i]) == '3') {
//        Mobile.tap(findTestObject('Login Onboarding/PIN3'), 0)
//    }
//    
//    if ((pinNumber[i]) == '4') {
//        Mobile.tap(findTestObject('Login Onboarding/PIN4'), 0)
//    }
//    
//    if ((pinNumber[i]) == '5') {
//        Mobile.tap(findTestObject('Login Onboarding/PIN5'), 0)
//    }
//    
//    if ((pinNumber[i]) == '6') {
//        Mobile.tap(findTestObject('Login Onboarding/PIN6'), 0)
//    }
//    
//    if ((pinNumber[i]) == '7') {
//        Mobile.tap(findTestObject('Login Onboarding/PIN7'), 0)
//    }
//    
//    if ((pinNumber[i]) == '8') {
//        Mobile.tap(findTestObject('Login Onboarding/PIN8'), 0)
//    }
//    
//    if ((pinNumber[i]) == '9') {
//        Mobile.tap(findTestObject('Login Onboarding/PIN9'), 0)
//    }
//}

WebUI.delay(3)

if ((index == '3') || (index == '4')) {
    Mobile.tap(findTestObject('Object Repository/others/PIN/settingsPINNewTickBtn'), 0)
}

