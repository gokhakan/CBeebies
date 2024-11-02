package com.CBeebies.stepDefs;

import com.CBeebies.pages.CarouselPage;
import com.CBeebies.utilities.ConfigurationReader;
import com.CBeebies.utilities.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.NoSuchElementException;

import static org.junit.Assert.assertEquals;

public class Steps {
    CarouselPage carouselPage = new CarouselPage();

    @Given("user is on {string} page")
    public void user_is_on_page(String pageName) {
        Driver.get().get(ConfigurationReader.get("urlWithoutAnimation"));
        BrowserUtils.waitForPageToLoad(20);
        assertEquals(Driver.get().getTitle(), pageName);
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
    public void user_wants_to_interact_with(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }}

