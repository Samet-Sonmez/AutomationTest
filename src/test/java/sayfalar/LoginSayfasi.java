package sayfalar;

import org.openqa.selenium.WebDriver;

public class LoginSayfasi extends Sayfa{

    public String email = "txtUserName";
    public String girisYapTusu = "btnLogin";
    public String cerezKabul = "onetrust-accept-btn-handler";

    public LoginSayfasi(WebDriver driver) {
        super(driver);
    }
}
