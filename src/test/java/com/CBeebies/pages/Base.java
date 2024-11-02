package com.CBeebies.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Base {
    @FindBy(xpath = "//div[@class='src__VisualArea-sc-1e9l4qf-1 jUqUSn']//div[@class='src__Click-sc-1e9l4qf-2 fQFOfF']")
    public WebElement supertato;

    public void downloadSupertato(){
        supertato.click();

    }
}
