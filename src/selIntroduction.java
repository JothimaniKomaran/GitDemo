import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;


public class selIntroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver  driver = new ChromeDriver();
		driver.get("http://www.rahulshettyacademy.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		
		int[] arr= new int[5];
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;
		
		for(int i=0;i<arr.length; i++)
		{
				
		System.out.println(arr[i]);
		
		}
		
		String[] name= {"Jothi", "Karthik"};
		for(int i=0;i<name.length; i++)
		{
				
		System.out.println(name[i]);
		
		}
		for(String s:name)
		{
		System.out.println(s);
		}
		

	}

}
