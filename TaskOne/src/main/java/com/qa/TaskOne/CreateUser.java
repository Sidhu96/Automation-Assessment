package com.qa.TaskOne;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class CreateUser {
		
	@FindBy(linkText = "Create User")
		private WebElement createUser; 
	
	public WebElement userScreen() {
		return createUser;
	}
	
	@FindBy(id = "username")
		private WebElement username; 
	
	public WebElement typeUserName() {
		return username;
	}
	
	@FindBy(name = "password1")
		private WebElement password1; 
	
	public WebElement typePassword1() {
		return password1; 
	}
	
	@FindBy(name = "password2")
		private WebElement password2;
	
	public WebElement typePassword2() {
		return password2; 
	}
	
	@FindBy(name = "fullname")
		private WebElement fullname;
	
	public WebElement typeName() {
		return fullname; 
	}
	
	@FindBy(name = "email")
		private WebElement email; 
	
	public WebElement typeEmail() {
		return email; 
	}
	
	@FindBy(id = "yui-gen1-button")
		private WebElement cButton;
	
	public WebElement createButton() {
		return cButton; 
	}
	
	
}

	
	

