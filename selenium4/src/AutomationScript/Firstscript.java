package AutomationScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Firstscript {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dark Lion\\Desktop\\New folder\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("http://localhost/Online-Gym-Management-System-in-PHP-main/Admin/login.php");
		
		//provide username
				WebElement username = driver.findElement(By.name("email"));
				username.isDisplayed();
				username.isEnabled();
				username.sendKeys("admin@gmail.com");
				
				//provide password
				WebElement password = driver.findElement(By.name("password"));
				password.isDisplayed();
				password.isEnabled();
				password.sendKeys("ayesh12PAK");
				
				//clicking on a login button
				WebElement loginButton = driver.findElement(By.name("submit"));
				loginButton.isDisplayed();
				loginButton.isEnabled();
				loginButton.click();
		
	}

}
 