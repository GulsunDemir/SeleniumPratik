package techproed.day04_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02_WebElementLocators {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // https://www.amazon.com sayfasına gidiniz
        driver.get("https://www.amazon.com");

        // arama kutusuna "city bike" yazıp aratın
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("city bike"+ Keys.ENTER);

        // sonuc yazısını yazdırın
       List<WebElement> sonucYazilari = driver.findElements(By.className("sg-col-inner"));
       WebElement sonuc = sonucYazilari.get(0);
        System.out.println(sonuc.getText());

        // sonuc sayısını yazdırın
        String [] sonucSayisi = sonuc.getText().split(" ");
        System.out.println("sonucSayisi = " + sonucSayisi[2]);

        // ilk ürünün locatini alın
        List<WebElement> sonuclar = driver.findElements(By.className("s-image"));
        WebElement ilkUrun = sonuclar.get(0);

        // ilk ürünün, görünür olup olmadıgını true, false seklinde yazdırın
        System.out.println("ilkUrun Gorunur mu = " + ilkUrun.isDisplayed());

        // ilk ürünün, erisilebilir olup olmadıgını true, false seklinde yazdırın
        System.out.println("ilkUrun Erisilebilir mi = " + ilkUrun.isEnabled());

        // ilk ürünün, secilebilir olup olmadıgını true, false seklinde yazdırın
        System.out.println("ilkUrun Secilebilir mi = " + ilkUrun.isSelected());

        // ilk urune tıklayın
        ilkUrun.click();

        // sayfayı kapatın
        driver.close();
    }
}
