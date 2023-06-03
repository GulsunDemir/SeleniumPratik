package techproed.day03_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C03_findElements {
    public static void main(String[] args) {
        System.setProperty("webDriver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Amazon sayfasina gidelim
        driver.get("https://www.amazon.com");

        //Sayfadaki linklerin sayısını ve linkleri yazdıralım
        List<WebElement> linklerListesi = driver.findElements(By.tagName("a"));
        System.out.println("linklerin Sayisi = " + linklerListesi.size());
        for (WebElement w:linklerListesi){
            if (!w.getText().isEmpty()){
                System.out.println(w.getText());
            }
        }

        //    sayfayı kapatın
              driver.close();


    }
}
