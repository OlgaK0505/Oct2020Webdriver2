import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class GoogleSearchTest {

    WebDriver driver;

    //1. Open the browser
    //2. Navigate to the main Google page
    //3. Type the query
    //4. Submit the query
    //5. Verify the results page
    @Test
    public void testName() {
        openBrowser();
        navigatToMainPage();
        typeQuery();
    }

    private void typeQuery() {
        String selector = ".gLFyf";
        WebElement element = driver.findElement(By.cssSelector(selector));
        element.sendKeys("Portnov Computer School");
    }

    private void navigatToMainPage() {
        driver.get("https://google.com/");
    }

    private void openBrowser() {
        System.setProperty("webdriver.gecko.driver","src/test/resourses/driver/win64/geckodriver.exe");
        driver = new FirefoxDriver();
    }
}


/*
// not same with teacher
    <properties>
        <maven.compiler.source>8</maven.compiler.source>
        <maven.compiler.target>8</maven.compiler.target>
    </properties>
 */