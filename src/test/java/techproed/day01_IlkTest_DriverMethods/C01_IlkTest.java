package techproed.day01_IlkTest_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_IlkTest {
    public static void main(String[] args) {
        System.setProperty("chromeDriver","src/resources/drivers/chromedriver.exe");
        //Java uygulamalarinda System ozelliklerini ayarlamak icin setProperty methodu ile kullaniriz
        //setProperty methodu ile class'imiza driver'in fiziki yolunu belirtir
        System.out.println(System.getProperty("chromeDriver"));//girmis oldugum key'in degerini verdi //src/resources/drivers/chromedriver.exe
        //getProperty ile "Key" degerini girerek "value"'ya ulasabilirim

        WebDriver driver =new ChromeDriver();
        //ChromeDriver turunde yeni bir obje olusturduk Olusturulan obje sayesinde metodlari kullanabilecegiz
        driver.get("https://techproeducation.com");//get() metodu ile String olarak girilen url'e gideriz

    }
}
