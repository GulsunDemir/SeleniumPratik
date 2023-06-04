package techproed.pratice.pratik;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class C12_RelativeLocators {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //1.) https://www.diemol.com/selenium-4-demo/relative-locators-demo.html adresine gidin
        driver.get("https://www.diemol.com/selenium-4-demo/relative-locators-demo.html");

        //2.) Berlin’i farkli relative locator ile locate edin
        WebElement sailor = driver.findElement(By.xpath("//*[@id='pid11_thumb']"));
        WebElement berlin = driver.findElement(with(By.tagName("img")).above(sailor));
        berlin.click();

        // 3 ) Relative locator’larin dogru calistigini test edin
        WebElement brlin =driver.findElement(By.xpath("//*[@id='pid7_thumb']"));
        if (brlin.equals(berlin)){
            System.out.println("Test PASSED");
        }else System.out.println("Test FAILED");
        driver.close();
    }

}

