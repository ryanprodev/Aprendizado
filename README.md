# 🚀 Jornada de Estudos em Java
#### Do começo ao programador! Tudo que aprendi em algumas linhas.

## Conteúdo Aprendido 📖
#### A_Fundamentos da linguagem
- [x] Lógica de programação
- [x] Variáveis
- [x] Comentários
- [x] Tipos primitivos
- [x] Operadores
- [x] Laços condicionais
- [x] Estrutura de repetição
- [ ] Arrays

#### Programação Orientada a Objetos (POO)
- [ ] Classes
- [ ] Objetos
- [ ] Métodos
- [ ] Modificadores de acesso
- [ ] Sobrecarga de Métodos
- [ ] Construtores
- [ ] Blocos de Inicialização
- [ ] Associação
- [ ] Leitura de dados pelo console
- [ ] Herança
- [ ] Modificador final
- [ ] Enumeração
- [ ] Classe Abstrata
- [ ] Interface
- [ ] Polimorfismo
#### Tópicos avançados
- [ ] Wrappers
- [ ] Exceptions
- [ ] Strings

# ☕ Guia de Operadores em Java

Um resumo rápido dos principais operadores da linguagem Java para consulta diária.

## 1. Operadores Aritméticos
Usados para realizar operações matemáticas básicas.

| Operador | Descrição | Exemplo | Resultado |
| :---: | :--- | :--- | :--- |
| `+` | Adição | `5 + 2` | `7` |
| `-` | Subtração | `5 - 2` | `3` |
| `*` | Multiplicação | `5 * 2` | `10` |
| `/` | Divisão | `5 / 2` | `2` (inteiro) |
| `%` | Módulo (Resto) | `5 % 2` | `1` |

---

## 2. Operadores Relacionais
Comparam dois valores e retornam um valor booleano (`true` ou `false`).

| Operador | Descrição | Exemplo | Resultado |
| :---: | :--- | :--- | :--- |
| `==` | Igual a | `5 == 5` | `true` |
| `!=` | Diferente de | `5 != 2` | `true` |
| `>` | Maior que | `5 > 2` | `true` |
| `<` | Menor que | `5 < 2` | `false` |
| `>=` | Maior ou igual a | `5 >= 5` | `true` |
| `<=` | Menor ou igual a | `2 <= 5` | `true` |

---

## 3. Operadores Lógicos
Usados para combinar expressões booleanas.

| Operador | Descrição | Exemplo | Resultado |
| :---: | :--- | :--- | :--- |
| `&&` | E lógico (AND) | `true && false` | `false` |
| `\|\|` | OU lógico (OR) | `true \|\| false` | `true` |
| `!` | Negação (NOT) | `!true` | `false` |

---

## 4. Laços Condicionais
Permitem que o programa tome decisões e execute diferentes blocos de código com base em condições.

| Estrutura | Descrição | Exemplo |
| :--- | :--- | :--- |
| `if` / `else` | Executa um bloco se a condição for verdadeira, senão executa outro. | `if (idade >= 18) { ... } else { ... }` |
| `else if` | Testa múltiplas condições em sequência. | `if (nota >= 9) { ... } else if (nota >= 7) { ... }` |
| `switch` | Seleciona um bloco de código dentre vários com base no valor de uma variável. | `switch (opcao) { case 1: ... break; }` |

---

## 5. Estruturas de Repetição (Loops)
Usadas para repetir um bloco de código várias vezes enquanto uma condição for verdadeira.

| Estrutura | Quando usar | Exemplo |
| :--- | :--- | :--- |
| `for` | Quando você **sabe** exatamente quantas vezes quer repetir algo. | `for (int i = 0; i < 10; i++) { ... }` |
| `while` | Quando você **não sabe** o número de repetições, mas a condição é testada *antes*. | `while (contador < 5) { ... }` |
| `do-while` | Igual ao `while`, mas garante que o bloco execute **pelo menos uma vez** antes de testar. | `do { ... } while (condicao);` |