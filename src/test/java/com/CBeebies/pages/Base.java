package com.CBeebies.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Base {
    @FindBy(xpath = "//div[@class='src__VisualArea-sc-1e9l4qf-1 jUqUSn']//div[@class='src__Click-sc-1e9l4qf-2 fQFOfF']")
    public WebElement supertato;

    public void downloadSupertato(){
        supertato.click();

    }

    @FindBy(xpath = "//button[@aria-label='Right swipe - select to move to the right']//div[@class='src__Click-sc-1e9l4qf-2 fQFOfF']")
    public WebElement rightButton;

    @FindBy(xpath = "//button[@aria-label='Left swipe - select to move to the left']//div[@class='src__Click-sc-1e9l4qf-2 fQFOfF']")
    public WebElement leftButton;

    public void clickRightButton() {
        rightButton.click();
    }

    public void clickLeftButton() {
        leftButton.click();
    }
}
