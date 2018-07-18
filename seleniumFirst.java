import org.openQA.selenium.WebDriver;
import org.openQA.selenium.chrome.chromeDriver;

public class seleniumFirst
{
	publis static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		//launch new browser session and directs to URL that is specified as parameter.
		driver.get("http://www.google.com");
		//The WebDriver class has the getTitle() method that is always used to obtain the page title of the currently 
		//loaded page.
		
		String actualtitle = driver.getTitle();
		String expectedtitle = "Welcome : google";
		
		//String Comparision
		
		if(expectectedtitle.contentEquals(actualtitle))
			System.out.println("Test Passed");
		else
			System.out.println("Test Failed");
			//finding GUI elements
			String tagName;
			tagName = driver.findElement(By.id("email")).getTagName();
			System.out.println("Tag Name "+tagName);
			//closes driver
			driver.close();
	}
}