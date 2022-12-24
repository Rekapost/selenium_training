package testNG;
import org.testng.annotations.Test;

public class GroupingExample {
	/*Scenario : a big basket of diff kinds of mobile phone
	 * Apple, moto, vivo and lenovo
	 * run test on vivo and moto . write a program for that
	 */		
	
	@Test(groups = {"Apple"} )
	public void apple1()
	{System.out.println(" Apple1 phone");
	}
	
	@Test (groups = {"Apple"} )
	public void apple2()
	{System.out.println(" Apple2 phone");
	}
	
	@Test (groups = {"moto"} )
	public void moto1()
	{System.out.println(" moto1 phone");
	}
	
	@Test (groups = {"moto"} )
	public void moto2()
	{System.out.println(" moto2 phone");
	}
	
	@Test (groups = {"vivo"} )
	public void vivo1()
	{System.out.println(" vivo1 phone");
	}
	
	@Test (groups = {"vivo"} )
	public void vivo2()
	{System.out.println(" vivo2 phone");
	}
	
	@Test(groups = {"lenovo"} )
	public void lenovo1()
	{System.out.println(" lenovo1 phone");
	}
	
	@Test(groups = {"lenovo"} )
	public void lenovo2()
	{System.out.println(" lenovo2 phone");
	}

}
