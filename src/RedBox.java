import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

/**
 * Created by yousufbhuiyan on 5/16/17.
 */
public class RedBox {
    WebDriver wb;

    public void hoverElement(){
        System.setProperty("webdriver.chrome.driver", "/Users/yousufbhuiyan/Downloads/chromedriver");
        wb = new ChromeDriver();
        wb.get("https://my.adp.com/static/redbox/login.html");

//        Login as Onboarding User
        wb.findElement(By.xpath("//*[@id=\"user\"]")).click();
        wb.findElement(By.xpath("//*[@id=\"user\"]")).clear();
        wb.findElement(By.xpath("//*[@id=\"user\"]")).sendKeys("fuser@qahra");
        wb.findElement(By.id("password")).click();
        wb.findElement(By.id("password")).clear();
        wb.findElement(By.id("password")).sendKeys("adpadp11");

        //        click on login button
        wb.findElement(By.xpath("//*[@id=\"login\"]/div/span/span")).click();

//        Hover over the profile icon/mini-me
        Actions action = new Actions(wb);
        WebElement we = wb.findElement(By.xpath("//*[@id=\"hdr-profile\"]"));
        we.click();
//        action.moveToElement(we).moveToElement(wb.findElement(By.xpath("//*[@id=\"personal-info\"]/span"))).click().build().perform();


//        Actions action = new Actions(webdriver);
//        WebElement we = webdriver.findElement(By.xpath("html/body/div[13]/ul/li[4]/a"));
//        action.moveToElement(we).moveToElement(webdriver.findElement(By.xpath("/expression-here"))).click().build().perform();
        wb.quit();
    }
}
