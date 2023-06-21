package Antim.Pariksha.ForMakingGoodFuture;

public class TC_004 extends BaseTest
{
	public static void main(String[] args) throws Exception
	{
		init();
		
		launch("chromebrowser");
		
		navigateUrl("amazonurl"); 
		
/*		driver.findElement(By.id("searchDropdownBox")).sendKeys("Books");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Hanuman Chalisa");
		
		driver.findElement(By.id("nav-search-submit-button")).click();      */
		
		
/*		selectOption("searchDropdownBox","Books");
		
		typeText("twotabsearchtextbox","Hanuman Chalisa");
		
		clickOption("nav-search-submit-button"); */
		
		selectOption("amazonsearchdropbox_id","Books");
		
		typeText("amazonentertext_id","Hanuman Chalisa");
		
		clickOption("amazonclickbutton_id");

	}

}
