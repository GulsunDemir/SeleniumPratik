package techproed.pratice.day04;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Odev {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //Techproeducation sayfasına gidelim
        driver.get("https://www.techproeducation.com/");

        //Çıkan reklamı locate edip kapatalım
        WebElement reklam =driver.findElement(By.xpath("//*[@class='attachment-large size-large wp-image-19095 lazyloaded']"));
        reklam.click();
        //Arama bölümünde qa aratalım
        WebElement aramaKutusu = driver.findElement(By.xpath("//input[@placeholder='Search...']"));
        aramaKutusu.sendKeys("qa"+ Keys.ENTER);

        //Sayfa başlığının qa içerdiğini doğrulayalım
        String actualQa = driver.getTitle();
        String exceptenQa ="qa";
        if (actualQa.contains(exceptenQa)){
            System.out.println("Test PASSED");
        }else System.out.println("Test FAILED");

        //Carrer Opportunities In QA linkinin görünür ve erişilebilir olduğunu doğrulayalım
        WebElement carrerLocators= driver.findElement(By.xpath("//a[@href='https://techproeducation.com/career-coaching/'][1]"));
        System.out.println(carrerLocators.isDisplayed());


        //Carrer Opportunities In QA linkine tıklayalım
        carrerLocators.click();

        Thread.sleep(3000);

        //Başlığın Opportunities içerdiğini test edelim
        String actualOpportunities = driver.getTitle();
        String exceptionOpportunities ="Opportunities";
        if (actualOpportunities.contains(exceptionOpportunities)){
            System.out.println( "Test PASSED");
        }else System.out.println("Test FAILED");

        //Tekrar anasayfaya dönelim ve url'in https://techproeducation.com/ olduğunu doğrulayalım
        driver.navigate().back();
        Thread.sleep(1000);

        driver.navigate().back();
        driver.navigate().back();
        if (driver.getCurrentUrl().equals("https://techproeducation.com/")){
            System.out.println("Test PASSED");
        }else System.out.println("Test FAILED");
    }
}
