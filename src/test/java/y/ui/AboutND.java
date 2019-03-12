package y.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AboutND {
    public static Target ABOUT_ND_MAIN_MENU = Target.the("About ND - Main Menu").located(By.xpath("//ul[@id='menu-menu-2']/li[1]/a[1]/span[1]"));

    public static Target WHO_WE_ARE_SUB_MENU = Target.the("Who We Are - Sub Menu").located(By.xpath("//span[text()='Who We Are']"));

    public static Target OUR_CLIENTS_SUB_MENU = Target.the("Our Clients / Testimonials - Sub Menu").located(By.xpath("//span[text()='Our Clients / Testimonials']"));

    public static Target CAREERS_SUB_MENU = Target.the("Careers - Sub Menu").located(By.xpath("//li[@class='menu-careers menu-item-5404']//span[text()='Careers']"));

    public static Target CONTACT_US_SUB_MENU = Target.the("Contact Us - Sub Menu").located(By.xpath("//li[@class='menu-contact-us menu-item-5402']//span[text()='Contact Us']"));
}
