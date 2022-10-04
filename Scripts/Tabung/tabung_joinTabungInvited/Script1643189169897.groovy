import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling


//try {
//    RunConfiguration.setMobileDriverPreferencesProperty('appPackage', 'com.maybank2u.life.sit')
//
//    RunConfiguration.setMobileDriverPreferencesProperty('appActivity', 'com.maybank2u.life.MainActivity')
//
//    if (GlobalVariable.isApplicationOpened == false) {
//        Mobile.startApplication(GlobalVariable.appPath, false)
//    }

		Mobile.startExistingApplication('com.maybank2u.life.uat', FailureHandling.STOP_ON_FAILURE)
	
	    Mobile.verifyElementVisible(findTestObject('Object Repository/Dashboard/dashboard_moreButton'), 10)
		
		Mobile.tap(findTestObject('Object Repository/Dashboard/dashboard_moreButton'), 0)
	
	    Mobile.waitForElementPresent(findTestObject('Main/moreTabungIconSelect'), 0)
	
	    Mobile.tap(findTestObject('Main/moreTabungIconSelect'), 0)
	
	    if (Mobile.verifyElementVisible(findTestObject('Main/mainEnterPINMessage'), 0, FailureHandling.OPTIONAL)) {
	        Mobile.tap(findTestObject('Login Onboarding/PIN1'), 0)
	
	        Mobile.tap(findTestObject('Login Onboarding/PIN1'), 0)
	
	        Mobile.tap(findTestObject('Login Onboarding/PIN1'), 0)
	
	        Mobile.tap(findTestObject('Login Onboarding/PIN1'), 0)
	
	        Mobile.tap(findTestObject('Login Onboarding/PIN1'), 0)
	
	        Mobile.tap(findTestObject('Login Onboarding/PIN2'), 0)
	
	        Mobile.delay(2)
	    }
		    Mobile.waitForElementPresent(findTestObject('Object Repository/Tabung/tabung_pendingInvitationsTxt'), 0)
		
		    Mobile.tap(findTestObject('Object Repository/Tabung/tabung_pendingInvitationsTxt'), 0)
		
		    Mobile.waitForElementPresent(findTestObject('Object Repository/Tabung/tabung_pendingInvitationBoxTxt'), 0)
		
		    Mobile.tap(findTestObject('Object Repository/Tabung/tabung_pendingInvitationBoxTxt'), 0)
		
		    Mobile.verifyElementExist(findTestObject('Tabung/tabung_tabungNameTxt'), 0)
			
			Mobile.verifyElementVisible(findTestObject('Object Repository/Tabung/tabung_requestorTabungNameTxt', [('requestorName') : findTestData('TestData').getValue(4, 90)]), 0)
		
			Mobile.verifyElementVisible(findTestObject('Object Repository/Tabung/tabung_tabungNameTxt', [('tabungName') : findTestData('TestData').getValue(4, 82)]), 0)
		
			Mobile.delay(5)
			
		    Mobile.tap(findTestObject('Object Repository/Tabung/tabung_joinButton'), 0)
			
			if (Mobile.verifyElementVisible(findTestObject('Tabung/tabungEnterPasswordTxt'), 0, FailureHandling.OPTIONAL)) {
				Mobile.setText(findTestObject('Tabung/tabungSignInInputPasswordField'), findTestData('TestData').getValue(4, 1), 0)
		
				Mobile.hideKeyboard()
		
				Mobile.tap(findTestObject('Object Repository/Tabung/tabung_enterPasswordContinueButton'), 0)   //Tabung/tabungSignInContinueBtn'
			}
			
			Mobile.delay(3)
			
			Mobile.verifyElementVisible(findTestObject('Tabung/tabungSelectAccountDropdownBox'), 0)
			
			Mobile.tap(findTestObject('Tabung/tabungSelectAccountTxt'), 0)
			
			Mobile.delay(2)
			
			Mobile.tap(findTestObject('Tabung/tabunCreateFirstAccountSelect'), 0)
			
			Mobile.delay(5)

			Mobile.tap(findTestObject('Main/mainCalenderPickerDoneBtn'), 0)

			Mobile.delay(4)
			
			Mobile.tap(findTestObject('Tabung/tabungContinueBtn'), 0)
			
			Mobile.delay(10)
			
			Mobile.verifyElementVisible(findTestObject('Tabung/tabungConfirmationTxt'), 0)
			
			Mobile.scrollToText('Auto Deduction (optional)')
		
			Mobile.verifyElementVisible(findTestObject('Tabung/tabungAutoDeductionText'), 0)
		
			Mobile.tap(findTestObject('Tabung/tabungConfirmationSelectFrequencyDropdown'), 0)
		
			Mobile.delay(2)
		
			Mobile.tap(findTestObject('Tabung/tabungConfirmationFirstFreqDropdownSelect'), 0)
		
			Mobile.delay(2)
		
			Mobile.tap(findTestObject('Main/mainCalenderPickerDoneBtn'), 0)
		
			Mobile.delay(2)
		
			Mobile.tap(findTestObject('Tabung/tabungDisableESIRadioBtn'), 0)
		
			Mobile.delay(2)
		
			Mobile.tap(findTestObject('Object Repository/Tabung/tabung_joinTabungButton'), 0)
		
			Mobile.delay(3)
	
			Mobile.tap(findTestObject('Object Repository/Tabung/tabung_confirmButton'), 0)
			
			Mobile.delay(3)
			
			if (Mobile.verifyElementVisible(findTestObject('Object Repository/Tabung/tabung_otpNumberPresentTxt'), 0, FailureHandling.OPTIONAL)) {
				def OTP = Mobile.getText(findTestObject('Object Repository/Tabung/tabung_otpNumberTxt'), 0)
			
				for (def i = 16; i <= 21; i++) {
					if ((OTP[i]) == '0') {
						Mobile.tap(findTestObject('Login Onboarding/PIN0'), 0)
					}
					
					if ((OTP[i]) == '1') {
						Mobile.tap(findTestObject('Login Onboarding/PIN1'), 0)
					}
					
					if ((OTP[i]) == '2') {
						Mobile.tap(findTestObject('Login Onboarding/PIN2'), 0)
					}
					
					if ((OTP[i]) == '3') {
						Mobile.tap(findTestObject('Login Onboarding/PIN3'), 0)
					}
					
					if ((OTP[i]) == '4') {
						Mobile.tap(findTestObject('Login Onboarding/PIN4'), 0)
					}
					
					if ((OTP[i]) == '5') {
						Mobile.tap(findTestObject('Login Onboarding/PIN5'), 0)
					}
					
					if ((OTP[i]) == '6') {
						Mobile.tap(findTestObject('Login Onboarding/PIN6'), 0)
					}
					
					if ((OTP[i]) == '7') {
						Mobile.tap(findTestObject('Login Onboarding/PIN7'), 0)
					}
					
					if ((OTP[i]) == '8') {
						Mobile.tap(findTestObject('Login Onboarding/PIN8'), 0)
					}
					
					if ((OTP[i]) == '9') {
						Mobile.tap(findTestObject('Login Onboarding/PIN9'), 0)
					}
			Mobile.delay(1)
			}
			Mobile.delay(3)
		
			Mobile.tap(findTestObject('Object Repository/Tabung/tabung_otpTacTickButton'), 0)
			}else {
				
			Mobile.verifyElementVisible(findTestObject('Main/mainS2UApproveBtn'), 0)
		
			Mobile.tap(findTestObject('Main/mainS2UApproveBtn'), 0)
		
			Mobile.delay(10)
			}
		
//}
//catch (Exception e) {
//    if (GlobalVariable.isApplicationOpened == false) {
//        Mobile.callTestCase(findTestCase('Tabung/joinTabungInvited'), null)
//    }
//}



