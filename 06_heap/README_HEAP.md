# Heap Sort — foco de prova

## Ideia principal

Para ordem crescente usamos normalmente um **Max Heap**.

Regra:
- cada pai é maior ou igual aos filhos;
- portanto o maior elemento fica na raiz, índice 0.

## Índices no vetor
Para um pai no índice `i`:

```text
filho esquerdo = 2*i + 1
filho direito  = 2*i + 2
```

## Duas fases

### 1. Construir Max Heap
Começa no último pai: `n/2 - 1` e vai até `0`.

### 2. Ordenar
- troca `v[0]` com `v[fim]`;
- o maior fica definitivamente no final;
- chama `heapify(v, fim, 0)` para restaurar o heap sem considerar a parte já ordenada.

## Lógica do heapify
Compara pai, filho esquerdo e filho direito.
Se um filho for maior, troca com o pai.
O elemento que desceu pode continuar errado, então chama `heapify` novamente na nova posição.
