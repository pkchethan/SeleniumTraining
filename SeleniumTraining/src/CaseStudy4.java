import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaseStudy4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:/WS_JAVA/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.get("https://www.cleartrip.com/");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[@class='radio__circle bs-border bc-neutral-500 bw-1 ba'])[2]")).click();
		Thread.sleep(2000);
		
		boolean roundTrip=driver.findElement(By.xpath("(//span[@class='radio__circle bs-border bc-neutral-500 bw-1 ba'])[2]")).isSelected();
		boolean returnOn=driver.findElement(By.xpath("//h4[text()='Return on']")).isDisplayed();
		
		System.out.println(roundTrip);
		System.out.println(returnOn);
		
		//Logic code
		if(roundTrip==false ) 
		{
			if(returnOn==true) {
				System.out.println("FAIL!! Return on is visible when Round trip is Not Selected");
			}
			else {
				driver.findElement(By.xpath("(//span[@class='radio__circle bs-border bc-neutral-500 bw-1 ba'])[2]")).click();
			}
		}
		
		else if(roundTrip==true)
		{
			if(returnOn==false) {
				System.out.println("FAIL!! Return on is not visible though Round trip is selected");	
			}
			else {
				System.out.println("Pass:Return on is not visible and rount trip is not selected");
			}
		}	
			
		
		
	}

}
