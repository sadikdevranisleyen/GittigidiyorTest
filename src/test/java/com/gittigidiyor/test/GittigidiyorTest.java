package com.gittigidiyor.test;

import com.gittigidiyor.base.BaseTest;
import com.gittigidiyor.page.SearchPage;
import com.gittigidiyor.page.openLoginPage;
import com.thoughtworks.gauge.BeforeScenario;
import com.thoughtworks.gauge.Step;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.gittigidiyor.constans.ConstantLoginPage.*;

public class GittigidiyorTest extends BaseTest {
    SearchPage searchPage;
    openLoginPage openLoginPage;

    @Before
    public void before() {
        openLoginPage = new openLoginPage(getDriver());
    }

    //@Step("Login Sayfasina Gider")
    @Test
    public void openLoginPage() {
        openLoginPage.hoverElement(By.className("robot-header-iconContainer-profile"));
        openLoginPage.clickElement(By.id("SignIn"));


        /*
        searchPage.clickElement(POPUP_KAPAT);
        searchPage.writeInput(ARANACAK_URUN);
        searchPage.ClickSearch();
        searchPage.chooseProduct();
        searchPage.addBasket();
        String producktName = searchPage.getText(URUN_ADI);
        searchPage.goBasket();
        String basketName = searchPage.getText(SEPET_ADI);
        System.out.println(producktName + " - " + basketName);
        Assert.assertEquals(basketName, producktName);*/
    }
}
