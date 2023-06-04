package techproed.pratice.pratik;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02_pratik {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // https://www.amazon.com/ adresine gidin
        driver.get("https://www.amazon.com/");

        // arama motorunda nutella yazip aratınız
        WebElement aramaKutusu = driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));
        aramaKutusu.sendKeys("nutella"+ Keys.ENTER);

        // Customer Service ve Registry butonlarına sırasıyla tıklayın ve title'larının "Amazon" icerdigini test edin


        for (int i = 0; i < 2; i++) {
            List<WebElement> butonlar = driver.findElements(By.xpath("(//*[@class='nav-a  '])[2] | (//*[@class='nav-a  '])[3]"));
            butonlar.get(i).click();
            Thread.sleep(1000);
            if (driver.getTitle().contains("Amazon")){
                System.out.println("Test PASSED");
            }else System.out.println("Test FAILED");
            Thread.sleep(1000);
            driver.navigate().back();

        }

        // pencereyi kapatiniz
        driver.close();
    }
}
