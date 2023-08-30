import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SeleniumAssignment {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void testScenario() {
       
        driver.get("http://iamneo.ai");

        
        String expectedTitle = "We are Hiring!";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Title does not match");

        
        driver.navigate().to("https://www.facebook.com");

        
        driver.navigate().back();

        
        String currentURL = driver.getCurrentUrl();
        System.out.println("Current URL: " + currentURL);

        
        driver.navigate().forward();

        
        driver.navigate().refresh();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
