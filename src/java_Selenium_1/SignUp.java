package java_Selenium_1;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignUp {
	
		public static void main(String[] args) {
			WebDriver driver = new  ChromeDriver() ;
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

			//WebDriverWait wait = new WebDriverWait(driver);
			
			driver.get("https://www.instagram.com/");
			driver.findElement(By.className("_aa4b")).sendKeys("sam");
			driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("sam@12@%21*");
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			System.out.println(driver.findElement(By.className("_ab2z")).getText());
			driver.findElement(By.linkText("Forgot password?")).click();
		}

	}

