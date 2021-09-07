import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:/WS_JAVA/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.get("https://www.amazon.in/");
	
		Actions a= new Actions(driver);
		a.moveToElement(driver.findElement(By.id("nav-link-accountList-nav-line-1"))).build().perform();
		driver.findElement(By.className("nav-action-inner")).click();
		Thread.sleep(2000);
		
		String s=driver.getTitle();
		if(s.equalsIgnoreCase("Amazon Sign In")) {
			System.out.println("Pass");
		}else
		{
			System.out.println("Fail");
		}
		
}
}