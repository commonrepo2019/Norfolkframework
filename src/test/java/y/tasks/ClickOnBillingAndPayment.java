package y.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.thucydides.core.annotations.Step;
import y.ui.AboutND;
import y.ui.BillingAndPayment;

public class ClickOnBillingAndPayment implements Task {

    /* @Override
     @Step("{0} Click on  #MenuAndSubMenu.ABOUT_MAIN_MENU")
     public <T extends Actor> void performAs(T actor) {
         //Click the Line Coverages link After Quote
         actor.attemptsTo(Click.on(MenuAndSubMenu.ABOUT_MAIN_MENU));
     }*/
//    private final String searchTerm;
//
//    protected ClickOn(String searchTerm) {
//        this.searchTerm = searchTerm;
//    }
    @Override
    @Step("{0} Click On Billing And Payment")
    public <T extends Actor> void performAs(T actor) {
        BillingAndPayment.BILLING_AND_PAYMENT_MAIN_MENU.resolveFor(actor).waitUntilVisible();
        actor.attemptsTo(

                Click.on(BillingAndPayment.BILLING_AND_PAYMENT_MAIN_MENU)
        );
    }

//    public static ClickOn forTheTerm(String searchTerm) {
//        return instrumented(ClickOn.class, searchTerm);
//    }

}
