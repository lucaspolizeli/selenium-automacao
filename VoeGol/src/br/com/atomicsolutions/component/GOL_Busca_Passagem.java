package br.com.atomicsolutions.component;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import br.com.atomicsolutions.proton.Proton;

public class GOL_Busca_Passagem {
	public static void Run(WebDriver driver) throws Exception {
		// TODO Auto-generated method stub
		Proton.startComponent();
		
		String HoraIda = "06:40";
		String HoraVolta = "07:10";
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[@id='flightsFilter01']/../../..//div[@class = 'infoScale' and contains(span, '"+ HoraIda +"')]/../../../..//td[@class = 'taxa taxaExecutiva'])[(1)]")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[@id='flightsFilter02']/../../..//div[@class = 'infoScale' and contains(span, '"+ HoraVolta +"')]/../../../..//td[@class = 'taxa taxaExecutiva'])[(2)]")).click();
		
		driver.findElement(By.xpath("//input[@value = 'Continuar']")).click();
		
		Proton.endComponent();
	}
}
