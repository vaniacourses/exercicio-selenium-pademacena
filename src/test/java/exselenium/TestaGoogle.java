package exselenium;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestaGoogle {
	
	protected WebDriver driver;
	
	@BeforeClass
	public static void configuraDriver() {
		System.setProperty("webdriver.gecko.driver", "/Users/paulomac/Desktop/geckodriver");
	}
	
    @Before
    public void createDriver() {  
    
		driver = new FirefoxDriver();
        driver.get("https://accounts.google.com/signup/v2/createaccount?biz=false&cc=BR&continue=https%3A%2F%2Fclassroom.google.com&dsh=S755197386%3A1687820192033730&flowEntry=SignUp&flowName=GlifWebSignIn&ifkv=Af_xneG2HB0A-a-l6fmQwKU85XXDqXCa1OTQlp5ic5ifb3DcApNGfjox4u8XFrvFSQ_IgB0ESeIjqw");
    }	

	@Test
	public void test() {
//		fail("Not yet implemented");
		WebElement firstName = driver.findElement(By.id("firstName"));
		firstName.sendKeys("Preencher");
		WebElement lastName = driver.findElement(By.id("lastName"));
		lastName.sendKeys("Nome ");
		WebElement sendButton = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div/div/div/button"));
		sendButton.click();
		assertTrue(driver.getTitle().contains("Teste de Software - Pesquisa Google"));
	}
	
    @After
    public void quitDriver() {
//    	driver.quit();
    }
}
