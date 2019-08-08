package first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class First {
	
	WebDriver driver;
	WebElement webele, webele2, webele3;
	
public void jyoti() {
	
	System.setProperty("webdriver.chrome.driver","E://SEL//driver//chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://google.com");
}

/*public void search() 
{
	webele= driver.findElement(By.xpath(".//input[@title='Search']"));

	webele.sendKeys("jyoti");
}*/

public void click() {
	webele2 = driver.findElement(By.linkText("Gmail"));
	webele2.click();
	}

public void signin() {
	webele3 = driver.findElement(By.xpath(".//a[2]"));
	webele3.click();
}
}	