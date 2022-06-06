package week5day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		options.add
		driver.get("http://www.ajio.com/");
        driver.manage().window().maximize();	
        
        WebElement hoverOnMens = driver.findElement(By.xpath("//a[text()='MEN']"));
        Actions builder=new Actions(driver);
        
		
		
		
		
		
		
		
	}
}
