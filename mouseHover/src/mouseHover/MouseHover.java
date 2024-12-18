package mouseHover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("http://183.82.125.5/nareshit/login.php");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.name("txtUserName")).sendKeys("suresh");
		driver.findElement(By.name("txtPassword")).sendKeys("suresh123");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(3000);
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.linkText("PIM"))).perform();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Add Employee")).click();
		Thread.sleep(3000);
		System.out.println("Clicked on submenu");
		driver.close();
	}
}
