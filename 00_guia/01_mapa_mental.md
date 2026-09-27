# Mapa mental dos 6 algoritmos

## Bubble Sort
Ideia: comparar vizinhos e trocar quando estão fora de ordem.

Imagem mental:
`[5, 2, 4] -> 5 e 2 trocam -> [2, 5, 4] -> 5 e 4 trocam -> [2, 4, 5]`

O maior “borbulha” para o fim a cada passada.

## Selection Sort
Ideia: procurar o menor de toda a parte não ordenada e colocá-lo na posição correta.

Imagem mental:
`acha menor -> troca com início -> avança o início`

Também pode aparecer ao contrário: acha o maior e manda para o fim.

## Insertion Sort
Ideia: manter uma parte esquerda já ordenada e inserir o próximo elemento no lugar correto.

Imagem mental:
`[2, 5, 7 | 4]` -> abre espaço -> `[2, 4, 5, 7]`

## Merge Sort
Ideia: dividir até sobrar 1 elemento e depois intercalar partes ordenadas.

Imagem mental:
`divide -> divide -> divide -> intercala ordenando`

## Quick Sort
Ideia: escolher um pivô, particionar em menores e maiores e repetir o processo recursivamente.

Na versão Lomuto:
- `j` percorre.
- `i` marca o fim da região dos menores.
- no final, pivô vai para `i + 1`.

## Heap Sort
Ideia: organizar o vetor como Max Heap, onde o maior fica na raiz, mandar a raiz para o fim e reconstruir o heap.

Imagem mental:
`cria Max Heap -> maior no índice 0 -> troca com fim -> heapify -> repete`
