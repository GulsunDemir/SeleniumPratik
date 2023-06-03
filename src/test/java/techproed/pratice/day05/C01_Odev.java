package techproed.pratice.day05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C01_Odev {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // http://the-internet.herokuapp.com/add_remove_elements/ adresine gidiniz
        driver.get("http://the-internet.herokuapp.com/add_remove_elements/");

        // Add Element butonuna 100 defa basınız
        WebElement addElementButonu = driver.findElement(By.xpath("//*[@onclick='addElement()']"));
        for (int i = 0; i < 100; i++) {
            addElementButonu.click();
        }
        // 100 defa basıldığını test ediniz
        List<WebElement> delete = driver.findElements(By.xpath("//*[@onclick='addElement()']"));
        int deleteSayisi = delete.size();
        if (deleteSayisi==100){
            System.out.println("Test PASSED");
        }else System.out.println("Test FAILED");


        // 90 defa delete butonuna basınız
//        WebElement deleteButonu = driver.findElement(By.xpath("//button[@class='added-manually']"));

        for (int i = 0; i < 90; i++) {
            driver.findElement(By.xpath("//button[@class='added-manually']")).click();
            //  deleteButonu.click();
        }
        // 90 defa basıldığını doğrulayınız
        List<WebElement> deleteButonu =driver.findElements(By.xpath("//button[@class='added-manually']"));
        int deleteSayısı =deleteButonu.size();
        if (deleteSayisi==100){
            System.out.println("Test PASSED");
        }else System.out.println("Test FAILED");

        // Sayfayı kapatınız
        driver.close();
    }
}
