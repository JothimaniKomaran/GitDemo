import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Thread.sleep(1000);
		Assert.assertFalse((driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected()));

		driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
		Assert.assertTrue((driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected()));

		Thread.sleep(1000);
		// Count the number of checkboxes
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());

		System.out.println(driver.findElement(By.id("Div1")).getDomAttribute("style"));
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		System.out.println(driver.findElement(By.id("Div1")).getDomAttribute("style"));
		if (driver.findElement(By.id("Div1")).getDomAttribute("style").contains("1")) {
			System.out.println("Is Enabled");
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}

		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(1000);
		int i = 1;
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		while (i < 4) {
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		// System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	}

}
