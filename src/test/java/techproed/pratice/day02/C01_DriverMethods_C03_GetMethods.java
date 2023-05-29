package techproed.pratice.day02;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_DriverMethods_C03_GetMethods {
    public static void main(String[] args) {
        /*
        driver.get(); Method’lari
Class Work
1.Yeni bir package olusturalim : day01
2. Yeni bir class olusturalim : C03_GetMethods
3. Amazon sayfasina gidelim. https://www.amazon.com/
4. Sayfa basligini(title) yazdirin
5. Sayfa basliginin “Amazon” icerdigini test edin
6. Sayfa adresini(url) yazdirin
7.Sayfa url’inin “amazon” icerdigini test edin.
8. Sayfa handle degerini yazdirin
9. Sayfa HTML kodlarinda “Gateway” kelimesi gectigini test edin
10.Sayfayi kapatin.
         */
        System.setProperty("webDriver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //3. Amazon sayfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com/");

        //4. Sayfa basligini(title) yazdirin
        System.out.println("Amazon Sayfa Basligi= " + driver.getTitle());

        //5. Sayfa basliginin “Amazon” icerdigini test edin
        String actual ="https://www.amazon.com/";
        String excepted ="Amazon";

        if (actual.contains(excepted)){
            System.out.println("Test PASSED");
        }else System.out.println("Test FAILED");

        //6. Sayfa adresini(url) yazdirin
        System.out.println("AMAZON URL");
        String actualUrl="https://www.amazon.com/";
        System.out.println(actualUrl);
        //System.out.println(driver.getCurrentUrl());
        String expectedamazon= "amazon";
        System.out.println("URL AMAZON İCERİYORMU");

        //7.Sayfa url’inin “amazon” icerdigini test edin.
        if (actualUrl.contains(expectedamazon)){
            System.out.println("Test PASSED");
        }else System.out.println("Test FAILED");

        //8. Sayfa handle degerini yazdirin
        System.out.println("Sayfa Handle Degeri = " + driver.getWindowHandle()); //AC4227BF9B78C5F00254B1496ABA42CE

        //9. Sayfa HTML kodlarinda “Gateway” kelimesi gectigini test edin
        if (driver.getPageSource().contains("Gateway")){
            System.out.println("PASSED");
        }else System.out.println("FAILED");

        //10.Sayfayi kapatin.
        driver.close();



    }
}
