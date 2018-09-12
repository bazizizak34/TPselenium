import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class seleniumTest {

    WebDriver driver;

    @Before
   public void  setup()
    {
        driver = new FirefoxDriver();           // on crée un drver qui teste l'ouverture d'une page web
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://www.google.com");             // on choisi d'afficher par exemple google.com
    }

    @After
    public void  quitBrowser()
    {
        driver.quit();                                   // on demande a ce que la page soit fermée juste après le test

    }

    @Test
    public void test1() throws InterruptedException
    {
        WebElement barreRecherche = driver.findElement(By.id("lst-ib"));
        barreRecherche.sendKeys("canelé");
        barreRecherche.sendKeys(Keys.ENTER);



        Thread.sleep(1000);

    }

    @Test

    public void test1click() throws InterruptedException
    {
        WebElement barreRecherche = driver.findElement(By.id("lst-ib"));
        barreRecherche.sendKeys("canelé");

        WebElement buttonRecherche = driver.findElement(By.className("lsb"));
        buttonRecherche.sendKeys(Keys.ENTER);

        Thread.sleep(1000);

    }


}
