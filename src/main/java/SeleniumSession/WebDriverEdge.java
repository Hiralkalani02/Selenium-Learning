package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WebDriverEdge {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver","C:\\Users\\goldenguitar\\IdeaProjects\\Software\\edgedriver_win64\\msedgedriver.exe");

        WebDriver driver = new EdgeDriver();
        driver.get("https://demo.nopcommerce.com/"); //Edge webpage launching
        driver.manage().window().fullscreen();
        driver.manage().window().maximize();

        driver.findElement(By.className("ico-login")).click();//Register page click

        driver.findElement(By.className("email")).sendKeys("hir@y.com");

        driver.findElement(By.id("Password")).sendKeys("test007");

        driver.findElement(By.className("login-button")).click();




    }

}
