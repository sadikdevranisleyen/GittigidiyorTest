import com.gittigidiyor.test.GittigidiyorTest;
import com.thoughtworks.gauge.Step;

import java.util.HashSet;


public class StepImplementation {

    private HashSet<Character> vowels;

    @Step("Siteye git")
    public void setLanguageVowels() {
        GittigidiyorTest gittigidiyorTest = new GittigidiyorTest();
        gittigidiyorTest.before();
    }
}
