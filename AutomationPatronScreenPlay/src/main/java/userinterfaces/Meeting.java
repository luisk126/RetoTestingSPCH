package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Meeting extends PageObject
{
    public static final Target CLICK_BUTTON_MEETING = Target.the("Click en boton Meeting").locatedBy("//span[contains(text(),'Meeting')]");
    public static final Target CLICK_BUTTON_MEETINGS = Target.the("Click en boton Meetings").locatedBy("//span[contains(text(),'Meetings')]");//span[contains(text(),'New Meeting')]
    public static final Target CLICK_BUTTON_NEW_MEETING = Target.the("Click en boton New Meeting").locatedBy("//span[contains(text(),'New Meeting')]");

    public static final Target INPUT_MEETING_NAME = Target.the("Input para diligenciar Meeting Name").located(By.name("MeetingName"));
    public static final Target INPUT_MEETING_NUMBER = Target.the("Input para diligenciar Meeting Number").located(By.name("MeetingNumber"));

    public static final Target INPUT_MEETING_START_DATE = Target.the("Input para diligenciar Start Date").located(By.name("StartDate"));
    public static final Target INPUT_MEETING_END_DATE = Target.the("Input para diligenciar End Date").located(By.name("EndDate"));

    //public static final Target INPUT_MEETING_UNIT = Target.the("Input para diligenciar Unit").locatedBy("#s2id_autogen8_search");

    public static final Target CLICK_BUTTON_SAVE_MEETING = Target.the("Click en boton Save Meeting").locatedBy("//span[contains(text(),'Save')]");


}
