import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3_MouseOver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:/WS_JAVA/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.get("https://www.google.com/");
	
		//all buttons
	int size=driver.findElements(By.xpath("//*[@type='submit']")).size();
    System.out.println(size);
    
    //All link texts
    int sizeL=driver.findElements(By.xpath("//a[@type='submit']")).size();
    System.out.println(sizeL);
    
}
}