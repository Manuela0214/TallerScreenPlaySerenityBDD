package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.page.TheWebPage;

public class UrlPage implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return TheWebPage.currentUrl().answeredBy(actor);
    }

    public static UrlPage urlPage() {
        return new UrlPage();
    }
}
