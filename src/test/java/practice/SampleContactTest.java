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

	@Test
	public void collaboratetechnique()
	{
		System.out.println("colloborative");
	}
	@Test
	public void collaborate()
	{
		System.out.println("colloborative");
		System.out.println("cccccc..");
	}
	public void collaborateNew()
	{
		System.out.println("colloborative");
		System.out.println("cccccc..cc    ");
	}
	
}
