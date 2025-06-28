package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class googleSearchHomePage {

	WebDriver driver= null;

	By googleSearchTextBox= By.name("//textarea[@aria-label='Search']");
	By googleSearchEnterButton= By.xpath("//input[@aria-label='Google Search']");

	public googleSearchHomePage( WebDriver driver) {
		this.driver= driver; 
	}

	public void setText(String text)
	{
		
		driver.findElement(googleSearchEnterButton).sendKeys(text);
		
	}

	public void clickSearchButton()
	{
		driver.findElement(googleSearchEnterButton).sendKeys(Keys.RETURN);
	}

}
