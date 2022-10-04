import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

import internal.GlobalVariable as GlobalVariable

//
//RunConfiguration.setMobileDriverPreferencesProperty('appPackage', 'com.maybank2u.life.uat')
//
//RunConfiguration.setMobileDriverPreferencesProperty('appActivity', 'com.maybank2u.life.MainActivity')
//
//Mobile.startApplication(GlobalVariable.appPath, false)

Mobile.startExistingApplication('com.maybank2u.life.uat')