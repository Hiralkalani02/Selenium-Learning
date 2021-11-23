package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {
    public static void main(String[] args) throws InterruptedException{

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\goldenguitar\\IdeaProjects\\Software\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.nopcommerce.com/");
        Thread.sleep(3000);
        driver.manage().window().maximize();

        String title = driver.getTitle();
        System.out.println(title);

        if (title.equals("nopCommerce demo store")){
            System.out.println("The title is correct");
        } else {
            System.out.println("The title is incorrect");
        }
        driver.quit();

    }
}
