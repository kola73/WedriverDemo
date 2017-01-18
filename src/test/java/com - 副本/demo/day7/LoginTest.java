package demo.day7;

import demo.day7.po.POLoginTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static demo.day7.LoginDemo.*;

/**
 * Created by kola on 2017/1/3.
 * 分为三层：PO层(页面库，把页面所有元素放在一起统一管理，减少冗余代码，看起来更加清晰），
 * 逻辑层（公共方法做封装，如登录等，供业务层调用），业务层（具体操作）
 */
public class LoginTest {
     public WebDriver driver;
    @BeforeMethod
    public void openBrowser() {
        System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://mail.163.com");
    }

     @Test
   public void loginTest1(){
       LoginDemo.login(driver, "wenhj123456789","skythebest1991");
       boolean a= driver.findElement(By.linkText("退出")).isDisplayed();
        Assert.assertTrue(a);
        String name=driver.findElement(By.xpath("html/body/div[2]/div[1]/div/div/div/div[2]/div[2]/span[1]/span[1]")).getText();
        Assert.assertEquals("wenhj123456789",name);
    }


}
