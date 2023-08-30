import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class IamNeoTest {
  public static void main(String[] args) {
    
    System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
    
    WebDriver driver = new ChromeDriver();
    
    driver.manage().window().maximize();
    
    driver.get("http://iamneo.ai");
    
    String expectedTitle = "We are Hiring!";
    String actualTitle = driver.getTitle();
    if (actualTitle.equals(expectedTitle)) {
      System.out.println("PASS: Page title matches expected value");
    } else {
      System.out.println("FAIL: Page title does not match expected value");
    }
    driver.navigate().to("https://www.facebook.com");
    
    driver.navigate().back();
    
    System.out.println("Current URL: " + driver.getCurrentUrl());
    
    driver.navigate().forward();
    
    driver.navigate().refresh();
    
    driver.quit();
  }
}
