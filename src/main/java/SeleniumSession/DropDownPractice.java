package SeleniumSession;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownPractice {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver =  new FirefoxDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        driver.findElement(By.className("ico-register")).click();

        WebElement day = driver.findElement(By.name("DateOfBirthDay"));
        WebElement month = driver.findElement(By.name("DateOfBirthMonth"));
        WebElement year = driver.findElement(By.name("DateOfBirthYear"));

        Select select = new Select(day);
        select.selectByVisibleText("11");


        Select select1 = new Select(month);
        select1.selectByVisibleText("November");

        Select select2 = new Select(year);
        //select2.selectByVisibleText("2020");
        select2.selectByIndex(5);





    }
}
