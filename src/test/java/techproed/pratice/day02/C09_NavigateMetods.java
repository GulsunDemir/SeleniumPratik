package techproed.pratice.day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

//1.Yeni bir Class olusturalim.C06_ManageWindow
public class C09_NavigateMetods {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //2. Amazon soyfasina gidelim. https://www.amazon.com/
        driver.navigate().to("https://www.amazon.com/");

        //3. Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println("Sayfanin Konumu : "+driver.manage().window().getPosition());

        //4. Sayfayi simge durumuna getirin
        driver.manage().window().minimize();

        //5. simge durumunda 3 saniye bekleyip sayfayi maximize yapin
        Thread.sleep(3000);
        driver.manage().window().maximize();

        //6. Sayfanin konumunu ve boyutlarini maximize durumunda yazdirin
        System.out.println("Sayfanin Boyutu = " + driver.manage().window().getSize());
        System.out.println("Sayfanin Konumu = " + driver.manage().window().getPosition());

        //7. Sayfayi fullscreen yapin
        driver.manage().window().fullscreen();

        //8. Sayfanin konumunu ve boyutlarini fullscreen durumunda yazdirin
        System.out.println("Sayfanin Konumu = " + driver.manage().window().getPosition());
        System.out.println("Sayfanin Boyutu = " + driver.manage().window().getSize());

        //9. Sayfayi kapatin
        driver.close();
    }
}
