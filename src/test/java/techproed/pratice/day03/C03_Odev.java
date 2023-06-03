package techproed.pratice.day03;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C03_Odev {
    public static void main(String[] args) {
        System.setProperty("webDriver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //Amazon sayfasına gidiniz
        driver.get("https://www.amazon.com");

        //iphone aratınız
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("iphone" + Keys.ENTER);

        //çıkan sonuç yazısını konsola yazdırınız
        List<WebElement> sonuclar = driver.findElements(By.className("sg-col-inner"));
        WebElement sonuc = sonuclar.get(0);
        System.out.println(sonuc.getText());

        String  son [] = sonuc.getText().split(" ");
        System.out.println("son[2] = " + son[2]);

        //çıkan ürünlerden ilk 3 tanesine tıklayıp sayfa başlıklarını yazdırınız
        List<WebElement> urunler = driver.findElements(By.className("s-image"));
        WebElement ilkUrun = urunler.get(0);
        ilkUrun.click();
        System.out.println("Sayfa Basligi 1 = " + driver.getTitle());

        driver.navigate().back();

        List<WebElement> urunler2 = driver.findElements(By.className("s-image"));
        WebElement ikinciUrun = urunler2.get(1);
        ikinciUrun.click();
        System.out.println("Sayfa Basligi 2 = " + driver.getTitle());

        driver.navigate().back();

       List<WebElement> urunler3 = driver.findElements(By.className("s-image"));
       WebElement ucuncuUrun =urunler3.get(2);
       ucuncuUrun.click();

        System.out.println("Sayfa Basligi 3 = " + driver.getTitle());

        driver.navigate().back();

       driver.close();









    }
}
