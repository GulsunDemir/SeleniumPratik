package techproed.pratice.day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

//1.Yeni bir package olusturalim : day01
//2. Yeni bir class olusturalim : C03_GetMethods
public class C07_DriversMethods {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //3. Amazon sayfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com/");

        //4. Sayfa basligini(title) yazdirin
        System.out.println(driver.getTitle());

        //5. Sayfa basliginin “Amazon” icerdigini test edin
        if (driver.getTitle().contains("Amazon")){
            System.out.println("Test PASSED");
        }else System.out.println("Test FAILED");

        //6. Sayfa adresini(url) yazdirin
        System.out.println(driver.getCurrentUrl());

        //7. Sayfa url’inin “amazon” icerdigini test edin.
        if (driver.getCurrentUrl().contains("amazon")){
            System.out.println("Test PASSED");
        }else System.out.println("Test FAILED");

        //8. Sayfa handle degerini yazdirin
        System.out.println(driver.getWindowHandle());

        //9. Sayfa HTML kodlarinda “Gateway” kelimesi gectigini test edin
        if (driver.getPageSource().contains("Gateway")){
            System.out.println("Test PASSED");
        }else System.out.println("Test FAILED");

        //10.Sayfayi kapatin
        driver.close();
    }
}
