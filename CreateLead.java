package Week2.Day1.WH1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {
	
	public static void main(String[] args) {
	
 		ChromeDriver driver = new ChromeDriver();
		
		//maximize my window

 		driver.manage().window().maximize();
 		
 		//Load the URL
 		
 		driver.get("http://leaftaps.com/opentaps/control/login");
 		
 		//To give the input username
 		
 		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
 		
 		//To give the input password
 		
 		driver.findElement(By.id("password")).sendKeys("crmsfa");
 		
 		//To enter the login 
 		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//To click the CRM/SFA
		
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		
		//To click the Create lead
		
		driver.findElement(By.linkText("Create Lead")).click();

		//To fill the Company name
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		
		//To fill the First name
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Princila");
		
		//To fill the Last name
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Edward");
		
		//Drop down Set 1
		
		WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
        //Step:2  Instantiate Select class
        Select drop1 =new Select(source);
        //Step:3  Call select class method to pick the option from dropdown
        drop1.selectByVisibleText("Employee");
        
		//Drop down Set 2
		
		WebElement Markcamp = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
        //Step:2  Instantiate Select class
        Select drop2 =new Select(Markcamp);
        //Step:3  Call select class method to pick the option from dropdown
        drop2.selectByVisibleText("Pay Per Click Advertising");
        
		//Drop down Set 3
		
		WebElement Industry = driver.findElement(By.id("createLeadForm_industryEnumId"));
        //Step:2  Instantiate Select class
        Select drop3 =new Select(Industry);
        //Step:3  Call select class method to pick the option from dropdown
        drop3.selectByVisibleText("Computer Software");
        
      //Drop down Set 4
		
      		WebElement Ownership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
              //Step:2  Instantiate Select class
              Select drop4 =new Select(Ownership);
              //Step:3  Call select class method to pick the option from dropdown
              drop4.selectByVisibleText("Corporation");
        
      //Drop down Set 5
      		
        		WebElement Country = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
                //Step:2  Instantiate Select class
                Select drop5 =new Select(Country);
                //Step:3  Call select class method to pick the option from dropdown
                drop5.selectByVisibleText("India");
                
      driver.findElement(By.className("smallSubmit")).click();
              
        
	}

}
