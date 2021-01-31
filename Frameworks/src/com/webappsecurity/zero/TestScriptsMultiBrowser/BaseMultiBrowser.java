package com.webappsecurity.zero.TestScriptsMultiBrowser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseMultiBrowser {

	
	WebDriver driver;

	
		@BeforeClass
		@Parameters("browser")
			
		public void openApp(String browser){
			 
		
			if(browser.equals("Chrome")) {
				System.out.println("Launching Chrome"); 
				//System.setProperty("webdriver.chrome.driver", "C:\\Selenium19_6\\Drivers\\chromedriver.exe");
				driver = new ChromeDriver();
				
			}
			else if(browser.equals("IE")){
				System.out.println("Launching IE");
				//System.setProperty("webdriver.ie.driver", "IEDriverServer.exe");
				driver = new InternetExplorerDriver();
				
			}
			else if (browser.equals("Edge")) {
				System.out.println("Launching Edge");
				//System.setProperty("webdriver.edge.driver", "msedgedriver.exe");
				driver = new EdgeDriver();
				
				
			}
			else if (browser.equals("Firefox")) {
				System.out.println("Launching Firefox");
				//System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
				driver = new FirefoxDriver();
				driver.get("http://zero.webappsecurity.com/login.html"); 
			}

			driver.get("http://zero.webappsecurity.com/login.html");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			
			}
		
		@AfterClass
		public void closeapp() {
			 driver.close();
		}

	}

