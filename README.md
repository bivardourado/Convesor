# Documentação do Projeto de Conversão de Moedas

## Introdução
Este projeto é uma aplicação Java que permite ao usuário converter valores entre dólar e real. A aplicação oferece duas opções de conversão: dólar para real e real para dólar. A cotação atual da moeda é buscada a partir de uma API externa.

## Dependências
Para rodar este projeto, é necessário ter o Java instalado na máquina. Além disso, é preciso uma conexão com a internet para acessar a API de cotação de moedas.

## Uso
Ao iniciar a aplicação, o usuário é apresentado com duas opções:
- Converter dólar para real
- Converter real para dólar

O usuário deve informar a opção desejada e a quantidade de dinheiro que deseja converter. Em seguida, a aplicação realiza o cálculo da conversão e exibe o resultado na tela.

## Métodos
O código da aplicação é composto pelos seguintes métodos:
- `main`: é o método principal da aplicação. Aqui é feita a interação com o usuário, onde ele escolhe a opção de conversão e informa a quantidade de dinheiro que deseja converter.

- `getCotacao`: é o método responsável por buscar a cotação atual da moeda. Neste exemplo, a cotação é fixa, mas é possível implementar a busca real da cotação a partir de uma API externa.

## Conclusão
Este projeto de conversão de moedas é uma aplicação simples e fácil de usar, que permite ao usuário realizar conversões entre dólar e real de maneira rápida e precisa. Além disso, a implementação da busca da cotação atual a partir de uma API externa torna a aplicação ainda mais útil e precisa.
