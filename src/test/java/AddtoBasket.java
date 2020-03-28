import com.gittigidiyor.page.AddtoBasketPage;
import com.thoughtworks.gauge.Step;
import static com.gittigidiyor.base.BaseTest.getDriver;

public class AddtoBasket {
    AddtoBasketPage addtoBasketPage;

    @Step("addToBasket")
    public void openMaingPage() {
        addtoBasketPage = new AddtoBasketPage(getDriver());
    }
}
