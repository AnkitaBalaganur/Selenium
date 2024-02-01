package java_Selenium_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class B {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver", "D:\\test\\geckodriver.exe");
		 
		 FirefoxDriver driver = new FirefoxDriver();
		 driver.get("https://www.fb.com");
	
		 
	   WebElement username = driver.findElement(By.name("email"));
		 username.sendKeys("ankita@gmai.com");
		 
		 
		 WebElement password = driver.findElement(By.name("pass"));
		 password.sendKeys("ankita");
		 
		 driver.findElement(By.linkText("Forgotten password?")).click();
		 
		 driver.navigate().back();
		 Thread.sleep(1000);
		 driver.navigate().forward();
		 Thread.sleep(1000);
		 driver.navigate().refresh();
		 Thread.sleep(1000);
		driver.close();

}
}
