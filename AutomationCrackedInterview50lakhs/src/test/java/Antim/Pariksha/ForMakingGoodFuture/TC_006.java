package Antim.Pariksha.ForMakingGoodFuture;
import org.apache.log4j.Logger;

public class TC_006 extends BaseTest
{
	private static final Logger log = Logger.getLogger(TC_006.class);
	
	public static void main(String[] args) throws Exception 
	{
		init();
		log.info("Init the properties files. . . .");
		
		launch("chromebrowser");
		log.info("Opening the Browser : " + p.getProperty("chromebrowser"));
		
		navigateUrl("amazonurl"); 
		log.info("Navigating the Url : " + childProp.getProperty("amazonurl"));
		
		selectOption("amazonsearchdropbox_id","Books");
		log.info("Selecting the Option book by using locator : " +orProp.getProperty("amazonsearchdropbox_id"));
		
		typeText("amazonentertext_id","Hanuman Chalisa");
		log.info("Entering the text by using locator : " +orProp.getProperty("amazonentertext_id"));
		
		clickOption("amazonclickbutton_id");
		log.info("Clicked on the element by using locator :"+orProp.getProperty("amazonclickbutton_id"));
		
	}

}
