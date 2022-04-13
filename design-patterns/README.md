# Padrões de projeto em Java.

"Padrões decrevem um problema que ocorre frequentemente, junto com a
 solução adotada para o problema". Christopher Alexander, 1977.

O criador dos padrões de projeto é o arquiteto e professor Christopher
Alexander que os descreve no livro ["A Pattern Language"
(1977)](https://goo.gl/BTpHAH). Porém, o livro que marcou a utilização
de padrões em software é ["Padrões de Projeto"](https://goo.gl/CPzgDF)
de Gamma, Helm, Johnson, Vlissides, também chamados de a Gang dos
Quatro (GoF - _Gang_ _of_ _Four_).

Padrões de projeto são a utilização de algoritmos+estrutura de
dados+classes para descrever uma solução para um problema recorrente
de projeto de software (orientado a objeto). Com a descrição começa a se
formar um *vocabulário*.

Os padrões de projeto são aplicados em um contexto bem específico,
não são projetos completos, classes individuais, bibliotecas ou
estrutura de dados como listas ou _hash_ _tables_.

## Elementos de um padrão de projeto

1. Nome do padrão
- Parte útil do vocabulário do projeto

2. Problema solucionado e aplicação
- Quando aplicar o padrão

3. Solução
- Participantes e seus relacionamentos
 
4. Consequências
- Relação custo/benefício de aplicação do padrão

## Alguns exemplos de padrões de projeto

|Objetivo      | Padrão de projeto                                     | Aspecto que pode variar                |
|--------------|-------------------------------------------------------|----------------------------------------|
|Criação       |                                                       |                                        |
|              | [singleton](src/creational/singleton)                 | a única instância de uma classe        |
|              | [abstract factory](src/creational/abstractfactory)    | famílias de objetos-produto            |
|              | [factory](src/creational/factory)                     | subclasse de objeto que instanciada    |
|              | [builder](src/creational/builder)                     | como um objeto composto é criado       |
|Estrutura     |                                                       |                                        |
|              | [adapter](src/structural/adapter)                     | interface para um objeto               |
|              | [composite](src/structural/composite)                 | estrutura e composição de um objeto    |
|Comportamental|                                                       |                                        |
|              | [memento](src/behavioral/memento)                     | que é informação é armazenada e quando |
|              | [strategy](src/behavioral/strategy)                   | um algoritmo                           |

O código fonte do projeto pode ser aberto usado o IDE Netbeans.

## Referências

- Erich Gamma,‎ Richard Helm,‎ Ralph Johnson,‎ John Vlissides. "Design
  Patterns: Elements of Reusable Object-Oriented
  Software". Addison-Wesley Professional, 1994.

- [Design Patterns in Java
  Tutorial](https://www.tutorialspoint.com/design_pattern/index.htm).
  Accessed in 2018-05-16.
