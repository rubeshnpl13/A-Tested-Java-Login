import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestLogin {
    private WebDriver driver;


    public void setup() {
        System.setProperty("webdriver.chrome.driver", "/Users/nishantanepal/Downloads/chromedriver_mac_arm64/chromedriver");

        // Configure Chrome options if needed
        ChromeOptions options = new ChromeOptions();
        // Add any desired options, such as disabling notifications or running in headless mode

        // Create a new ChromeDriver instance
        driver = new ChromeDriver(options);

    }

    public void teardown() {
        // Quit the WebDriver instance
        driver.quit();

}
    public void testLogin() {
        // Navigate to the login page
        driver.get("http://localhost:8080/Login_war_exploded/");
       // driver.get("https://practice-cybertekschool.herokuapp.com/login");

        // Find the username and password input fields and the login button
        WebElement usernameInput = driver.findElement(By.id("usertxt"));
        WebElement passwordInput = driver.findElement(By.id("userpsd"));
        WebElement loginButton = driver.findElement(By.id("login"));

        // Enter the username and password
        usernameInput.sendKeys("admin");
        passwordInput.sendKeys("admin");

        // Click the login button
        loginButton.click();

        // Perform assertions or verifications to validate the login result
        // For example, check if a success message is displayed
        WebElement successMessage = driver.findElement(By.id("successMessage"));
        // Assert or verify the success message text or presence

        // Alternatively, you can use Selenium's built-in assertions like Assert.assertEquals()
    }

    public static void main(String[] args){
            TestLogin testSite = new TestLogin();
            testSite.setup();

            // Run the test cases
            testSite.testLogin();

            testSite.teardown();


    }

}

