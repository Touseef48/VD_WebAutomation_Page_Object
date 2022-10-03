package testcases;

import config.ConfigProperties;
import general.BaseTest;
import general.MainCall;
import org.testng.annotations.Test;
import objects.WebAssignmentLocators;

public class Web_Assignment extends BaseTest {
    /*
    ---------------------------------------------------

        Add to Cart (Dove Brand Items) Functionality

    ---------------------------------------------------
    */
    @Test
    public static void Scenario1(){
        MainCall.genericFunctions.driverStart(ConfigProperties.webAssignmentUrl);
        WebAssignmentLocators.selectBrand();
        WebAssignmentLocators.setSelectnewitem();
        WebAssignmentLocators.clickAddToCart();
        WebAssignmentLocators.AssertText();
        WebAssignmentLocators.AssertValue();
    }

    @Test
    public static void Scenario2(){
        MainCall.genericFunctions.driverStart(ConfigProperties.webAssignmentUrl);
        WebAssignmentLocators.selectAccessoriesSection();
        WebAssignmentLocators.selectTshirt();
        WebAssignmentLocators.sortItems();
        WebAssignmentLocators.addMediumTshirtToCart();
        WebAssignmentLocators.addHighestRatingShoesToCart();
    }

    @Test
    public static void Scenario3(){
        MainCall.genericFunctions.driverStart(ConfigProperties.webAssignmentUrl);
        WebAssignmentLocators.countOnSaleItems();
    }

    @Test
    public static void Scenario4(){
        MainCall.genericFunctions.driverStart(ConfigProperties.webAssignmentUrl);
        WebAssignmentLocators.addItemEndsWithMToCart();
    }
}
