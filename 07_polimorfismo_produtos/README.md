# Polimorfismo com herança — Produtos

Esta pasta reproduz a **ideia da oficina** usada em aula para revisar POO e polimorfismo.

## Hierarquia

```text
                 Produto
                /       \
ProdutoNaoPerecivel    ProdutoPerecivel
```

## O que observar no código

1. `ProdutoPerecivel extends Produto`.
2. `ProdutoNaoPerecivel extends Produto`.
3. As subclasses podem sobrescrever `valorVenda()`.
4. Uma variável `Produto` pode receber objetos das duas subclasses.
5. Ao chamar `valorVenda()`, o método executado depende do objeto real.

## Regras do perecível usadas aqui

- não aceitar data de validade anterior à data atual;
- não permitir `valorVenda()` se já estiver vencido;
- aplicar 25% de desconto se faltarem 7 dias ou menos.

## Sobre exceções

O material da oficina descreve as regras, mas não especifica qual classe de exceção deve ser usada.
Neste exemplo:

- `IllegalArgumentException` é usada para cadastro com data inválida;
- `IllegalStateException` é usada ao tentar obter o valor de venda de um produto vencido.

Isso é uma escolha de implementação do material de estudo.
