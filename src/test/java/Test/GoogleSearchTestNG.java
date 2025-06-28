package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.googleSearchHomePage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchTestNG {
	
	public static void main(String[] args) throws InterruptedException {
		googlesearchtestOne();
		
	}
	
	
	public static void googlesearchtestOne() throws InterruptedException{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		googleSearchHomePage googSearch = new googleSearchHomePage(driver); 
		
		driver.get("https://www.google.co.uk/");
		
		driver.findElement(By.id("L2AGLb")).click();

		Thread.sleep(4000);
		
		googSearch.setText("Soumadip Patra");
		googSearch.clickSearchButton();
		
		Thread.sleep(4000);
		driver.close();
		driver.quit();
		
		
	}

}
