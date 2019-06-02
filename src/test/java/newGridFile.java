
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class newGridFile {
	
	static DesiredCapabilities cap;
	
	@Parameters("browser")
	@Test
	public static void launchApp(String browser) throws MalformedURLException  {  
		if(browser.equalsIgnoreCase("chrome")) {
			 cap = DesiredCapabilities.chrome();
			cap.setBrowserName("chrome");
			 
		}else{
			 cap = DesiredCapabilities.chrome();
			cap.setBrowserName("chrome");
			
		}
		cap.setPlatform(Platform.MAC);
		
		//System.out.println("abc");
		WebDriver driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), cap);
		driver.get("http://the-internet.herokuapp.com/key_presses");

	}

}
