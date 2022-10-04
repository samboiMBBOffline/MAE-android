package com.my.keywords.android
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.util.KeywordUtil


public class EasyTap {
	@Keyword

	def static TapOTP () {
	
		def OTP = Mobile.getText(findTestObject('Forget Password/android.widget.TextView - Your TAC no. is 063182'), 0)
		
		println(OTP)
		
		Mobile.delay(6)
		
		for (def i = 16; i <= 21; i++) {
			def TapNo = (OTP[i])
		
			println(TapNo)
		
			Mobile.tap(findTestObject('Forget Password/PIN tap', [('TapNo') : TapNo]), 0)
		}
		Mobile.tap(findTestObject('Forget Password/TickTACButton'), 0)
		KeywordUtil.logInfo("Successfully Tap TAC")
	
			}
	
}