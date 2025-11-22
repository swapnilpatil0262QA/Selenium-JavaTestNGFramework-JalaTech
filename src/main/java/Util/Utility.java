package Util;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {
	public static void captureScreenShot(WebDriver driver) throws IOException {
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		SimpleDateFormat dateFormat=new SimpleDateFormat("-yyyy-MM-dd HH-mm-ss");
		Date date = new Date();
		String str_currentdateTime=dateFormat.format(date);
		System.out.println("test.jpeg"+str_currentdateTime);
		
		File dest=new File("test-output\\FailedTestScreenshots\\"+str_currentdateTime+".png");
		FileHandler.copy(src,dest);
	}

}
