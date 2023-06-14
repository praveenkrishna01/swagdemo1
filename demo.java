package praveena;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class demo{
	ChromeDriver driver = new ChromeDriver();
	
	
	  WebDriver driver1=new ChromeDriver();
	  
	@BeforeMethod
	public void url()
	{
	driver.get(" https://www.saucedemo.com/");
	}
	
     @Test
     public void login()
     {
    	WebElement username=driver.findElement(By.id("//*[@id=\"user-name\"]"));
    	WebElement password=driver.findElement(By.id("//*[@id=\"password\"]"));
    	WebElement login=driver.findElement(By.name("//*[@id=\"login-button\"]"));
    	username.sendKeys("standard_user");
    	password.sendKeys("secret_sauce");
    	login.click();
    	String actualUrl="https://www.saucedemo.com/";
    	String expectedUrl=driver.getCurrentUrl();
    	Assert.assertEquals(expectedUrl,actualUrl);
     
    	  
    	  WebElement price=driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select"));
    	  Select se=new Select(price);
    	  se.selectByVisibleText("price(low to high)");
    	  
    	 driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
    	 driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bike-light\"]")).click();
    	 driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]")).click();
    	 driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-onesie\"]")).click();
    	 driver.findElement(By.xpath("//*[@id=\"add-to-cart-test.allthethings()-t-shirt-(red)\"]")).click();
    	 
    	  
    	 driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
    	 List<WebElement>remove=driver1.findElements(By.xpath("//*[@id=\"header_container\"]/div[2]/span"));
    	for(int i=0;i<15;i++);
    	{
    	   remove.get(15).click();	
    	   if(remove.size()<15) 
    	   {
    		  break;
    	   }
    	
    	 
    		 
    	} }
     
     @Test
       public void checkout()
       {
    	 
    	 driver.findElement(By.id("checkseout")).click();
    	 driver.findElement(By.id("first-name")).sendKeys("vinson");
    	 driver.findElement(By.id("last-name")).sendKeys("joy");
    	 driver.findElement(By.id("postal-code")).sendKeys("568745");
    	 driver.findElement(By.id("continue")).click();
    	 driver.findElement(By.id("finish")).click();
    	driver.findElement(By.id("back-to-products")).click();
    	driver.findElement(By.id("react-burger-menu-btn")).click();
    	driver.findElement(By.id("logout_sidebar_link")).click();
    	driver.quit();
     }
     {
    	 
    	 {
    		 
    	 }
    	 
    	  
    	  
    	  
    	  
    	  
     }
     
     }
