package br.com.atomicsolutions.cometa;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Cometa {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\DriverChrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String localIda = "Santo Andr�";
		String localPara = "Guaruj�";
		
		String diaIda = "8";
		String mesIda = "10";
		String anoIda = "2018";
		
		String horaIda = "06:55";
		
		driver.manage().window().maximize();
		driver.get("http://www.viacaocometa.com.br");
		
		Thread.sleep(1000);
		driver.findElement(By.id("origin-sidebar")).sendKeys(localIda);
		
		Thread.sleep(1000);
		driver.findElement(By.id("origin-sidebar")).sendKeys(Keys.ENTER);
		
		driver.findElement(By.id("destination-sidebar")).sendKeys(localPara);
		Thread.sleep(1000);
		driver.findElement(By.id("destination-sidebar")).sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath("//td[@data-month = '"+ mesIda +"' and @data-year='"+ anoIda +"']/a[text() = '"+ diaIda +"']")).click();

    	driver.findElement(By.xpath("//div[@class='x-main-content__sidebar--form-field x-main-content__sidebar--form-submit']/button")).click();
    	Thread.sleep(2000);
    	
    	for(String winHandle : driver.getWindowHandles()){
    	    driver.switchTo().window(winHandle);
    	}
    	Thread.sleep(5000);
    	
    	driver.findElement(By.xpath("//span//b[text() = '"+ horaIda +"']/../../span/input")).click();
    	
    	driver.findElement(By.id("consultaSubmit")).click();
    	
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("(//td[@class='desenho-poltrona libre'])[1]")).click();
    	Thread.sleep(2000);
    	
    	driver.findElement(By.id("passageiroNome")).sendKeys("Lucas Polizeli");
    	driver.findElement(By.id("passageiroDocumento")).sendKeys("289877702");
    	driver.findElement(By.xpath("//input[@value='CONTINUAR']")).click();
    	Thread.sleep(1000);
    	
      	driver.findElement(By.xpath("//a[contains(span, 'Finalizar')]")).click();
    	
      	Thread.sleep(2000);
      	driver.findElement(By.id("login")).sendKeys("41188270850");
      	driver.findElement(By.id("senha")).sendKeys("Llucas89");
      	driver.findElement(By.xpath(" //form[@id='loginForm']//input[@class='btn-login']")).click();
	}

}
