# JPA/Hibernate

## Sistemas de Informação - DCOMP/IFMA

🎓 Atividade de Laboratório de Banco de Dados II - Prof.: Joao Carlos Pinheiro

⚡ Para esta atividade foi criado um projeto Maven, afim de fazer um desenvolvimento de uma camada de acesso a dados com JPA/Hibernate para um fragmento de um sistema de Transportadora.

🛠 Ferramentas e Tecnologias
- Java
- MySql
- IntelliJ IDEA

📋 Funcionalidades

📌 Modelo de banco de dados do sistema de Frete a ser considerado: <br>
 [https://ibb.co/0cRtbHk](https://ibb.co/0cRtbHk)
 
✔ Cadastrar clientes, contendo os dados: nome, endereço e telefone;

✔ Cadastrar cidades, que representam os lugares abrangidos pela empresa de
transportes e contêm o nome da cidade, o estado a que pertence, e o valor
para a taxa de entrega;

✔ Cadastrar fretes, contendo um código, uma descrição, o peso total, um
cliente e a cidade de destino, não podendo haver um frete sem os dados
citados.

✔ Recuperar o valor do frete, que deve ser calculado através do peso
multiplicado por um valor fixo (por exemplo R$ 10,00), acrescido da taxa de
entrega associada a cada cidade de destino.

✔ Recuperar uma lista com todos os fretes de um determinado cliente

📈 Requisitos

- Implementar todos os mapeamentos entidades.

- Implementar a camada de acesso a dados com os CRUDs. Não é preciso implementar
a operação de exclusão.

- Para cada funcionalidade deverá ser disponibilizada uma classe com um método
main() que fará acesso a sua camada de acesso a dados.
