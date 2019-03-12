package y.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;
import y.ui.NDLandingPage;

public class OpenTheApplication implements Task {

    NDLandingPage NDLandingPage;

    @Step("{0} Open the application")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn().the(NDLandingPage)
        );
    }
}
