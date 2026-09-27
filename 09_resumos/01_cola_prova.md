# Cola rápida

## Bubble
Vizinhos. Maior vai ao fim.

## Selection
Procura menor -> troca com início da parte ativa.

## Insertion
Chave -> desloca maiores -> insere chave.

## Merge
Divide ao meio -> ordena metades -> intercala.

## Quick Lomuto
Pivô = fim.
`i = inicio - 1`.
`j` percorre até `fim - 1`.
Se `v[j] <= pivo`: `i++` e troca.
No fim troca pivô com `i + 1`.
Retorna `i + 1`.
Recursão: esquerda `inicio..p-1`, direita `p+1..fim`.

## Heap
Max Heap para crescente.
Filhos: `2*i+1`, `2*i+2`.
Último pai: `n/2 - 1`.
Constrói heap de baixo para cima.
Troca raiz com fim.
`heapify(v, fim, 0)`.

## Complexidades
Bubble/Selection/Insertion: O(n²) em geral.
Merge/Quick médio/Heap: O(n log n).
Quick pior: O(n²).
Heap pior: O(n log n).
