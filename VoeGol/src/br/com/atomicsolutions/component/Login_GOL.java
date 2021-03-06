package br.com.atomicsolutions.component;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import br.com.atomicsolutions.proton.Proton;

public class Login_GOL {
	public static void Run(WebDriver driver) throws Exception {
		// TODO Auto-generated method stub
		Proton.startComponent();
		
		String email = Proton.getProtonValue("in_Email_Gol");
		String senha = Proton.getProtonValue("in_Senha_Gol");
		
		driver.findElement(By.id("LoginMemberLogin2View_TextBoxUserID")).sendKeys(email);
		driver.findElement(By.id("LoginMemberLogin2View_PasswordFieldPassword")).sendKeys(senha);
		driver.findElement(By.id("LoginMemberLogin2View_LinkButtonLogIn")).click();
		
		driver.findElement(By.id("noSSR1")).click();
		driver.findElement(By.id("noVoeJunto1")).click();
		
		driver.findElement(By.xpath("//button[text() = 'Confirmar passageiro']")).click();
		driver.findElement(By.id("ControlGroupFullcontact2View_ButtonSubmit")).click();
		
		driver.findElement(By.xpath("//p[text() = 'Pular etapa']")).click();
		
		Proton.endComponent();
	}
}
