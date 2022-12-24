package testNG;
import org.testng.Assert;
import org.testng.annotations.Test;
public class AssertionsExample {
	String name="Agni";
	@Test
	public void checkEqual() 
	{
		/*if(name.equals("Agni")) 
		{
			System.out.println("name equal");
		}
		else
		{
			System.out.println("name not equal");
		}
		*/
		
		Assert.assertEquals(name,"Agni");
	}

}
