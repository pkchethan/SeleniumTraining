import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:/WS_JAVA/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.get("http://www.youcandealwithit.com/borrowers/calculators-and-resources/calculators/budget-calculator.shtml");
		
		driver.findElement(By.id("food")).sendKeys("200");
		driver.findElement(By.id("clothing")).sendKeys("100");
		driver.findElement(By.id("shelter")).sendKeys("300");
		driver.findElement(By.id("monthlyPay")).sendKeys("1000");
		driver.findElement(By.id("monthlyOther")).sendKeys("200");
		Thread.sleep(2000);
		System.out.println("totoal monthly expense:"+driver.findElement(By.id("totalMonthlyExpenses")).getAttribute("value"));
		System.out.println("totoal monthly Income:"+driver.findElement(By.id("totalMonthlyIncome")).getAttribute("value"));
		
		
	}

}
