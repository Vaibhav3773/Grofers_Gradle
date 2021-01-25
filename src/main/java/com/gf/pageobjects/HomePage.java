package com.gf.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
    /**
     * WebElement
     */
    @FindBy(xpath = "//input[@aria-activedescendant="
        + " 'react-select-2--value']")
    private WebElement locationTxtBox;
    /**
     * WebElement
     */
    @FindBy(xpath="//input[@placeholder='Search for products']")
    private WebElement searchProdTxtbox;
    /**
     * WebElement
     */
    @FindBy(xpath="//div[text()='Society Plain Tea (Pouch)']")
    private WebElement societyTea;
    /**
     * WeElement
     */
    @FindBy(xpath="(//button[@class='add-to-cart__dec'])")
    private WebElement addToCartBtn;

}
