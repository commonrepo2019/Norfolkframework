package y.util;

import org.openqa.selenium.WebDriver;

import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ReportLoader {




 public  static void loadReport()
    {
        System.setProperty("webdriver.chrome.driver","C:/Users/hiscoxuser2/serenity/chromedriver.exe");

        WebDriver driver1=new ChromeDriver();

        driver1.manage().timeouts().implicitlyWait(30000, TimeUnit.MILLISECONDS);
        driver1.get("C:/Users/hiscoxuser2/serenity/ndautomation/target/site/serenity/y.features.search.allmenusandsubmenus_allmenusandsubmenus.html");
    }
}
