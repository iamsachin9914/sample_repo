package practice;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SampleContactTest
{
WebDriver driver=new ChromeDriver();
	@Test
	public void createContact() throws Throwable
	{
		String value=System.getProperty("url");
	    System.getProperty("browser");
		driver.get(value);
		System.out.println("contact created...");
	}
	
	
}
