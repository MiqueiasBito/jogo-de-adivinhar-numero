# Jogo de Adivinhar Número

Jogo de terminal em Java em que o computador sorteia um número de 1 a 100
e o jogador tenta adivinhar dentro de um número limitado de chances.

Projeto baseado no desafio [Number Guessing Game](https://roadmap.sh/projects/number-guessing-game)
do roadmap.sh.

## Funcionalidades

- Três níveis de dificuldade: Fácil (10 chances), Médio (5) e Difícil (3)
- Dicas de "maior" ou "menor" a cada palpite, com as chances restantes
- Revelação do número ao fim das chances
- Opção de jogar novamente

## Como executar

Requer o JDK 11 ou mais recente. Na raiz do projeto:

    java src/Main.java

## O que pratiquei

- Entrada de dados com `Scanner`
- Laços `do-while` com condição composta (`&&`)
- `switch` com a sintaxe de setas
- Organização do código em métodos com parâmetros e retorno
- Versionamento com Git e GitHub