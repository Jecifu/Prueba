package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class GoTo implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.url("https://conduit-realworld-example-app.fly.dev/#/")
        );
    }
    public static GoTo theUrl(){
        return Tasks.instrumented(GoTo.class);
    }

}
