package Test_run;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scenario7 {

	public static void main(String[] args) throws InterruptedException, IOException {
		maketrip("mmt");
	}
		public static void maketrip(String filename ) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shahr\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  
		
		WebDriver driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    driver.get("https://www.makemytrip.com/");
	    driver.manage().window().maximize();
	    System.out.println(driver.getTitle());
	
	File srcimg = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(srcimg, new File("C:\\Users\\shahr\\Eclipse-WorkSpace1\\Test_Run\\test-output"+filename+".png"));
	
	driver.navigate().back();
	File srcimg1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(srcimg, new File("C:\\Users\\shahr\\Eclipse-WorkSpace1\\Test_Run\\test-output"+filename+".png"));
	
	
	}
}