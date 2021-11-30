package SeleniumSession;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class RegistrationPage {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        WebDriverWait wait=new WebDriverWait(driver,20);//Explicit wait
        driver.findElement(By.className("ico-register")).click();

        driver.findElement(By.id("gender-female")).click();
        driver.findElement(By.id("FirstName")).sendKeys("Hiral");
        driver.findElement(By.id("LastName")).sendKeys("Kalani");

        WebElement day = driver.findElement(By.name("DateOfBirthDay"));
        WebElement month = driver.findElement(By.name("DateOfBirthMonth"));
        WebElement year = driver.findElement(By.name("DateOfBirthYear"));

        Select select = new Select(day);
        select.selectByVisibleText("14");

        Select select1 = new Select(month);
        select1.selectByVisibleText("June");

        Select select2 = new Select(year);
        //select2.selectByVisibleText("2020");
        select2.selectByIndex(28);


        driver.findElement(By.id("Email")).sendKeys("hiral@yahoo.com");
        driver.findElement(By.id("Company")).sendKeys("XYZ");
        driver.findElement(By.id("Newsletter")).isSelected();
        driver.findElement(By.id("Password")).sendKeys("343434");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("343434");
        driver.findElement(By.id("register-button")).click();





    }

}
