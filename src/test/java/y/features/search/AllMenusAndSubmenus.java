package y.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.questions.page.TheWebPage;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.junit.*;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import y.tasks.*;
import y.ui.AboutND;
import y.util.ReportLoader;

import org.junit.runners.MethodSorters;
import y.util.ResponseCode;

import java.io.IOException;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.EventualConsequence.eventually;
import static org.hamcrest.Matchers.containsString;

@RunWith(SerenityRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AllMenusAndSubmenus {

    private Actor anna = Actor.named("The guestuser");

    @Managed(driver="firefox")
    public WebDriver driver;

    @Before
    public void annaCanBrowseTheWeb() {

        anna.can(BrowseTheWeb.with(driver));

    }


    /*-----------------------------------------------------------------------*/
    //About ND Menu

    @Steps
    OpenTheApplication openTheApplication;
    @Steps
    ClickOnAboutND clickOnAboutND;
    @Steps
    ClickOnWhoWeAre clickOnWhoWeAre;
    @Steps
    ClickOnClients clickOnClients;
    @Steps
    ClickOnCareers clickOnCareers;
    @Steps
    ClickOnContactUs clickOnContactUs;

    /*-----------------------------------------------------------------------*/
    //Find an ND Agent

    @Steps
    ClickOnFindAnNDAgentMenu clickOnFindAnNDAgentMenu;

    /*-----------------------------------------------------------------------*/
    // Billing and Payment
    @Steps
    ClickOnBillingAndPayment clickOnBillingAndPayment;
    @Steps
    ClickOnOnlinePayment clickOnOnlinePayment;
    @Steps
    ClickOnEDPAutorisationForm clickOnEDPAutorisationForm;


    /*-----------------------------------------------------------------------*/
    // Claims  services

    @Steps
    ClickOnClaimsServices clickOnClaimsServices;
    @Steps
    ClickOnAutomatedClaimsVehicles clickOnAutomatedClaimsVehicles;
    @Steps
    ClickOnMABodyShops clickOnMABodyShops;
    @Steps
    ClickOnMADriveInCenters clickOnMADriveInCenters;
    @Steps
    ClickOnReportAClaim clickOnReportAClaim;


    /*-----------------------------------------------------------------------*/
    // Insurance Solutions

    @Steps
    ClickOnInsuranceSolutions clickOnInsuranceSolutions;
    @Steps
    ClickOncommercialLines clickOncommercialLines;
    @Steps
    ClickOncommercialLinesAuto clickOncommercialLinesAuto;
    @Steps
    ClickOnComPakBusinessOwners clickOnComPakBusinessOwners;
    @Steps
    ClickOnEmployementPracticesLiability clickOnEmployementPracticesLiability;
    @Steps
    ClickOnFarmOwners clickOnFarmOwners;
    @Steps
    ClickOnCommercialUmbrella clickOnCommercialUmbrella;
    @Steps
    ClickOnWorkPakWorkersCompensation clickOnWorkPakWorkersCompensation;


    @Steps
    ClickOnPersonalLines clickOnPersonalLines;
    @Steps
    ClickOnPersonalLinesAuto clickOnPersonalLinesAuto;
    @Steps
    ClickOnDwellingfire clickOnDwellingfire;
    @Steps
    ClickOnHomeOwners clickOnHomeOwners;
    @Steps
    ClickOnInlandMarine clickOnInlandMarine;
    @Steps
    ClickOnPersonalLinesUmbrella clickOnPersonalLinesUmbrella;


    /*-----------------------------------------------------------------------*/
    // SafetyTips
    @Steps
    ClickOnSafetyTips clickOnSafetyTips;
    @Steps
    ClickOnAutoLossControlPrevention clickOnAutoLossControlPrevention;
    @Steps
    ClickOnBusinessOwnersLossControlTopics clickOnBusinessOwnersLossControlTopics;
    @Steps
    ClickOnHomeOwnersLossControlTopics clickOnHomeOwnersLossControlTopics;
    @Steps
    ClickOnWinterLossControlTopics clickOnWinterLossControlTopics;

    @Test
    public void all_menus_and_sub_menus() throws IOException {

        givenThat(anna).wasAbleTo(openTheApplication);
        Assert.assertEquals(200, ResponseCode.responseCode(driver.getCurrentUrl()));

        //About ND-main menu
        when(anna).attemptsTo(clickOnAboutND);
        Assert.assertEquals(200, ResponseCode.responseCode(driver.getCurrentUrl()));
        then(anna).should(eventually(seeThat(TheWebPage.title(), containsString("About | The N&D Group Insurance"))));
        when(anna).attemptsTo(clickOnWhoWeAre);
        Assert.assertEquals(200, ResponseCode.responseCode(driver.getCurrentUrl()));
        when(anna).attemptsTo(clickOnClients);
        Assert.assertEquals(200, ResponseCode.responseCode(driver.getCurrentUrl()));
        when(anna).attemptsTo(clickOnCareers);
        Assert.assertEquals(200, ResponseCode.responseCode(driver.getCurrentUrl()));
        when(anna).attemptsTo(clickOnContactUs);
        Assert.assertEquals(200, ResponseCode.responseCode(driver.getCurrentUrl()));

        //Find an ND Agent
        when(anna).attemptsTo(clickOnFindAnNDAgentMenu);
        Assert.assertEquals(200, ResponseCode.responseCode(driver.getCurrentUrl()));

        // Billing and Payment
        when(anna).attemptsTo(clickOnBillingAndPayment);
        Assert.assertEquals(200, ResponseCode.responseCode(driver.getCurrentUrl()));
        when(anna).attemptsTo(clickOnOnlinePayment);
        Assert.assertEquals(200, ResponseCode.responseCode(driver.getCurrentUrl()));
        when(anna).attemptsTo(clickOnEDPAutorisationForm);
        Assert.assertEquals(200, ResponseCode.responseCode(driver.getCurrentUrl()));

        // Claims  services
        when(anna).attemptsTo(clickOnClaimsServices);
        Assert.assertEquals(200, ResponseCode.responseCode(driver.getCurrentUrl()));
        when(anna).attemptsTo(clickOnAutomatedClaimsVehicles);
        Assert.assertEquals(200, ResponseCode.responseCode(driver.getCurrentUrl()));
        when(anna).attemptsTo(clickOnMABodyShops);
        Assert.assertEquals(200, ResponseCode.responseCode(driver.getCurrentUrl()));
        when(anna).attemptsTo(clickOnMADriveInCenters);
        Assert.assertEquals(200, ResponseCode.responseCode(driver.getCurrentUrl()));
        when(anna).attemptsTo(clickOnReportAClaim);
        Assert.assertEquals(200, ResponseCode.responseCode(driver.getCurrentUrl()));


        // Insurance Solutions
        when(anna).attemptsTo(clickOnInsuranceSolutions);
        Assert.assertEquals(200, ResponseCode.responseCode(driver.getCurrentUrl()));

        when(anna).attemptsTo(clickOncommercialLines);
        Assert.assertEquals(200, ResponseCode.responseCode(driver.getCurrentUrl()));
        when(anna).attemptsTo(clickOncommercialLinesAuto);
        Assert.assertEquals(200, ResponseCode.responseCode(driver.getCurrentUrl()));
        when(anna).attemptsTo(clickOnComPakBusinessOwners);
        Assert.assertEquals(200, ResponseCode.responseCode(driver.getCurrentUrl()));
        when(anna).attemptsTo(clickOnEmployementPracticesLiability);
        Assert.assertEquals(200, ResponseCode.responseCode(driver.getCurrentUrl()));
        when(anna).attemptsTo(clickOnFarmOwners);
        Assert.assertEquals(200, ResponseCode.responseCode(driver.getCurrentUrl()));
        when(anna).attemptsTo(clickOnCommercialUmbrella);
        Assert.assertEquals(200, ResponseCode.responseCode(driver.getCurrentUrl()));
        when(anna).attemptsTo(clickOnWorkPakWorkersCompensation);
        Assert.assertEquals(200, ResponseCode.responseCode(driver.getCurrentUrl()));

        when(anna).attemptsTo(clickOnPersonalLines);
        Assert.assertEquals(200, ResponseCode.responseCode(driver.getCurrentUrl()));
        when(anna).attemptsTo(clickOnPersonalLinesAuto);
        Assert.assertEquals(200, ResponseCode.responseCode(driver.getCurrentUrl()));
        when(anna).attemptsTo(clickOnDwellingfire);
        Assert.assertEquals(200, ResponseCode.responseCode(driver.getCurrentUrl()));
        when(anna).attemptsTo(clickOnHomeOwners);
        Assert.assertEquals(200, ResponseCode.responseCode(driver.getCurrentUrl()));
        when(anna).attemptsTo(clickOnInlandMarine);
        Assert.assertEquals(200, ResponseCode.responseCode(driver.getCurrentUrl()));
        when(anna).attemptsTo(clickOnPersonalLinesUmbrella);
        Assert.assertEquals(200, ResponseCode.responseCode(driver.getCurrentUrl()));


        // SafetyTips
        when(anna).attemptsTo(clickOnSafetyTips);
        Assert.assertEquals(200, ResponseCode.responseCode(driver.getCurrentUrl()));
        when(anna).attemptsTo(clickOnAutoLossControlPrevention);
        Assert.assertEquals(200, ResponseCode.responseCode(driver.getCurrentUrl()));
        when(anna).attemptsTo(clickOnBusinessOwnersLossControlTopics);
        Assert.assertEquals(200, ResponseCode.responseCode(driver.getCurrentUrl()));
        when(anna).attemptsTo(clickOnHomeOwnersLossControlTopics);
        Assert.assertEquals(200, ResponseCode.responseCode(driver.getCurrentUrl()));
        when(anna).attemptsTo(clickOnWinterLossControlTopics);
        Assert.assertEquals(200, ResponseCode.responseCode(driver.getCurrentUrl()));



    }

}