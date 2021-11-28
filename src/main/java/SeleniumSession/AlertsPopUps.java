package SeleniumSession;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertsPopUps {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver =  new FirefoxDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.findElement(By.className("search-box-button")).click();
        Thread.sleep(3000);

        Alert alert = driver.switchTo().alert();
        String text = alert.getText();
        System.out.println(text);

        Thread.sleep(3000);
        alert.accept();

    }
}
