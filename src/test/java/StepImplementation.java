import com.gittigidiyor.base.BasePage;
import com.gittigidiyor.base.BaseTest;
import com.gittigidiyor.test.GittigidiyorTest;
import com.thoughtworks.gauge.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.HashSet;


public class StepImplementation  {
    BasePage basePage;
    private HashSet<Character> vowels;



    @Step("Siteye git")
    public void setLanguageVowels() {
        GittigidiyorTest gittigidiyorTest = new GittigidiyorTest();
        gittigidiyorTest.before();
    }

    @Step("urunsecme")
    public void implementation1() {

        basePage.sendKeys(By.id("search_word"),"Bilgisayar");

    }
}
