package Basic;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class PropertyToJenkins {
	
	@Test 
	public void prop() throws IOException, InterruptedException
	{
		WebDriver d = null;
		
		
		FileInputStream fis = new FileInputStream("src\\test\\resources\\ReadJenkins.properties");
		
		Properties p = new Properties();
		
		p.load(fis);
		
		String BROWSER = p.getProperty("Browser");
		String URL = p.getProperty("Url");
		String USERNAME = p.getProperty("Username");
		String PASSWORD = p.getProperty("Password");
		
		
		
		if(BROWSER.equalsIgnoreCase("Chrome"))
		{
			d = new ChromeDriver();
		}
		else if (BROWSER.equalsIgnoreCase("FireFox")) 
		{	
			d = new FirefoxDriver(); 
		}
		else if (BROWSER.equalsIgnoreCase("Edge"))
		{
			d = new EdgeDriver();
		}
		 
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		d.get(URL);
		Thread.sleep(2000);
		
		WebElement user = d.findElement(By.id("username"));
		user.clear();
		Thread.sleep(2000);
		user.sendKeys(USERNAME);
		Thread.sleep(2000);
		
		WebElement pw = d.findElement(By.id("password"));
		pw.clear();
		Thread.sleep(2000);
		pw.sendKeys(PASSWORD);
		Thread.sleep(2000);
		
		d.findElement(By.xpath("//button[text()='Sign in']")).click();
		System.out.println("Hello!!!!");
		
	}

}
