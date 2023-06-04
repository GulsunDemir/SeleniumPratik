package techproed.pratice.pratik;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C07_Pratik {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        //2.ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title) “facebook”
        //oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.
        driver.get("https://www.facebook.com/");
        if (driver.getTitle().equals("facebook")){
            System.out.println("Test PASSED");
        }else System.out.println("Test FAILED");

        //3.Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i yazdirin.
        String actualUrl = driver.getCurrentUrl();
        String expedtedUrl = "facebook";
        if (actualUrl.contains(expedtedUrl)){
            System.out.println("Test PASSED");
        }else System.out.println("Test FAILED"+driver.getCurrentUrl());

        //4.https://www.walmart.com/ sayfasina gidin.
        driver.get("https://www.walmart.com/");

        //5. Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
        if (driver.getTitle().contains("Walmart.com")){
            System.out.println("Test PASSED");
        }else System.out.println("Test FAILED");

        //6. Tekrar “facebook” sayfasina donun
        driver.navigate().back();
        //7. Sayfayi yenileyin
        driver.navigate().refresh();
        //8.Sayfayi tam sayfa (maximize) yapin
        driver.manage().window().maximize();
        //9.9.Browser’i kapatin
        driver.close();
    }
}
