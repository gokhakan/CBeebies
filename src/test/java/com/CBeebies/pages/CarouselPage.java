package com.CBeebies.pages;

import com.CBeebies.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CarouselPage extends Base{
    public CarouselPage() {
        PageFactory.initElements(Driver.get(), this);
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

    @FindBy(id = "Teletubbies")
    public WebElement teletubbies;

    @FindBy(id = "halloween")
    public WebElement halloween;

    @FindBy(id = "space-games")
    public WebElement spaceGames;

    @FindBy(id = "supertato")
    public WebElement supertato;

    @FindBy(id = "jojo-and-gran-gran")
    public WebElement jojoAndGranGran;

    @FindBy(id = "my-collection")
    public WebElement myGames;

    @FindBy(id = "shaun-the-sheep")
    public WebElement shaunTheSheep;

    @FindBy(id = "hey-duggee")
    public WebElement heyDuggee;

    @FindBy(id = "vegesaurs")
    public WebElement vegesaurs;

    @FindBy(id = "peter-rabbit")
    public WebElement peterRabbit;

    @FindBy(id = "dog-squad")
    public WebElement dogSquad;

    @FindBy(id = "swashbuckle")
    public WebElement swashbuckle;

    @FindBy(id = "love-monster")
    public WebElement loveMonster;

    @FindBy(id = "mr-tumble")
    public WebElement mrTumble;

    @FindBy(id = "waffle-the-wonderdog")
    public WebElement waffleTheWonderdog;

    @FindBy(id = "go-jetters")
    public WebElement goJetters;

    @FindBy(id = "little-ones")
    public WebElement littleOnes;

    @FindBy(id = "big-kids")
    public WebElement bigKids;

    @FindBy(id = "more-cbeebies-apps")
    public WebElement moreCbeebiesApps;

    @FindBy(id = "hidden-gems")
    public WebElement hiddenGems;

    @FindBy(id = "octonauts")
    public WebElement octonauts;

    @FindBy(id = "theme-songs")
    public WebElement themeSongs;

    public WebElement getGameElementById(String id) {
        try {
            return Driver.get().findElement(By.id(id));
        } catch (NoSuchElementException e) {
            throw new IllegalArgumentException("Game element not found with id: " + id, e);
        }
    }
}

