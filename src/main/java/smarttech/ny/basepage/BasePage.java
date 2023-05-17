package smarttech.ny.basepage;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
//import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;

  public class BasePage {
	  public static Properties prop;
	  public static  FileInputStream file;
	  public static WebDriver driver;
	  public BasePage() {
	try {
       prop = new Properties();  
		file = new FileInputStream("./src/main/java/smarttech/ny/config/Config.properties");
		prop.load(file);
	} catch (FileNotFoundException e) {
		
		e.printStackTrace();
	} catch (IOException e) {	
		e.printStackTrace();
	}
}
	  
public void getOpenApplication() {
	String browser = prop.getProperty("browserName");
	if(browser.equals("chrome")) {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		}
	else if(browser.equals("edge")) {
		WebDriverManager.edgedriver().setup();
		 driver = new EdgeDriver();
	}
	else {
System.out.println("There is no Driver");
	
	}
  
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.get(prop.getProperty("QA_ENV"));

}
  }	
