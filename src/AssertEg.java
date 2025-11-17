import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
public class AssertEg {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(1000);
		String ActualTitle= driver.getTitle();
		System.out.println(ActualTitle);
		String ExpectedTitle="PracticePage";
		Assert.assertEquals(ActualTitle, ExpectedTitle,"Title match");
		System.out.println("Title matched");
		
		
	}

}
