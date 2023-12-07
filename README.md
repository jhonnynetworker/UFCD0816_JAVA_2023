# Exercício: Desenvolver uma Aplicação JAVA de Gestão de Tarefas com Spring Boot 

## Objetivo

Este exercício tem como objetivo permitir que os alunos apliquem conceitos basicos do Spring Boot. Eles irão configurar um projeto Spring Boot para criar uma aplicação de gestão de tarefas. O exercício também inclui a criação de uma interface de usuário em HTML, CSS e JavaScript.

## Instruções para os Alunos

Para realizar este exercício, siga as instruções abaixo:

1. **Configuração do Projeto:** Configure um novo projeto Spring Boot no seu ambiente de desenvolvimento. Utilize o [Spring Initializer](https://start.spring.io/) para criar o projeto com as dependências necessárias, como o Spring Web, o Spring Data JPA e o Thymeleaf para a renderização de páginas web.

2. **Classe de Modelo:** Crie uma classe `Tarefa` para representar uma tarefa. A classe `Tarefa` deve conter campos como `id`, `título`, `descrição`, `data de vencimento` e `concluída`.

3. **Persistência de Dados:** Crie um repositório (interface) para a classe `Tarefa` e configure-o para comunicar com uma base de dados H2 (ou outra base de dados de sua escolha) para a persistência dos dados.

4. **Controlador Spring MVC:** Implemente um controlador Spring MVC para criar, listar, atualizar e excluir tarefas. Os métodos do controlador devem ser anotados com `@RequestMapping`, `@GetMapping`, `@PostMapping`, `@PutMapping` e `@DeleteMapping` conforme necessário.

5. **Interface de Utilizador Web:** Crie uma página web (HTML, CSS e JavaScript) que permita aos utilizadores visualizar a lista de tarefas, adicionar novas tarefas, marcar tarefas como concluídas e excluir tarefas.

6. **Lógica de Negócios:** Implemente um serviço que lide com a lógica de negócios para as tarefas, como adicionar, listar, atualizar e excluir tarefas.

7. **API RESTful:** Configure um endpoint RESTful para fornecer a funcionalidade de API REST para a sua aplicação. Utilize `@RestController` e `@RequestMapping` para definir os endpoints.

8. **Teste e Depuração:** Teste e depure a aplicação à medida que avança. Utilize as funcionalidades de depuração da sua ferramenta de desenvolvimento.

9. **Controle de Versão:** Faça commits regulares no seu repositório Git à medida que trabalha no projeto para acompanhar o progresso.

10. **Entrega:** Cada aluno deverá enviar o seu projeto para o repositório central. Para isso, siga as instruções detalhadas nas observações.

## Observações

Este exercício é uma excelente oportunidade para aplicar o que você aprendeu e criar uma aplicação de gestão de tarefas funcional. Você deve enviar a entrega do exercício para o repositório central [UFCD0816_JAVA_2023](https://github.com/Programadores-2Ano/UFCD0816_JAVA_2023) por meio de um pull request a partir do seu fork do repositório.

---
Lembre-se de que este exercício é uma excelente oportunidade para aplicar o que aprendeu e também para integrar uma interface de utilizador utilizando HTML, CSS e JavaScript. Pode utilizar frameworks JavaScript como o Vue.js, React ou Angular, ou mesmo JavaScript puro, para criar a interatividade na página web. Use a sua criatividade para tornar a sua lista de tarefas amigável e funcional.
