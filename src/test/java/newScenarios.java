import com.gittigidiyor.page.openLoginPage;
import com.gittigidiyor.test.GittigidiyorTest;
import com.thoughtworks.gauge.Step;
import org.openqa.selenium.By;

import static com.gittigidiyor.base.BaseTest.getDriver;

public class newScenarios {
    openLoginPage openLoginPage;

    @Step("Siteye git")
    public void setLanguageVowels() {
        openLoginPage = new openLoginPage(getDriver());
    }
    @Step("Kayıt sayfasını aç")
    public void openLoginPage(){
        openLoginPage.hoverElement(By.className("robot-header-iconContainer-profile"));
        openLoginPage.clickElement(By.id("SignUp"));
    }
}
