package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LocationPge {

//    public LocationPge(){
//        PageFactory.initElements(Driver.getDriver(),this);
//    }

    public By startButton=By.xpath("//input[@id='next-button']");

    public By england=By.xpath("//input[@id='radio-england']");
    public By scotland=By.xpath("//input[@id='radio-scotland']");
    public By wales=By.xpath("//input[@id='radio-wales']");
    public By northIreland=By.xpath("/input[@id='radio-nire']");
    public By nextButton=By.xpath("//input[@id='next-button']");

}
