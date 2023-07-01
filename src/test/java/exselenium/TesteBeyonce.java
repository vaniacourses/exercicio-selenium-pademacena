package exselenium;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TesteBeyonce {
	
	protected WebDriver driver;
	
	@BeforeClass
	public static void configuraDriver() {
		System.setProperty("webdriver.gecko.driver", "/Users/paulomac/Desktop/geckodriver");
	}
	
    @Before
    public void createDriver() {  
    
		driver = new FirefoxDriver();
        driver.get("https://pt.wikipedia.org/wiki/Beyonc%C3%A9");
    }	

	@Test
	public void test() {
//		fail("Not yet implemented");
		WebElement elemento = driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/main/div[3]/div[3]/div[1]/table[1]/tbody/tr[5]/td[2]/a[2]"));
		String texto = elemento.getAttribute("title");
		System.out.println("Ano de nascimento é "+ texto);
	}
	
    @After
    public void quitDriver() {
//    	driver.quit();
    }
}
