package techproed.day02_DriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_ManageMethods {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webDriver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //Broeser'in konumunu yazdiralim
        System.out.println("Sayfanin Konumu = " + driver.manage().window().getPosition());

        //Broeser'in boyutlarini yazdiralim
        System.out.println("Sayfanin Boyutlari = " + driver.manage().window().getSize());

        //Browser'i maximize yapalim
        driver.manage().window().maximize();
        /*
        Bir web sitesine gittiginizde browser default olarak bir boyutta gelir. Ve acilan browsre'daki
        webElementlere browser maximize olmadigi icin ulasamayabiliriz. Dolayisiyla browser'i actiktan
        sonra maximize yaparsak driver butu webElementleri gorur ve rahatlikla mudahale edebilir. Bu yuzden
        browser'ı actiktan sonra ilk olarak  driver.manage().window().maximize(); yapmamiz bizim webElementlere
        ulasmada isimizi kolaylastirir. Böylelikle fail almamış oluruz
         */

        //Techproeducation sayfasina gidelim
        driver.get("https://techproeducation.com");//https://tecphroeducation.com/

        //Broeser'in konumunu yazdiralim
        System.out.println("Sayfanin Konumu = " + driver.manage().window().getPosition());

        //Broeser'in boyutlarini yazdiralim
        System.out.println("Sayfanin Boyutu = " + driver.manage().window().getSize());
        Thread.sleep(3000);


        //Sayfayi minimize yapalim
        driver.manage().window().minimize();
        Thread.sleep(3000);


        //Sayfayi fullScreen yapalim
        driver.manage().window().fullscreen();
        Thread.sleep(3000);

        driver.manage().window().setPosition(new Point(50,50));//İstedigimiz konuma getirir
        driver.manage().window().setSize(new Dimension(600,600));//icine genislik olarak //istedigimiz size ye getirir
        Thread.sleep(3000);
        //Sayfayi kapatalim
        driver.close();



    }
}
