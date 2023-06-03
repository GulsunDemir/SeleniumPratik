package techproed.pratice.day05;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_Xpath {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // https://www.amazon.com sayfasına gidiniz
        driver.get("https://www.amazon.com");

        // arama kutusuna "city bike"  yazıp aratın
        WebElement aramaKutusu = driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));
        aramaKutusu.sendKeys("city bike", Keys.ENTER);

        // Hybrid Bikes bölümüne tıklayın
        WebElement hybridBikes = driver.findElement(By.xpath("//*[text()='hybrid bike']"));
        hybridBikes.click();


        // sonuc sayısını yazdırın
        WebElement aramaYazisi = driver.findElement(By.xpath("(//*[@class='sg-col-inner'])[1]"));

        String [] aramaSayisi = aramaYazisi.getText().split(" ");
        System.out.println("arama Sayisi = " + aramaSayisi[2]);

        //14 results for "city bike" bu yazinin locate'i
        System.out.println(aramaYazisi.getText());

        // ilk ürününe tıklayın
        WebElement sonuc = driver.findElement(By.xpath("(//img[@class='s-image'])[1]"));
        sonuc.click();

        Thread.sleep(3000);

        // Sayfayı kapatınız
        driver.close();


    }
}
