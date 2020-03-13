package StepDefinition;		

import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.JavascriptExecutor;	

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;		
import cucumber.api.java.en.Then;		
import cucumber.api.java.en.When;		

public class Steps {				

    public WebDriver driver;			
    
    public void launchBrowser()
    {
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\Spacey\\Downloads\\chromedriver_win32\\chromedriver.exe");				
        driver= new ChromeDriver();	
    	
    }

    //Ordering a SThirt and Verifying the order in Order Details		
    @Given("^Open the Chrome Browser and launch the Dummy Testing Website URL$")					
    public void open_the_Firefox_and_launch_the_application() throws Throwable							
    {		
    	//System.setProperty("webdriver.chrome.driver","C:\\Users\\Spacey\\Downloads\\chromedriver_win32\\chromedriver.exe");				
        //driver= new ChromeDriver();	
    	launchBrowser();
    	   driver.manage().window().maximize();			
       driver.get("http://automationpractice.com/");		
       driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
         }		

    @When("^I Click on Sign In Link in HomePage$")					
    public void open_the_Firefox_and_launch_the_application1() throws Throwable							
    {		
        driver.findElement(By.xpath("//*[@id='header']/div[2]/div/div/nav/div[1]/a")).click();
        Thread.sleep(2000);
    }	
    @When("^Enter the Username in Email Address Text Box and Password in Password Text Box$")
    public void enter_the_Username_in_Email_Address_Text_Box_and_Password_in_Password_Text_Box() {
    	
    	driver.findElement(By.xpath("//*[@name='email']")).sendKeys("testing999@test.com");
    	driver.findElement(By.xpath("//*[@id='passwd']")).sendKeys("password1");
    	
    	
        
    }
    @When("^Click on Sign In Button$")
    public void click_on_Sign_In_Button() throws Throwable	{
        // Write code here that turns the phrase above into concrete actions
    	 
    	driver.findElement(By.xpath("//*[@id='SubmitLogin']")).click();
    	 Thread.sleep(2000);
    	
        
    }

    @Then("^Verify user has successfully logged in$")					
    public void open_the_Firefox_and_launch_the_application2() throws Throwable							
    {		
    	Thread.sleep(2000);
    	//WebElement signin = driver.findElement(By.xpath("//*[@id='header']/div[2]/div/div/nav/div[1]/a/span"));
    	//String name= signin.getText();
    	boolean signincheck = driver.findElement(By.xpath("//*[@id='header']/div[2]/div/div/nav/div[1]/a/span")).isDisplayed();
    					if(signincheck)
    					{
    						System.out.println("Sign In Successful");
    					}
    					else
    					{
    						System.out.println("Sign In Failed");
    					}
    					
    }	
    
   
    @When("^I Click on T-shirts$")					
    public void enter_the_Username_and_Password() throws Throwable 							
    {		
    	
    	driver.findElement(By.xpath("//*[@id='block_top_menu']/ul/li[3]/a")).click();
    	
       
    }		
    
    @When("^Add a T-shirt to cart from the results$")
    public void add_a_T_shirt_to_cart_from_the_results() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
    	
    	WebElement element = driver.findElement(By.xpath("//*[@id='center_column']/ul/li/div/div[2]/div[2]/a[1]/span"));
    	WebElement element2 = driver.findElement(By.xpath("//*[@id='center_column']/ul/li/div/div[1]/div/a[1]/img"));
    	Actions actiontest1 = new Actions(driver);
    	actiontest1
    	.moveToElement(element2)
    	.moveToElement(element).click()
    	.build()
    	.perform();
    	
    	/*((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    	Thread.sleep(2000);*/
    	
    	
    }

    @When("^Click on Proceed to Checkout from the Popup$")
    public void click_on_Proceed_to_Checkout_from_the_Popup() throws InterruptedException {
    	 String windowHandle = driver.getWindowHandle(); // gives alphanumeric value of current window handle
    	 driver.switchTo().window(windowHandle);
    	 Thread.sleep(2000);
    	 driver.findElement(By.xpath("//*[@id='layer_cart']/div[1]/div[2]/div[4]/a/span")).click();
    	
    }

    @When("^Verify Product Details and click on Proceed to Checkout in Product Summary Page$")
    public void verify_Product_Details_and_click_on_Proceed_to_Checkout_in_Product_Summary_Page() {
    	driver.findElement(By.xpath("//*[@id='center_column']/p[2]/a[1]/span")).click();
    	
    }

    @When("^Click on Proceed to Checkout in Address Page$")
    public void click_on_Proceed_to_Checkout_in_Address_Page() {
    	driver.findElement(By.xpath("//*[@id='center_column']/form/p/button/span")).click();
    	
    }

    @When("^Check the terms and conditions check box and clcik on Proceed to Checkout in Shipping Page$")
    public void check_the_terms_and_conditions_check_box_and_clcik_on_Proceed_to_Checkout_in_Shipping_Page() {
    	driver.findElement(By.xpath("//*[@id='cgv']")).click();
    	driver.findElement(By.xpath("//*[@id='form']/p/button/span")).click();
    	
    }

    @When("^Choose the payment payment method and click on confirm payment$")
    public void choose_the_payment_payment_method_and_click_on_confirm_payment() {
    	driver.findElement(By.xpath("//*[@id='HOOK_PAYMENT']/div[1]/div/p/a")).click();
    	driver.findElement(By.xpath("//*[@id='cart_navigation']/button/span")).click();
    	
    }


    @Then("^TShirt Order should be successfully completed$")					
    public void TShirt_Order_should_be_successfully_completed() throws Throwable 							
    {		
    	WebElement order= driver.findElement(By.xpath("//*[@id='center_column']/div/p/strong"));
    	String orderText = order.getText();
    	if(orderText.contentEquals("Your order on My Store is complete."))
    	{
    		System.out.println("Order successfully completed");
    	}
    	else
    	{
    		System.out.println("Order not completed");
    	}
    				
    }		
    
  
    
    @Then("^Verify in Order history$")					
    public void Verify_in_Order_history() throws Throwable 							
    {		
    	WebElement reference= driver.findElement(By.xpath("//*[@id='center_column']/div"));
    	String innertext =reference.getAttribute("innerText");
    	//System.out.println("Test 1: "+innertext);
    	String orderId =innertext.substring(217, 226);
    	orderId.trim();
    	System.out.println("Order Id:"+orderId);
    	driver.findElement(By.xpath("//*[@id='footer']/div/section[5]/div/ul/li[1]/a")).click();
    	
    	//Verifying Order Id
    	
    	String orderIdInHistory = driver.findElement(By.xpath("//*[@id='order-list']/tbody/tr[1]/td[1]/a")).getText();
    	if(orderId.contentEquals(orderIdInHistory))
    	{
    		System.out.println("Order Id: "+ orderId +" is available in Order History");
    	}
    	else
    	{
    		System.out.println("Order Id: "+ orderId +" not available in Order History");
    	}
    	
    	
    }	
    
    
    // Update Personal Information(First Name) in My Account
    
    @When("^I Click on My Personal Info under My Account in footer$")
	public void i_Click_on_My_Personal_Info_under_My_Account_in_footer() {
		
		driver.findElement(By.xpath("//*[@id='footer']/div/section[5]/div/ul/li[4]/a")).click();
		
	}

	@When("^I change my first name and click on Save$")
	public void i_change_my_first_name_and_click_on_Save() {
		WebElement firstName = driver.findElement(By.xpath("//*[@id='firstname']"));
		firstName.clear();
		firstName.sendKeys("Dummyuser");
		WebElement oldpassword = driver.findElement(By.xpath("//*[@id='old_passwd']"));
		oldpassword.sendKeys("password1");
		driver.findElement(By.xpath("//*[@id='center_column']/div/form/fieldset/div[11]/button/span")).click();
		
		
		
	}

	@Then("^My First Name Should be Updated$")
	public void my_First_Name_Should_be_Updated() {
		WebElement message = driver.findElement(By.xpath("//*[@id='center_column']/div/p"));
		String status = message.getText();
		System.out.println("Status: "+ status);
	}



   
}		