package hook;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

@AllArgsConstructor
public class OpenBrowser implements Task {

    private String url;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.url(url));
    }

    public static OpenBrowser openUrl(String url) {
        return Tasks.instrumented(OpenBrowser.class, url);
    }
}
