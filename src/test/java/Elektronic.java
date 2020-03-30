import com.gittigidiyor.base.BaseTest;
import com.gittigidiyor.page.ElektronicPage;
import com.thoughtworks.gauge.Step;
import org.openqa.selenium.By;
import static com.gittigidiyor.constans.ConstantLoginPage.*;
import static com.gittigidiyor.base.BaseTest.getDriver;

public class Elektronic {

    ElektronicPage elektronicPage;

    @Step("Ana sayfa açılır")
    public void openPage() {
        try {
            elektronicPage = new ElektronicPage(getDriver());
        } catch (Exception e) {
            elektronicPage.captureScreenshot("Anasayfaacilir");
        }
    }

    @Step("Elektronik sayfasına gider")
    public void goToElektronic() {
        try {
            elektronicPage.hoverElement(By.className("horizontal-menu-item-link"));
            //elektronicPage.clickElement(By.xpath("//*[@id=\"header_wrapper\"]/div[6]/div[1]/div/div[2]/div[1]/a[1]"));
            elektronicPage.clickElement(By.cssSelector("gg-uw-24.gg-w-24.gg-d-24.gg-t-24.gg-m-24.gg-mw-24.cell-border-css"));
        } catch (Exception e) {
            elektronicPage.captureScreenshot("Elektroniksayfasinagider");
        }

    }

    @Step("Urun seçilir")
    public void selectProduct() {
        try {
            elektronicPage.findElement(By.cssSelector(ELECTRONICPRODUCT));
        } catch (Exception e) {
            elektronicPage.captureScreenshot("Urunsecilir");
        }

    }

    @Step("Sepete ekle")
    public void addToBasket() {
        try {
            elektronicPage.clickElement(By.cssSelector(ADDTOBASKET));

        } catch (Exception e) {
            elektronicPage.captureScreenshot("Sepeteekle");
        }
    }

    @Step("Sepete git")
    public void goToBasket() {
        try {
            elektronicPage.clickElement(By.className(BASKETPAGE));
        } catch (Exception e) {
            elektronicPage.captureScreenshot("Septegit");
        }

    }

    @Step("Sepetten ürün sil")
    public void deleteProduct() {
        try {
            elektronicPage.findElement(By.className(DELETEPRODUCT));
        }catch (Exception e){
            elektronicPage.captureScreenshot("Sepettenurunsil");
        }
    }
}
