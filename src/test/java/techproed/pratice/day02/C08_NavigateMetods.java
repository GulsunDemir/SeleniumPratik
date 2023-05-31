package techproed.pratice.day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

//1.Yeni bir Class olusturalim.C05_NavigationMethods
public class C08_NavigateMetods {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver","src/resources/drivers/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //2. Youtube ana sayfasina gidelim . https://www.youtube.com/
        driver.navigate().to("https://www.youtube.com/");
        Thread.sleep(2000);

        //3. Amazon soyfasina gidelim. https://www.amazon.com/
        driver.navigate().to("https://www.amazon.com/");
        Thread.sleep(2000);

        //4. Tekrar YouTube’sayfasina donelim
        driver.navigate().back();
        Thread.sleep(2000);

        //5. Yeniden Amazon sayfasina gidelim
        driver.navigate().forward();
        Thread.sleep(2000);

        //6. Sayfayi Refresh(yenile) yapalim
        driver.navigate().refresh();

        //7. Sayfayi kapatalim / Tum sayfalari kapatalim
        driver.close();
        driver.quit();
    }
}
