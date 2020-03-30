import com.gittigidiyor.base.BasePage;
import com.gittigidiyor.base.BaseTest;
import com.gittigidiyor.page.AddtoBasketPage;
import com.gittigidiyor.page.LoginAndRegisterPage;
import com.gittigidiyor.page.SearchPage;
import com.thoughtworks.gauge.Step;
import static com.gittigidiyor.base.BaseTest.getDriver;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.util.List;
import java.util.Random;

public class SearchProduct {
    SearchPage searchPage;
    BaseTest baseTest;

    @Step("openPage")
    public void openPage(){
        try{
            searchPage = new SearchPage(getDriver());
        }catch (Exception e){
            searchPage.captureScreenshot("openPage");
        }
    }

    @Step("Arama kutusuna <urun> yaz")
    public void searchKey(String urun){
        try {
            searchPage.clickElement(By.className("btn-alert-close"));
            searchPage.sendKeys(By.id("search_word"), urun);
        }catch (Exception e){
            searchPage.captureScreenshot("Aramakutusunaurunyaz");
        }
    }

    @Step("Arama butonuna bas")
    public void clickSearchButton(){
        try {
            searchPage.clickElement(By.id("header-search-find-link"));
        }
        catch (Exception e){
            searchPage.captureScreenshot("AramabutonunaBas");
        }
    }


    @Step("<urun> araması kontrol edilir")
    public void SearchControl(String urun){
        String productName;
        try {
            productName = searchPage.findElement(By.className("search-result-keyword")).getText();
            Assert.assertEquals(urun, productName);
        }
        catch(Exception e){
            searchPage.captureScreenshot("Urunkontrolhatasi");
        }
    }

    @Step("Arama sayfasından rasgele ürün seçilir")
    public void randomProductSelect(){
        try {
            Random rand = new Random();
            int random = rand.nextInt(45);
            String productName = searchPage.findElement(By.xpath(" /html/body/div[5]/div[2]/div/div[2]/div[4]/div[2]/ul/li[" + random + "]/a/div/div/div[1]/div[1]/h3/span")).getText();
            searchPage.clickElement(By.xpath("/html[1]/body[1]/div[5]/div[2]/div[1]/div[2]/div[4]/div[2]/ul[1]/li[" + random + "]"));
            String productNameAtDetail = searchPage.findElement(By.id("sp-title")).getText();
            Assert.assertEquals(productName,productNameAtDetail);
        }catch (Exception e){
            searchPage.captureScreenshot("Aramasayfasindanrasgeleurunsecilir");
        }
    }

    @Step("Seçilen ürün sepete eklenir")
    public void addToBasket() {
        try {
            searchPage.hoverElement(By.id("add-to-basket"));
            searchPage.clickElement(By.id("add-to-basket"));
        //searchPage.findElement(By.xpath("//*[@id=\"header_wrapper\"]/div[4]/div[3]/div/div/div/div[2]/div[4]/div[1]/a")).click();
         //searchPage.clickElement(By.cssSelector("div.gray-content:nth-child(3) div.container:nth-child(17) div.gg-w-24.gg-d-24.gg-t-24.gg-m-24.root-column div.boxContent.clearfix.gg-w-24.gg-d-24.gg-t-24.gg-m-24:nth-child(1) div.gg-w-24.gg-d-24.gg-t-24.gg-m-24.padding-none-m:nth-child(1) div.gg-w-13.gg-d-13.gg-t-24.gg-m-24.pr0.padding-none-m div.g-w-24.gg-d-24.gg-t-24.gg-m-24.padding-none:nth-child(2) div.gg-w-24.gg-d-24.gg-t-24.gg-m-24.pl0.padding-none-m div.seller-price-area.gg-w-24.gg-d-24.gg-t-24.gg-m-24.padding-none div.gg-w-24.gg-d-24.gg-t-24.gg-m-24.padding-none:nth-child(10) div.gg-w-24.gg-d-24.gg-t-24.gg-m-24:nth-child(3) section.stickyCTA:nth-child(3) div.sectionContainer div.gg-w-24.gg-d-24.gg-t-24.gg-m-24 div:nth-child(2) form:nth-child(1) button.control-button.gg-ui-button.plr10.gg-ui-btn-default:nth-child(4) > span.action-text"));
        }catch (Exception e){
            searchPage.captureScreenshot("Secilenurunsepeteeklenir");
        }
    }

    @Step("Sepete Git")
    public void goBasket(){
        searchPage.hoverElement(By.className("robot-header-iconContainer-cart"));
        searchPage.clickElement(By.cssSelector(".gg-ui-btn-default.padding-none"));
    }

    @Step("Sepetten Sil")
    public void deleteProduct(){
        searchPage.clickElement(By.cssSelector(".btn-delete.hidden-m"));
    }

}
