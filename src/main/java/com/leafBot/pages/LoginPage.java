package com.leafBot.pages;

import org.openqa.selenium.WebElement;

import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods {

	public LoginPage() {
		
	}
	
	public void enterUserName(WebElement ele, String username) {
		locateElement("id","username");
		clearAndType(ele,"Demosalesmanager");
	}
	
	public void enterPassword(WebElement ele, String password) {
		locateElement("id","password");
		clearAndType(ele,"crmsfa");
	}
	public void ClickLoginButton(WebElement ele) {
		locateElement("Class","decorativeSubmit");
		click(ele);
	}
	
}
