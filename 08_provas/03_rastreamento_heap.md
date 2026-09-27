# Rastreamento de Heap Sort

## Exercício 1
Vetor: `[4, 10, 3, 5, 1]`

1. Desenhe a árvore correspondente.
2. Identifique o último pai.
3. Mostre a construção do Max Heap.
4. Troque a raiz com o último.
5. Mostre como o `heapify` restaura o heap.
6. Repita até ordenar.

## Exercício 2
Para o heap:

```text
        20
      /    \
    15      18
   /  \    / \
  9   12  17  16
```

Depois de mandar `20` para o fim, explique por que `heapify` pode precisar descer por mais de um nível.

## Exercício 3
Reescreva `heapify` sem recursão, usando `while`.
