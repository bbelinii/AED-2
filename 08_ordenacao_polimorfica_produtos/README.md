# Possível conexão: ordenação + polimorfismo

**Atenção:** a oficina fornecida ensina a hierarquia de Produtos, mas não contém o enunciado completo da futura atividade de "Ordenação Polimórfica".

Esta pasta serve para treinar uma conexão natural entre os dois conteúdos:

```text
Produto[] com objetos de subclasses diferentes
                +
algoritmo de ordenação
```

Os exemplos ordenam `Produto[]` pelo resultado de `valorVenda()`.

Isso é interessante porque a comparação chama:

```java
produto.valorVenda()
```

Se o objeto for `ProdutoPerecivel`, pode executar a versão sobrescrita da subclasse.
Se for `ProdutoNaoPerecivel`, executa a versão correspondente.

Portanto, **o algoritmo de ordenação trabalha com `Produto`, enquanto o cálculo do valor pode ser polimórfico**.

Foram incluídos somente os seis algoritmos estudados.
