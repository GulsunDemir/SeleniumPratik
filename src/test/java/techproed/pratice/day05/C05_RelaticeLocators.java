package techproed.pratice.day05;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class C05_RelaticeLocators {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //Amazona gidelim
        driver.get("https://www.amazon.com");

        //city bike aratalim
        WebElement aramaKutusu = driver.findElement(By.xpath("(//*[@class='nav-input nav-progressive-attribute'])[1]"));
        aramaKutusu.sendKeys("city bike" + Keys.ENTER);

        //relative locator kullanarak hybrid bikes altindaki elemente tiklayalim
        WebElement hybridBikes = driver.findElement(By.xpath("//*[text()='Hybrid Bikes']"));
        WebElement adultElectricBikes = driver.findElement(with(By.tagName("span")).below(hybridBikes));
        WebElement completeCruiserBikes = driver.findElement(with(By.tagName("span")).below(adultElectricBikes));
        WebElement adultFoldingBikes =driver.findElement(with(By.tagName("span")).below(completeCruiserBikes));
        adultFoldingBikes.click();

        Thread.sleep(1000);

        //sayfayi kapatalim
        driver.close();

    }
}
