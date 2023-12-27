package tasks;

import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;
import java.util.Map;

import static ui.Login.*;


public class Login implements Task {
    private DataTable data;

    public Login(DataTable data){
        this.data = data;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        List<Map<String,String>> values = data.asMaps(String.class,String.class);
        actor.attemptsTo(
                Click.on(BUTTON_LOGIN_HOME.resolveFor(actor)),
                Enter.theValue(String.valueOf(values.get(0).get("email"))).into(LOGIN_EMAIL.resolveFor(actor)),
                Enter.theValue(String.valueOf(values.get(0).get("password"))).into(LOGIN_PASSWORD.resolveFor(actor)),
                Click.on(BUTTON_LOGIN.resolveFor(actor))
        );

    }
    public static Login UseTo(DataTable data){
        return Tasks.instrumented(Login.class,data);
    }
}
