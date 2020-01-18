package com.app.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.app.pages.BasePage;
import com.app.pages.HomePageObject;

public class HomePageTest {
	
HomePageObject hp;
BasePage bp;
public HomePageTest(){
	
	hp= new HomePageObject();
	bp= new BasePage();
	
} 
	
@Test
public void verifyWomenTabs()
{
	Assert.assertTrue(hp.getWomenTab().isDisplayed());
}
@Test
public void verifyDressesTabs()
{
	Assert.assertTrue(hp.getDressesTab().isDisplayed());
}
@Test
public void verifyTshirtTabs()
{
	Assert.assertTrue(hp.getTshirtTab().isDisplayed());
}

@Test
public void verifySize()
{
	Assert.assertTrue(hp.getSizeL().isDisplayed());
	Assert.assertTrue(hp.getSizeM().isDisplayed());
	Assert.assertTrue(hp.getSizeS().isDisplayed());
}



//@Test
//
//public void checksWomenContain()
//{
//assert.assertEquals(actual, expected);
//}



}




