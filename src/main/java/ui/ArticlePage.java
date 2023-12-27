package ui;

import net.serenitybdd.screenplay.targets.Target;

public class ArticlePage {
    public static final Target BUTTON_ARTICLE= Target.the("Button Article").locatedBy("/html/body/div/header/nav/div/ul[2]/li[2]/a");
    public static final Target TITLE_ARTICLE= Target.the("Title Article").locatedBy("//input[@name='title']");
    public static final Target WHAT_ARTICLE= Target.the("What Article").locatedBy("//input[@name='description']");
    public static final Target WRITE_ARTICLE= Target.the("Write Article").locatedBy("//textarea[@class='form-control']");
    public static final Target TAGS_ARTICLE= Target.the("Write Article").locatedBy("//input[@name='tags']");
    public static final Target BUTTON_PUBLISH_ARTICLE= Target.the("Write Article").locatedBy("//button[@class='btn btn-lg pull-xs-right btn-primary']");

}
