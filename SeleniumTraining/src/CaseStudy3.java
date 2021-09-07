import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaseStudy3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:/WS_JAVA/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.get("http://www.youcandealwithit.com/borrowers/calculators-and-resources/calculators/budget-calculator.shtml");
		
		int food=300;
		int clothing=200;
		int shelter=500;
		int monthlyPay=2000;
		int monthlyOther=1050;
		
		driver.findElement(By.id("food")).sendKeys(String.valueOf(food));//converting integer to string
		driver.findElement(By.id("clothing")).sendKeys(String.valueOf(clothing));
		driver.findElement(By.id("shelter")).sendKeys(String.valueOf(shelter));
		driver.findElement(By.id("monthlyPay")).sendKeys(String.valueOf(monthlyPay));
		driver.findElement(By.id("monthlyOther")).sendKeys(String.valueOf(monthlyOther));
		
		double vMExp= food+clothing+shelter;
		double vMInc=monthlyPay+monthlyOther;
		
		double MonIncome= Double.parseDouble(driver.findElement(By.id("totalMonthlyIncome")).getAttribute("value"));
		double MonExpense= Double.parseDouble(driver.findElement(By.id("totalMonthlyExpenses")).getAttribute("value"));
		
		if(vMExp==MonExpense && vMInc==MonIncome) {
			System.out.println("Pass- Both the expecnse and income are matching");
		}else
		{
			System.out.println("Fail- there is difference in calculation");
		}
	}

}
