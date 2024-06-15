package Steps;

import java.io.IOException;

import Elementos.Elementos;
import Metodos.Metodos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
	
	 Elementos e = new Elementos(); 
	 Metodos m = new Metodos(); 


@Given("acesse o site {string}")
public void acesse_o_site(String url) throws InterruptedException {
	m.abrirNavegador(url);
	m.pausa(2000);
   }

@Given("clique no botao sign")
public void clique_no_botao_sign() {
   m.clicar(e.getBtnsignin());
}

@Given("preencha o email")
public void preencha_o_email() throws InterruptedException {
   m.preencher(e.getEmail(), "luan-lopes71@gruposantin.com.br");
   m.pausa(2000);
}

@Given("clica no botao create")
public void clica_no_botao_create() throws InterruptedException {
   m.pausa(1000);
   m.clicar(e.getBtncreate());
}

@When("preenche as requisicoes")
public void preenche_as_requisicoes() throws InterruptedException {
m.pausa(2000);
m.preencher(e.getFirstname(), "Lucas Osvaldo"); 
m.preencher(e.getLastname(), "Barbosa");
m.preencher(e.getPassword(), "123456");
m.preencher(e.getDatybirthdays(), "25");
m.preencher(e.getDatybirthmonths(), "january");
m.preencher(e.getDatybirthyears(), "1980");
m.clicar(e.getTitle());
}

@When("clica em register")
public void clica_em_register() {
   m.clicar(e.getCheckbox());
   m.clicar(e.getRegister());
}

@Then("aparecera a mensagem")
public void aparecera_a_mensagem() throws IOException, InterruptedException {
	m.validarTexto(e.getTextoespercadastro(), "Your account has been created.");
	m.print("Accountcreate");
	m.pausa(2000);
	m.fecharNavegador();
}


@Given("preencha o emaillogin")
public void preencha_o_emaillogin() {
	m.preencher(e.getEmaillogin(), "luan-lopes71@gruposantin.com.br");
}

@When("preencha o Passwordlogin")
public void preencha_o_passwordlogin() {
   m.preencher(e.getPasswordlogin(), "123456");
}

@Given("clica no botao signinlogin")
public void clica_no_botao_signinlogin() throws IOException, InterruptedException {
   m.clicar(e.getBtnsigninlogin());
  }

@Then("fara o login")
public void fara_o_login() throws IOException, InterruptedException {
	 m.validarTexto(e.getTextoesperadologin(), "Welcome to your account. Here you can manage all of your personal information and orders.");
	 m.pausa(5000); 
	 m.print("validacaologin");
	   m.pausa(5000);
	   m.fecharNavegador();
   }




}
