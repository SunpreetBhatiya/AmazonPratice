package Basic;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import CommonUtils.WebDriverUtils;

public class AmazonTest {
	
	
	
	@Test
	public void amazonTest()
	{
		
		WebDriverUtils utils = new WebDriverUtils();
		
		
		WebDriver cd = new ChromeDriver();
		utils.maximizeWindow(cd);
		
		utils.waitWebElementToLoad(cd);
		
		
		cd.get("https://www.amazon.in/");
		
		WebElement tf = cd.findElement(By.name("field-keywords"));
		tf.sendKeys("Shoes");
		tf.sendKeys(Keys.ENTER);
		
		JavascriptExecutor js = (JavascriptExecutor) cd;
		js.executeScript("window.scrollBy(0,500)");
		
	
		WebDriver cd1 = (WebDriver) js;
		
		cd1.findElement(By.xpath("(//span[text()='See more'])[1]")).click();
		cd1.findElement(By.xpath("//span[text()='Nike']")).click();
		
		cd1.findElement(By.cssSelector("img[alt='Nike Mens Downshifter 12 Running']")).click();
		
		String expurl = "https://www.amazon.in/Nike-Downshifter-12-Racer-Black-HIGH-VOLTAGE-SUNDIAL-DD9293-402-9UK/dp/B0CB457XKZ/ref=sr_1_3?keywords=Shoes&qid=1706013926&refinements=p_89%3ANike&rnid=3837712031&s=shoes&sr=1-3";
		
		utils.Switch(cd1, expurl);
		
		cd1.findElement(By.id("add-to-cart-button")).click();
		
		
		
		
		
	}
	
	
	
	

}
