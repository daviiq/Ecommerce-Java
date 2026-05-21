# 🛒 Ecommerce Java

Projeto de Ecommerce desenvolvido em Java utilizando conceitos de Programação Orientada a Objetos (POO).

O sistema simula um pequeno ecommerce em modo console, permitindo:

- Listagem de produtos
- Adição e remoção de produtos do carrinho
- Finalização de pedidos
- Escolha de forma de pagamento
- Atualização de status do pedido

---

# 📚 Conceitos utilizados

O projeto utiliza diversos conceitos importantes de Java e POO:

- Classes e Objetos
- Encapsulamento
- Interfaces
- Herança
- Enum
- Listas (`ArrayList`)
- Métodos Getter e Setter
- Organização em pacotes
- Separação de responsabilidades
- Estrutura de Ecommerce

---

# 📂 Estrutura do Projeto

```text
src/
│
├── application/
│   └── Sistema.java
│
├── entities/
│   ├── Carrinho.java
│   ├── Cliente.java
│   ├── Estoque.java
│   ├── FinalizarPedido.java
│   ├── ItemPedido.java
│   ├── Pedido.java
│   ├── Produto.java
│   └── ...
│
├── repository/
│   └── PagamentoRepository.java
│
└── services/
    ├── InterfaceUsuario.java
    ├── Pagamento.java
    ├── Status.java
    └── ...
```

---

# ⚙️ Funcionalidades

## ✅ Listar produtos

O sistema exibe os produtos disponíveis no estoque.

---

## ✅ Adicionar produtos no carrinho

O usuário pode:

- buscar produtos pelo nome
- visualizar preço
- adicionar produtos ao carrinho

---

## ✅ Gerenciar carrinho

O carrinho permite:

- visualizar produtos
- remover itens específicos
- limpar completamente o carrinho

---

## ✅ Finalizar pedido

Ao finalizar a compra:

- os dados do cliente são utilizados
- os produtos são convertidos em itens do pedido
- a forma de pagamento é escolhida
- o pedido é processado

---

## ✅ Status do pedido

O sistema atualiza automaticamente o status do pedido:

```text
PROCESSANDO
→ CONFIRMADO
→ ENVIADO
→ ENTREGUE
```

---

# 💳 Formas de pagamento

O sistema possui suporte para:

- Pix
- Cartão
- Boleto

---

# 🚀 Como executar o projeto

## 1️⃣ Clone o repositório

```bash
git clone https://github.com/seu-usuario/seu-repositorio.git
```

---

## 2️⃣ Abra o projeto

Você pode utilizar:

- IntelliJ IDEA
- Eclipse
- VSCode
- GitHub Codespaces

---

## 3️⃣ Execute a classe principal

Execute:

```text
Sistema.java
```

---

# 🖥️ Exemplo do sistema

```text
1- Listar produtos disponíveis para compra
2- Adicionar produto(s) no carrinho
3- Verificar o carrinho
4- Efetuar compra dos itens do carrinho
5- Status do(s) pedido(s)
6- Sair
```

---

# 🛠️ Melhorias futuras

Ideias para futuras versões:

- Sistema de login
- Banco de dados
- Estoque dinâmico
- Quantidade de produtos
- Cupom de desconto
- Interface gráfica com Swing
- Persistência de pedidos
- Geração de nota fiscal

---

# 👨‍💻 Autor

Projeto desenvolvido por Davi Israel Quirino para fins acadêmicos e aprendizado em Java.
