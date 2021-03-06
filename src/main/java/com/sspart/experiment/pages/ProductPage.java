package com.sspart.experiment.pages;

import org.openqa.selenium.By;

import com.sspart.experiment.utils.DriverUtils;

public class ProductPage extends DriverUtils{
	public void switchToProductPage(String productName) {
		for(String windowHandle : driver.getWindowHandles()) {
			driver.switchTo().window(windowHandle);
			if(driver.getTitle().contains(productName)) {
				return;
			}
		}
	}
	public void printPrice() {
		System.out.println(driver.findElement(By.xpath(props.getProperty("amazon.deal.price"))).getText());
	}
	public void switchBack() {
		for(String windowHandle : driver.getWindowHandles()) {
		driver.switchTo().window(windowHandle);
	}
	}
}