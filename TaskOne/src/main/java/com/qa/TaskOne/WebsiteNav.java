package com.qa.TaskOne;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebsiteNav {

	@FindBy(xpath="//*[@id=\"j_username\"]")
		private WebElement adminUsername;
		
		public WebElement typeAdminUsername() {
			return adminUsername;
		}
	@FindBy(xpath="/html/body/div/div/form/div[2]/input")
		private WebElement adminPass; 
	
		public WebElement typeAdminPass() {
			return adminPass;
		}
	
	@FindBy(xpath="//*[@id=\"tasks\"]/div[4]/a[2]")
		private WebElement manageJenkins;
	
		public WebElement navManageJenkins() {
			return manageJenkins; 
		}
		
	@FindBy(xpath="//*[@id=\"main-panel\"]/div[17]/a/dl/dt")
		private WebElement manageUsers;
	
		public WebElement navManageUsers() {
			return manageUsers; 		
		}
		
	@FindBy(linkText = "Create User") 
		private WebElement createUserPage; 
	
		public WebElement navCreateUserPage() {
			return createUserPage; 
		}
		
	@FindBy(xpath = "//*[@id=\"main-panel\"]/p/a")
		private WebElement viewPeople; 
	
		public WebElement navPeoplePage() {
			return viewPeople; 
		}
}

