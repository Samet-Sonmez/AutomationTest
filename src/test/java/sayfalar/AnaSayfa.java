package sayfalar;

import org.openqa.selenium.WebDriver;

public class AnaSayfa extends Sayfa {

    public String hesabim = "myAccount";
    public String girisYap = "login";

    public AnaSayfa(WebDriver driver) {
        super(driver);
    }
}
