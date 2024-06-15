
@tag
Feature: Teste de Login do site AutomationPractice
  @tag1
  Scenario: Teste de Login
    Given acesse o site "http://www.automationpractice.pl/index.php"
    And clique no botao sign
    And preencha o emaillogin
    When preencha o Passwordlogin
    And clica no botao signinlogin
    Then fara o login