package seleniumFrameworkPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class practiceTests {


	public static void main(String[] args) throws InterruptedException {




		//System.setProperty("webdriver.gecko.driver","D:\\Java_Projects\\Automation\\seleniumFrameworkPractice\\Driver\\FirefoxDriver\\geckodriver.exe");
		//WebDriver driver= new FirefoxDriver();

		//System.setProperty("webdriver.chrome.driver","D:\\Java_Projects\\Automation\\seleniumFrameworkPractice\\Driver\\ChromeDriver\\chromedriver.exe");
		//WebDriver driver= new ChromeDriver();

		WebDriverManager.chromedriver().setup();
		//WebDriverManager.firefoxdriver().setup();
		WebDriver driver= new ChromeDriver();


		driver.get("https://consulat.gouv.fr/en/ambassade-de-france-en-irlande/appointment?name=Visas");

//		try {
//			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//
//			WebElement acceptButton = wait.until(ExpectedConditions.elementToBeClickable(
//					By.xpath("//button[contains(@aria-label,'Accept')]")
//					));
//			acceptButton.click();
//			System.out.println("Accepted Google cookies consent");
//		} catch (Exception e) {
//			System.out.println("No consent popup appeared.");
//		}
//
//		driver.findElement(By.xpath("//input[@placeholder='Search']")).click();
//

		Thread.sleep(3000);


		driver.close();
		driver.quit();

	}

}
