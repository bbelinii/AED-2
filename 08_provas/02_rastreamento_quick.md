# Rastreamento de Quick Sort

Use Lomuto, último elemento como pivô.

## Exercício 1
Vetor: `[8, 3, 7, 2, 6]`

Mostre em cada passo:
- `i`;
- `j`;
- comparação com pivô;
- trocas;
- vetor depois da partição;
- valor retornado por `particionar`;
- próximas duas chamadas recursivas.

## Exercício 2
Vetor: `[4, 1, 6, 2, 5, 3]`

Faça a árvore de chamadas:

```text
quickSort(?, ?)
  quickSort(?, ?)
  quickSort(?, ?)
```

até chegar aos casos base.

## Exercício 3
Altere o algoritmo para ordem decrescente sem mudar a estrutura da recursão.
