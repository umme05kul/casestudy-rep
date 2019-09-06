package cart;
 import org.openqa.selenium.By;
 import org.openqa.selenium.WebDriver;
 import org.openqa.selenium.chrome.ChromeDriver;
 import org.openqa.selenium.interactions.Actions;

 import cucumber.api.java.en.Given;
 import cucumber.api.java.en.When;

 public class addtocart {
 WebDriver driver;
 @Given("User is in Homepage")
 public void user_is_in_Homepage() {
 System.setProperty("webdriver.chrome.driver", "C:\\ummekul\\drivers\\chromedriver.exe");
 driver=new ChromeDriver();
 driver.get("http://10.232.237.143:443/TestMeApp/");
 driver.manage().window().maximize();
 }

 @Given("User logins the page")
 public void user_logins_the_page() {
 driver.findElement(By.linkText("SignIn")).click();
 driver.findElement(By.id("userName")).sendKeys("Lalitha");
 driver.findElement(By.id("password")).sendKeys("Password123");
 driver.findElement(By.name("Login")).click();
 }

 @When("User searches {string} in the field")
 public void user_searches_in_the_field(String string) {
 driver.findElement(By.id("myInput")).sendKeys("Head");
 Actions act=new Actions(driver);
 act.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/form/input"))).click().build().perform();
 }

 @When("Products page appears")
 public void products_page_appears() {
   
 }

 }