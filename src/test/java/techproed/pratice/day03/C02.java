package techproed.pratice.day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02 {
    //1.Bir class oluşturun : AmazonSearchTest
    //2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
    public static void main(String[] args) {
        System.setProperty("webDriver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        //a.web sayfasına gidin. https://www.amazon.com/
        driver.get("https://www.amazon.com/");

        //b. Search(ara) “city bike”
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("city bike");
        aramaKutusu.submit();


        //c. Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
        List<WebElement> aramaSonucu = driver.findElements(By.className("sg-col-inner"));
        WebElement sonuc = aramaSonucu.get(0);
        System.out.println(sonuc.getText());

       String son [] = sonuc.getText().split(" ");
        System.out.println(son[2]);


        //d. Sonra karşınıza çıkan ilk sonucun resmine tıklayın
       List<WebElement> sonuclar = driver.findElements(By.className("s-image"));
       WebElement ilkUrun = sonuclar.get(0);
        System.out.println(ilkUrun.getText());

        ilkUrun.click();

        driver.close();


    }
}
