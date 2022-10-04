package com.my.keywords.android

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

import io.appium.java_client.AppiumDriver as AppiumDriver

import internal.GlobalVariable

public class scroll {

	Dimension size;
	public void testscroll() {
		size = driver.manage().window().getSize();

		System.out.println(size);

		Double screenHeightStart = size.getHeight() * 0.5;

		int scrollStart = screenHeightStart.intValue();
		System.out.println(scrollStart);

		Double screenHeightEnd = size.getHeight() * 0.2;

		int scrollEnd = screenHeightEnd.intValue();
		System.out.println(screenHeightEnd);
		driver.swipe(0, scrollStart, 0, scrollEnd, 1000);
	}
}