import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class AutoSuggestive {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Thread.sleep(1000);
		driver.findElement(By.id("autosuggest")).sendKeys("United");
		//List<WebElement> Options=driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		 List<WebElement> Options=driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		 
		 for(WebElement option: Options)
		 {
			 if(option.getText().equalsIgnoreCase("United Arab Emirates"))
			 {
				 option.click();
				 break;
			 }
		 }
	}
	

}
