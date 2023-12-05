package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ExecutionIndividuallyTest {

	@Test
	public void myntraTest(){
		{
			WebDriver d = new ChromeDriver();
			d.get("https://www.myntra.com/");
		}
	}
		
	@Test(groups = "Food")
	public void swiggyTest(){
		{
			WebDriver d = new ChromeDriver();
			d.get("https://www.swiggy.com/");			
		}
	}


	@Test(groups = "Food")
	public void zomatoTest()
	{
		WebDriver d = new ChromeDriver();
		d.get("https://www.zomato.com/india");
	}
}
