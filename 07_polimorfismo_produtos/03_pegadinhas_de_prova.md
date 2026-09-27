# Pegadinhas de prova — polimorfismo

## 1. Tipo da referência x tipo do objeto

```java
Produto p = new ProdutoPerecivel(...);
```

- tipo da referência: `Produto`;
- tipo do objeto: `ProdutoPerecivel`.

## 2. Método sobrescrito
O método de instância sobrescrito é escolhido pelo tipo **real do objeto**.

## 3. Construtor não é sobrescrito
Construtores podem ser sobrecarregados, não sobrescritos.

## 4. `super.valorVenda()`
Chama explicitamente a implementação da superclasse.

## 5. `@Override`
Ajuda o compilador a verificar se você realmente está sobrescrevendo um método existente.

## 6. Vetor polimórfico

```java
Produto[] v = new Produto[3];
v[0] = new ProdutoNaoPerecivel(...);
v[1] = new ProdutoPerecivel(...);
```

O vetor é `Produto[]`, mas pode guardar instâncias de subclasses.
