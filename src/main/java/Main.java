import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\avlaso\\chromedrivers\\chromedriver_win32_97.0.4692.71\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com");

        WebElement inputEl = driver.findElement(By.xpath("//input[@aria-label=\"Пошук Google\"]"));
        
        inputEl.click();
    }
}