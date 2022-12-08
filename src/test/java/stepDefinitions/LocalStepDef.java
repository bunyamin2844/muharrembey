package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LocationPge;

public class LocalStepDef {
    LocationPge locationPge= new LocationPge();


    @When("user user click start button")
    public void user_user_click_start_button() {


    }
    @When("user select location as {string}")
    public void user_select_location_as(String string) {

    }
    @Then("user click next button")
    public void user_click_next_button() {

    }



//    LocationPageObjects lpom=new LocationPageObjects();
//        @When(“user click start button”){
//            Click.startButton;
//        }
//        @When(“user select location as {string}”)  {
//            Switch(string) {
//                Case “England”:
//                Click(lpom.england);
//                break;
//                Case “Scotland”:
//                Click(lpom.scotland);
//                break;
//                Case “Wales”:
//                Click(lpom.wales);
//                break;
//                Case “North Ireland”:
//                Click(lpom.northIreland);
//                break;
//            }
//
//
//        }
}
