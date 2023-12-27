package tasks;

import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;
import java.util.Map;

import static ui.SigUp.*;

public class SigUp implements Task {
    private DataTable data;

    public SigUp(DataTable data){
        this.data = data;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        List<Map<String,String>> values = data.asMaps(String.class,String.class);
        actor.attemptsTo(
                Click.on(BUTTON_SIGN_UP_HOME.resolveFor(actor)),
                Enter.theValue(String.valueOf(values.get(0).get("name"))).into(USER_NAME.resolveFor(actor)),
                Enter.theValue(String.valueOf(values.get(0).get("email"))).into(USER_EMAIL.resolveFor(actor)),
                Enter.theValue(String.valueOf(values.get(0).get("password"))).into(USER_PASSWORD.resolveFor(actor)),
                Click.on(BUTTON_SIGN_UP.resolveFor(actor))
        );

    }
    public static SigUp Use(DataTable data){
        return Tasks.instrumented(SigUp.class,data);
    }
}
