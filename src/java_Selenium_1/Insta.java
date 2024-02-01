package java_Selenium_1;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Insta {
	public static void main(String[] args) {
         System.setProperty("webdriver.gecko.driver", "D:\\test\\geckodriver.exe");
		 
		 FirefoxDriver driver = new FirefoxDriver();
		 driver.get("https://www.instagram.com");
		 
		 driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div/div[1]/section/main/article/div[2]/div[1]/div[2]/form/div/div[1]/div/label/input")).sendKeys("99885421");
		 
		 driver.findElement(By.name("password")).sendKeys("arb");
		 
		 driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div/div[1]/section/main/article/div[2]/div[1]/div[2]/form/div/div[3]")).click();
		 
		 
	}

}
