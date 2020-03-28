import com.gittigidiyor.page.LoginAndRegisterPage;
import com.thoughtworks.gauge.Step;
import org.openqa.selenium.By;

import static com.gittigidiyor.base.BaseTest.getDriver;

public class RegisterScenario {
    LoginAndRegisterPage LoginAndRegisterPage;

    @Step("Open Main Page")
    public void openMaingPage() {
        LoginAndRegisterPage = new LoginAndRegisterPage(getDriver());
    }
    @Step("Open Register Page")
    public void openRegisterPage(){
        LoginAndRegisterPage.hoverElement(By.className("robot-header-iconContainer-profile"));
        LoginAndRegisterPage.clickElement(By.id("SignUp"));
    }
    @Step("register name <name>, surname <surname>, email <email>, password <passwd>, gsm no <gsmData>")
    public void register(String name, String surname, String email, String passwd, String gsmData){
        LoginAndRegisterPage.sendKeys(By.name("name"), "name");
        LoginAndRegisterPage.sendKeys(By.name("surname"), "surname");
        LoginAndRegisterPage.sendKeys(By.name("email"), "email");
        LoginAndRegisterPage.sendKeys(By.name("passwd"), "passwd");
        LoginAndRegisterPage.sendKeys(By.name("gsmData"), "gsmData");
    }
    @Step("Click Register Button")
    public void ClickRegisterButton(){
        LoginAndRegisterPage.clickElement(By.id("SubmasditForm"));
    }
}
