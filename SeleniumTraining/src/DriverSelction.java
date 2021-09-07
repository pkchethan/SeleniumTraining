import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverSelction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Please enter your Browser choice :chrome/mozilla ");
		Scanner sc= new Scanner(System.in);
		String input= sc.nextLine();
		
		switch(input){
			
			case "chrome":
				System.setProperty("webdriver.chrome.driver","D:/WS_JAVA/chromedriver_win32/chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("http://www.google.com");
				System.out.println(driver.getTitle());
				break;
			
			case "mozilla":
				System.setProperty("webdriver.gecko.driver","D:\\WS_JAVA\\geckodriver\\geckodriver-v0.29.1-win64\\geckodriver.exe");
				WebDriver drive = new FirefoxDriver();
				drive.get("http://www.google.com");
				System.out.println(drive.getTitle());
				break;
			default:
				System.out.println("Unsupported Browser!!!");
				
		}
			
	}

}
