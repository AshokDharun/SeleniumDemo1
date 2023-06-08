package git1;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot
{
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://letcode.in/buttons");
	//take screenshot from drive(page)
	File fsrc= driver.getScreenshotAs(OutputType.FILE);
	File dest=new File("./snapes/img.png");
	org.openqa.selenium.io.FileHandler.copy(fsrc, dest);
	
	//screenshot from element (button)
	WebElement el=driver.findElementById("home");
	File esrc=el.getScreenshotAs(OutputType.FILE);
	File edest=new File("./snapes/img2.png");
	FileHandler.copy(esrc, edest);
	
	//screenshot from paticular section
	WebElement icon=driver.findElementByClassName("has-text-primary");
	File isrc=icon.getScreenshotAs(OutputType.FILE);
	File idest=new File("./snapes/icon.png");
	FileHandler.copy(isrc, idest);
	
	driver.quit();

}
}
