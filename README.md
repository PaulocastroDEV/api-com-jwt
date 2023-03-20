# Consumo de Api Externa de Tempo

Este é um projeto com Spring boot que tem a finalidade de aplicar segurança em uma aplicação com jwt(json web token)

## Tecnologias Utilizadas

 Java 17
 
 Spring 2.7.9
 

## Como Executar o Projeto

 Para executar o projeto, basta seguir as seguintes etapas:

 1. Faça o clone do projeto em sua máquina local;
 
 2. Abra o projeto em sua IDE preferida e faça a compilação do mesmo;
 
 3. Execute o projeto em sua IDE ou via linha de comando;
 
## Uso

 1. Inicie o servidor de aplicação
 
 2. acesse a rota http://localhost:8080/auth/register para registrar um usuário no padrão
 
	{
	    "firstname":"PAULO",
	    "lastname":"gustavo",
	    "email":"paulo120@gmail.com",
	    "password":"123456"
	}

 3. Acessa rota de authenticação http://localhost:8080/auth/authenticate para se authenticar e liberar as rotas

	{
	    "email":"paulo120@gmail.com",
	    "password":"123456"
	}
	
 4.  Acesse a rota http://localhost:8080/test via postman no authorization selecionando a opção bearer token e colocando o token ;

## Autor

 Paulo Gustavo