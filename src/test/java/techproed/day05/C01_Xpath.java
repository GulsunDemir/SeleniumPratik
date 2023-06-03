package techproed.day05;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Xpath {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // https://www.amazon.com sayfasına gidiniz
        driver.get("https://www.amazon.com");

        // arama kutusuna "city bike"  yazıp aratın
        WebElement aramaKutusu = driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));
        aramaKutusu.sendKeys("city bike"+ Keys.ENTER);

        // Hybrid Bikes bölümüne tıklayın
        WebElement hybridBikes = driver.findElement(By.xpath("//*[text()='Hybrid Bikes']"));
        hybridBikes.click();

        // sonuc sayısını yazdırın
        WebElement sonuc =driver.findElement(By.xpath("(//*[@class='sg-col-inner'])[1]"));
        System.out.println(sonuc.getText());

        String [] sonucc = sonuc.getText().split(" ");
        System.out.println(sonucc[0]);

        // ilk ürününe tıklayın
        driver.findElement(By.xpath("(//*[@class='s-image'])[1]")).click();

        //Sayfayı kapatınız
        driver.close();
    }
}
