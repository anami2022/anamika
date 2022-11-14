package Hachion.Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MavenTestprg {
	@Test
	public void Amazon()
	{
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\anami\\Documents\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\anami\\Documents\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
	}

}
