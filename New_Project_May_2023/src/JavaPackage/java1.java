package JavaPackage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class java1 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","F:\\software testing\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        Thread.sleep(20000);
        driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
        
        driver.findElement(By.xpath("//input[@id='email"));
        
        

	}

}
