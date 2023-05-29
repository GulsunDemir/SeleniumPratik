package techproed.pratice.day02;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_ImplicitlyWait_C07_ManageWindowSet {
    public static void main(String[] args) {
        /*
        Class Work
        1.Yeni bir Class olusturalim.C07_ManageWindowSet
        2. Amazon sayfasina gidelim. https://www.amazon.com/
        3. Sayfanin konumunu ve boyutlarini yazdirin
        4. Sayfanin konumunu ve boyutunu istediginiz sekilde
        ayarlayin
        5. Sayfanin sizin istediginiz konum ve boyuta geldigini test
        edin
        8. Sayfayi kapatin
         */
        System.setProperty("webDriver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        // 2. Amazon sayfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com/");

        // 3. Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println("Sayfanin Konumu = " + driver.manage().window().getPosition());
        System.out.println("Sayfanin Boyutu = " + driver.manage().window().getSize());

        //4. Sayfanin konumunu ve boyutunu istediginiz sekilde ayarlayin
        driver.manage().window().setPosition(new Point(40,60));
        driver.manage().window().setSize(new Dimension(600,900));

        //5. Sayfanin sizin istediginiz konum ve boyuta geldigini test edin
        System.out.println("Sayfanin Konumu = " + driver.manage().window().getPosition());
        System.out.println("Sayfanin Boyutu= " + driver.manage().window().getSize());

        if (driver.manage().window().getPosition().x==40 && driver.manage().window().getPosition().y==60){
            System.out.println("PASSED");
        }else System.out.println("FAILED");

        if (driver.manage().window().getSize().getHeight()==900 && driver.manage().window().getSize().getWidth()==600){
            System.out.println("PASSED");
        }else System.out.println("FAILED");

        //8. Sayfayi kapatin
        driver.close();



    }
}
