Aqui está o README atualizado:

---

# Sistema de Gerenciamento de Alunos 📚

Este é um projeto simples desenvolvido em **Java** utilizando **JPA (Hibernate)** com banco de dados **H2**. O objetivo é implementar um sistema básico de gerenciamento de alunos.

## 🚀 Tecnologias Utilizadas

- **Java 21**
- **JPA (Hibernate)**
- **Banco de dados H2 (em arquivo)**
- **Maven**

___

## 📌 Objetivo do Projeto

Este projeto faz parte da atividade prática da disciplina **Programação para WEB 3**. Ele serve como uma introdução ao uso do **JPA puro**, sem a utilização de **Spring**, visando entender os conceitos básicos de persistência e mapeamento objeto-relacional antes de avançar para o framework.

___

## 🛠️ Como Executar

1. Clone o repositório:
   ```sh
   git clone git@github.com:gusmaomatheus/students-management-jpa.git
   cd seu-repositorio
   ```
2. Compile e execute o projeto com Maven:
   ```sh
   mvn clean install
   mvn exec:java
   ```
   
___

## 🔍 Como Visualizar as Alterações no Banco

O banco de dados **H2** está armazenado em um arquivo localizado na pasta `./data/db`. Para acessar os dados diretamente:

1. Baixe o **JAR do H2 Database** [neste link](https://h2database.com/html/download.html).
2. Use o seguinte comando para abrir um terminal SQL conectado ao banco:
   ```sh
   java -cp path/h2-2.3.232.jar org.h2.tools.Shell
   ```
3. Insira os seguintes dados quando solicitado:
    - **URL JDBC:** `jdbc:h2:./data/db`
    - **Usuário:** `admin`
    - **Senha:** `admin`

___

## 📜 Considerações

- Esta implementação segue apenas os requisitos básicos da atividade.
- O projeto não utiliza **Spring**, pois o foco é o aprendizado de **JPA puro**.
- Futuramente, o sistema poderá ser refatorado para incluir **Spring Boot** e boas práticas de desenvolvimento.

___

## 📝 Licença

Este projeto é apenas para fins educacionais e não possui licença específica.
