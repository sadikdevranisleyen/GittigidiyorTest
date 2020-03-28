import com.gittigidiyor.page.openLoginPage;
import com.gittigidiyor.test.GittigidiyorTest;
import com.thoughtworks.gauge.Step;
import org.openqa.selenium.By;

import static com.gittigidiyor.base.BaseTest.getDriver;

public class RegisterScenario {
    openLoginPage openLoginPage;

    @Step("Open Main Page")
    public void openMaingPage() {
        openLoginPage = new openLoginPage(getDriver());
    }
    @Step("Open Register Page")
    public void openRegisterPage(){
        openLoginPage.hoverElement(By.className("robot-header-iconContainer-profile"));
        openLoginPage.clickElement(By.id("SignUp"));
    }
    @Step("register name <name>, surname <surname>, email <email>, password <passwd>, gsm no <gsmData>")
    public void register(String name, String surname, String email, String passwd, String gsmData){
        openLoginPage.sendKeys(By.name("name"), "name");
        openLoginPage.sendKeys(By.name("surname"), "surname");
        openLoginPage.sendKeys(By.name("email"), "email");
        openLoginPage.sendKeys(By.name("passwd"), "passwd");
        openLoginPage.sendKeys(By.name("gsmData"), "gsmData");
    }
    @Step("Click Register Button")
    public void ClickRegisterButton(){
        openLoginPage.clickElement(By.id("SubmitForm"));
    }
}
