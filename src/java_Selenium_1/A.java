package java_Selenium_1;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class A {

	public static void main(String[] args) throws AWTException, InterruptedException {
		
		 System.setProperty("webdriver.gecko.driver", "D:\\test\\geckodriver.exe");
		 
		 FirefoxDriver driver = new FirefoxDriver();
		 driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		 
		 driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div[1]/form/div[2]/div[5]/div[1]/div[1]/button")).click();
		 
		 //control+c
		 //set system clipboard to specific path
		 
		 StringSelection str = new StringSelection("D:\\Ankita Balaganur_resume.pdf");
		 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		 
		 Thread.sleep(4000);
		 //control+v
		 
		 Robot robot = new Robot();
		 
		 //to press control+V
		 robot.keyPress(KeyEvent.VK_CONTROL);
	     robot.keyPress(KeyEvent.VK_V);
	        
	     //to release control+V key  
	     robot.keyRelease(KeyEvent.VK_V);
	     robot.keyRelease(KeyEvent.VK_CONTROL);
	     
	     //to press and release enter key
	     robot.keyPress(KeyEvent.VK_ENTER);
	     
         robot.keyRelease(KeyEvent.VK_ENTER);
	        
	}

}
