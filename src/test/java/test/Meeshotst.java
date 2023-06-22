package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Meeshopg;

public class Meeshotst {
	WebDriver driver;
	@BeforeTest
	public void set()
	{
		driver=new ChromeDriver();
		driver.get("https://www.meesho.com/");
		driver.manage().window().maximize();
	}
	@Test
	public void testmeesho()
	{
		Meeshopg ob=new Meeshopg(driver);
		ob.search("saree");
		ob.men();
		ob.scrolldown();
		
		
	}
}
