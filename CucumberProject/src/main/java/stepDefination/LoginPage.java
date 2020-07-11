
  package stepDefination;
  
  import static org.testng.Assert.assertEquals;


import java.util.concurrent.TimeUnit;
  
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given; 
  import cucumber.api.java.en.Then; 
  import cucumber.api.java.en.When;
  
  public class LoginPage {
  
   WebDriver driver;
  
  @Given("^Open Google chrome$") 
  public  void Open_Google_chrome()   {
    
  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe"); 
  driver = new ChromeDriver(); 
  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
  driver.get("https://mvnrepository.com/"); }
  
  
  
  @When("^Verify Title & Search for cucumber$") 
  public void Verify_Title_Search_for_cucumber() {
	  
  driver.manage().window().maximize();
  String mvntitle = driver.getTitle();	  
  System.out.println(mvntitle);
  assertEquals(mvntitle, "Maven Repository: Search/Browse/Explore", "Title verification Completed"); 
  
  driver.findElement(By.className("textfield")).sendKeys("cucumber");
  driver.findElement(By.className("button")).click();
  
  }
  
	  @Then("^Verify the Junit package is present$") 
	  public void Verify_the_Junit_package() {
	  
		  
		  
		  try {
			  WebElement txtUsername = driver.findElement(By.xpath("//div[@id=\"maincontent\"]//li//a[contains(text(),'2')]"));
			  
			  Actions builder = new Actions(driver); 
			    
			  Action seriesOfActions = builder.moveToElement(txtUsername).keyDown(txtUsername, Keys.CONTROL)
			  .click().keyUp(txtUsername, Keys.CONTROL).build();
			  
			  seriesOfActions.perform();
			}
			catch(org.openqa.selenium.StaleElementReferenceException ex)
			{
				
			}
	
		  for(String allwindows : driver.getWindowHandles()) 
		  {
			  
			  driver.switchTo().window(allwindows);
			  System.out.println(driver.getTitle());
		  }
		  
	  }
  }
	 