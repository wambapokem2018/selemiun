import org.openqa.selenium.chrome.ChromeDriver;

/**
 * 
 */

/**
 * @author wambapokem
 *
 */
public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","/Users/wambapokem/workspace/Selenium/lib/webdriver/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://localhost:8000/");
	}

}
