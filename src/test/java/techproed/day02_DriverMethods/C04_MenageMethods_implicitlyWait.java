package techproed.day02_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_MenageMethods_implicitlyWait {
    public static void main(String[] args) {
        System.setProperty("webDriver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        /*implicitlyWait(Duration.ofSeconds(20) Sayfadaki webElementleri gorunur olana kadar (sayfada olusana kadar)
        maximum 20 sayniye bekler. Eger webelementler 2 saniyede olusursa 2 saniye beklerve alt satira gecer Fakat
        belirttigimiz max sure boyunca internetten ya da sayfadan kaynakli olarak web elementler olusmazsa testimiz
        fail verir
        Thread.sleep() metodu java kodlarini bizim belirttigimiz sure kadar bekler. 30 saniye beklemesini belirtirsem
        30 saniye bekler ve alt satira gecer.
       */
        //techproed sayfasina gidelim
        String amazonUrl= "https://amazon.com";
        String techproUrl ="https://techproeducation.com";
        driver.get(techproUrl);

        //amazona gidelim//
        driver.get(amazonUrl);

        //techpro sayfasina geri donelim
        driver.navigate().back();

        //sayfa basliginin techpro icerdigini test edelim
        String actualTitle ="driver.getTitle()";
        String arananKelime ="techpro";
        if (actualTitle.contains(arananKelime)){
            System.out.println("Test PASSED");
        }else System.out.println("Test FAILED");

        //tekrar amazon sayfasina gidelim
        driver.navigate().forward();

        //saufa basliginin Amazon icerdiini test edelim
        if (driver.getTitle().contains("Amazon")){
            System.out.println("Test PASSED");
        }else System.out.println("Test FAILED->" +actualTitle);

        //Sayfayi Kapatalim
        driver.close();
    }
}
