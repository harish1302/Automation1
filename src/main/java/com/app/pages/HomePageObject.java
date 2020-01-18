package com.app.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageObject extends	BasePage
{

	
//@FindBy(xpath = "//a[@title='Women']")
			@FindBy(xpath = "//*[@id='block_top_menu']/ul/li[1]/a")
			private WebElement Women;
			
			
//@FindBy(xpath = "((//a[@title='Dresses'])[2]")
			
			@FindBy(xpath = "//*[@id='block_top_menu']/ul/li[2]/a")
			private WebElement Dresses;
			

//@FindBy(xpath = "((//a[@title='T-shirts'])[2]")
			
			@FindBy(xpath = "//*[@id='block_top_menu']/ul/li[3]/a")
			private WebElement Tshirts;
			
//Find Sizes:
			
			@FindBy(xpath = "//*[@id='ul_layered_id_attribute_group_1']/li[3]/label/a")
			private WebElement SizeL;
			
			@FindBy(xpath = "//*[@id='ul_layered_id_attribute_group_1']/li[2]/label/a")
			private WebElement SizeM;
			
			@FindBy(xpath = "//*[@id='ul_layered_id_attribute_group_1']/li[1]/label/a")
			private WebElement SizeS;
			
		
public HomePageObject()
{
			PageFactory.initElements(driver , this);
}		


public WebElement getWomenTab()
{
	return Women;
}

public WebElement getDressesTab()
{
	return Dresses;
}

public WebElement getTshirtTab()
{
	return Tshirts;
}

public WebElement getSizeL()
{
	return SizeL;
}

public WebElement getSizeM()
{
	return SizeM;
}

public WebElement getSizeS()
{
	return SizeS;
}

public WebElement toDressesTab()
{
	return Dresses;
}


public void toWomenPage()
{
	Women.click(); 
	
}




//public void toDressesPage()
//{
//	DressesPage.click(); 
//	
//}

//public String womenPageTitle()
//{
//	return ;
//}	
	



}
