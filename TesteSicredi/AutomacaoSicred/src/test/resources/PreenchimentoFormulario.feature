#Author: Gabriel Aguiar
Feature: Preencher formulario
  Eu como usuario quero acessar a pagina para preencher o formulario

  
  Scenario: Preencher Formulario
    Given eu queira acessar a pagina "https://www.grocerycrud.com/v1.x/demo/bootstrap_theme"
    When clicar em add customer para preencher o formulario 
    Then formulario e preenchido e salvo
    
