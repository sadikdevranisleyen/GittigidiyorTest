package com.gittigidiyor.page;

import com.gittigidiyor.base.BasePage;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import java.io.File;

public class BestSellersPage extends BasePage {

    WebDriver driver = null;

    public BestSellersPage(WebDriver driver) {
        super(driver);
    }
}
