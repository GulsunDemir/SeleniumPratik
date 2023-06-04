package techproed.pratice.pratik;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C09_LocatorXpath {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        //2- Add Element butonuna basin
        driver.findElement(By.xpath("//*[@onclick='addElement()']")).click();

        //3. Delete butonu’nun gorunur oldugunu test edin
        WebElement deleteButonu = driver.findElement(By.xpath("//*[@class='added-manually']"));
        if (deleteButonu.isDisplayed()){
            System.out.println("Test PASSED");
        }else System.out.println("Test FAILED");

        //4. Delete tusuna basin
        deleteButonu.click();

        //5. “Add/Remove Elements” yazisinin gorunur oldugunu test edin
        WebElement addRemoveElement = driver.findElement(By.xpath("//h3"));
        if (addRemoveElement.isDisplayed()){
            System.out.println("Test PASSED");
        }else System.out.println("Test FAILED");
        Thread.sleep(1000);

        //Sayfayi kapatalim
        driver.close();
    }
}
