import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class A {
	 public static void main(String[] args ) throws InterruptedException
	    {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.get("https://aspireapp.odoo.com");
		 driver.findElement(By.name("login")).sendKeys("user@aspireapp.com");
		 System.out.println("Entered Username");
		 driver.findElement(By.name("password")).sendKeys("@sp1r3app");
		 System.out.println("Entered Password");
		 driver.findElement(By.xpath("//*[@id=\"wrapwrap\"]/main/div/div/div/form/div[3]/button")).click();	
		 System.out.println("Hit on Login button");
		 
		 driver.findElement(By.xpath("//*[@id=\"result_app_1\"]")).click();
		 System.out.println("Hit on Inventory");
		 driver.findElement(By.xpath("/html/body/header/nav/div[1]/div[2]/button/span")).click();
		 System.out.println("Hit on Product button");
		 driver.findElement(By.xpath("/html/body/header/nav/div[1]/div[2]/div/a[1]")).click();
		 System.out.println("Select value from Product");
		 driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div[1]/div/div/button")).click();
		 System.out.println("Hit on Create button to create a new product");
		 driver.findElement(By.xpath("//*[@id=\"o_field_input_11\"]")).sendKeys("Banarasi Silk Sarees");
		 System.out.println("Entered Product Name");
		 		 
		 Select productType = new Select(driver.findElement(By.xpath("//*[@id=\"o_field_input_15\"]")));
		 productType.selectByVisibleText("Consumable");
		 productType.selectByIndex(1);
		 System.out.println("Selected the Product type");
		 
		 Thread.sleep(4000);
		 driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div[1]/div/div/div[2]/button[1]")).click();
		 System.out.println("Hit on the save button");
		 driver.findElement(By.xpath("/html/body/header/nav/a[1]")).click();
		 System.out.println("Hit on the Home Icon");
		 
		 driver.findElement(By.xpath("//*[@id=\"result_app_2\"]")).click();
		 System.out.println("Hit on Manufacturing");
		 
		 driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div[1]/div/div/button[3]")).click();
		 System.out.println("Hit on the create button");
		 
		 driver.findElement(By.xpath("//*[@id=\"o_field_input_180\"]")).sendKeys("Banarasi Silk Sarees");
		 System.out.println("Fetched Product Name");
		driver.findElement(By.xpath("/html/body/ul[1]/li[2]/a")).click();
		driver.findElement(By.name("product_qty")).sendKeys(Keys.CONTROL+"a");
		driver.findElement(By.name("product_qty")).sendKeys("15.00");
		System.out.println("Given quantity");
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/div[1]/div[1]/button[5]")).click();
		System.out.println("Hit on the Confirmed button");
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/div[1]/div[1]/button[4]")).click();
		System.out.println("Hit on Mark as Done button");
		
		driver.findElement(By.xpath("//*[@id=\"modal_235\"]/div/div/footer/button[1]")).click();
		System.out.println("Hit on ok button on new window");
		driver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/div/div/footer/div/footer/button[1]")).click();
		System.out.println("Hit on Apply button");
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div[1]/div/div/div[2]/button[1]")).click();
		driver.findElement(By.xpath("/html/body/header/nav/a[2]")).click();
		
		driver.findElement(By.xpath("/html/body/header/nav/div[2]/div[5]/button/img")).click();
		driver.findElement(By.xpath("/html/body/header/nav/div[2]/div[5]/div/a[3]")).click();
		
		
	    }
}
