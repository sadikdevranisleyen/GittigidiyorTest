import com.gittigidiyor.base.BasePage;
import com.gittigidiyor.base.BaseTest;
import com.gittigidiyor.page.openLoginPage;
import com.gittigidiyor.test.GittigidiyorTest;
import com.thoughtworks.gauge.Step;
import org.openqa.selenium.By;

import static com.gittigidiyor.base.BaseTest.getDriver;


public class StepImplementation {
    openLoginPage openLoginPage;
    GittigidiyorTest gittigidiyorTest = null;

    @Step("Siteye git")
    public void setLanguageVowels() {
        openLoginPage = new openLoginPage(getDriver());
    }
    @Step("Login sayfasını aç")
    public void openLoginPage(){
        openLoginPage.hoverElement(By.className("robot-header-iconContainer-profile"));
        openLoginPage.clickElement(By.id("SignIn"));
    }
    @Step("Kullanıcı adı <kAdi> şifre <sifre> gir")
    public void setUsrnmandPass(String kAdi, String sifre){
        openLoginPage.sendKeys(By.id("L-UserNameField"), kAdi);
        openLoginPage.sendKeys(By.id("L-PasswordField"), sifre);
    }

    @Step("Giriş butonuna tıkla")
    public void signIn(){
        openLoginPage.clickElement(By.id("gg-login-enter"));
    }
}
