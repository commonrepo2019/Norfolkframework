package y.ui;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SafetyTips {



        public static Target SAFETY_TIPS = Target.the("Safety tips - Main Menu").located(By.xpath("//ul[@id='menu-menu-2']/li[6]/a[1]/span[1]"));

        public static Target AUTO_LOSS_CONTROL_TOPICS = Target.the("Auto Loss Control Topics - Sub Menu").located(By.xpath("//li[@class='menu-auto-loss-control-topics menu-item-5412']//span[text()='Auto Loss Control Topics']"));

        public static Target BUSINESS_OWNERS_LOSS_TOPICS = Target.the("Businessowners Loss Control Topics - Sub Menu").located(By.xpath("//li[@class='menu-businessowners-loss-control-topics menu-item-5413']//span[text()='Businessowners Loss Control Topics']"));

        public static Target HOME_OWNER_LOSS_TOPICS = Target.the("Homeowner Loss Control Topics - Sub Menu").located(By.xpath("//li[@class='menu-homeowner-loss-control-topics menu-item-5414']//span[text()='Homeowner Loss Control Topics']"));

        public static Target WINTER_LOSS_TOPICS = Target.the("Winter Loss Control Topics - Sub Menu").located(By.xpath("//li[@class='menu-winter-loss-control-topics menu-item-5415']//span[text()='Winter Loss Control Topics']"));
    }
