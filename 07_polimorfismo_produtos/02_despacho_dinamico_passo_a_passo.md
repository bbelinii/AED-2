# Despacho dinâmico — passo a passo

Considere:

```java
Produto p;
p = new ProdutoPerecivel(...);
double valor = p.valorVenda();
```

## O que acontece

1. O compilador verifica se `Produto` possui o método `valorVenda()`.
2. Possui, então a chamada é válida.
3. Em tempo de execução, Java olha o objeto real apontado por `p`.
4. O objeto é `ProdutoPerecivel`.
5. Como `ProdutoPerecivel` sobrescreve `valorVenda()`, essa implementação é executada.

Se depois fizermos:

```java
p = new ProdutoNaoPerecivel(...);
p.valorVenda();
```

agora o objeto real mudou e outra implementação pode ser usada.
