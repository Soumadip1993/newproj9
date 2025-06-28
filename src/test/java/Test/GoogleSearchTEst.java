package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.security.Key;
import java.time.Duration;
import java.util.List;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class GoogleSearchTEst {

	public static void main(String[] args) {
		try {
			googlesearchtestOne();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void googlesearchtestOne() throws InterruptedException {
		// Setup ChromeDriver properly
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		try {
			driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
			driver.manage().window().maximize();
			driver.findElement(By.cssSelector("#autosuggest")).sendKeys("India");

			WebElement selectStaticDD= driver.findElement(By.name("ctl00$mainContent$DropDownListCurrency"));

			Select sel= new Select(selectStaticDD);

			sel.selectByVisibleText("AED");
			List<WebElement> listofDD = sel.getOptions();
			for(WebElement we: listofDD)
				System.out.println(we.getText());
			System.out.println(sel.getFirstSelectedOption().getText());
			//System.out.println(Assert.assertTrue(driver.findElement(By.id("checkBoxOption1")).isSelected()));
			//WebElement selectStaticDD= driver.findElement(By.
			

			//_______________________________________________________________________________another dropdown test 
			
			
			System.out.println("_______________________Another Test________________");

			WebElement webel= driver.findElement(By.id("divpaxinfo"));
			webel.click();
			Thread.sleep(3000);
			int count=5;

			for(int i=1; i<count;i++)
			{
				driver.findElement(By.id("hrefIncAdt")).click();
				//Thread.sleep(2000);
				driver.findElement(By.id("hrefIncChd")).click();
			}
			driver.findElement(By.id("btnclosepaxoption")).click();

			System.out.println(webel.getText());
			
			//___________________________________________Dynamic Dropdown
			
			System.out.println("_________________________________________Dynamic dropdown");
			
			
			driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
			Thread.sleep(2000);
			
			WebElement wel= driver.findElement(By.xpath("//a[@value='PNY']"));
			wel.click();
			
			System.out.println("The text is ::"+ driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).getAttribute("selectedtext"));
			
			//__________________________________________AUtoSuggested dropdown
			
			System.out.println("__________________________________________AutoSuggested DD");
			
			
			WebElement db= driver.findElement(By.id("autosuggest"));
			db.clear();
			db.sendKeys("Ind");
			Thread.sleep(3000);
			
			List<WebElement> options= driver.findElements(By.cssSelector("li.ui-menu-item a"));
			
			for(WebElement w: options )
			{
				System.out.println(w.getText());
				if(w.getText().equalsIgnoreCase("India"))
				{
					w.click();
					
					break;
					
				}
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			

		} finally {
			// Clean up
			//driver.quit();
		}
	}
}
