package techproed.day02_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_DriversMethod_ClassWork {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        //Amazon sayfasina gidelim
        driver.get("https://amazon.com");

        //Sayfa basliginin amazon icerdigini test edelim
        String actualTitle =driver.getTitle();
        String expectedTitle ="Amazon";
        if (actualTitle.contains(expectedTitle)) {
            System.out.println("Test PASSED");//Test PASSED
        }else System.out.println("Test FAILED");

        //Url'in http://www.amazon.com oldugunu test edelim
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://www.amazon.com/";
        if (actualUrl.equals(expectedUrl)) {
            System.out.println("Test PASSED");//Test PASSED
        }else System.out.println("Test FAILED "+actualUrl);
        //Sayfayi kapatalim
        driver.close(); //Browser'ı kapatir
        //driver.quit() -->Birden fazla browser varsa hepsini kapatir.


    }
}
