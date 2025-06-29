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

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		googlesearchtestOne();
	}

	public static void googlesearchtestOne() throws InterruptedException 
	{
		
	
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		driver.findElement(By.name("name")).sendKeys("Soumadip Patra");
		driver.findElement(By.name("email")).sendKeys("patra.soumadip1993@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("Souma444@@");
		driver.findElement(By.id("exampleCheck1")).click();
		WebElement dropdown= driver.findElement(By.cssSelector("#exampleFormControlSelect1"));
		Select sel= new Select(dropdown);
		sel.selectByVisibleText("Male");
		driver.findElement(By.cssSelector("#inlineRadio1")).click();
		
		driver.findElement(By.xpath("//input[@name='bday']")).sendKeys("05-12-1993");
		
		driver.findElement(By.cssSelector(".btn.btn-success")).click();
		
		Thread.sleep(2000);
		
		String output=(driver.findElement(By.cssSelector(".alert.alert-success.alert-dismissible")).getText());
		
		output=output.substring(1);
		System.out.println(output);
		
		System.out.println("This is a new change and I'm happy about it");
		System.out.println("hi ");
		System.out.println("Now I'm changing my CHANGES file");
		System.out.println("I'm in develop branch+++++");
		System.out.println("I'M in new Brach lets see");
		
	
	}
	}
