package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\.eclipse\\java-2019-093\\eclipse\\Ani\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://greenstech.in/selenium-course-content.html");
	WebElement txtElement = driver.findElement(By.xpath(" //p[text()='Roles & Responsibilities']"));
	WebElement text = driver.findElement(By.xpath(" //p[text()=' Interview Questions']"));
	JavascriptExecutor jk=(JavascriptExecutor)driver;
	jk.executeScript("arguments[0].scrollIntoView(true)",txtElement);
	jk.executeScript("arguments[0].scrollIntoView(false)",text);	
}
}
