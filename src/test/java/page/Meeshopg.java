package page;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Meeshopg {
WebDriver driver;
By search=By.xpath("//*[@id=\"__next\"]/div[2]/div[1]/div/div[2]/div/input");
By men=By.xpath("//*[@id=\"__next\"]/div[2]/div[3]/div/div[5]");
By jwellery=By.xpath("//*[@id=\"__next\"]/div[2]/div[3]/div/div[6]/div/div[3]/a[5]/p");
By hairclour=By.xpath("//*[@id=\"__next\"]/div[4]/div[2]/div/div/div[2]/div[2]/div[24]/div[14]/div[2]/div/span[3]/a");
public Meeshopg(WebDriver driver)
{
	this.driver=driver;
}
public void search(String item)
{
	driver.findElement(search).sendKeys(item,Keys.ENTER);
}
public void men()
{
	driver.findElement(men).click();
	driver.findElement(jwellery).click();
}

public void scrolldown()
{
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	driver.findElement(hairclour).click();
}
} 
