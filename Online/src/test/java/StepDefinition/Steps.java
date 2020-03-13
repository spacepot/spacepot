package StepDefinition;		

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
	

import cucumber.api.java.en.Given;		
import cucumber.api.java.en.Then;		
import cucumber.api.java.en.When;		

public class Steps {				

    public WebDriver driver;			
    		
    @Given("^Open the Chrome and launch the application$")					
    public void open_the_Firefox_and_launch_the_application() throws Throwable							
    {		
    	System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\optimum\\eclipse-workspace\\Amazon test\\driver\\New\\chromedriver.exe");				
       driver= new ChromeDriver();				
       driver.manage().window().maximize();			
       driver.get("http://demo.guru99.com/v4");					
    }		

    @When("^Enter the Username and Password$")					
    public void enter_the_Username_and_Password() throws Throwable 							
    {		
    	Thread.sleep(2000);
       driver.findElement(By.name("uid")).sendKeys("username12");	
       Thread.sleep(2000);
       driver.findElement(By.name("password")).sendKeys("password12");		
       
    }		

    @Then("^Reset the credential$")					
    public void Reset_the_credential() throws Throwable 							
    {		
    	Thread.sleep(2000);
       driver.findElement(By.name("btnReset")).click();					
    }		
}		