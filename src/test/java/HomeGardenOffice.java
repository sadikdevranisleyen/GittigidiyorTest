import com.gittigidiyor.base.BaseTest;
import com.gittigidiyor.page.HomeGardenPage;
import com.thoughtworks.gauge.Step;
import org.openqa.selenium.By;

import static com.gittigidiyor.constans.ConstantLoginPage.*;
import static com.gittigidiyor.base.BaseTest.getDriver;

public class HomeGardenOffice {

    HomeGardenPage homeGardenPage;


    @Step("Open Page")
    public void openPage() {
        try {
            homeGardenPage = new HomeGardenPage(getDriver());
        } catch (Exception e) {
            homeGardenPage.captureScreenshot("Openpage");
        }
    }


    @Step("Ev bahçe sayfasına gider")
    public void goToHomeGarden() {
        try {
            homeGardenPage.hoverElement(By.xpath(HOMEGARDENOFFICETITLES));
        } catch (Exception e) {
            homeGardenPage.captureScreenshot("Evbahceurunleri");
        }
    }


    @Step("Urun seç")
    public void selectProduct() {
        try {
            homeGardenPage.clickElement(By.id(HOMEGARDENOFFICEPRODUCT));
        } catch (Exception e) {
            homeGardenPage.captureScreenshot("Urunsec");
        }
    }


    @Step("Sepete Ekle")
    public void addToBasket() {
        try {
            homeGardenPage.clickElement(By.cssSelector(ADDTOBASKET));
        } catch (Exception e) {
            homeGardenPage.captureScreenshot("Sepeteekle");
        }

    }

    @Step("Sepete Git")
    public void goToBasket() {
        try {
            homeGardenPage.clickElement(By.className(BASKETPAGE));
        } catch (Exception e) {
            homeGardenPage.captureScreenshot("Sepetegit");
        }
    }

    @Step("Sepetten Ürün Sil")
    public void deleteProduct() {
        try {
            homeGardenPage.clickElement(By.className(DELETEPRODUCT));
        }catch (Exception e){
            homeGardenPage.captureScreenshot("Sepettenurunsil");
        }
    }
}
