package techproed.pratice.pratik;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_GetMetodlar {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //3. Amazon sayfasina gidelim. https://www.amazon.com/
        driver.navigate().to("https://www.amazon.com/");

        //4. Sayfa basligini(title) yazdirin
        System.out.println(driver.getTitle());

        //5. Sayfa basliginin “Amazon” icerdigini test edin
        if (driver.getTitle().contains("Amazon")){
            System.out.println("Test PASSED");
        }else System.out.println("Test FAILEd");

        //6. Sayfa adresini(url) yazdirin
        System.out.println(driver.getCurrentUrl());

        //7. Sayfa url’inin “amazon” icerdigini test edin.
        if (driver.getCurrentUrl().contains("amazon")){
            System.out.println("Test PASSED");
        }else System.out.println("Test FAILED");

        //8. Sayfa handle degerini yazdirin
        System.out.println(driver.getWindowHandle());

        //9. Sayfa HTML kodlarinda “Gateway” kelimesi gectigini test edin
        System.out.println(driver.getPageSource());

        //10.Sayfayi kapatin.
        driver.close();
    }
}
