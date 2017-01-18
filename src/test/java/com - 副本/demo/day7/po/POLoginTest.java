package demo.day7.po;

import org.openqa.selenium.By;

/**
 * Created by wenhj1 on 2017/1/17.
 */
public class POLoginTest {
    //    定位email框
    public static By loginTextFile = By.name("email");
    //    定位密码框
    public static By pwdTextFile = By.name("password");
    //    定位登录框
    public static By pwdButton = By.id("dologin");
    // 定位iframe
    public static By frame = By.id("x-URS-iframe");
}
