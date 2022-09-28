package Models;

import Tests.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class BaseModel extends BaseTest {

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    public WebElement findElement(By by) {
        return driver.findElement(by);
    }

    public List<WebElement> findElements(By by) {
        return driver.findElements(by);
    }

    public void clickElement(By by) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        wait.until(ExpectedConditions.elementToBeClickable(by));
        findElement(by).click();
    }

    protected void clickElement(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }

    public String getText(By by) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        return findElement(by).getText();
    }

    public  void sendKeys(By by, String str){

        // wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        findElement(by).sendKeys(str);

    }

    public  void  clearText(By by){

        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        findElement(by).clear();

    }

    public void clickList(By by, int index){
        List<WebElement> list = findElements(by);
        clickElement(list.get(index));
    }

    public boolean isElementVisible(By by) {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(by));
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

}
