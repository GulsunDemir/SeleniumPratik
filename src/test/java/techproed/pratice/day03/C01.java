package techproed.pratice.day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

//1.Bir class oluşturun: LoginTest
public class C01 {
    //2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
    public static void main(String[] args) {
        System.setProperty("webDriver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //a. http://a.testaddressbook.com adresine gidiniz.
        driver.get("http://a.testaddressbook.com");

        driver.findElement(By.xpath("(//a[@class='btn'])[1]")).click();



        //b. Sign in butonuna basin

        //c. email textbox,password textbox, and signin button elementlerini locate ediniz..
        //d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
        //i. Username : testtechproed@gmail.com
        //ii. Password : Test1234!
        //e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
        //f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed)
        //doğrulayin(verify).
        //3. Sayfada kac tane link oldugunu bulun.
    }
}
