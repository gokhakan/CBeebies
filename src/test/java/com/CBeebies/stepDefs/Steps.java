package com.CBeebies.stepDefs;

import com.CBeebies.pages.CarouselPage;
import com.CBeebies.utilities.ConfigurationReader;
import com.CBeebies.utilities.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.NoSuchElementException;

import static org.junit.Assert.assertEquals;

public class Steps {
    CarouselPage carouselPage = new CarouselPage();

    @Given("user is on {string} page")
    public void user_is_on_page(String pageName) throws InterruptedException {
        Driver.get().get(ConfigurationReader.get("urlWithoutAnimation"));
        BrowserUtils.waitForPageToLoad(20);
        assertEquals(Driver.get().getTitle(), pageName);
        Thread.sleep(5);
    }

    @When("user clicks on {string} navigation button")
    public void user_clicks_on_navigation_button(String direction) {
        BrowserUtils.waitFor(4);
        switch (direction.toLowerCase()) {
            case "right":
                carouselPage.clickRightButton();
                break;
            case "left":
                carouselPage.clickLeftButton();
                break;
            default:
                throw new IllegalArgumentException("Invalid direction. Please specify either 'right' or 'left'.");
        }
    }

    @Then("user sees {string}")
    public void user_sees(String nameOfTheGame) {
        System.out.println("nameOfTheGame = " + nameOfTheGame);
        try {
            carouselPage.getGameElementById(nameOfTheGame).isDisplayed();
            System.out.println(nameOfTheGame + " is visible on the page.");
        } catch (NoSuchElementException e) {
            System.out.println(nameOfTheGame + " is not visible on the page.");
        } catch (Exception e) {
            System.out.println("An error occurred while checking for " + nameOfTheGame + ": " + e.getMessage());
        }
    }

    @When("user wants to interact with {string}")
    public void user_wants_to_interact_with(String desiredGame) throws InterruptedException {
        Thread.sleep(5);
        System.out.println("desiredGame = " + desiredGame);
        BrowserUtils.waitForPageToLoad(20);

        if(carouselPage.getGameElementById(desiredGame).isDisplayed()){
            carouselPage.getGameElementById(desiredGame).click();
            BrowserUtils.waitFor(5);
        }else{
            System.out.println("ERROR");
        }
    }

    @Then("user is on {string} game")
    public void user_is_on_game(String nameOfTheGame) {
        String expectedUrl = "https://baseplates.uap.int.api.bbci.co.uk/playtime-island/preview/index.html?animations=off#/brand/" + nameOfTheGame;
        assertEquals(expectedUrl, Driver.get().getCurrentUrl());
    }
    @And("user downloads {string} game")
    public void user_downloads_game(String nameOfTheGame) throws InterruptedException {
        System.out.println("nameOfTheGame = " + nameOfTheGame);
        carouselPage.downloadSupertato();
        Thread.sleep(6);
        System.out.println("Driver.get().getTitle() = " + Driver.get().getTitle());
    }
}