package week2.day1.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLeads {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://leaftaps.com/opentaps/control/main");
	
	String title = driver.getTitle();
	System.out.println("title"+title);

	WebElement userName = driver.findElement(By.id("username"));
	userName.sendKeys("demosalesmanager");
	WebElement password = driver.findElement(By.id("password"));
	password.sendKeys("crmsfa");
	WebElement login = driver.findElement(By.className("decorativeSubmit"));
	login.click();
	WebElement crm = driver.findElement(By.linkText("CRM/SFA"));
	crm.click();
	WebElement leads = driver.findElement(By.linkText("Leads"));
	leads.click();
	WebElement create= driver.findElement(By.linkText("Create Lead"));
	create.click();
driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
driver.findElement(By.id("createLeadForm_firstName")).sendKeys("sathya");
driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Rangaswami");
driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Testing");
driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Selenium");
driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("launching browser");
driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("courses");
driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("SeleniumTesting");
driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("1000000");
driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("200");
driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("50");
driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("70");
driver.findElement(By.id("createLeadForm_description")).sendKeys("creating a lead form");
driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("lead form for testleaf");
WebElement countrycode = driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
countrycode.clear();
countrycode.sendKeys("4");
driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("64");
driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("1234567899");
driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("91");
driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("manager");
driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("http://www.testleaf.com");
driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("testleaf@gmail.com");
driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("sathya Rangaswami");
driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("sathya");
driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("samayan nagar");
driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("periyanaickenpalayam");

driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Coimbatore");
driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("641020");
driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("6");
driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")).sendKeys("Georgia");
driver.findElement(By.className("smallSubmit")).click();
}
}
