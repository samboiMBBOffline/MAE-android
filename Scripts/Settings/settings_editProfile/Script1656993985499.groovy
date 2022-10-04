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

not_run: WebUI.callTestCase(findTestCase('Pages/Start Application'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.startExistingApplication('com.maybank2u.life.sit', FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/Dashboard'), [('index') : '2'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/More'), [('index') : '1'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/Settings'), [('index') : '2'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/Pin'), [('index') : '1', ('data') : 42], FailureHandling.STOP_ON_FAILURE)

'Verify first time'
WebUI.callTestCase(findTestCase('Pages/Profile'), [('index') : '1'], FailureHandling.STOP_ON_FAILURE)

'Change name and name validation'
WebUI.callTestCase(findTestCase('Pages/Profile'), [('index') : '2'], FailureHandling.STOP_ON_FAILURE)

'Change email and email validation'
WebUI.callTestCase(findTestCase('Pages/Profile'), [('index') : '3'], FailureHandling.STOP_ON_FAILURE)

'Change Mobile No'
WebUI.callTestCase(findTestCase('Pages/Profile'), [('index') : '4'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/Mobile Number Input'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/TAC Request'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/TAC Input'), [:], FailureHandling.STOP_ON_FAILURE)

'Verify mobile no changed'
WebUI.callTestCase(findTestCase('Pages/Profile'), [('index') : '5'], FailureHandling.STOP_ON_FAILURE)

'Verify success message'
WebUI.callTestCase(findTestCase('Pages/Profile'), [('index') : '7'], FailureHandling.STOP_ON_FAILURE)

'Change profile picture'
WebUI.callTestCase(findTestCase('Pages/Profile'), [('index') : '6'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/Camera Capture'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/Profile'), [('index') : '7'], FailureHandling.STOP_ON_FAILURE)

