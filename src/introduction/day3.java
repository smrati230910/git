package introduction;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class day3 {
	
	@BeforeSuite
	
	public void test6day3()
	 {
		
		System.out.println("BeforeSuite");
	}
	
	@AfterSuite
	
	public void test7day3()
	 {
		
		System.out.println("AfterSuite");
	}
	
	@BeforeClass
	public void test8day3()
	 {
		
		System.out.println("BeforeClass");
	}
	
	@AfterClass
	public void test9day1()
	 {
		
		System.out.println("AfterClass");
	}
	

	@Test
	public void test1day3()
	 {
		
		System.out.println("TestCase1Day3");
	}
	@BeforeMethod
	public void test2day3()
	{
		
		System.out.println("BeforeMethod");
	}
	@AfterMethod
	public void test3day3 ()
	 {
		
		System.out.println("AfterMethod");
	}
	@Test
	(groups= {"smoke"})
	public void test4day3 ()
	 {
		
		System.out.println("TestCase2Day3");
	}
	@Test(dataProvider="getdata")
	public void test5day3(String username,String password)
	 {
		
		System.out.println("TestCase3Day3");
		System.out.println(username);
		System.out.println(password);
		

	 }


@DataProvider
public Object[][] getdata() {
	Object[][]obj=new Object[3][2];
	
	obj[0][0]="username1";
	obj[0][1]="password1";
	obj[1][0]="username2";
	obj[1][1]="password2";
	obj[2][0]="username3";
	obj[2][1]="password3";
	
	return getdata();	
	
			
	
}

}
