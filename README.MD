# ☕ Praticando Java - Orientação a Objetos

Este repositório contém exercícios práticos desenvolvidos durante meus estudos de **Java** com foco em **Programação Orientada a Objetos (POO)**. Cada pacote representa um mini-projeto com classes, atributos e métodos, reforçando os conceitos fundamentais da linguagem.

---

## 🧠 Conceitos Praticados

- Criação de **classes** com responsabilidades bem definidas
- Uso de **atributos** para armazenar dados dos objetos
- Implementação de **métodos** para manipular comportamentos
- Estudo de **encapsulamento** com uso de `private`, `getters` e `setters`
- Organização do projeto em **pacotes** e separação de responsabilidades
- Execução através de classes `Principal.java` (com método `main`)
- Simulação de operações simples com objetos reais

---

## 🗂️ Estrutura do Projeto

```bash
📦 PRATICANDO JAVA ORIENTAÇÃO A OBJETOS
├── Cadastro/
│   ├── Carro.java
│   └── Principal.java
│
├── ControleEstoque/
│   └── Principal.java
│
├── CarrinhoDeCompras/
│   └── Principal.java
│
├── CalculaNota/
│   └── Principal.java
│
├── encapsulamento/
│   ├── Funcionario.java
│   └── Principal.java
│
├── Estoque/
│   └── Principal.java
│
├── Multa/
│   └── Principal.java
│
├── RelatorioDoProduto/
│   ├── Produto.java
│   └── Principal1.java
│
├── ResumoLivro/
│   ├── Livro.java
│   └── Principal.java
│
├── Tarefas/
│   └── Principal.java
│
├── Temperatura/
│   └── Principal.java
│
├── ZeraSaldo/
│   ├── Conta.java
│   └── Principal.java
│
└── README.md
📌 Descrição dos Pacotes
🔹 Cadastro/
Simula o cadastro de um carro com modelo, placa e ano.
Praticado: criação de construtor, métodos getters/setters, encapsulamento.

🔹 ControleEstoque/
Controla a quantidade de produtos em estoque.
Praticado: métodos de entrada e saída de itens.

🔹 CarrinhoDeCompras/
Criação de um carrinho com nome, preço e quantidade.
Praticado: composição de objetos e lógica de soma de preços.

🔹 CalculaNota/
Calcula média de notas de um aluno.
Praticado: entrada de dados, média aritmética, validação.

🔹 encapsulamento/
Utiliza classe Funcionario para mostrar encapsulamento na prática.
Praticado: uso de modificadores private, métodos de acesso e modificação (get/set).

🔹 Estoque/
Controle simples de produtos.
Praticado: lógica de verificação e impressão de dados.

🔹 Multa/
Cálculo de multas de trânsito baseado em velocidade.
Praticado: lógica condicional com métodos.

🔹 RelatorioDoProduto/
Exibe relatório com nome, descrição e valor.
Praticado: criação de objeto e formatação de saída.

🔹 ResumoLivro/
Exibe resumo de livros com título, autor e páginas.
Praticado: encapsulamento e saída formatada.

🔹 Tarefas/
Simula organização de tarefas.
Praticado: manipulação de dados e exibição.

🔹 Temperatura/
Conversão de temperatura entre Celsius e Fahrenheit.
Praticado: criação de métodos e cálculos.

🔹 ZeraSaldo/
Gerencia uma conta com saldo e zera valor.
Praticado: métodos void, alteração de valores e encapsulamento simples.

✅ Exemplos Práticos
Exemplo de encapsulamento:

private String modelo;

public String getModelo() {
    return modelo;
}

public void setModelo(String modelo) {
    this.modelo = modelo;
}
Exemplo de método:

public void zerarSaldo() {
    this.saldo = 0;
}
🚀 Tecnologias Utilizadas
Java 17+

Visual Studio Code com extensão Java (Language Support for Java)

Conhecimentos de Orientação a Objetos

📚 Aprendizados
✔️ Estruturação de projetos em pacotes
✔️ Separação de responsabilidades por classe
✔️ Prática da lógica de programação com objetos reais
✔️ Entendimento do encapsulamento
✔️ Estudo e prática de métodos
✔️ Execução passo a passo no Java com main()

🧠 Estudo constante e prática diária são as chaves para a evolução.

🚀 Em breve mais projetos em Java, com foco em back-end e frameworks como Spring Boot.