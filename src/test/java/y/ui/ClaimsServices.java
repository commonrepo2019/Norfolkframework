package y.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class ClaimsServices {

    public static Target CLAIMS_SERVICES = Target.the("Claims Services - Main Menu").located(By.xpath("//ul[@id='menu-menu-2']/li[4]/a[1]/span[1]"));

    public static Target AUTOMATED_CLAIMS_VEHICLES = Target.the("Automated Claims Vehicles - sub menu").located(By.xpath("//li[@class='menu-automated-claims-vehicles menu-item-5408']//span[text()='Automated Claims Vehicles']"));

    public static Target MA_BODY_SHOPS = Target.the("MA Body shops - sub menu").located(By.xpath("//li[@class='menu-ma-body-shops menu-item-5409']//span[text()='MA Body Shops']"));

    public static Target MA_DRIVE_IN_CENTERS = Target.the("MA Drive-in centers - sub menu").located(By.xpath("//li[@class='menu-ma-drive-in-centers menu-item-5410']//span[text()='MA Drive-In Centers']"));

    public static Target REPORT_A_CLAIM = Target.the("Report a Claim - sub menu").located(By.xpath("//li[@class='menu-report-a-claim menu-item-5411']//span[text()='Report A Claim']"));


}
