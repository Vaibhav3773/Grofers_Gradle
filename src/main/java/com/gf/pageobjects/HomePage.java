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

}
