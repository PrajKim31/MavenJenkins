package finalMock;


import java.io.IOException;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import CommonUtils.FileUtils2;
import CommonUtils.WebDriverUtils;

public class Flipkart {

	@Test
	public void home() throws IOException, InterruptedException
	{
		WebDriver d = new ChromeDriver();
		WebDriverUtils wutils = new WebDriverUtils();
		FileUtils2 futils = new FileUtils2();
		
		/*
		FileInputStream fis = new FileInputStream("src\\test\\resources\\final.properties");
		Properties p = new Properties();
		p.load(fis); 
		*/
		
		String URL = futils.dataFromProperty("Url");
		String searchtext = futils.dataFromProperty("search");
		
		//String URL = p.getProperty("Url");
		//String searchtext = p.getProperty("search");
		wutils.maximize(d);
		Thread.sleep(2000);
		d.get(URL);
		Thread.sleep(2000);
		d.findElement(By.xpath("//span[text()='✕']")).click();
		Thread.sleep(2000);
		WebElement search = d.findElement(By.name("q"));
		Thread.sleep(2000);
		search.sendKeys(searchtext);
		Thread.sleep(2000);
		search.sendKeys(Keys.ENTER);
		Thread.sleep(4000);
		d.findElement(By.xpath("//div[text()='Popularity']")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("(//img[@class='_2r_T1I'])[1]")).click();
		Thread.sleep(2000);
		d.close();
		
		Set<String> c = d.getWindowHandles();
		
		for (String ids : c) {
			//System.out.println(allid); 
			String title = d.switchTo().window(ids).getTitle();
			System.out.println(title); 
		}
	
		
		JavascriptExecutor jse = (JavascriptExecutor) d ;
		jse.executeScript("window.scrollBy(0,2500)");  
		Thread.sleep(4000);
		d.findElement(By.xpath("(//li[@class='col col-6-12'])[1]")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("//button[text()='+']")).click();
		Thread.sleep(2000);
		wutils.screenshot(d);
		
		
	
		
		
	}
}
