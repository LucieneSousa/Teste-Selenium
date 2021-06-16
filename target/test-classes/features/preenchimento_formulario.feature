# language: pt
# encoding: utf-8


Funcionalidade: Preencher formulários para enviar email no site SampleApp

Cenário: Preencher formulário e submissão de email

Dado que o usuario entra no <site> da SampleApp
Então seleciona a aba “Enter Vehicle Data”
E preenche o formulário Vehicle Data
Então clica no botão <next> para Vehicle Data
Então o usuario preenche o formulário na aba “Enter Insurant Data”
E clica no botão <next> para Insurant Data
Então o usuário preenche o formulário na aba “Enter Product Data”
E clica no botão <next> para Product Data
Então o usuário preenche o formulário na aba “Select Price Option”
E clica no botão <next> para Price Option
Então o usuário preenche o formulário na aba “Send Quote”
E clica no botão <send>
Então deve aparecer na tela a mensagem <resultado>


Exemplos:
	|	site																					|next		|send		|resultado 								|
	|	"http://sampleapp.tricentis.com/101/app.php"	|"next"	|"send"	|"Sending e-mail success!"|
	
	
	
	
	