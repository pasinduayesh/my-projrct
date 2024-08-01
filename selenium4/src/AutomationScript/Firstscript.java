package AutomationScript;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Firstscript {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dark Lion\\Desktop\\New folder\\chromedriver-win64\\chromedriver.exe");

        // Instantiate a ChromeDriver class
        ChromeOptions options = new ChromeOptions();
        options.addArguments("user-data-dir=D:\\Chrome\\NewProfile");
        options.setBinary("C:\\Users\\Dark Lion\\Desktop\\New folder\\chrome-win64\\chrome.exe"); // Set the path to your Chrome binary
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize(); // Maximize Window

        driver.get("http://localhost/Online-Gym-Management-System-in-PHP-main/Admin/login.php");

        // Provide username
        WebElement username = driver.findElement(By.name("email"));
        username.isDisplayed();
        username.isEnabled();
        username.sendKeys("admin@gmail.com");

        // Provide password
        WebElement password = driver.findElement(By.name("password"));
        password.isDisplayed();
        password.isEnabled();
        password.sendKeys("ayesh12PAK");

        // Clicking on a login button
        WebElement loginButton = driver.findElement(By.name("submit"));
        loginButton.isDisplayed();
        loginButton.isEnabled();
        loginButton.click();
    }
}
