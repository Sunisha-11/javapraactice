package seleniumconsept;
import org.openqa.selenium.chrome.ChromeDriver;



public class WebdriverMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get ("https://www.google.com/");
		
	}

}
