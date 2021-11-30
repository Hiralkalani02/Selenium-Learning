package SeleniumSession;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.implementation.bytecode.assign.TypeCasting;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

//This program is to print year list
public class YearList {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();

        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        driver.findElement(By.className("ico-register")).click();
        driver.findElement(By.name("DateOfBirthYear"));
        WebElement year = driver.findElement(By.name("DateOfBirthYear"));
        Select select= new Select(year);

        List<WebElement> YearList = select.getOptions();
        System.out.println(YearList.size());

        for(int i=0; i < YearList.size();i++)
        {
            String value = YearList.get(i).getText();
            System.out.println(value);

        }


    }
}
