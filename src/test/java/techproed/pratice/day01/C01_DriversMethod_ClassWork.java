package techproed.pratice.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// 1.Yeni bir class oluşturun: class name ⇒ C01_Get
public class C01_DriversMethod_ClassWork {
    //2. main method olusturun
     public static void main(String[] args) {

         //3. Java’dan System.setProperty(“”,””) method’unu kullanarak webdriver’in turunu ve path’ini belirleyelim.
         System.setProperty("webdriver.chrome","src/resources/drivers/chromedriver.exe");

        //4. Chrome driver oluşturun
         WebDriver driver = new ChromeDriver();

       // 5. Olusturdugumuz driver objesi ile WebDriver class’indan static method’lari kullanin
         driver.get("https://www.amazon.com");

         System.out.println(driver.getTitle());

         System.out.println("Amazon Url = " + driver.getCurrentUrl());

         //System.out.println(driver.getPageSource());//Icinde bulunulan sayfanin kaynak kodlarini verir.
         System.out.println("Handle Degeri = " + driver.getWindowHandle());

         driver.close();
     }
}
