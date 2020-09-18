package com.jpetstore.tests;

import static org.junit.Assert.assertEquals;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.jpetstore.steps.PetStoreSteps;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;

@RunWith(SerenityRunner.class)
public class AccountsPageTest {
	
	@Managed
	WebDriver driver;
	
	@Steps
	PetStoreSteps shopper;
	
	
	@Test
	@Title("Add a new user to store & verify if the new user can login")
	public void addNewUserToStoreAndVerify() throws InterruptedException {
	
		  String generatedString = RandomStringUtils.randomAlphabetic(10);
		
		String userName = RandomStringUtils.randomAlphabetic(10);//"irfanserenity";
		String password= "abc123";
		String repeatPassword= "abc123";
		String firstName= "irfan";
		String lastName= "tursun";
		String email= "test@gmail.com";
		String phoneNumber= "1231231233";
		String addr1= "123 rue st martin";
		String addr2= "123 main st";
		String city= "Paris";
		String state= "VA";
		String zipCode= "12312";
		String country= "USA";
		
		
		
		shopper.navigateToLoginPage();
		
		shopper.navigateToRegistrationPage();
		

		shopper.addNewUserInformation(userName, password, repeatPassword);
		

		
		shopper.addAccountInformation(firstName, lastName, email, phoneNumber, addr1, 
				addr2, city, state, zipCode, country);
		
		shopper.addProfileInformation("english", "DOGS", true, true);
			
		shopper.clickSaveAccountInformation();
		
		shopper.doLogin(userName, password);
		
		String greetingMessage =  shopper.getGreetingMessage();
		
		assertEquals("Welcome " + firstName + "!", greetingMessage);
		
	}

}
