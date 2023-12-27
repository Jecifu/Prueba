package ui;

import net.serenitybdd.screenplay.targets.Target;

public class Login {
    public static final Target BUTTON_LOGIN_HOME= Target.the("Button Login").locatedBy("//a[text()='Login']");
    public static final Target LOGIN_EMAIL= Target.the("Label Login Email").locatedBy("//input[@name='email']");
    public static final Target LOGIN_PASSWORD= Target.the("Label Login Password").locatedBy("//input[@name='password']");
    public static final Target BUTTON_LOGIN= Target.the("Button Login").locatedBy("//button[@class='btn btn-lg btn-primary pull-xs-right']");

}
