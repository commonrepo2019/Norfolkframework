
package y.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class FindAnNDAgent {


    public static Target FIND_AN_ND_AGENT = Target.the("Find an ND Agent - Main Menu").located(By.xpath("//ul[@id='menu-menu-2']/li[2]/a[1]/span[1]"));
}
