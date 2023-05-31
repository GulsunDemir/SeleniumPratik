package techproed.pratice.day02;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

//1.Yeni bir Class olusturalim.C07_ManageWindowSet
public class C10_ImplicityWait {
    public static void main(String[] args) {
        System.setProperty("webdriver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //2. Amazon soyfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com/");

        //3. Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println("Sayfanin Konum: "+driver.manage().window().getPosition());
        System.out.println("Sayfanin Boyutu = " + driver.manage().window().getSize());

        //4. Sayfanin konumunu ve boyutunu istediginiz sekilde ayarlayin
        driver.manage().window().setPosition(new Point(40,40));
        driver.manage().window().setSize(new Dimension(600,900));
        //5. Sayfanin sizin istediginiz konum ve boyuta geldigini test edin
        System.out.println("İstenilen Boyut: "+driver.manage().window().getSize());
        System.out.println("Istenilen Konum = " + driver.manage().window().getPosition());

        if (driver.manage().window().getPosition().x==40 && driver.manage().window().getPosition().y==40){
            System.out.println("Test PASSED");
        }else System.out.println("Test FAILED");

        if (driver.manage().window().getSize().width==600 && driver.manage().window().getSize().height==900){
            System.out.println("Test PASSED");
        }else System.out.println("Test FAILED");
        //8. Sayfayi kapatin

    }
}
