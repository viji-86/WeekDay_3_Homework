package Week2.Day1.WH1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

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
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Create Account")).click();
		
		driver.findElement(By.xpath("//input[@class='inputBox']")).sendKeys("Chandrella");
		
		driver.findElement(By.xpath("//td/textarea[@class='inputBox']")).sendKeys("Selenium Automation Tester");
		
		driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("TestLeaf");

		driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("TestLeaf URLs");
		
		driver.findElement(By.xpath("//input[@id='annualRevenue']")).sendKeys("15,000");
			
		//Drop down set 1
		
		WebElement Industry = driver.findElement(By.xpath("//select[@name='industryEnumId']"));
        //Step:2  Instantiate Select class
        Select drop6 =new Select(Industry);
        //Step:3  Call select class method to pick the option from dropdown
        drop6.selectByVisibleText("Computer Software");
        
      //Drop down set 2
		
      		WebElement Ownership = driver.findElement(By.xpath("//select[@name='ownershipEnumId']"));
              //Step:2  Instantiate Select class
              Select drop7 =new Select(Ownership);
              //Step:3  Call select class method to pick the option from dropdown
              drop7.selectByVisibleText("S-Corporation");
              
     //Drop down set 3
      		
      WebElement Source = driver.findElement(By.xpath("//select[@name='dataSourceId']"));
     //Step:2  Instantiate Select class
         Select drop8 =new Select(Source);
     //Step:3  Call select class method to pick the option from dropdown
          drop8.selectByVisibleText("Employee");
              
          
          //Drop down set 4
    		
          WebElement Markcamp = driver.findElement(By.xpath("//select[@name='marketingCampaignId']"));
         //Step:2  Instantiate Select class
             Select drop9 =new Select(Markcamp);
         //Step:3  Call select class method to pick the option from dropdown
              drop9.selectByVisibleText("eCommerce Site Internal Campaign");
              
              //Drop down set 5
      		
              WebElement Stateprov = driver.findElement(By.xpath("//select[@name='generalStateProvinceGeoId']"));
             //Step:2  Instantiate Select class
                 Select drop10 =new Select(Stateprov);
             //Step:3  Call select class method to pick the option from dropdown
                  drop10.selectByVisibleText("Texas");
                  
      driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();

        
        
		
		
		
		
				
		
		
		
		
}
}
