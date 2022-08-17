package Steps;

import org.openqa.selenium.By;

import Pages.Metodos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestesFormulario {
	 
	Metodos metodo = new Metodos();
	
	@Given("eu queira acessar a pagina {string}")
	public void eu_queira_acessar_a_pagina(String appUrl) {
		metodo.abrirNavegador(appUrl);
	   
	}

	@When("clicar em add customer para preencher o formulario")
	public void clicar_em_add_customer_para_preencher_o_formulario() throws InterruptedException {
		Thread.sleep(3000);
		metodo.clicar(By.id("switch-version-select"));
		Thread.sleep(2000);
		metodo.escrever("Bootstrap V4 Theme", By.id("switch-version-select"));
		metodo.clicar(By.id("switch-version-select"));
		Thread.sleep(2000);
		metodo.clicar(By.cssSelector("#gcrud-search-form > div.header-tools > div.floatL.t5 > a"));
		Thread.sleep(3000);
		metodo.escrever("Teste Sicredi", By.id("field-customerName"));
		metodo.escrever("Teste", By.id("field-contactLastName"));
		metodo.escrever("Gabriel Aguiar", By.id("field-contactFirstName"));
		metodo.escrever("5199999999", By.id("field-phone"));
		metodo.escrever("Av Assis Brasil, 3970", By.id("field-addressLine1"));
		metodo.escrever("Torre D", By.id("field-addressLine2"));
		metodo.escrever("Porto Alegre", By.id("field-city"));
		metodo.escrever("RS", By.id("field-state"));
		metodo.escrever("91000-000", By.id("field-postalCode"));
		metodo.escrever("Brasil", By.id("field-country"));
		metodo.clicar(By.id("field_salesRepEmployeeNumber_chosen"));
		//metodo.escrever("Fixter", By.cssSelector("#field_salesRepEmployeeNumber_chosen > div > ul > li:nth-child(8)"));
		//metodo.clicar(By.id("#field_salesRepEmployeeNumber_chosen > a > abbr"));
		metodo.escrever("200", By.id("field-creditLimit"));
		metodo.clicar(By.id("form-button-save"));
		//metodo.validarTexto("�Your data has been successfully stored into the database. Edit Customer or Go back to list", By.cssSelector("#report-success > p"));
		Thread.sleep(3000);
		
		//Desafio 2
		metodo.clicar(By.id("save-and-go-back-button"));
		Thread.sleep(3000);
		metodo.escrever("Teste Sicredi", By.name("customerName"));
		Thread.sleep(3000);
		metodo.clicar(By.cssSelector("#gcrud-search-form > div.scroll-if-required > table > thead > tr.filter-row.gc-search-row > td.no-border-right > div > input"));
		Thread.sleep(2000);
		
		

	}

	@Then("formulario e preenchido e salvo")
	public void formulario_e_preenchido_e_salvo() {
		metodo.fecharNavegador();
	    
	}
	
	
}
