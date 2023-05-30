package Scripts;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Poms.GooglePage;
import Poms.TAP;

public class Sesion6 {

private WebDriver driver;
	
	@Before
	public void setUp() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		driver = new ChromeDriver(options);	}
	
	@Test
	public void test() throws InterruptedException {
		driver.get("https:/www.google.com");
		GooglePage gp = new GooglePage(driver);
		TAP tap = new TAP(driver);
		Thread.sleep(3000);
		gp.typeOnSearchBar("Automation Testing Practice");
		Thread.sleep(1000);
		gp.clickResultById(0);
		
		Thread.sleep(1000);
		tap.clickOnWikipediaTesting();
		tap.clickOnWikipediaTesting();
		tap.clickOnWikipediaTesting();
		tap.clickOnWikipediaTesting();
		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
		
		driver.switchTo().window(tabs2.get(1));
		driver.get("https://www.google.com.mx/");
		driver.switchTo().window(tabs2.get(2));
		driver.get("https://www.youtube.com/");
		driver.switchTo().window(tabs2.get(3));
		driver.get("https://www.amazon.com.mx/");
		driver.switchTo().window(tabs2.get(4));
		driver.get("https://www.mercadolibre.com.mx/");
		
		for(int i = 0; i < tabs2.size(); i++) {
			Thread.sleep(1000);
			driver.switchTo().window(tabs2.get(i));
			if(driver.getTitle().equals("Google")) {
				System.out.println(driver.getTitle());
				break;
			}
		}
		/*
		Thread.sleep(3000);
		
		driver.get("https://www.youtube.com/");
		
		Thread.sleep(3000);
		
		driver.get("https://www.amazon.com.mx/?&tag=hydramzkw0mx-20&ref=pd_sl_2y6dol47uv_e&adgrpid=55901039737&hvpone=&hvptwo=&hvadid=590601811666&hvpos=&hvnetw=g&hvrand=15666855850217364214&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1010149&hvtargid=kwd-360364908397&hydadcr=13959_13404201");
		
		Thread.sleep(3000);
		
		driver.get("https://www.mercadolibre.com.mx/");
		
		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
		System.out.println(driver.getTitle());
		driver.switchTo().window(tabs2.get(1));
		System.out.println(driver.getTitle());
		*/
		//gp.typeOnSearchBar("Automation Testing Practice");
		
		//Click en primer resultado
		//Thread.sleep(1000);
		
		//gp.clickResultById(0);
		
		//Thread.sleep(1000);
		
		//driver.get("https:/www.google.com");
		/*
		tap.clickOnWikipedia();
		

		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
		System.out.println(driver.getTitle());
		driver.switchTo().window(tabs2.get(1));
		System.out.println(driver.getTitle());
		*/
		//tap.typeOnAmazonBar("Celulares");
		//Thread.sleep(1000);
		//tap.clickOnSamsung();
		//tap.selectBuscadorByValue();
		//String value = tap.selectBuscadorByText("Celulares");
		//System.out.println(value);
		//
		//String value2 = tap.selectCheckBoxByText("Medium");
		//System.out.println(value2);
		//String value3 = tap.selectCheckBoxByIndex("4");
		//System.out.println(value3);
		
		//String value = tap.selectCheckBoxByValue("3");
		//System.out.println(value);
		//
		//String value2 = tap.selectCheckBoxByText("Medium");
		//System.out.println(value2);
		//String value3 = tap.selectCheckBoxByIndex("4");
		//System.out.println(value3);
		
		//tap.printText2();
		//tap.clickAlertButton();
		//Thread.sleep(1000);
		//tap.acceptAlert();
		//Thread.sleep(1000);
		//tap.printText();
		
		//tap.clickAlertButton();
		//Thread.sleep(1000);
		//tap.cancelAlert();
		//Thread.sleep(1000);
		//tap.printText();
		//gp.clickFirstResult();
		//gp.printFirstText();
		//Búsqueda en Google
	}
	@After
	public void teardown() {
		
		//driver.quit();
	}
}