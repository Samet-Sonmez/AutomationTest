package testler;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import sayfalar.AnaSayfa;
import sayfalar.LoginSayfasi;


public class LoginTesti {

    private WebDriver driver;
    private AnaSayfa anaSayfa;
    private LoginSayfasi loginSayfasi;

    @BeforeEach
    public void setup (){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        anaSayfa = new AnaSayfa(driver);
        loginSayfasi = new LoginSayfasi(driver);
    }

    @Test
    public void hepsiburadaLoginTesti() throws InterruptedException {
        driver.get("https://www.hepsiburada.com/");
        anaSayfa.click(anaSayfa.hesabim);
        Thread.sleep(2000);
        anaSayfa.click(anaSayfa.girisYap);
        Thread.sleep(2000);
        loginSayfasi.alanaYaz(loginSayfasi.email, "deneme123@gmail.com");
        loginSayfasi.click(loginSayfasi.cerezKabul);
        Thread.sleep(2000);
        loginSayfasi.click(loginSayfasi.girisYapTusu);

    }

    @AfterEach
    public void tearDown(){
        driver.close();
    }
}
