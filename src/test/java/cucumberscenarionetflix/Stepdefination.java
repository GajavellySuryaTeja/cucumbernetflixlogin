package cucumberscenarionetflix;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Stepdefination {
	WebDriver driver=null;
	int s1=3000;
	@Given("open browser")
	public void open_browser() throws InterruptedException {
	 WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver();
	 driver.get("https://www.netflix.com/login");
	 driver.manage().window().maximize();
	 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 Thread.sleep(s1);
	}

	@And("username and password credentials")
	public void username_and_password_credentials() throws InterruptedException {
	 driver.findElement(By.name("userLoginId")).sendKeys("suryatejagajavelly@gmail.com");
	 Thread.sleep(s1);
	 driver.findElement(By.name("password")).sendKeys("surya123456");
	 Thread.sleep(s1);
	}

	@Then("click login")
	public void click_login() throws InterruptedException {
	driver.findElement(By.xpath("//button[text()='Sign In']")).click();
	Thread.sleep(s1);
	}

	@When("close browser")
	public void close_browser() {
	driver.close();    
	}

}
