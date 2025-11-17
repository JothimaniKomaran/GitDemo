import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class AddtoCart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
		String[] itemsToAdd= {"Brocolli","Cucumber","Beetroot"};
	
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		//AddtoCart b=new AddtoCart();
		//b.addItems(driver, itemsToAdd);
		addItems(driver,itemsToAdd);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("span.promoInfo")));
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		

}

	
	
	
	
	
	
	
	
	
public static void addItems(WebDriver driver,String[] itemsToAdd)
{
	int j=0;
	List<WebElement> productName= driver.findElements(By.cssSelector("h4.product-name"));
	
	for(int i=0;i<productName.size();i++)
	{
		
		String[] name=productName.get(i).getText().split("-");
		String formattedName=name[0].trim();
		
		List itemsNeeded=Arrays.asList(itemsToAdd);
	
		if(itemsNeeded.contains(formattedName))
		{
			driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
			j++;
			if(j==itemsToAdd.length)
			{
				break;
			}
		}
	}	

}
}