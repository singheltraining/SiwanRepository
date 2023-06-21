package Antim.Pariksha.ForMakingGoodFuture;
import com.aventstack.extentreports.Status;

public class TC_007 extends BaseTest
{
	
	public static void main(String[] args) throws Exception 
	{
		init();
		test = rep.createTest("TC_007");
		test.log(Status.INFO,"Init the properties files. . . .");
		
		launch("chromebrowser");
		test.log(Status.PASS,"Opening the Browser : " + p.getProperty("chromebrowser"));
		
		navigateUrl("amazonurl"); 
		test.log(Status.PASS,"Navigating the Url : " + childProp.getProperty("amazonurl"));
		
		selectOption("amazonsearchdropbox_id","Books");
		test.log(Status.PASS,"Selecting the Option book by using locator : " +orProp.getProperty("amazonsearchdropbox_id"));
		
		typeText("amazonentertext_id","Hanuman Chalisa");
		test.log(Status.FAIL,"Entering the text by using locator : " +orProp.getProperty("amazonentertext_id"));
		
		clickOption("amazonclickbutton_id");
		test.log(Status.INFO,"Clicked on the element by using locator :"+orProp.getProperty("amazonclickbutton_id"));
		
		rep.flush();
	}

}
