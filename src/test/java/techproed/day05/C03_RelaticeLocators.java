package techproed.day05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class C03_RelaticeLocators {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


        //amazon sayfasına gidelim
        driver.get("https://www.amazon.com");

        //city bike aratalım
        WebElement aramaKutusu = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        aramaKutusu.sendKeys("city bike");
        aramaKutusu.submit();

        //Relative Locator kullanarak Hybrid Bikes üstündeki Road Bikes'a tıklayalım
         WebElement hybridBikes = driver.findElement(By.xpath("//span[text()='Hybrid Bikes']"));
         WebElement roadBikes =driver.findElement(with(By.tagName("span")).above(hybridBikes));

         roadBikes.click();

        // sayfayı kapatın
        driver.close();
    }
}
