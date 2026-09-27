# Erros comuns em Heap Sort

1. Confundir tamanho do heap com último índice.
2. Chamar `heapify(v, v.length, 0)` depois de já ter colocado máximos no fim.
3. Esquecer que `heapify(v, fim, 0)` usa `fim` como tamanho ativo.
4. Usar fórmulas de base 1 (`2*i`) em vetor Java normal de base 0.
5. Achar que Max Heap significa vetor inteiro ordenado.
6. Esquecer a chamada recursiva do `heapify` depois da troca.
7. Construir heap começando das folhas; folhas já satisfazem a propriedade.
8. Não entender por que começa em `n/2 - 1`: é o último pai.
