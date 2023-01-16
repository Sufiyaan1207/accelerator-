package Test_run;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class scenario_4 {
	
	public static void main(String[] args ) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shahr\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    
	    //Open WebPage
	    driver.get("https://www.makemytrip.com/");
	    driver.findElement(By.xpath("//div/div[1]/div/div/ul/li[4]")).click();
	 
	   driver.findElement(By.id("showBizUpgradePopup")).click();
	   
	  
	    
	    //Input Biz_Email
	    driver.findElement(By.name("username")).sendKeys("delta_Force@gmail.com");
	    String email = driver.findElement(By.name("username")).getAttribute("value");
	    System.out.println(email);
	    
	    driver.findElement(By.xpath("//div/form/div/span")).click();
	    
	   //driver.close();
	    
}
}
