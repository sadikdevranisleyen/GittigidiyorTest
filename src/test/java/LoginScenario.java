import com.gittigidiyor.page.LoginAndRegisterPage;
import com.thoughtworks.gauge.Step;
import org.openqa.selenium.By;

import static com.gittigidiyor.base.BaseTest.getDriver;


public class LoginScenario {
    LoginAndRegisterPage LoginAndRegisterPage;

    @Step("Siteye git")
    public void setLanguageVowels() {
        LoginAndRegisterPage = new LoginAndRegisterPage(getDriver());
    }
    @Step("Login sayfasını aç")
    public void openLoginPage(){
        LoginAndRegisterPage.hoverElement(By.className("robot-header-iconContainer-profile"));
        LoginAndRegisterPage.clickElement(By.id("SignIn"));
    }
    @Step("Kullanıcı adı <kAdi> şifre <sifre> gir")
    public void setUsrnmandPass(String kAdi, String sifre){
        LoginAndRegisterPage.sendKeys(By.id("L-UserNameField"), kAdi);
        LoginAndRegisterPage.sendKeys(By.id("L-PasswordField"), sifre);
    }

    @Step("Giriş butonuna tıkla")
    public void signIn(){
        LoginAndRegisterPage.clickElement(By.id("gg-login-enter"));
    }
}
