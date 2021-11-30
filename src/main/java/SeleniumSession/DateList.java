package SeleniumSession;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DateList {
    public static void main(String[] args) {

        //THis program is to print list of days from registration page

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();

        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        driver.findElement(By.className("ico-register")).click();
        //driver.findElement(By.name("DateOfBirthDay"));

        WebElement day = driver.findElement(By.name("DateOfBirthDay"));
        Select select = new Select(day);

        List<WebElement> dayList= select.getOptions();
        System.out.println(dayList.size());

        for(int i=0; i< dayList.size();i++){
            String value =dayList.get(i).getText();
            System.out.println(value);

        }
    }
}