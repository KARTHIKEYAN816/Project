package windowshandling;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WHandling {
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\NOLAN\\eclipse-workspace\\Selinium\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.snapdeal.com/");
	driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
         WebElement ser=driver.findElement(By.name("keyword"));
         ser.sendKeys("motorola",Keys.ENTER);
         
         WebElement j=driver.findElement(By.xpath("//*[@id=\"651068217963\"]/div[3]/div[1]/a/p"));
         j.click();
         
         String par=driver.getWindowHandle();
         System.out.println(par);
         
         Set<String> all=driver.getWindowHandles();
         System.out.println(all);
     List<String>   l=new ArrayList<>();
     l.addAll(all);
     driver.switchTo().window(l.get(1));
    	WebElement pin=driver.findElement(By.xpath("//input[@placeholder='Enter pincode']"));
    	pin.sendKeys("631304",Keys.ENTER);
		
    	WebElement add=driver.findElement(By.xpath("//span[text()='add to cart']"));
    	add.click();
    	
    	WebElement shop=driver.findElement(By.xpath("//*[@id=\"sdFooter\"]/div[1]/div/a[4]/div/div[2]/p[1]"));
    	shop.click();
      
    	driver.switchTo().window(l.get(0));
    	driver.switchTo().window(l.get(1));
    	}

}
