package week2day5;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChildParentXPath {

	
		 public static void main(String[] args) {

				WebDriverManager.chromedriver().setup();
				ChromeDriver driver=new ChromeDriver();
				driver.get("http://leaftaps.com/opentaps/control/main");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.Of.Seconds(20));

	}

}
