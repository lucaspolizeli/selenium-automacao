package br.com.atomicsolutions.component;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import br.com.atomicsolutions.proton.Proton;

public class Parametros_Selecao_Busca {
	public static void Run(WebDriver driver) throws Exception {
		// TODO Auto-generated method stub
		Proton.startComponent();
		
		String ida = Proton.getProtonValue("in_Local_Ida");
		String volta = Proton.getProtonValue("in_Local_Volta");

		String diaIda = Proton.getProtonValue("in_Dia_Ida");
		String mesIda = Proton.getProtonValue("in_Mes_Ida");
		String anoIda = Proton.getProtonValue("in_Ano_Ida");
		
		String diaVolta = Proton.getProtonValue("in_Dia_Volta");
		String mesVolta = Proton.getProtonValue("in_Mes_Volta");
		String anoVolta = Proton.getProtonValue("in_Ano_Volta");
		
		driver.findElement(By.xpath("//div[@id = 'purchase-box']//a[@class = 'chosen-single chosen-default']/span[@class = 'chosen-placeholder-origin']")).click();
		driver.findElement(By.id("header-chosen-origin")).sendKeys(ida);
		driver.findElement(By.id("header-chosen-origin")).sendKeys(Keys.TAB);
		
		driver.findElement(By.xpath("//div[@class = 'purchase-box-header-division division-input division-input-destiny']")).click();
		driver.findElement(By.id("header-chosen-destiny")).sendKeys(volta);
		driver.findElement(By.id("header-chosen-destiny")).sendKeys(Keys.TAB);
		
		driver.findElement(By.id("datepickerGo")).click();
		driver.findElement(By.xpath("//td[@data-month = '"+ mesIda +"' and @data-year='"+ anoIda +"']/a[text() = '"+ diaIda +"']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("datepickerBack")).click();
		driver.findElement(By.xpath("//td[@data-month = '"+ mesVolta +"' and @data-year='"+ anoVolta +"']/a[text() = '"+ diaVolta +"']")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.id("btn-box-buy")).click();
		
		Proton.endComponent();
	}
}
