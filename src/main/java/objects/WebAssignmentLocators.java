package objects;

import general.MainCall;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import general.GenericFunctions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class WebAssignmentLocators {

    /*
    -----------------------------------------------------------
        locators for Add Dove Brand items to cart using X-path
    -----------------------------------------------------------
    */

    public static By getSelectDoveBrand = By.xpath("//img[@alt='Dove']");
    public static By selectnewitem = By.xpath("//div[@class='thumbnail']/a");
    public static By clickAddToCart = By.xpath("//a[@class='cart']");
    public static By assertQuantity = By.xpath("//*[@id='cart_quantity76']");
    public static By assertItem = By.linkText("Men+Care Clean Comfort Deodorant");
    /*
    -------------------------------------------------------------------------
        locators for Adding Men medium T-shirt and Shoes using CSS Selectors
    -------------------------------------------------------------------------
    */

    public static By getAPPARELACCESSORIESsection = By.cssSelector("[href='https://automationteststore.com/index.php?rt=product/category&path=68']");
    public static By selectTshirtOption = By.cssSelector(":nth-child(2) > .mt10 > a");
    public static By sortItems = By.cssSelector("#sort");
    public static By selectShirt = By.cssSelector(":nth-child(6) > .thumbnail > :nth-child(1) > img");
    public static By selectMediumSize = By.cssSelector("#option351");
    public static By addToCart = By.cssSelector(".cart");
    public static By clickShoes = By.cssSelector(":nth-child(1) > .mt10 > a");
    public static By selectShoes = By.cssSelector(":nth-child(1) > .thumbnail > :nth-child(1) > img");
    public static By itemQuantity = By.cssSelector("#product_quantity");
    public static By assert1 = By.cssSelector(".table > tbody > :nth-child(2) > :nth-child(2) > a");
    public static By assert2 = By.cssSelector("tbody > :nth-child(3) > :nth-child(2) > a");
    public static By assert3 = By.cssSelector("#cart_quantity1159decaced08ca7c307cce3840afceda7f");

    /*
    -----------------------------------------------------------
        locators for Adding Men catagory item that ends with M
    -----------------------------------------------------------
    */

    public static By selectMenCategory = By.xpath("//a[@href='https://automationteststore.com/index.php?rt=product/category&path=58']");
    public static By selectItemEndsWithMLetter = By.xpath("//a[@title='ck IN2U Eau De Toilette Spray for Him']");
    public static By Cart = By.xpath("//a[@class='cart']");
    public static By AssetCart = By.linkText("ck IN2U Eau De Toilette Spray for Him");

    /*
    -----------------------------------------------------------
       locators for counting on sale items and adding to cart
    -----------------------------------------------------------
    */
    public static By selectSkincareSection = By.xpath("//a[@href='https://automationteststore.com/index.php?rt=product/category&path=43']");
    public static By viewCart = By.xpath("//a[@href='https://automationteststore.com/index.php?rt=checkout/cart']");
    public static By salesItems = By.xpath("//span[@class='sale']");
    public static By noStock = By.xpath("//span[@class='nostock']");
    public static By addToCartSaleItems = By.xpath("//a[@class='productcart']");


    /*---------------------------------------------------------------------------------------------------------------------------------------
    ---------------------------------------------------------------------------------------------------------------------------------------
    ---------------------------------------------------------------------------------------------------------------------------------------*/

    /*
    -------------------------------------------------
    Add Dove Brand (Newest) item to cart using Xpath
    -------------------------------------------------
    */

    public static void selectBrand(){
        MainCall.log.logInfo("User Click on Dove Brand");
        WebElement elements = MainCall.webDriverFactory.getDriver().findElement(getSelectDoveBrand);
        elements.click();
    }
    public static void setSelectnewitem(){
        MainCall.log.logInfo("User selected newest item");
        WebElement elements = MainCall.webDriverFactory.getDriver().findElement(selectnewitem);
        elements.click();
    }
    public static void clickAddToCart(){
        MainCall.log.logInfo("User click Add To Cart Button");
        WebElement elements = MainCall.webDriverFactory.getDriver().findElement(clickAddToCart);
        elements.click();
    }
    public static void AssertText(){
        String elementText= MainCall.webDriverFactory.getDriver().findElement(assertItem).getText();
        GenericFunctions.assertTextByLocator(elementText,"Men+Care Clean Comfort Deodorant");
    }
    public static void AssertValue(){
        String elementval= MainCall.webDriverFactory.getDriver().findElement(assertQuantity).getAttribute("value");;
        GenericFunctions.assertValueByLocator(elementval,"1");
    }

    /*
    ------------------------------------------------------------------------
        Add Accessories T-shirts and Shoes item to cart using CSS-Selectors
    ------------------------------------------------------------------------
    */


    public static void selectAccessoriesSection(){
        MainCall.log.logInfo("User Click on APPAREL & ACCESSORIES section");
        WebElement elements = MainCall.webDriverFactory.getDriver().findElement(getAPPARELACCESSORIESsection);
        elements.click();
    }

    public static void selectTshirt(){
        MainCall.log.logInfo("User Click on Tshirts");
        WebElement elements = MainCall.webDriverFactory.getDriver().findElement(selectTshirtOption);
        elements.click();
    }

    public static void sortItems(){
        MainCall.log.logInfo("User Click on SortOptions");
        Select dropdown = new Select(MainCall.webDriverFactory.getDriver().findElement(sortItems));
        dropdown.selectByVisibleText("Price Low > High");
    }

    public static void addMediumTshirtToCart(){
        MainCall.log.logInfo("User Add Medium tshirt to Cart");
        WebElement elements = MainCall.webDriverFactory.getDriver().findElement(selectShirt);
        elements.click();
        Select dropdown = new Select(MainCall.webDriverFactory.getDriver().findElement(selectMediumSize));
        dropdown.selectByVisibleText("Medium");
        WebElement cart = MainCall.webDriverFactory.getDriver().findElement(addToCart);
        cart.click();
    }

    public static void addHighestRatingShoesToCart(){
        MainCall.log.logInfo("User Add Highest Rating Shoes to Cart");
        WebElement elements = MainCall.webDriverFactory.getDriver().findElement(getAPPARELACCESSORIESsection);
        elements.click();
        WebElement clickShoesOption = MainCall.webDriverFactory.getDriver().findElement(clickShoes);
        clickShoesOption.click();
        Select dropdown = new Select(MainCall.webDriverFactory.getDriver().findElement(sortItems));
        dropdown.selectByVisibleText("Rating Highest");
        WebElement selectShoesOption = MainCall.webDriverFactory.getDriver().findElement(selectShoes);
        selectShoesOption.click();
        WebElement pQuantity = MainCall.webDriverFactory.getDriver().findElement(itemQuantity);
        pQuantity.clear();
        pQuantity.sendKeys("2");
        WebElement cart = MainCall.webDriverFactory.getDriver().findElement(addToCart);
        cart.click();
        String elementText1= MainCall.webDriverFactory.getDriver().findElement(assert1).getText();
        GenericFunctions.assertTextByLocator(elementText1,"Designer Men Casual Formal Double Cuffs Grandad Band Collar Shirt Elegant Tie");
        String elementText2= MainCall.webDriverFactory.getDriver().findElement(assert2).getText();
        GenericFunctions.assertTextByLocator(elementText2,"Fiorella Purple Peep Toes");
        String elementvalue= MainCall.webDriverFactory.getDriver().findElement(assert3).getAttribute("value");
        GenericFunctions.assertValueByLocator(elementvalue,"2");
    }

    /*
    --------------------------------------------------------------------
    Add Men Category Item to cart (name end with letter M) Using x-Path
    --------------------------------------------------------------------
    */

    public static void addItemEndsWithMToCart(){
        MainCall.log.logInfo("User is adding item to cart that end with M letter");
        WebElement elements = MainCall.webDriverFactory.getDriver().findElement(selectMenCategory);
        elements.click();
        WebElement EndsWithM = MainCall.webDriverFactory.getDriver().findElement(selectItemEndsWithMLetter);
        EndsWithM.click();
        WebElement clickCartbtn = MainCall.webDriverFactory.getDriver().findElement(Cart);
        clickCartbtn.click();
        String assertText= MainCall.webDriverFactory.getDriver().findElement(AssetCart).getText();
        GenericFunctions.assertTextByLocator(assertText,"ck IN2U Eau De Toilette Spray for Him");
    }
    /*
    -------------------------------------------------------
     Counting items that are on Sale and adding into cart
    -------------------------------------------------------
    */
    public static void countOnSaleItems(){
        MainCall.log.logInfo("Counting items that are on Sale and adding into cart");
        WebElement skincare = MainCall.webDriverFactory.getDriver().findElement(selectSkincareSection);
        skincare.click();
        List<WebElement> Items= MainCall.webDriverFactory.getDriver().findElements(salesItems);
            for (int i=0; i<Items.size(); i++) {
                Items.get(i).findElement(addToCartSaleItems).click();
            }
        List<WebElement> outOfStock= MainCall.webDriverFactory.getDriver().findElements(noStock);
        System.out.println("Count of items on sale : "+Items.size());
        System.out.println("Count of items that are out of stock : "+outOfStock.size());
        WebElement Cart = MainCall.webDriverFactory.getDriver().findElement(viewCart);
        Cart.click();

    }
}
