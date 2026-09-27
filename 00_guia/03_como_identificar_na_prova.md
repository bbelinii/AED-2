# Como identificar o algoritmo olhando o código

## Bubble
Procure dois laços e comparação de vizinhos: `v[j]` com `v[j + 1]`.

## Selection
Procure uma variável como `indiceMenor` ou `indiceMaior`. O algoritmo varre o restante e faz normalmente uma troca ao fim da rodada.

## Insertion
Procure `chave = v[i]`, um `while` deslocando elementos e, ao final, `v[j + 1] = chave`.

## Merge
Procure duas chamadas recursivas para metades e depois uma função `merge` / `intercalar`.

## Quick
Procure `particionar`, `pivo`, e duas chamadas recursivas ao redor da posição do pivô.

## Heap
Procure `heapify`, filhos calculados por `2*i+1` e `2*i+2`, construção do heap e troca da raiz com o fim.
