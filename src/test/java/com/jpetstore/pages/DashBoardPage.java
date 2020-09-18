package com.jpetstore.pages;

public class DashBoardPage  extends BasePage{
	private static final String GREETING_MSG = "//*[@id='WelcomeContent']";

	public String getGreetingMessage() {

		return waitFor(GREETING_MSG).$(GREETING_MSG).getText();
	}
	
}
