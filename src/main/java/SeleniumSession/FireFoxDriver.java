package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

   //geckodriver is for firefox browser
public class FireFoxDriver {
    public static void main(String[] args) throws InterruptedException{


        //2.Set up FirefoxDriver(mediator)-it's path.
        System.setProperty("webdriver.gecko.driver","C:\\Users\\goldenguitar\\IdeaProjects\\Software\\geckodriver-v0.30.0-win64\\geckodriver.exe");

        //1.Create an instance of Web driver
        WebDriver driver = (WebDriver) new FirefoxDriver(); //Top casting- Child class object referred by parent interface reference variable.

        //3.Navigate to webpage
        driver.get("https://demo.nopcommerce.com/");
        Thread.sleep(3000);//1000 milliseconds is 1 second
        driver.manage().window().maximize();

        //4. Get page title(Tab Name)
        String title = driver.getTitle();
        System.out.println(title);

        //5. Expected vs Actual-Validation
        if(title.equals("nopCommerce demo store")){
            System.out.println("The title is correct");
        } else{
            System.out.println("The title is incorrect");
        }

        //closing webpage
        //driver.close();// close the current session
        driver.quit(); //close everything




    }
}
