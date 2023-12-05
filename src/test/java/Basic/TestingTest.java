package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestingTest {

	@Test
	public void facebookTest()    // testng suffix should be Test 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		String actualtitle = driver.getTitle();
		System.out.println(actualtitle);
	}
}
