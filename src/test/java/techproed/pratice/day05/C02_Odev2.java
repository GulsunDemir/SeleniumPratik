package techproed.pratice.day05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_Odev2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //1- https://www.amazon.com/ adresine gidin
        driver.get("https://www.amazon.com/");

        //2- Browseri tam sayfa yapin
        driver.manage().window().maximize();

        //3- Sayfayi “refresh” yapin
        driver.navigate().refresh();

        //4- Sayfa basliginin “Spend less” ifadesi icerdigini test edin
        String actualTitle =driver.getTitle();
        String exceptionTitle ="Spend less";
        if (actualTitle.contains(exceptionTitle)){
            System.out.println("Test PASSED");
        }else System.out.println("Test FAILED");

        //5- Gift Cards sekmesine basin
        driver.findElement(By.xpath("//*[@href='/gift-cards/b/?ie=UTF8&node=2238192011&ref_=nav_cs_gc']")).click();

        //6- Birthday butonuna basin
        driver.findElement(By.xpath("//img[@src='https://images-na.ssl-images-amazon.com/images/G/01/gift-certificates/consumer/2021/GCLP/Support/2x/Occ_Birthday_346x130.png']")).click();

        //7- Best Seller bolumunden ilk urunu tiklayin
        driver.findElement(By.xpath("(//*[@alt='Amazon.com eGift Card'])[1]")).click();

        //8- Gift card details’den 25 $’i secin
        WebElement dolar = driver.findElement(By.xpath("(//*[@id='gc-mini-picker-amount-1'])[1]"));
        dolar.click();

        //9-Urun ucretinin 25$ oldugunu test edin
        WebElement fiyat = driver.findElement(By.xpath("//*[@id='gc-live-preview-amount']"));
        if (fiyat.getText().contains("$25.00")){
           System.out.println("Test PASSED");
        }else System.out.println("Test FAILED");

       //10-Sayfayi kapatin
       driver.close();
    }
}
