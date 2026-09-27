# Herança, sobrescrita e polimorfismo

## Herança

```java
class ProdutoPerecivel extends Produto
```

`ProdutoPerecivel` herda os membros acessíveis de `Produto`.

## Sobrescrita

```java
@Override
public double valorVenda() { ... }
```

A subclasse fornece uma nova implementação para um método herdado.

## Polimorfismo

```java
Produto p = new ProdutoPerecivel(...);
p.valorVenda();
```

A variável é do tipo `Produto`, mas o objeto criado é `ProdutoPerecivel`.
A implementação de `ProdutoPerecivel.valorVenda()` é a executada.

## Não confundir com sobrecarga

Sobrecarga é ter métodos de mesmo nome com parâmetros diferentes.
Exemplo dos construtores:

```java
Produto(String desc, double custo)
Produto(String desc, double custo, double margem)
```

Isso não é a mesma coisa que sobrescrita.
