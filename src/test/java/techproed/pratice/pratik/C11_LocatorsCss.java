package techproed.pratice.pratik;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C11_LocatorsCss {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //2- https://www.amazon.com/ adresine gidin
        driver.get("https://www.amazon.com/");

        //3- Browseri tam sayfa yapin
        driver.manage().window().maximize();

        //4.- Sayfayi “refresh” yapin
        driver.navigate().refresh();

        //5. Sayfa basliginin “Spend less” ifadesi icerdigini test edin
        String actualTitle = driver.getTitle();
        String expedtedTitle ="Spend less";
        if (actualTitle.contains(expedtedTitle)){
            System.out.println("Test PASSED");
        }else System.out.println("Test FAILED");

        //6. Gift Cards sekmesine basin
        driver.findElement(By.xpath("//*[text()='Gift Cards']")).click();

        //7. Birthday butonuna basin
        driver.findElement(By.xpath("(//*[@alt='Birthday'])[1]")).click();

        //8. Best Seller bolumunden ilk urunu tiklayin
        driver.findElement(By.xpath("(//*[@alt='Amazon.com eGift Card'])[1]")).click();

        //9. Gift card details’den 25 $’i secin
        driver.findElement(By.xpath("(//*[@id='gc-mini-picker-amount-1'])[1]")).click();

        //10-Urun ucretinin 25$ oldugunu test edin
        WebElement urunUcreti = driver.findElement(By.xpath("//*[@id='gc-live-preview-amount']"));
      if (urunUcreti.getText().contains("$25.00")){
          System.out.println("Test PASSED");
      }else System.out.println("Test FAILED");


        //10-Sayfayi kapatin
        driver.close();



    }
}
