package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ExecutionIndividually {

	@Test
	public void facebook(){
		{
			WebDriver d = new ChromeDriver();
			d.get("https://www.facebook.com/");
		}
	}
		
	@Test(groups = "Food")
	public void swiggy(){
		{
			WebDriver d = new ChromeDriver();
			d.get("https://www.swiggy.com/");			
		}
	}


	@Test(groups = "Food")
	public void zomato()
	{
		WebDriver d = new ChromeDriver();
		d.get("https://www.zomato.com/india");
	}
}
