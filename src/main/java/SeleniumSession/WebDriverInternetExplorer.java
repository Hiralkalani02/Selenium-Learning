package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import static org.openqa.selenium.By.className;

public class WebDriverInternetExplorer {
    public static void main(String[] args) {
        System.setProperty("webdriver.ie.driver","C:\\Users\\goldenguitar\\IdeaProjects\\Software\\IEDriverServer_x64_4.0.0.\\IEDriverServer.exe");

        WebDriver driver = new InternetExplorerDriver();
        driver.get("https://demo.nopcommerce.com");
        driver.manage().window().maximize();

        driver.findElement(By.className("ico-login")).click();
        driver.findElement(By.id("Email")).sendKeys("hir@y.com");
        driver.findElement(By.id("Password")).sendKeys("test007");
        driver.findElement(By.className("login-button")).click();
    }

}
