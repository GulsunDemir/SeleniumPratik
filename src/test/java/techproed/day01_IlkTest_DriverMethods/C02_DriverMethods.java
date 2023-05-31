package techproed.day01_IlkTest_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethods {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");//key value class'imiza driverin yolunu gosteriyorum
        WebDriver driver =new ChromeDriver();
        driver.get("https://amazon.com");

        //getTitle() Sayfa Basligini verir
        System.out.println("Amazon Actual Title = " + driver.getTitle());
        System.out.println("Amazon Actual Url = " + driver.getCurrentUrl());
        String amazonWindowHandle =driver.getWindowHandle();
        System.out.println("Amazon Window Handle Degeri: "+ amazonWindowHandle);

        driver.get("https://techproeducation.com");
        System.out.println("Techproeducation Actual Title = " + driver.getTitle());//Sayfa Basligini verir

        //getCurrentUrl() Gidilen sayfanin Url'ini verir
        System.out.println("Techproed Actual Url = " + driver.getCurrentUrl());

        //getPageSource() Acilan sayfanin kaynak kodlarini verir
        //stem.out.println( driver.getPageSource()); Bilerek yoruma aldık her calistirdigimizda konsola butun kaynak kodlar gelmesin

        //getWindowHandle() Gidilen sayfanin handle degerini(hashKod) verir. Bu handle degerini sayfalar arasi gecis icin kullaniriz
        System.out.println("Techproed Window Handle Degeri = " + driver.getWindowHandle());//Techproed Window Handle Degeri = A58A9D915D516438483707012CF856DC bu hash kodunu pencereler arasi gecis te kullanacagiz

    }
}

