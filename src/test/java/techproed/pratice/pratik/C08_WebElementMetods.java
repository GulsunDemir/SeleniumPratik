package techproed.pratice.pratik;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C08_WebElementMetods {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //a.web sayfasına gidin. https://www.amazon.com/
        driver.get("https://www.amazon.com/");
        //b. Search(ara) “city bike”
        driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("city bike"+ Keys.ENTER);

        //c. Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
        WebElement sonucYazisi = driver.findElement(By.xpath("(//*[@class='sg-col-inner'])[1]"));
        String [] sonucSayisi = sonucYazisi.getText().split(" ");
        System.out.println("Sonuc Sayisi: "+sonucSayisi[2]);

        //d. Sonra karşınıza çıkan ilk sonucun resmine tıklayın
        driver.findElement(By.xpath("(//*[@class='s-image'])[1]")).click();

        Thread.sleep(1000);

        //Sayfayi Kapatalim
        driver.close();
    }
}
