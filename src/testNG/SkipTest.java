package testNG;
import org.testng.annotations.Test;
public class SkipTest {


		@Test(priority=0)
		public void startTheCar() {
			System.out.println("start the car");
		}
		
		@Test(priority=6, enabled=false)
		public void musicStart() {
			System.out.println("music start in car");
		}
		
		@Test(priority=1)
		public void putFirstGear() {
			System.out.println("first gear");	
		}
		@Test(priority=2)
		public void putSecondGear() {
			System.out.println("second  gear");
		}

		@Test(priority=3)
		public void putThirdGear() {
			System.out.println("third gear");
		}
		@Test(priority=4)
		public void putFourthGear() {
			System.out.println("fourth gear");
		}

	}

