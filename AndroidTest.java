package TestSampleAppium1.TestSampleAppium1;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class AndroidTest {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,MobilePlatform.ANDROID);
		cap.setCapability("appPackage", "com.sec.android.app.popupcalculator");
		cap.setCapability("appActivity","com.sec.android.app.popupcalculator.Calculator");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME,"13886253040004V");
		AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Button[@content-desc=\"9\"]"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Button[@content-desc=\"Plus\"]"))).click();		
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Button[@content-desc=\"5\"]"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Button[@content-desc=\"Equal\"]"))).click();
		
        

	}

}
