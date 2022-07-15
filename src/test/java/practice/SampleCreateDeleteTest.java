package practice;
import org.testng.annotations.Test;



public class SampleCreateDeleteTest
{

	@Test(groups = "smoke")
	public void createContact() throws Throwable
	{
		System.out.println("contact created");
		
	}
	@Test(groups = "regression")
	public void createAndDeleteContact()throws Throwable
	{
		System.out.println("crated with delete options..");
	}
}
