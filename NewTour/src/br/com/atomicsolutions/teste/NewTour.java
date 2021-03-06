package br.com.atomicsolutions.teste;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NewTour {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\DriverChrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://newtours.demoaut.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.name("userName")).sendKeys("teste");
		driver.findElement(By.name("password")).sendKeys("teste");
		driver.findElement(By.name("login")).click();
		
//		driver.findElement(By.name("passCount")).click();
//		driver.findElement(By.xpath("//select[@name = 'passCount']/option[@value = '2']")).click();
//		driver.findElement(By.name("passCount")).click();
		
		Select sel = new Select(driver.findElement(By.xpath("//select[@name = 'passCount']")));
		sel.selectByValue("2");
		
//		driver.findElement(By.name("fromPort")).click();
//		driver.findElement(By.xpath("//select[@name = 'fromPort']/option[@value = 'Portland']")).click();
//		driver.findElement(By.name("fromPort")).click();
		
		Select sel1 = new Select(driver.findElement(By.xpath("//select[@name = 'fromPort']")));
		sel1.selectByValue("Portland");
		
//		driver.findElement(By.name("fromMonth")).click();
//		driver.findElement(By.xpath("//select[@name = 'fromMonth']/option[@value = '7']")).click();
//		driver.findElement(By.name("fromMonth")).click();
		
		Select sel2 = new Select(driver.findElement(By.xpath("//select[@name = 'fromMonth']")));
		sel2.selectByValue("7");
		
//		driver.findElement(By.name("fromDay")).click();
//		driver.findElement(By.xpath("//select[@name = 'fromDay']/option[@value = '9']")).click();
//		driver.findElement(By.name("fromDay")).click();
		
		Select sel3 = new Select(driver.findElement(By.xpath("//select[@name = 'fromDay']")));
		sel3.selectByValue("9");
		
//		driver.findElement(By.name("toPort")).click();
//		driver.findElement(By.xpath("//select[@name = 'toPort']/option[@value = 'Paris']")).click();
//		driver.findElement(By.name("toPort")).click();
		
		Select sel4 = new Select(driver.findElement(By.xpath("//select[@name = 'toPort']")));
		sel4.selectByValue("Paris");
		
//		driver.findElement(By.name("toMonth")).click();
//		driver.findElement(By.xpath("//select[@name = 'toMonth']/option[@value = '12']")).click();
//		driver.findElement(By.name("toMonth")).click();
		
		Select sel5 = new Select(driver.findElement(By.xpath("//select[@name = 'toMonth']")));
		sel5.selectByValue("12");
		
//		driver.findElement(By.name("toDay")).click();
//		driver.findElement(By.xpath("//select[@name = 'toDay']/option[@value = '1']")).click();
//		driver.findElement(By.name("toDay")).click();

		Select sel6 = new Select(driver.findElement(By.xpath("//select[@name = 'toDay']")));
		sel6.selectByValue("1");
		
		driver.findElement(By.xpath("//input[@value= 'First']")).click();
		
//		driver.findElement(By.name("airline")).click();
//		driver.findElement(By.xpath("//select[@name = 'airline']/option[text() = 'Unified Airlines']")).click();
//		driver.findElement(By.name("airline")).click();
		
		Select sel7 = new Select(driver.findElement(By.xpath("//select[@name = 'airline']")));
		sel7.selectByVisibleText("Unified Airlines");
		
		driver.findElement(By.name("findFlights")).click();
		
		driver.findElement(By.xpath("//input[@value = 'Unified Airlines$563$125$11:24']")).click();
		driver.findElement(By.xpath("//input[@value = 'Pangea Airlines$652$114$16:37']")).click();
		
		driver.findElement(By.name("reserveFlights")).click();
		
		driver.findElement(By.name("passFirst0")).sendKeys("Lucas");
		driver.findElement(By.name("passLast0")).sendKeys("Polizeli");
		
//		driver.findElement(By.name("pass.0.meal")).click();
//		driver.findElement(By.xpath("//select[@name = 'pass.0.meal']/option[@value = 'LSML']")).click();
//		driver.findElement(By.name("pass.0.meal")).click();
		
		Select sel8 = new Select(driver.findElement(By.xpath("//select[@name = 'pass.0.meal']")));
		sel8.selectByValue("LSML");
		
		driver.findElement(By.name("passFirst1")).sendKeys("Tamiris");
		driver.findElement(By.name("passLast1")).sendKeys("Cerqueira");
		
//		driver.findElement(By.name("pass.1.meal")).click();
//		driver.findElement(By.xpath("//select[@name = 'pass.1.meal']/option[@value = 'LFML']")).click();
//		driver.findElement(By.name("pass.1.meal")).click();
		
		Select sel9 = new Select(driver.findElement(By.xpath("//select[@name = 'pass.1.meal']")));
		sel9.selectByValue("LFML");
		
//		driver.findElement(By.name("creditCard")).click();
//		driver.findElement(By.xpath("//select[@name = 'creditCard']/option[@value = 'DC']")).click();
//		driver.findElement(By.name("pass.1.meal")).click();
		
		Select sel10 = new Select(driver.findElement(By.xpath("//select[@name = 'creditCard']")));
		sel10.selectByValue("DC");
		
		driver.findElement(By.name("creditnumber")).sendKeys("5555666677778884");
		
//		driver.findElement(By.name("cc_exp_dt_mn")).click();
//		driver.findElement(By.xpath("//select[@name = 'cc_exp_dt_mn']/option[contains(text(), '07')]")).click();
//		driver.findElement(By.name("cc_exp_dt_mn")).click();
		
		Select sel11 = new Select(driver.findElement(By.xpath("//select[@name = 'cc_exp_dt_mn']")));
		sel11.selectByVisibleText("07");
		
//		driver.findElement(By.name("cc_exp_dt_yr")).click();
//		driver.findElement(By.xpath("//select[@name = 'cc_exp_dt_yr']/option[contains(text(), '2010')]")).click();
//		driver.findElement(By.name("cc_exp_dt_yr")).click();
		
		Select sel12 = new Select(driver.findElement(By.xpath("//select[@name = 'cc_exp_dt_yr']")));
		sel12.selectByVisibleText("2010");
		
		driver.findElement(By.name("cc_frst_name")).sendKeys("Emerson");
		driver.findElement(By.name("cc_mid_name")).sendKeys("Henrique");
		driver.findElement(By.name("cc_last_name")).sendKeys("da Silva");
		
		driver.findElement(By.xpath("//font[contains(text(), 'Ticketless Travel')]/preceding-sibling::input")).click();
		driver.findElement(By.xpath("//font[contains(text(), 'Same as Billing Address')]/preceding-sibling::input")).click();
		
		driver.findElement(By.name("buyFlights")).click();
		
		driver.findElement(By.xpath("//img[@src = '/images/forms/home.gif']")).click();
		
		driver.quit();
		
	}

}
