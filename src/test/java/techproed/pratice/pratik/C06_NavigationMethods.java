package techproed.pratice.pratik;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C06_NavigationMethods {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //2. Amazon soyfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com/");

        //3. Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println(driver.manage().window().getPosition());
        System.out.println(driver.manage().window().getSize());

        //4. Sayfanin konumunu ve boyutunu istediginiz sekilde ayarlayin
        driver.manage().window().setPosition(new Point(40,50));
        driver.manage().window().setSize(new Dimension(600,900));

        //5. Sayfanin sizin istediginiz konum ve boyuta geldigini test edin
        if (driver.manage().window().getPosition().x==40 && driver.manage().window().getPosition().y==50){
            System.out.println("Test PASSED");
        }else System.out.println("Test FAILED");
        if (driver.manage().window().getSize().width==600 && driver.manage().window().getSize().height==900){
            System.out.println("Test PASSED");
        }else System.out.println("Test FAILED");

        //8. Sayfayi kapatin
        driver.close();
    }
}
