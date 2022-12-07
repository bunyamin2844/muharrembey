package stepDefinitions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class deneme {
    @Test
    public void name() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();

    }
}
