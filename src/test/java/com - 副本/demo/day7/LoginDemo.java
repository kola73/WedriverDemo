package demo.day7;

import demo.day7.po.POLoginTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by kola on 2017/1/8.
 * 封装
 */
public class LoginDemo {
    public static void login(WebDriver driver, String email, String password) {
        WebElement frame = driver.findElement(POLoginTest.frame);
        driver.switchTo().frame(frame);
        driver.findElement(POLoginTest.loginTextFile).sendKeys("wenhj123456789");
        driver.findElement(POLoginTest.pwdTextFile).sendKeys("skythebest1991");
        driver.findElement(POLoginTest.pwdButton).click();
    }
}
