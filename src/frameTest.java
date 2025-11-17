import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class frameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
		WebElement sourcefi=driver.findElement(By.className("ui-draggable"));
		Actions a= new Actions(driver);
		WebElement destfi=driver.findElement(By.className("ui-droppable"));
		
		a.dragAndDrop(sourcefi, destfi).build().perform();
		driver.switchTo().defaultContent();
		

	}

}
