package com.util;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Highlighter {
	
	public static void getColor(WebDriver driver,WebElement element) {
	JavascriptExecutor js =(JavascriptExecutor)driver;
	js.executeScript("arguments[0].style.border='5px solid red'", element);

	}
	
	public static void getColor(WebDriver driver,WebElement element,String colorName) {
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].style.border='5px solid red'", element,"+colorName+");

		}
}
