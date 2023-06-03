package techproed.pratice.day03;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_WebElementLocators {
    public static void main(String[] args) {
        System.setProperty("webDriver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //Amazon sayfasina gidelim
        driver.get("https://www.amazon.com");

        //Arama kutusunu locate edelim
        WebElement aramaKutusu = driver.findElement(By.name("field-keywords"));

        //Arama kutusuna iphone yazdiralim ve aratalim
        aramaKutusu.sendKeys("iphone"+ Keys.ENTER);

        //Sayfayi kapatalim
        driver.close();
    }
}
