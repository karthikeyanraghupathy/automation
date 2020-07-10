
  package stepDefination;
  
  import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;
  
  import org.junit.Assert; import org.openqa.selenium.By; import
  org.openqa.selenium.Keys; import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import
  org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import
  org.openqa.selenium.support.ui.ExpectedConditions; import
  org.openqa.selenium.support.ui.WebDriverWait;
  
  import cucumber.api.java.en.And; import cucumber.api.java.en.Given; import
  cucumber.api.java.en.Then; import cucumber.api.java.en.When;
  
  public class LoginPage {
  
   WebDriver driver;
  
  @Given("^Open Google chrome$") 
  public  void Open_Google_chrome()   {
    
  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe"); 
  driver = new ChromeDriver(); 
  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
  driver.get("https://mvnrepository.com/"); }
  
  
  
  @When("^Verify Title & Search for cucumber$") 
  public void Enter_Username_and_Password() {
	  
  driver.manage().window().maximize();
  String mvntitle = driver.getTitle();	  
  System.out.println(mvntitle);
  assertEquals(mvntitle, "Maven Repository: Search/Browse/Explore", "Title verification Completed");
  
  driver.findElement(By.className("textfield")).sendKeys("cucumber");
  driver.findElement(By.className("button")).click();
  
  }
  
  @Then("^Verify the Junit package is present$")
  public void Enter_source_and_Destination()
  {
	
	 	  
	  WebElement txtUsername = driver.findElement(By.xpath("(//a[contains(text(),\"Cucumber JVM: JUnit\")])[1]"));

	  Actions builder = new Actions(driver);
	  Action seriesOfActions = builder.moveToElement(txtUsername).keyDown(txtUsername, Keys.CONTROL)
			  .click().keyUp(txtUsername, Keys.CONTROL).build();
	 
	  seriesOfActions.perform();

	 
  }
  
  } 
 