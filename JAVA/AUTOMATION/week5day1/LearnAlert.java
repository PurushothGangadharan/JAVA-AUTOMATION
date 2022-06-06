package week5day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAlert {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Alert.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		//alert.accept();
		driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();
		driver.switchTo().alert().sendKeys("ZOHO");
		driver.switchTo().alert().accept();
		
}
}