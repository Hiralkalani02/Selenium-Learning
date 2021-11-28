package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.util.concurrent.TimeUnit;

public class NavigationConcept
{
    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","C:\\Users\\goldenguitar\\IdeaProjects\\Software\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver= new ChromeDriver();

        driver.get("https://demo.nopcommerce.com/");
        //Thread.sleep(3000);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);//Implicit wait

        //Thread.sleep(3000);
        driver.findElement(By.className("ico-register")).click();

        //Thread.sleep(3000);
        driver.navigate().back();

        //Thread.sleep(3000);
        driver.navigate().forward();

        //Thread.sleep(3000);
        driver.navigate().back();

        //Thread.sleep(3000);
        driver.navigate().refresh();

        String url= driver.getTitle();
        System.out.println(url);
        
    }


}
