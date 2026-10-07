# Sistema de Vendas em Java

Projeto desenvolvido em Java com foco em Programação Orientada a Objetos (POO), simulando um sistema de vendas com gerenciamento de clientes, fornecedores, produtos, pedidos, pagamentos, funcionários e estoque.

## 📌 Funcionalidades

O sistema permite:

* Cadastro, consulta, alteração e remoção de clientes
* Cadastro e gerenciamento de fornecedores
* Cadastro de produtos
* Produtos de diferentes categorias:

  * Eletrônicos
  * Roupas
  * Alimentos
* Controle de quantidade em estoque
* Criação e gerenciamento de pedidos
* Adição e remoção de produtos dos pedidos
* Cálculo de subtotal, frete e valor total
* Diferentes formas de pagamento:

  * Pix
  * Cartão
  * Boleto
* Processamento e cancelamento de pagamentos
* Gerenciamento de funcionários
* Operações relacionadas ao estoque
* Validações e tratamento de exceções

## 🏗️ Estrutura do Projeto

O projeto foi organizado seguindo uma separação de responsabilidades:

```text
src/
├── Application/
│   └── Main.java
│
├── Domain/
│   ├── Cliente.java
│   ├── Endereco.java
│   ├── Fornecedor.java
│   ├── Produto.java
│   ├── Eletronico.java
│   ├── Roupa.java
│   ├── Alimento.java
│   ├── Pedido.java
│   ├── ItemPedido.java
│   ├── Pagamento.java
│   ├── Pix.java
│   ├── Cartao.java
│   ├── Boleto.java
│   └── ...
│
├── Infrastructure/
│   ├── ClienteRepositorio.java
│   ├── FornecedorRepositorio.java
│   ├── ProdutoRepositorio.java
│   ├── PedidoRepositorio.java
│   └── ...
│
├── Service/
│   ├── ClienteServico.java
│   ├── FornecedorServico.java
│   ├── ProdutoServico.java
│   ├── PedidoServico.java
│   └── ...
│
├── Presentation/
│   ├── MenuPrincipal.java
│   ├── ClienteMenu.java
│   ├── ProdutoMenu.java
│   ├── PedidoMenu.java
│   └── ...
│
└── Exception/
    └── ...
```

### Responsabilidade das camadas

**Domain:** contém as entidades e regras relacionadas aos objetos do sistema.

**Infrastructure:** contém os repositórios responsáveis pelo armazenamento dos dados em memória utilizando `ArrayList`.

**Service:** contém as regras de negócio e faz a comunicação entre a apresentação, os repositórios e o domínio.

**Presentation:** contém os menus utilizados para interação com o usuário através do terminal.

**Application:** contém a classe `Main`, responsável por inicializar o sistema e suas dependências.

**Exception:** contém as exceções personalizadas utilizadas para tratar situações inválidas.

## 💻 Tecnologias e conceitos utilizados

* Java
* Programação Orientada a Objetos (POO)
* Encapsulamento
* Herança
* Polimorfismo
* Abstração
* Classes abstratas
* Interfaces
* Enum
* Construtores
* Sobrescrita de métodos (`@Override`)
* `ArrayList`
* `List`
* `LocalDate`
* `instanceof`
* Exceções personalizadas
* Repository Pattern
* Service Layer
* Separação de responsabilidades

## 📦 Armazenamento dos dados

O projeto utiliza repositórios em memória através de `ArrayList`.

Exemplo:

```java
private List<Fornecedor> listaFornecedores;

public FornecedorRepositorio() {
    listaFornecedores = new ArrayList<>();
}
```

Nesse caso, `List` é a interface e `ArrayList` é a implementação utilizada.

Como os dados são armazenados apenas em memória, eles são perdidos quando o programa é encerrado.

## 💰 Cálculo de pedidos

O sistema realiza cálculos automaticamente para os pedidos.

O subtotal é calculado a partir dos produtos e suas respectivas quantidades.

O frete considera o peso dos produtos alimentícios:

```text
Frete = 10 + (peso total × 2)
```

O valor total do pedido é:

```text
Total = Subtotal + Frete
```

Também existem regras específicas para cada forma de pagamento, como descontos no Pix, juros no cartão e descontos/multas no boleto.

## ▶️ Como executar o projeto

### 1. Clone o repositório

No terminal, execute:

```bash
git clone URL_DO_SEU_REPOSITORIO
```

Depois, entre na pasta do projeto:

```bash
cd nome-do-projeto
```

### 2. Abra o projeto na IDE

O projeto pode ser aberto em uma IDE compatível com Java, como:

* IntelliJ IDEA
* Eclipse
* Visual Studio Code

### 3. Localize a classe `Main`

A classe principal está dentro do pacote:

```text
Application
```

Ela contém o método:

```java
public static void main(String[] args)
```

### 4. Execute o projeto

Execute o arquivo:

```text
Application/Main.java
```

A aplicação será iniciada no terminal e o `MenuPrincipal` será apresentado.

### 5. Utilize o menu

A partir do menu principal, é possível acessar as funcionalidades de clientes, fornecedores, produtos, pedidos, pagamentos e demais operações disponíveis no sistema.

> **Observação:** como o projeto utiliza armazenamento em memória com `ArrayList`, os dados cadastrados durante a execução não permanecem após o encerramento da aplicação.

## 🎯 Objetivos de Aprendizagem

O principal objetivo do projeto é aplicar, na prática, conceitos fundamentais de Programação Orientada a Objetos utilizando Java.

Durante o desenvolvimento, foram trabalhados os seguintes conhecimentos:

* Compreender e aplicar os princípios de Programação Orientada a Objetos;
* Criar e utilizar classes, objetos, atributos e métodos;
* Aplicar encapsulamento através de modificadores de acesso e métodos getters/setters;
* Utilizar herança para representar diferentes tipos de produtos e pagamentos;
* Aplicar polimorfismo através de classes abstratas e sobrescrita de métodos;
* Trabalhar com classes abstratas e métodos abstratos;
* Utilizar `enum` para representar categorias e estados;
* Manipular coleções utilizando `List` e `ArrayList`;
* Trabalhar com datas utilizando `LocalDate`;
* Criar exceções personalizadas para validação das regras do sistema;
* Separar responsabilidades entre as diferentes camadas da aplicação;
* Aplicar o padrão Repository para gerenciamento dos dados;
* Aplicar uma camada de Service para centralizar regras de negócio;
* Desenvolver uma aplicação interativa utilizando menus no terminal;
* Praticar organização e estruturação de um projeto Java.

## 📚 Objetivo do Projeto

Este projeto foi desenvolvido com finalidade acadêmica, buscando consolidar os conhecimentos de Java e Programação Orientada a Objetos através da construção de uma aplicação completa de gerenciamento de vendas.

A proposta foi aplicar os conceitos estudados em uma situação prática, criando uma estrutura organizada e preparada para futuras evoluções, como a substituição do armazenamento em memória por um banco de dados.

## 👨‍💻 Autor

**Guilherme Milani**

Projeto desenvolvido para fins acadêmicos.
