# analise-credito

## Sobre o projeto
Sistema onde o usuário envia uma proposta para solicitar um emprestimo em uma empresa. Após o envio da proposta, ela será analisada e o usuário receberá uma notificação via SMS informando se a proposta foi aprovada ou não.

O projeto possui 3 microsserviços que se comunicam entre si de forma assíncrona através do RabbitMQ:
- proposta-app
- notificacao
- analise-credito

## Tecnologias utilizadas
- Java 17
- Spring 
- PostgreeSQL
- Docker
- RabbitMQ
- Amazon SNS

## Subindo o front-end
Para subir o container do front-end da aplicação, execute o comando: 
```sh
docker run -d -p 80:80 --name proposta-web-container matheuspieropan/proposta-web
```
## Subindo o PostgreSQL
Execute esse comando para subir o container docker do PostgreSQL:
```sh
docker run --name postgres-container -d -e POSTGRES_PASSWORD=123 -e POSTGRES_DB=propostadb -p 5432:5432 -e POSTGRES_USER=root postgres
```
## Subindo o RabbitMQ
Execute esse comando para subir o container docker do RabbitMQ:
```sh
docker run -d -p 5672:5672 -p 15672:15672 --name my-rabbit rabbitmq:3-management
```
