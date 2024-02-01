package java_Selenium_1;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

import javax.xml.datatype.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RobotKey {
	
	

	public static void main() throws Exception {
		
		
		
		System.setProperty("webdriver.opera.driver", "D:\\test1\\operadriver_win64\\operadriver.exe");
		
		OperaDriver driver = new OperaDriver();
		
		driver.get("");
		
		List<WebElement> findElements = driver.findElements(By.xpath(""));
		
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		StringSelection str = new StringSelection("");
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		Robot robot = new Robot();
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		
		robot.keyPress(KeyEvent.VK_ENTER);
	     
		
		
		
		
	}
	
    
}
