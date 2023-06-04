package techproed.day06relativeLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class C01_RelativeLocators {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //Amazona gidelim
        driver.get("https://www.amazon.com");

        //city bike aratalim
        WebElement aramaKutusu = driver.findElement(By.xpath("(//*[@class='nav-input nav-progressive-attribute'])[1]"));
        aramaKutusu.sendKeys("city bike" + Keys.ENTER);

        //relative locator kullanarak hybrid bikes altindaki elemente tiklayalim
        //WebElementlerin yazisini consola yazdiralim
        WebElement hybridBikes = driver.findElement(By.xpath("//*[text()='Hybrid Bikes']"));
        System.out.println(hybridBikes.getText());
        WebElement adultElectricBikes = driver.findElement(with(By.tagName("span")).below(hybridBikes));
        System.out.println(adultElectricBikes.getText());
        WebElement completeCruiserBikes = driver.findElement(with(By.tagName("span")).below(adultElectricBikes));
        System.out.println(completeCruiserBikes.getText());
        WebElement adultFoldingBikes =driver.findElement(with(By.tagName("span")).below(completeCruiserBikes));
        System.out.println(adultFoldingBikes.getText());
        //Bikes altindaki tum linkleri(Webelement) consola yazdiralim

        System.out.println("**************************");

        List<WebElement> linklerListesi = driver.findElements(By.xpath("(//*[@class='a-list-item'])[position()>=9 and position()<=15]"));
        //Lambda ile yazdirdik
        linklerListesi.forEach(t-> System.out.println(t.getText()));
        System.out.println("****************");
        for (WebElement w:linklerListesi){
            System.out.println(w.getText());
        }

        //Bu linklerin hepsini tiklayalim ve sayfa basliklarini alalim
        for (int i = 0; i < linklerListesi.size(); i++) {
            linklerListesi = driver.findElements(By.xpath("(//*[@class='a-list-item'])[position()>=9 and position()<=15]"));
            System.out.println(linklerListesi.get(i).getText());
            linklerListesi.get(i).click();
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);
        }

        //adultFoldingBikes.click();

    }
}
