
@tag
Feature: Teste de cadastro do site AutomationPractice
  @tag1
  Scenario: Teste de cadastro
    Given acesse o site "http://www.automationpractice.pl/index.php"
    And clique no botao sign
    And preencha o email
    And clica no botao create
    When preenche as requisicoes
    And clica em register
    Then aparecera a mensagem
 
