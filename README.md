# 🛒 Sistema de Vendas em Java

Projeto desenvolvido em Java com o objetivo de aplicar conceitos de **Programação Orientada a Objetos**, organização em camadas, herança, classes abstratas, interfaces, enums, exceções e boas práticas de desenvolvimento.

O sistema simula uma aplicação de vendas, permitindo o gerenciamento de clientes, fornecedores, produtos, pedidos, funcionários, estoque e pagamentos.

---

## 🚀 Funcionalidades

### 👤 Clientes
- Cadastro de clientes
- Busca de cliente por ID
- Remoção de clientes
- Alteração de endereço
- Alteração de telefone
- Listagem de clientes
- Validação de CPF

### 🏢 Fornecedores
- Cadastro de fornecedores
- Busca por ID
- Remoção de fornecedores
- Listagem de fornecedores
- Validação de fornecedores

### 📦 Produtos
O sistema possui diferentes tipos de produtos:

- Eletrônicos
- Roupas
- Alimentos

Cada categoria possui características específicas.

#### Eletrônicos
- Marca
- Modelo
- Garantia
- Voltagem
- Regra específica de frete

#### Roupas
- Tamanho
- Cor
- Material

#### Alimentos
- Data de validade
- Peso
- Cálculo de peso total

### 🛍️ Pedidos
- Criação de pedidos
- Adição de produtos
- Remoção de produtos
- Alteração de quantidade
- Cálculo do subtotal
- Cálculo do peso total
- Cálculo do frete
- Cálculo do valor total
- Controle de status do pedido

### 💳 Pagamentos

O sistema possui diferentes formas de pagamento:

- PIX
- Cartão
- Boleto

Cada forma possui regras próprias para cálculo do valor final.

#### PIX
- Desconto percentual

#### Cartão
- Parcelamento
- Juros

#### Boleto
- Desconto
- Multa por atraso
- Data de vencimento

Também é possível:

- Processar pagamento
- Verificar se foi processado
- Cancelar pagamento

### 👨‍💼 Funcionários
- Cadastro de funcionários
- Busca por matrícula
- Alteração de salário
- Alteração de cargo
- Cálculo de média salarial
- Listagem de funcionários

### 📦 Estoque
- Controle da quantidade de produtos
- Entrada de produtos
- Saída de produtos
- Atualização de estoque

---

## 🏗️ Arquitetura

O projeto foi organizado em diferentes camadas para separar responsabilidades:

```text
src
├── Application
│   └── Main.java
│
├── Domain
│   ├── Cliente.java
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
├── Infrastructure
│   ├── ClienteRepositorio.java
│   ├── FornecedorRepositorio.java
│   ├── ProdutoRepositorio.java
│   ├── PedidoRepositorio.java
│   └── ...
│
├── Service
│   ├── ClienteServico.java
│   ├── FornecedorServico.java
│   ├── ProdutoServico.java
│   ├── PedidoServico.java
│   ├── FuncionarioServico.java
│   ├── EstoqueServico.java
│   └── PagamentoServico.java
│
├── Presentation
│   ├── MenuPrincipal.java
│   ├── ClienteMenu.java
│   ├── FornecedorMenu.java
│   ├── ProdutoMenu.java
│   ├── PedidoMenu.java
│   └── PagamentoMenu.java
│
└── Exception
    └── ...
