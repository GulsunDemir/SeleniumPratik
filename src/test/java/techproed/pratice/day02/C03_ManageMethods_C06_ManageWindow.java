package techproed.pratice.day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_ManageMethods_C06_ManageWindow {
    public static void main(String[] args) throws InterruptedException {
        /*
        Class Work
1.Yeni bir Class olusturalim.C06_ManageWindow
2. Amazon soyfasina gidelim. https://www.amazon.com/
3. Sayfanin konumunu ve boyutlarini yazdirin
4. Sayfayi simge durumuna getirin
5. simge durumunda 3 saniye bekleyip sayfayi maximize yapin
6. Sayfanin konumunu ve boyutlarini maximize durumunda
yazdirin
7.Sayfayi fullscreen yapin
8. Sayfanin konumunu ve boyutlarini fullscreen durumunda
yazdirin
9. Sayfayi kapatin
         */
        System.setProperty("webDriver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //2. Amazon soyfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com/");

        //3. Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println("Sayfanin Konumu = " + driver.manage().window().getPosition());
        System.out.println("Sayfanin Boyutu = " + driver.manage().window().getSize());

        //4. Sayfayi simge durumuna getirin minimize etmek
        driver.manage().window().minimize();

        //5. simge durumunda 3 saniye bekleyip sayfayi maximize yapin
        Thread.sleep(3000);
        driver.manage().window().maximize();

        //6. Sayfanin konumunu ve boyutlarini maximize durumunda yazdirin
        System.out.println("Sayfanin Konumu = " + driver.manage().window().getPosition());
        System.out.println("Sayfanin Boyutu = " + driver.manage().window().getSize());

        //7.Sayfayi fullscreen yapin
        driver.manage().window().fullscreen();
        Thread.sleep(4000);

        //8. Sayfanin konumunu ve boyutlarini fullscreen durumunda yazdirin
        System.out.println("Sayfanin Konumu = " + driver.manage().window().getPosition());
        System.out.println("Sayfanin Boyutu = " + driver.manage().window().getSize());

        //9. Sayfayi kapatin
        driver.close();





    }
}
