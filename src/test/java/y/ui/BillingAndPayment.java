package y.ui;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
public class BillingAndPayment {

    public static Target BILLING_AND_PAYMENT_MAIN_MENU = Target.the("Billing and Payment - Main Menu").located(By.xpath("//ul[@id='menu-menu-2']/li[3]/a[1]/span[1]"));

    public static Target ONLINE_PAYMENT = Target.the("Online Payment - Sub Menu").located(By.xpath("//li[@class='menu-online-payment menu-item-5405']//span[text()='Online Payment']"));

    public static Target EDP_AUTHORISATION_FORM = Target.the("EDP Authorization Form - Sub Menu").located(By.xpath("//li[@class='menu-edp-authorization-form menu-item-5406']//span[text()='EDP Authorization Form']"));


}
