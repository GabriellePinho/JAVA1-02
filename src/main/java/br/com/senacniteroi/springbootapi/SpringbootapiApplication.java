package br.com.senacniteroi.springbootapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootapiApplication {
 /*
  * ARQUITETURA MVC
  *
  * MODELS- SERÃO O  MODELO DAS REQUISIÇÕES 
  * VIWS - FRONTEND PRONTO QUE EXIBIRÁ O RESULTADO DAS REQUISIÇÕES 
  * CONTROLERS- VÃO ADMINISTRAR AS REQUISIÇÕES
  * SERVICES - VÃO "SERVIR" AS RESQUISIÇÕES
  *
  *
  *
  *
  *
  *
  */
	public static void main(String[] args) {
		SpringApplication.run(SpringbootapiApplication.class, args);
	}

}
