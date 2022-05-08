import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumTest {
    public static void main(String[] args){
        System.setProperty("webdriver.gecko.driver", "/root/Documents/geckodriver");
        WebDriver driver=new FirefoxDriver();
        String url = "http://www.google.se";
        driver.get(url);
        driver.findElement(By.id("L2AGLb")).click();
        driver.findElement(By.name("q")).sendKeys("Luleå Hockey");
        driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
    }
}