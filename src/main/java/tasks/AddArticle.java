package tasks;

import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.MoveMouse;

import java.util.List;
import java.util.Map;

import static ui.ArticlePage.*;

public class AddArticle implements Task {
    private DataTable data;
    public AddArticle(DataTable data){
        this.data = data;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        List<Map<String,String>> values = data.asMaps(String.class,String.class);
        actor.attemptsTo(
                MoveMouse.to(BUTTON_ARTICLE.resolveFor(actor)),
                Click.on(BUTTON_ARTICLE.resolveFor(actor)),
                Enter.theValue(String.valueOf(values.get(0).get("title"))).into(TITLE_ARTICLE.resolveFor(actor)),
                Enter.theValue(String.valueOf(values.get(0).get("what"))).into(WHAT_ARTICLE.resolveFor(actor)),
                Enter.theValue(String.valueOf(values.get(0).get("write"))).into(WRITE_ARTICLE.resolveFor(actor)),
                Enter.theValue(String.valueOf(values.get(0).get("tags"))).into(TAGS_ARTICLE.resolveFor(actor)),
                Click.on(BUTTON_PUBLISH_ARTICLE.resolveFor(actor))

        );


    }
    public static AddArticle Used(DataTable data){
        return Tasks.instrumented(AddArticle.class,data);
    }
}
