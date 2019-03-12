package y.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;




public class InsuranceSolutions {

    public static Target INSURANCE_SOLUTIONS = Target.the("Insurance Solutions - Main Menu").located(By.xpath("//ul[@id='menu-menu-2']/li[5]/a[1]/span[1]"));

    public static Target COMMERCIAL_LINES = Target.the("Commercial Lines - sub Menu").located(By.xpath("//li[@class='menu-commercial-lines menu-item-5418']//span[text()='Commercial Lines']"));

    public static Target COMMERCIAL_LINES_AUTO = Target.the("Commercial Lines Auto - sub Menu").located(By.xpath("//li[@class='menu-auto current-menu-item current_page_item menu-item-5427']//span[text()='Auto']"));

    public static Target COM_PAK_BUSINESS_OWNERS = Target.the("Commercial Lines ComPak Businessowners- sub Menu").located(By.xpath("//li[@class='menu-compak-businessowners menu-item-7279']//span[contains(text(),'Businessowners')]"));

    public static Target EMPLOYEMENT_PRACTICES_LIABILITY = Target.the("Commercial Lines Employment Practices Liability (EPL) - sub Menu").located(By.xpath("//li[@class='menu-employment-practices-liability-epl menu-item-5423']//span[contains(text(),'Employment Practices Liability (EPL)')]"));

    public static Target FARM_OWNERS = Target.the("Commercial Lines Farmowners - sub Menu").located(By.xpath("//li[@class='menu-farmowners menu-item-5420']//span[contains(text(),'Farmowners')]"));

    public static Target COMMERCIAL_LINES_UMBRELLA = Target.the("Commercial Lines  Umbrella - sub Menu").located(By.xpath("//li[@class='menu-umbrella menu-item-5424']//span[contains(text(),'Umbrella')]"));

    public static Target WORK_PAK_WORKERS = Target.the("Commercial Lines WorkPak – Workers Compensation- sub Menu").located(By.xpath("//li[@class='menu-workpak-workers-compensation menu-item-5425']//span[contains(text(),'Compensation')]"));






    public static Target PERSONAL_LINES = Target.the("Personal Lines- sub Menu").located(By.xpath("//li[@class='menu-personal-lines menu-item-5426']//span[text()='Personal Lines']"));

    public static Target PERSONAL_LINES_AUTO = Target.the("Personal Lines Auto- sub Menu").located(By.xpath("//li[@class='menu-auto current-menu-item current_page_item menu-item-5434']//span[contains(text(),'Auto')]"));

    public static Target DWELLING_FIRE = Target.the("Personal Lines Dwelling Fire- sub Menu").located(By.xpath("//li[@class='menu-dwelling-fire menu-item-5429']//span[contains(text(),'Dwelling Fire')]"));

    public static Target HOME_OWNERS = Target.the("Personal Lines Homeowners- sub Menu").located(By.xpath("//li[@class='menu-homeowners menu-item-5430']//span[contains(text(),'Homeowners')]"));

    public static Target INLAND_MARINE = Target.the("Personal Lines Inland Marine- sub Menu").located(By.xpath("//li[@class='menu-inland-marine menu-item-5431']//span[contains(text(),'Inland Marine')]"));

    public static Target PERSONAL_LINES_UMBRELLA = Target.the("Personal Lines Umbrella- sub Menu").located(By.xpath("//li[@class='menu-umbrella menu-item-5432']//span[contains(text(),'Umbrella')]"));



}
