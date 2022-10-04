import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling

Mobile.startExistingApplication('com.maybank2u.life.sit', FailureHandling.STOP_ON_FAILURE)

Mobile.delay(5)

Mobile.tap(findTestObject('QR/new_qrPay_qrIconBtn'), 0)

if (Mobile.verifyElementVisible(findTestObject('Tabung/tabungEnterPasswordTxt'), 10, FailureHandling.OPTIONAL)) {
	
	//data files Testdata sheets Transfer
	Mobile.setText(findTestObject('Tabung/tabungSignInInputPasswordField'), findTestData('TestData').getValue(4, 1), 0)   

	Mobile.hideKeyboard()

	Mobile.tap(findTestObject('Tabung/tabungSignInContinueBtn'), 0)

}
    
if (Mobile.getDeviceManufacturer() == 'Xiaomi') {
   Mobile.delay(5)
} else {
    Mobile.tap(findTestObject('QR/new_qrPay_qrCodeGallery'), 0)

    Mobile.tap(findTestObject('QR/new_qrPay_selectQrCodeInGallery'), 0)

    Mobile.delay(5)
}
    
Mobile.tap(findTestObject('Object Repository/QR/qrPay_enterPin4'), 0)

Mobile.tap(findTestObject('QR/new_qrPay_enterTickBtn'), 0)

Mobile.tap(findTestObject('QR/new_qrPay_payNowBtn'), 0)

Mobile.verifyElementExist(findTestObject('QR/new_qrPay_paymentSuccessfulTxt'), 0)

//    referenceID = Mobile.getText(findTestObject('Object Repository/QR/qrPay_refIdTxt'), 0)
//
//    println(referenceID)
//
//    String test = GlobalVariable.dataFolder
//
//    String sheetName = 'Sheet1'
//
//    File file1 = new File(test)
//
//    assert file1.exists() == true
//
//    woorkbook1 = ExcelKeywords.getWorkbook(test)
//
//    sheet1 = ExcelKeywords.getExcelSheet(woorkbook1, sheetName)
//
//    ExcelKeywords.setValueToCellByIndex(sheet1, 1, 1, referenceID //(2,2)
//        )
//
//    ExcelKeywords.saveWorkbook(test, woorkbook1)

Mobile.verifyElementExist(findTestObject('QR/new_qrPay_doneBtn'), 0)

Mobile.tap(findTestObject('QR/new_qrPay_doneBtn'), 0)


