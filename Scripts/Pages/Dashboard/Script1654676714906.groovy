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

Mobile.verifyElementExist(findTestObject('Object Repository/Dashboard/dashboardWalletTopSelect'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Dashboard/dashboardQuickActionsTitleTxt'), 0)

int startX = 0

int startY = 0

//Maybank2u tab
if (index == '1') {
//    device_Height = Mobile.getDeviceHeight()
//
//    device_Width = Mobile.getDeviceWidth()
//
//    startX = (device_Width / 3)
//
//    startY = (device_Height * 0.97) 

    Mobile.tap(findTestObject('Object Repository/Dashboard/dashboard_maybank2uButton'), 0)
	
//More tab
} else if (index == '2') {
	
	Mobile.tap(findTestObject('Object Repository/Dashboard/dashboard_moreButton'), 0)
	
//    device_Height = Mobile.getDeviceHeight()
//
//    device_Width = Mobile.getDeviceWidth()
//
//    startX = (device_Width / 1.25)
//
//    startY = (device_Height * 0.97)
}

//Mobile.tapAtPosition(startX, startY)


//Home tab
 else if (index == '3') {
	
	Mobile.tap(findTestObject('Object Repository/Dashboard/dashboard_homeButton'), 0)

}

//Expense tab
else if (index == '4') {
   
   Mobile.tap(findTestObject('Object Repository/Dashboard/dashboard_expensesButton'), 0)
   
}
