package org.facebook;

import java.awt.Frame;
import java.awt.Robot;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	public static WebDriver driver;
	public static WebElement element;
	public static Robot r;
	public static Actions a;
	public static Select s;
	public static Alert alert;
	public static Frame f;

	public static void launchBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\dell\\\\eclipse-workspace\\\\Selenium\\\\driver\\\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	public static void url(String url) {
		driver.get(url);
	}

	public static void toinPut1(WebElement element, String input) {
		element.sendKeys(input);
	}
	public static void toclk(WebElement elements) {
  element.click();
	}

	public static void switchTo() {
		driver.switchTo();
	}

	public static void close() {
		driver.close();
	}

	public static void toinPut(WebElement element, String input) {
		element.sendKeys(input);
	}

	public static void get(String url) {
		driver.get(url);
	}

	public static void getTitle() {
		driver.getTitle();
	}

	public static void getCurrentUrl() {
		driver.getCurrentUrl();
	}

	public static void windowHandle() {
		driver.getWindowHandle();
	}

	public static void windows() {
		driver.getWindowHandles();
	}

	public static void pages() {
		driver.getPageSource();
	}

	public static void manage() {
		driver.manage();
	}

	public static void toquit() {
		driver.quit();
	}

	public static void navigate() {
		driver.navigate();
	}

	public static void gettext() {
		element.getText();
	}

	public static void getAttribute(String name) {
		element.getAttribute(name);
	}

	public static void clear() {
		element.clear();
	}

	public static void clk(WebElement target) {
		a.contextClick(target).perform();;
	}

	public static void clkdouble(WebElement target) {
		
		a.doubleClick(target).perform();;
	}

	public static void dragAndDrop(WebElement source, WebElement target) {
		a.dragAndDrop(source, target).perform();;
	}

	public static void getOptions() {
		s.getOptions();
	}

	public static void isMultiple() {
		s.isMultiple();
	}

	public static void selectByValue(String value) {
		s.selectByValue(value);
	}

	private void selectByVisibleText(String text) {
		s.selectByVisibleText(text);
	}

	public static void selectByIndex(int index) {
		s.selectByIndex(index);
	}

	public static void getAllSelectedoptions() {
		s.getAllSelectedOptions();
	}

	private void getFirstselectedoptions() {
		s.getFirstSelectedOption();
	}

	private void deSelectByValue(String value) {
		s.deselectByValue(value);
	}

	private void deSelectByVisibleText(String text) {
		s.deselectByVisibleText(text);
	}

	private void deSelectByIndex(int index) {
		s.deselectByIndex(index);
	}

	private void deSelectAll() {
		s.deselectAll();
	}

	public static void rob(int keycode) {
		r.keyPress(keycode);
	}

	public static void keyrel(int keycode) {
		r.keyRelease(keycode);
	}

	private void alt() {
		// TODO Auto-generated method stub
		alert.accept();
	}

	private void dis() {
		// TODO Auto-generated method stub
		alert.dismiss();
	}

}
