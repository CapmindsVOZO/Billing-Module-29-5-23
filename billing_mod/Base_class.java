package com.billing_mod;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_class {

//public static WebDriver driver;

	// Driver Invokes

	public static RemoteWebDriver driver;

	// public static WebDriver driver = getbrowser("chrome");

	// public static Pom_Class pom = new Pom_Class(driver);
	@Parameters("type")

	public static WebDriver getbrowser(String type) {

		System.out.println("Browser Name Is :" + type);
		System.out.println("Thread Id :" + Thread.currentThread().getId());

		if (type.equalsIgnoreCase("chrome")) {

			WebDriverManager.chromedriver().setup();

			driver = new ChromeDriver();
//			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
//
//			driver = new ChromeDriver();

		} else if (type.equalsIgnoreCase("edge")) {

			WebDriverManager.edgedriver().setup();
			// System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") +
			// "\\edgedriver\\msedgedriver.exe");

			driver = new EdgeDriver();

		} else if (type.equalsIgnoreCase("firefox")) {
//			System.setProperty("webdriver.edge.driver",
//					System.getProperty("user.dir") + "\\edgedriver\\msedgedriver.exe");
			WebDriverManager.firefoxdriver().setup();

			driver = new FirefoxDriver();

		} else if (type.equalsIgnoreCase("opera")) {

			WebDriverManager.operadriver().setup();

			driver = new OperaDriver();
		}

		driver.manage().window().maximize();

		return driver;

	}

	public static void geturl(String url) {

		driver.get(url);

	}

	public static void sendkeys(WebElement elements, String Value) {

		elements.sendKeys(Value);

	}

	public static void Clickonelement(WebElement element) {

		element.click();

	}

	public static void alertdismiss(WebDriver driver) {

		driver.switchTo().alert().dismiss();

	}

	public static void gettext(WebElement text) {

		String text1 = text.getText();

		System.out.println(text1);

	}

	public static void ClearText(WebElement element) {

		element.clear();

	}

	public static void Selectone(WebElement ele, String val) {

		Select se = new Select(ele);

		se.selectByVisibleText(val);
	}

	public static void sendkeys1(WebElement elements, Keys Value) {

		elements.sendKeys(Value);

	}
	public static void selecttwo(WebElement eleme, String valu) {

		Select se = new Select(eleme);

		se.selectByValue(valu);

	}

//	public static  void gettexts(List<WebElement> text) {
//		
//		for(WebElement data : text) {
//			String text2 = data.getText();
//			System.out.println(text2);

//Common for all the test cases

}
