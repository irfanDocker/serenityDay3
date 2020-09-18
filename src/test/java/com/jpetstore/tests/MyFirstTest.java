package com.jpetstore.tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Title;

@RunWith(SerenityRunner.class)
public class MyFirstTest extends PageObject{
	
	@Managed
	WebDriver driver;
	
	@Title("This is my first serenity test method!!!!!")
	@Test
	public void navigateToGooglePage() throws InterruptedException {
		
		open();
		
		Thread.sleep(3000);
	}
}
