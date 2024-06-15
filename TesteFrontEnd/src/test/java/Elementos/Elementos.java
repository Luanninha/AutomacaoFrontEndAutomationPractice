package Elementos;

import org.openqa.selenium.By;

public class Elementos {

	private By btnsignin = By.cssSelector("#header > div.nav > div > div > nav > div.header_user_info > a");
	private By btnsigninlogin = By.cssSelector("#SubmitLogin > span");
	private By email = By.id("email_create");
	private By emaillogin = By.id("email");
	private By btncreate = By.cssSelector("#SubmitCreate > span");
	private By title = By.id("id_gender1");
	private By firstname = By.id("customer_firstname");
	private By lastname = By.id("customer_lastname");
	private By password = By.name("passwd");
	private By passwordlogin = By.id("passwd");
	private By datybirthdays = By.name("days");
	private By datybirthmonths = By.id("months");
	private By datybirthyears = By.id("years");
	private By checkbox = By.id("newsletter");
	private By register = By.cssSelector("#submitAccount > span");
	private By textoespercadastro = By.cssSelector("#center_column > p.alert.alert-success");
	private By textoesperadologin = By.cssSelector("#center_column > p");
	
	public By getBtnsignin() {
		return btnsignin;
	}
	public By getEmail() {
		return email;
	}
	public By getBtncreate() {
		return btncreate;
	}
	public By getTitle() {
		return title;
	}
	public By getFirstname() {
		return firstname;
	}
	public By getLastname() {
		return lastname;
	}
	public By getPassword() {
		return password;
	}
	public By getDatybirthdays() {
		return datybirthdays;
	}
	public By getDatybirthmonths() {
		return datybirthmonths;
	}
	public By getDatybirthyears() {
		return datybirthyears;
	}
	public By getCheckbox() {
		return checkbox;
	}
	public By getRegister() {
		return register;
	}
	public By getBtnsigninlogin() {
		return btnsigninlogin;
	}
	public By getEmaillogin() {
		return emaillogin;
	}
	public By getPasswordlogin() {
		return passwordlogin;
	}
	public By getTextoespercadastro() {
		return textoespercadastro;
	}
	public By getTextoesperadologin() {
		return textoesperadologin;
	}
}
