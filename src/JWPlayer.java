import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import sun.jvm.hotspot.utilities.Assert;


import javax.swing.*;
import java.util.concurrent.TimeUnit;

/**
 * Created by yousufbhuiyan on 5/16/17.
 */
public class JWPlayer {

    WebDriver wb;

    public JWPlayer(){
        System.setProperty("webdriver.chrome.driver", "/Users/yousufbhuiyan/Downloads/chromedriver");
        wb = new ChromeDriver();
        wb.get("https://dashboard.jwplayer.com/");
    }

    public void jwHomePage(){

        WebElement email = wb.findElement(By.id("email"));
        email.sendKeys(new CharSequence[]{"yousuf.bhuiyan216@gmail.com"});

        WebElement password = wb.findElement(By.xpath("/html/body/div[3]/div/div[4]/div/div/div[2]/div/form/div[1]/fieldset/div[2]/div[2]/input"));
        password.sendKeys("starssky1");

        WebElement login = wb.findElement(By.id("submit_login"));
        login.click();

        //System.out.println("Loggin successfully");


    }

    public void navgateToPalyersPage(){

        String pathOfPlayers = "//*[@id=\"fouc\"]/div[1]/div[2]/div[2]/div[3]/div[2]/div[1]/a";
        WebDriverWait wait = new WebDriverWait(wb, 30);
        WebElement players = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(pathOfPlayers)));
        players.click();


        //System.out.println("navgateToPalyers :"+players.toString());
    }

    public void loadExamplePlayers(){

        String pathOfExmplePlayers = "//*[@id=\"fouc\"]/div[2]/div[5]/div/div/div[2]/div[2]/div[2]/div[2]/div[1]/table/tbody/tr[1]/td[2]/a";
        WebDriverWait waiti = new WebDriverWait(wb, 30);
        WebElement ExmplePlayers = waiti.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(pathOfExmplePlayers)));
        ExmplePlayers.click();

        //System.out.println("Example Players :"+ExmplePlayers.toString());
    }


    public void changePlayersProprities(){

        String idOfPlayersName = "player-title";

        WebDriverWait wait = new WebDriverWait(wb, 30);
        WebElement playersName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(idOfPlayersName)));
        playersName.clear();
        playersName.sendKeys(new CharSequence[]{"TestPlayer"});

        //System.out.println("Example Players :"+playersName.toString());
    }
    public void changePlayerRatio(){

        String idOfRatiao1 = "fix_width";
        String idOfRatiao2 = "fix_height";

        WebDriverWait wait = new WebDriverWait(wb, 30);
        WebElement ratioName1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(idOfRatiao1)));
        WebElement ratioName2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(idOfRatiao2)));
        ratioName1.clear();
        ratioName1.sendKeys(new CharSequence[]{"600"});
        ratioName2.clear();
        ratioName2.sendKeys(new CharSequence[]{"320"});

        //System.out.println("Ratio X :"+ratioName1.toString());
        //System.out.println("Ratio Y :"+ratioName2.toString());
    }


    public void clickSaveChangeButton(){

        String xpathOfSaveChangeButton = "//*[@id='fouc']/div[2]/div[5]/div/div/div[2]/div[2]/div[1]/div[2]/button[1]";
        WebDriverWait wait = new WebDriverWait(wb, 30);
        WebElement saveChanges = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathOfSaveChangeButton)));
        saveChanges.click();

        System.out.println("Button Save Chages  :"+saveChanges.toString());
        wb.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        String xpathNotification = "//*[@id=\"fouc\"]/div[2]/div[4]/div[4]/div";
        WebDriverWait waitN = new WebDriverWait(wb, 30);
        WebElement notifcaiton = waitN.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathNotification)));

        //String text = notifcaiton.getText();

        if(notifcaiton.getText().equals("Player successfully saved"))
        {
            System.out.println("Test run successfully for changing the name of player");
        }


    }

    public void getThePlayerModifiedName(){

        String pathOfExmplePlayers = "//*[@id=\"fouc\"]/div[2]/div[5]/div/div/div[2]/div[2]/div[2]/div[2]/div[1]/table/tbody/tr[1]/td[2]/a";
        WebDriverWait waiti = new WebDriverWait(wb, 30);
        WebElement ExmplePlayers = waiti.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(pathOfExmplePlayers)));

        String playerName = ExmplePlayers.getText();

        if(ExmplePlayers.getText().equals("TestPlayer"))
        {
            System.out.println("Test Player");
        }





    }
}
