package SeleniumSession;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class MonthList {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();

        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        driver.findElement(By.className("ico-register")).click();
        WebElement month = driver.findElement(By.name("DateOfBirthMonth"));
        Select select = new Select(month);

        List<WebElement> monthList= select.getOptions();
        System.out.println(monthList.size());

        for(int i=0; i< monthList.size();i++){
            String value =monthList.get(i).getText();
            System.out.println(value); }




    }
}
