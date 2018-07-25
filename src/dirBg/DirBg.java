package dirBg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DirBg {

    public static void main(String[] args) {
        WebDriver driver = initChrome("browsers\\chromedriver.exe", "https://life.dir.bg/");
        WebElement clickZdraveIkrasota = clickZdraveIkrasota(driver);
        driver.quit();

    }

    private static WebElement clickZdraveIkrasota(WebDriver driver){
        WebElement zdraveIKrasotaLink = driver.findElement(By.cssSelector("#main > div:nth-child(6) > div:nth-child(1) > div > div > ul > li:nth-child(5) > a > span"));
        zdraveIKrasotaLink.click();
        System.out.println("Zdrave i Krasota link is clicked " + zdraveIKrasotaLink.isDisplayed());
        return zdraveIKrasotaLink;
    }

    private static WebDriver initChrome(String browser, String url) {

        //System.setProperty("webdriver.chrome.driver", browser);
        WebDriver driver = new ChromeDriver();
        driver.navigate().to(url);
        return driver;
    }
}


