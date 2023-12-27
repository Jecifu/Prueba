package ui;

import net.serenitybdd.screenplay.targets.Target;

public class SigUp {
    public static final Target BUTTON_SIGN_UP_HOME = Target.the("Button Sign Up").locatedBy("//a[text()='Sign up']");
    public static final Target USER_NAME = Target.the("label User Name").locatedBy("//input[@name='username']");
    public static final Target USER_EMAIL = Target.the("label User Email").locatedBy("//input[@name='email']");
    public static final Target USER_PASSWORD = Target.the("label User Password").locatedBy("//input[@name='password']");
    public static final Target BUTTON_SIGN_UP = Target.the("Button Sign Up").locatedBy("//button[@class='btn btn-lg btn-primary pull-xs-right']");

}
