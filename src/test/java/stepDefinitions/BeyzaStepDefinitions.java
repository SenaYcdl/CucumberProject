package stepDefinitions;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.TestCase04Nida;
import utilities.Driver;

public class BeyzaStepDefinitions {

    TestCase04Nida test=new TestCase04Nida();
    Actions actions=new Actions(Driver.getDriver());
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();


    @Then("Click on Product button")
    public void click_on_product_button() {
        test.products.click();
    }
    @Then("Verify user is navigated to ALL PRODUCTS page successfully")
    public void verify_user_is_navigated_to_all_products_page_successfully() {
        Assert.assertTrue(test.allProducts.isDisplayed());
    }
    @Then("Enter product name in search input and click search button")
    public void enter_product_name_in_search_input_and_click_search_button() {
        test.searchProduct.click();
        test.searchProduct.sendKeys("jeans");
        test.searchProductButton.click();
    }
    @Then("Verify SEARCHED PRODUCTS is visible")
    public void verify_searched_products_is_visible() {
        Assert.assertTrue(test.searcedProduct.isDisplayed());
    }
    @Then("Verify all the products related to search are visible")
    public void verify_all_the_products_related_to_search_are_visible() {
        Assert.assertTrue(test.photo1.isDisplayed());
        Assert.assertTrue(test.photo2.isDisplayed());
        Assert.assertTrue(test.photo3.isDisplayed());
    }
    @Then("The products list is visible")
    public void the_products_list_is_visible() {
        Assert.assertTrue(test.productList.isDisplayed());
    }

    @Then("Click on View Product of first product")
    public void click_on_view_product_of_first_product() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        js.executeScript("arguments[0].click();", test.viewProduct);
        //test.viewProduct.click();
    }

    @Then("kullanici {int} saniye bekler")
    public void kullanici_saniye_bekler(Integer beklenenSure) {
        try {
            Thread.sleep(beklenenSure*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Then("User is landed to product detail page")
    public void user_is_landed_to_product_detail_page() {
        Assert.assertTrue(test.productDetailPage.isDisplayed());
    }
    @Then("Verify that detail detail is visible: product name, category, price, availability, condition, brand")
    public void verify_that_detail_detail_is_visible_product_name_category_price_availability_condition_brand() {
        Assert.assertTrue(test.productName.isDisplayed());
        Assert.assertTrue(test.category.isDisplayed());
        Assert.assertTrue(test.price.isDisplayed());
        Assert.assertTrue(test.availability.isDisplayed());
        Assert.assertTrue(test.condition.isDisplayed());
        Assert.assertTrue(test.brand.isDisplayed());

    }
}
