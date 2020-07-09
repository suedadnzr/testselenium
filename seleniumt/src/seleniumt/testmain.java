package seleniumt;

import java.awt.List;
import java.util.Timer;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.util.concurrent.TimeLimiter;

import okio.Timeout;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import java.io.File;
import java.sql.Time;

import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


class login{
	
	public  String mail="denemedenemetest@outlook.com";
	public String passwrd="Test123456789";

}

public class testmain
{


		public static void main(String[] args)  {

			
			WebDriver driver = new ChromeDriver();
			login logininfo=new login();


			driver.get("http://www.trendyol.com/");
			//driver.findElement(By.xpath("//*[@id='popupContainer']/div/div[1]/a/span[1]/img")).click();  //kadýn sayfasýna gider
			//driver.findElement(By.xpath("//*[@id='accountBtn']/div[1]")).click();
			
	
			WebDriverWait wait = new WebDriverWait(driver, 10);
			WebElement carpi = wait.until(ExpectedConditions.elementToBeClickable((By.xpath("/html/body/div[7]/div/div/a"))));
			carpi.click();
			WebElement uyeGirisi = wait.until(ExpectedConditions.visibilityOfElementLocated((By.id("accountBtn"))));
			uyeGirisi.click();
			WebElement email = wait.until(ExpectedConditions.elementToBeClickable((By.name("email"))));
			email.click();
			email.sendKeys(logininfo.mail);
			
			WebElement sifre = wait.until(ExpectedConditions.elementToBeClickable((By.name("password"))));
			sifre.click();
			sifre.sendKeys(logininfo.passwrd);
			WebElement btnokey = driver.findElement(By.id("loginSubmit"));
			btnokey.click();
		
		
			
			WebElement kutu = wait.until(ExpectedConditions.elementToBeClickable((By.xpath("//*[@id='auto-complete-app']/div/div/input"))));
			kutu.click();
			kutu.sendKeys("bilgisayar");
			WebElement btnara = driver.findElement(By.xpath("//*[@id='auto-complete-app]/div/div/i"));
			btnara.click();
		
			
			
			
			
			
	}


}