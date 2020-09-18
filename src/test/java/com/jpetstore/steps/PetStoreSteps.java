package com.jpetstore.steps;

import com.jpetstore.pages.AccountsPage;
import com.jpetstore.pages.BasePage;
import com.jpetstore.pages.DashBoardPage;
import com.jpetstore.pages.LoginPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class PetStoreSteps extends ScenarioSteps {

	BasePage basePage;
	LoginPage loginPage;
	AccountsPage accountPage;
	DashBoardPage dashBoardPage;
	
	
	@Step("Signing out from the store")
	public DashBoardPage signOut() {

		return basePage.signOut();
	}
	
	@Step("Navigating to Login Page")
	public LoginPage navigateToLoginPage() {

		return basePage.navigateToSignOnPage();
	}


	@Step("Clicking on Company Logo & navigating to the DashBoard")
	public DashBoardPage navigateToDashBoard() {
		
		return basePage.navigateToDashBoard();
	}

	@Step("Navigating to Accounts Page")
	public AccountsPage navigateToMyAccountsPage() {

		return basePage.navigateToAccountPage();
	}


	
	@Step("Getting Invalid Login Message")
	public String getMessageOnInvalidLogin() {
		
		return loginPage.getMessageOnInvalidLogin();
	}
	
	@Step("Navigating to user registration page")
	public AccountsPage navigateToRegistrationPage() {
		
		return loginPage.navigateToRegistrationPage();
	}
	
	@Step("Logging into the application with userName: {0} & passsword: {1}")
	public DashBoardPage doLogin(String userName, String password) {
		
		basePage.clickSignOnLink();
		return loginPage.doLogin(userName, password);
	}
	
	
	@Step("Adding new user information with userName: {0} ,password: {1} , repeatPassword: {2}")
	public AccountsPage addNewUserInformation(String userName , String password 
			, String repeatPassword) {
		
		return accountPage.addNewUserInformation(userName, password, repeatPassword);
	}
	
	
	@Step("Adding account information- firstname:{0} , lastName:{1}," +
		 " email:{2}, phone:{3}, addr1:{4}, addr2: {5}, city:{6}, "  +
		 "state:{7}, zip:{8}, country:{9} ")
	public AccountsPage addAccountInformation(String firstName , 
											  String lastName , 
											  String email ,
											  String phone ,
											  String addr1 , 
											  String addr2 ,
											  String city ,
											  String state , 
											  String zip ,
											  String country) {
		
		
		return accountPage.addAccountInformation(firstName,
												 lastName, 
												 email, 
												 phone, 
												 addr1, 
												 addr2, 
												 city, 
												 state, 
												 zip, 
												 country);
	}
	
	@Step("Adding profile information - language:{0} ,category: {1} ,myList: {2} ,myBanner:{3}")
	public AccountsPage addProfileInformation(String language, 
											  String category , 
											  boolean myList , 
											  boolean myBanner) {
		
		return accountPage.addProfileInformation(language, 
												 category, 
												 myList, 
												 myBanner);	
	}
	
	@Step("Saving account information")
	public DashBoardPage clickSaveAccountInformation() {
		
		return accountPage.clickSaveAccountInformation();
		
	}

	@Step("Getting the greeting message")
	public String getGreetingMessage() {
		
		return dashBoardPage.getGreetingMessage();
	}
	
	
	
	
	
	
}
