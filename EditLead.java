package Week2.Day1.WH1;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		//maximize my window
		
		driver.manage().window().maximize();
		
		//Load the URL
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//Timeout code
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(26));
		
		//To give the input user name
				
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		
		//To give the input password
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//To enter the login
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//To click the CRM/SFA
		
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		
		//To click the lead link
		
		driver.findElement(By.linkText("Leads")).click();
		
		//To click the find leads
		
		driver.findElement(By.linkText("Find Leads")).click();
		
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Rudra");
				
		//To click the find leads
		
		driver.findElement(By.linkText("Find Leads")).click();
		
		//To click the first leads name
		
		driver.findElement(By.linkText("10291")).click();
		
		//To view the title
		
		String title = driver.getTitle();// ctrl+2
		
				System.out.println(title);
			
		//To change the company name
				
		driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).sendKeys("ABK");

		
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		
		driver.close();
	}
}
